import collections
from typing import Dict, List, Tuple

import numpy as np
import pandas as pd
import seutil as se
from bs4 import BeautifulSoup
from exli.macros import Macros
from exli.util import Util
from jsonargparse import CLI
from seutil import latex

logger = se.log.get_logger(__name__)


# formats
fmt_f = ",.1f"
fmt_d = ",d"

# list of projects
projects_used_sorted = sorted(
    Util.get_project_names_list(),
    key=lambda p: p.lower(),
)
projects_excluded_sorted = sorted(
    Macros.project_with_timeout + Macros.projects_with_jacoco_exception
)
projects_no_mutant = ["liquibase_liquibase-oracle"]

# tool (names used in experiments) to macro (names used in paper) mapping
tool2macro = {
    Macros.dev: "dev",
    Macros.randoop: "randoop",
    Macros.evosuite: "evosuite",
    Macros.unit: "unit",
    Macros.r0: "r0",
    Macros.r1: "r1",
    Macros.r2_um: "r2-um",
    Macros.r2_major: "r2-major",
}


class Table:
    # python -m exli.table data_target_stmts_found
    def data_target_stmts_found(self):
        print("data_target_stmts_found")
        file = latex.File(Macros.table_dir / "data-target-statements-found.tex")
        target_stmts_dict = se.io.load(Macros.results_dir / "target-statements.json")
        df = pd.DataFrame(target_stmts_dict)

        # count the number of target statements of each type
        count_by_type = df.groupby("type").count().unstack(fill_value=0)["filename"]

        for stmt_type, num in count_by_type.items():
            file.append_macro(
                latex.Macro(f"total-num-stmts-{stmt_type}", f"{num:{fmt_d}}")
            )
        # count the number of target statements of each project
        count_by_project = (
            df.groupby("project").count().unstack(fill_value=0)["filename"]
        )
        for proj, num in count_by_project.items():
            file.append(latex.Macro(f"{proj}-num-stmts-total", f"{num:{fmt_d}}"))
        # count each project's  number of target statements of each type
        count_by_project_type = (
            df.groupby(["project", "type"]).count().unstack(fill_value=0).stack()
        )
        for index, row in count_by_project_type.iterrows():
            proj = index[0]
            stmt_type = index[1]
            file.append(
                latex.Macro(
                    f"{proj}-num-stmts-{stmt_type}", f"{row['filename']:{fmt_d}}"
                )
            )

        # count the total number of target statements
        file.append_macro(
            latex.Macro("total-num-stmts-total", f"{len(target_stmts_dict):{fmt_d}}")
        )
        # avg
        file.append_macro(
            latex.Macro(
                "avg-num-stmts-total",
                f"{len(target_stmts_dict)/len(projects_used_sorted):,.0f}",
            )
        )

        df[f"{Macros.unit}_stmt_covered"] = (
            df[f"{Macros.dev}_stmt_covered"]
            | df[f"{Macros.randoop}_stmt_covered"]
            | df[f"{Macros.evosuite}_stmt_covered"]
        )
        df[f"{Macros.unit}_method_covered"] = (
            df[f"{Macros.dev}_method_covered"]
            | df[f"{Macros.randoop}_method_covered"]
            | df[f"{Macros.evosuite}_method_covered"]
        )
        for tool in [Macros.dev, Macros.randoop, Macros.evosuite, Macros.unit]:
            tmacro = tool2macro[tool]

            # count the number of target statements covered
            sum_by_type = (
                df.groupby("type").sum(numeric_only=True).unstack(fill_value=0)
            )
            sum_by_project = (
                df.groupby("project").sum(numeric_only=True).unstack(fill_value=0)
            )
            for level in ["stmt", "method"]:
                for stmt_type, num in sum_by_type[f"{tool}_{level}_covered"].items():
                    file.append(
                        latex.Macro(
                            f"total-{tmacro}-covered-num-{level}s-{stmt_type}",
                            f"{int(num):{fmt_d}}",
                        )
                    )
                total = int(
                    sum_by_type[f"{tool}_{level}_covered"].sum(numeric_only=True)
                )
                file.append(
                    latex.Macro(
                        f"total-{tmacro}-covered-num-{level}s-total", f"{total:{fmt_d}}"
                    )
                )
                for proj, num in sum_by_project[f"{tool}_{level}_covered"].items():
                    file.append(
                        latex.Macro(
                            f"{proj}-{tmacro}-covered-num-{level}s-total",
                            f"{int(num):{fmt_d}}",
                        )
                    )
            sum_by_project_type = (
                df.groupby(["project", "type"])
                .sum(numeric_only=True)
                .unstack(fill_value=0)
                .stack()
            )
            for index, row in sum_by_project_type.iterrows():
                proj = index[0]
                stmt_type = index[1]
                file.append(
                    latex.Macro(
                        f"{proj}-{tmacro}-covered-num-stmts-{stmt_type}",
                        f"{int(row[f'{tool}_stmt_covered']):{fmt_d}}",
                    )
                )
                file.append(
                    latex.Macro(
                        f"{proj}-{tmacro}-covered-num-methods-{stmt_type}",
                        f"{int(row[f'{tool}_method_covered']):{fmt_d}}",
                    )
                )
        file.save()

    # python -m exli.table data_target_stmts_passing
    def data_target_stmts_passing(self):
        file = latex.File(Macros.table_dir / "data-target-statements-passing.tex")
        target_stmts = se.io.load(Macros.results_dir / "target-statements.json")
        for tool in [Macros.r0, Macros.r1]:
            tmacro = tool2macro[tool]
            passed_tests = se.io.load(
                Macros.results_dir / f"{tool}-passed-tests.txt", se.io.Fmt.txtList
            )
            stmt2type = {}
            for stmt in target_stmts:
                classname = Util.file_path_to_class_name(stmt["filename"])
                stmt2type[classname + stmt["line_number"]] = stmt["type"]

            type2stmts = collections.defaultdict(set)
            for test in passed_tests:
                tokens = test.split(";")
                key = tokens[1] + tokens[2]
                if key in stmt2type:
                    type2stmts[stmt2type[key]].add(key)
                else:
                    logger.warning(f"cannot find {key}")

            total = 0
            for stmt_type in Macros.target_stmt_types:
                cnt = len(type2stmts[stmt_type])
                total += cnt
                file.append(
                    latex.Macro(
                        f"total-{tmacro}-num-stmts-{stmt_type}", f"{cnt:{fmt_d}}"
                    )
                )
            file.append(
                latex.Macro(f"total-{tmacro}-num-stmts-total", f"{total:{fmt_d}}")
            )
        file.save()

    # python -m exli.table data_inline_tests
    def data_inline_tests(self, algorithm="greedy"):
        file = latex.File(Macros.table_dir / "data-inline-tests.tex")

        _, metrics_list = self.get_stmts_num_itest(algorithm)
        metrics_list = {k: [v for v in l if v != 0] for k, l in metrics_list.items()}

        # generate macros
        for k, l in metrics_list.items():
            file.append_macro(
                latex.Macro(f"total-{k}-num-inline-tests", f"{sum(l):{fmt_d}}")
            )
            file.append_macro(
                latex.Macro(f"avg-{k}-num-inline-tests", f"{sum(l) / len(l):{fmt_f}}")
            )
            file.append_macro(
                latex.Macro(f"max-{k}-num-inline-tests", f"{max(l):{fmt_d}}")
            )
            file.append_macro(
                latex.Macro(f"median-{k}-num-inline-tests", f"{np.median(l):{fmt_f}}")
            )
            file.append_macro(
                latex.Macro(
                    f"pct95-{k}-num-inline-tests", f"{np.percentile(l, 95):{fmt_f}}"
                )
            )

        # savings
        tools = [Macros.unique, Macros.r0, Macros.r1, Macros.r2_um + "-" + algorithm]
        for k1 in tools:
            for k2 in tools:
                if k1 == k2:
                    continue
                n1 = sum(metrics_list[k1])
                n2 = sum(metrics_list[k2])
                file.append(
                    latex.Macro(
                        f"pct-{k2}-lt-{k1}-num-inline-tests",
                        f"{(n1 - n2) / n1 * 100:{fmt_f}}",
                    )
                )

        file.save()

    def get_stmts_num_itest(
        self, algo: str = Macros.greedy
    ) -> Tuple[List[str], Dict[str, List[int]]]:
        tool2num_itest = {}
        tool_to_stmts = {}
        for tool in [Macros.r0, Macros.r1, f"{Macros.r2_um}-{algo}"]:
            tests_path = Macros.results_dir / f"{tool}-passed-tests.txt"
            # inline tests, used as the standard of used target statements
            inline_tests = se.io.load(tests_path, se.io.Fmt.txtList)
            stmts = set()
            its_counter = collections.Counter()
            for test in inline_tests:
                if test == "":
                    continue
                if tool == f"{Macros.r2_um}-{algo}":
                    stmt, _, _ = test.rsplit(";", 2)
                else:
                    stmt, _ = test.rsplit(";", 1)
                stmts.add(stmt)
                its_counter[stmt] += 1
            sorted_stmts = sorted(stmts)
            print(tool, "num of stmts", len(sorted_stmts))
            tool_to_stmts[tool] = sorted_stmts
            tool2num_itest[tool] = [its_counter[stmt] for stmt in sorted_stmts]

        # unique values
        unique_tests = se.io.load(
            Macros.results_dir / f"{Macros.unique}-tests.txt", se.io.Fmt.txtList
        )
        unique_counter = collections.Counter()
        for test in unique_tests:
            stmt, cnt = test.rsplit(";", 1)
            if stmt in stmts:
                unique_counter[stmt] += int(cnt)
        tool2num_itest[Macros.unique] = [unique_counter[stmt] for stmt in sorted_stmts]

        # TODO: because num of unique values are collected in a separate run after the main experiments, some statements may have less unique values (in this run) than the num of r0 tests (in the previous run), we make a hacky fix here to require the num of unique values to be at least the num of r0 tests
        unique_lt_r0 = []
        for i, stmt in enumerate(sorted_stmts):
            unique = tool2num_itest[Macros.unique][i]
            r0 = tool2num_itest[Macros.r0][i]
            if unique < r0:
                unique_lt_r0.append(f"{stmt}: {unique=} < {r0=}")
                tool2num_itest[Macros.unique][i] = r0
        return stmts, tool2num_itest

    # python -m exli.table data_mutants_stat
    def data_mutants_stat(self):
        file = latex.File(Macros.table_dir / "data-mutants-stat.tex")

        phase2name = {
            Macros.r1: "r1",
            Macros.r2_um: "r2-um",
            Macros.dev: "dev",
            Macros.randoop: "randoop",
            Macros.evosuite: "evosuite",
        }
        phases = phase2name.keys()

        # collect data
        data = collections.defaultdict(set)
        projects = [p for p in projects_used_sorted if p not in projects_no_mutant]
        for project_name in projects:
            results_list = Util.get_killed_mutants(project_name, phases)
            if len(results_list) != len(phases):
                raise RuntimeError(f"Project {project_name} has missing results")
            data_proj = {phase: results for phase, results in zip(phases, results_list)}
            for phase, results in data_proj.items():
                data[phase2name[phase]].update({f"{project_name}:{r}" for r in results})

        # compute several additional interesting sets and their sizes
        data[f"r2-{Macros.r0}"] = data["r2-um"] | data["r2-major"]
        data[f"unit-{Macros.r0}"] = data["dev"] | data["randoop"] | data["evosuite"]
        data[f"all"] = data["r2-all"] | data["unit-all"]
        data["intersect-r2-unit"] = data["r2-all"] & data["unit-all"]
        data["r2-all-minus-r1"] = data["r2-all"] - data["r1"]
        data["r2-um-minus-r1"] = data["r2-um"] - data["r1"]
        data["r2-major-minus-r1"] = data["r2-major"] - data["r1"]
        data["r2-all-minus-unit-all"] = data["r2-all"] - data["unit-all"]
        data["r2-um-minus-unit-all"] = data["r2-um"] - data["unit-all"]
        data["r2-major-minus-unit-all"] = data["r2-major"] - data["unit-all"]
        data["r2-major-minus-r2-um"] = data["r2-major"] - data["r2-um"]
        data["r2-um-minus-r2-major"] = data["r2-um"] - data["r2-major"]
        data["unit-all-minus-r2-all"] = data["unit-all"] - data["r2-all"]
        data["unit-all-minus-r2-um"] = data["unit-all"] - data["r2-um"]
        data["unit-all-minus-r2-major"] = data["unit-all"] - data["r2-major"]

        for k, v in data.items():
            file.append_macro(latex.Macro(f"km-{k}", f"{len(v):{fmt_d}}"))

        # compute several interesting percentages
        for m in ["all", "um", "major"]:
            file.append(
                latex.Macro(
                    f"pct-km-r2-{m}-gt-unit-all",
                    f"{len(data[f'r2-{m}-minus-unit-all']) / len(data['unit-all'])*100:{fmt_f}}",
                )
            )
            file.append(
                latex.Macro(
                    f"pct-km-r2-{m}-minus-unit-all",
                    f"{len(data[f'r2-{m}-minus-unit-all']) / len(data['all'])*100:{fmt_f}}",
                )
            )
            file.append(
                latex.Macro(
                    f"pct-km-unit-all-minus-r2-{m}",
                    f"{len(data[f'unit-all-minus-r2-{m}']) / len(data['all'])*100:{fmt_f}}",
                )
            )
            file.append(
                latex.Macro(
                    f"pct-km-r2-{m}-minus-r1",
                    f"{len(data[f'r2-{m}-minus-r1']) / len(data['all'])*100:{fmt_f}}",
                )
            )
        file.append(
            latex.Macro(
                "pct-km-r2-um-gt-r2-major",
                f"{len(data['r2-um-minus-r2-major']) / len(data['r2-major'])*100:{fmt_f}}",
            )
        )
        file.append(
            latex.Macro(
                "pct-km-r2-major-gt-r2-um",
                f"{len(data['r2-major-minus-r2-um']) / len(data['r2-um'])*100:{fmt_f}}",
            )
        )
        file.save()


if __name__ == "__main__":
    se.log.setup(Macros.log_file, se.log.WARNING)
    CLI(Table, as_positional=False)
