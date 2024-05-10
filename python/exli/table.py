import collections
from typing import Dict, List, Tuple

import numpy as np
import pandas as pd
import seutil as se
from exli.macros import Macros
from exli.util import Util
from jsonargparse import CLI
from seutil import latex
import re

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
            Macros.r0: "r2-um",
            Macros.dev: "dev",
            Macros.randoop: "randoop",
            Macros.evosuite: "evosuite",
        }
        phases = phase2name.keys()

        # collect data
        data = collections.defaultdict(set)
        projects = [p for p in projects_used_sorted if p not in projects_no_mutant]
        for project_name in projects:
            sha = Util.get_sha(project_name)
            results_list = Util.get_killed_mutants(
                project_name, sha, Macros.universalmutator, phases
            )
            if len(results_list) != len(phases):
                raise RuntimeError(f"Project {project_name} has missing results")
            data_proj = {phase: results for phase, results in zip(phases, results_list)}
            for phase, results in data_proj.items():
                data[phase2name[phase]].update({f"{project_name}:{r}" for r in results})

        # compute several additional interesting sets and their sizes
        data["r2"] = data["r2-um"]
        data[Macros.unit] = (
            data[Macros.dev] | data[Macros.randoop] | data[Macros.evosuite]
        )
        data[f"all"] = data[Macros.r2] | data[Macros.unit]
        data["intersect-r2-unit"] = data["r2"] & data["unit"]
        data["r2-minus-r1"] = data["r2"] - data["r1"]
        data["r2-minus-unit"] = data["r2"] - data["unit"]
        data["unit-minus-r2"] = data["unit"] - data["r2"]

        for k, v in data.items():
            file.append_macro(latex.Macro(f"km-{k}", f"{len(v):{fmt_d}}"))

        # compute several interesting percentages
        file.append(
            latex.Macro(
                f"pct-km-r2-gt-unit",
                f"{len(data[f'r2-minus-unit']) / len(data['unit'])*100:{fmt_f}}",
            )
        )
        file.append(
            latex.Macro(
                f"pct-km-r2-minus-unit",
                f"{len(data[f'r2-minus-unit']) / len(data['all'])*100:{fmt_f}}",
            )
        )
        file.append(
            latex.Macro(
                f"pct-km-unit-minus-r2",
                f"{len(data[f'unit-minus-r2']) / len(data['all'])*100:{fmt_f}}",
            )
        )
        file.append(
            latex.Macro(
                f"pct-km-r2-minus-r1",
                f"{len(data[f'r2-minus-r1']) / len(data['all'])*100:{fmt_f}}",
            )
        )
        file.save()

    # python -m exli.table data_mutants_eval_results
    def data_mutants_eval_results(self):
        file = latex.File(Macros.table_dir / "data-mutants-eval-results.tex")
        metrics_list = collections.defaultdict(list)

        num_projects = 0
        for proj, sha in Util.get_project_names_list_with_sha():
            num_projects += 1
            mutants_path = (
                Macros.results_dir
                / "mutants"
                / f"{proj}-{sha}-{Macros.universalmutator}.json"
            )
            mutants = []
            if mutants_path.exists():
                mutants = se.io.load(mutants_path)
            else:
                logger.warning(f"File {mutants_path} does not exist")
                continue
            # only keep compilable mutants (currently, already filtered in previous steps)
            mutants = [
                m
                for m in mutants
                if ("compilation_failure" not in m) or (not m["compilation_failure"])
            ]

            if len(mutants) == 0:
                file.append(latex.Macro(f"{proj}-num-mutants", r"\UseMacro{TH-na}"))
                continue

            num_mutants = len(mutants)
            file.append(latex.Macro(f"{proj}-num-mutants", f"{num_mutants:{fmt_d}}"))
            metrics_list["num-mutants"].append(num_mutants)

            target_stmts = set(
                Util.file_path_to_class_name(m["filepath"]) + ";" + str(m["linenumber"])
                for m in mutants
            )
            num_target_stmts = len(target_stmts)
            file.append(
                latex.Macro(
                    f"{proj}-num-mutated-target-stmts", f"{num_target_stmts:{fmt_d}}"
                )
            )
            metrics_list["num-mutated-target-stmts"].append(num_target_stmts)

            for tool in [
                Macros.dev,
                Macros.randoop,
                Macros.evosuite,
                Macros.r0,
                Macros.r1,
                Macros.r2_um,
            ]:
                tmacro = tool2macro[tool]
                mutants_result_path = (
                    Macros.results_dir
                    / "mutants-eval-results"
                    / f"{proj}-{sha}-{Macros.universalmutator}-{tool}.json"
                )

                if tool == Macros.r2_um:
                    # merge r0 and r1 results
                    r0 = se.io.load(
                        Macros.results_dir
                        / "mutants-eval-results"
                        / f"{proj}-{sha}-{Macros.universalmutator}-{Macros.r0}.json"
                    )
                    r1 = se.io.load(
                        Macros.results_dir
                        / "mutants-eval-results"
                        / f"{proj}-{sha}-{Macros.universalmutator}-{Macros.r1}.json"
                    )
                    res = []
                    for r0, r1 in zip(r0, r1):
                        if r0["id"] != r1["id"]:
                            logger.warning(f"r0 and r1 mutants have different ids")
                        item = {
                            "id": r0["id"],
                            f"{tool}-killed": r0[f"{Macros.r0}-killed"]
                            or r1[f"{Macros.r1}-killed"],
                            f"{tool}-time": max(
                                r0[f"{Macros.r0}-time"], r1[f"{Macros.r1}-time"]
                            ),
                        }
                        res.append(item)
                    # save res
                    se.io.dump(mutants_result_path, res, se.io.Fmt.jsonPretty)

                mutants_result = se.io.load(mutants_result_path)
                timeout = 600
                if tool == Macros.evosuite:
                    timeout = 3600
                num_killed_mutants = len(
                    [
                        m
                        for m in mutants_result
                        if f"{tool}-killed" in m
                        and m[f"{tool}-killed"]
                        or m[f"{tool}-time"] >= timeout
                    ]
                )
                mutation_score = num_killed_mutants / num_mutants * 100
                file.append(
                    latex.Macro(
                        f"{proj}-{tmacro}-mutation-score", f"{mutation_score:{fmt_f}}"
                    )
                )
                metrics_list[f"{tmacro}-mutation-score"].append(mutation_score)

                time = sum(
                    [
                        m[f"{tool}-time"] if m[f"{tool}-time"] < 600 else 600
                        for m in mutants_result
                    ]
                )
                file.append(
                    latex.Macro(f"{proj}-{tmacro}-mutation-time", f"{time:{fmt_f}}")
                )
                metrics_list[f"{tmacro}-mutation-time"].append(time)

        for k, l in metrics_list.items():
            if k.endswith("mutation-score") or k.endswith("time"):
                file.append(latex.Macro(f"total-{k}", f"{sum(l):{fmt_f}}"))
            else:
                file.append(latex.Macro(f"total-{k}", f"{sum(l):{fmt_d}}"))
            file.append(latex.Macro(f"avg-{k}", f"{sum(l) / len(l):{fmt_f}}"))

        # time of generating mutants
        generate_mutants_time_path = (
            Macros.results_dir / "time" / "generate-mutants-universalmutator.json"
        )
        if generate_mutants_time_path.exists():
            generate_mutants_time = se.io.load(generate_mutants_time_path)
            total_time = sum(generate_mutants_time.values())
            file.append(
                latex.Macro("total-generate-mutants-time", f"{total_time:{fmt_f}}")
            )
            file.append(
                latex.Macro(
                    "avg-generate-mutants-time",
                    f"{total_time / len(generate_mutants_time):{fmt_f}}",
                )
            )
        file.save()

    # python -m exli.table data_time_r1
    def data_time_r1(self):
        file = latex.File(Macros.table_dir / "data-time-r1.tex")
        attr_to_time = se.io.load(
            Macros.results_dir / "time" / "extract-inline-tests.json"
        )

        sum_time = collections.defaultdict(float)
        num_proj = 0
        for attr, time in attr_to_time.items():
            file.append(latex.Macro(attr + "-time", f"{time:{fmt_f}}"))
            match = re.match(r"^(?P<proj_name>.+)-(?P<sha>[a-f0-9]{7})-(?P<metric>.+)$", attr + "-time")
            if match:
                sum_time[match.group("metric")] += time
            num_proj += 1
        for k, v in sum_time.items():
            file.append(latex.Macro(f"total-{k}", f"{v:{fmt_f}}"))
            file.append(latex.Macro(f"avg-{k}", f"{v / num_proj:{fmt_f}}"))
        file.save()

    # python -m exli.table data_time_r2
    def data_time_r2(self):
        file = latex.File(Macros.table_dir / "data-time-r2.tex")

        autogen_time_macros = latex.Macro.load_from_file(
            Macros.table_dir / "data-time-run-autogen-unit.tex"
        )
        randoop_time = float(autogen_time_macros["avg-time-randoop-tests"].value)
        evosuite_time = float(autogen_time_macros["avg-time-evosuite-tests"].value)

        dev_time_macros = latex.Macro.load_from_file(
            Macros.table_dir / "data-teco-projects.tex"
        )
        dev_time = float(dev_time_macros["avg-time-dev-tests"].value)

        r1_time_macros = latex.Macro.load_from_file(
            Macros.table_dir / "data-time-r1.tex"
        )
        r1_time = float(r1_time_macros["avg-r1-time"].value)

        mutant_time_um_macros = latex.Macro.load_from_file(
            Macros.table_dir / "data-mutants-eval-results.tex"
        )
        mutant_um_time = float(mutant_time_um_macros["avg-r0-mutation-time"].value)

        if (Macros.table_dir / "data-mutants-major.tex").exists():
            mutant_time_major_macros = latex.Macro.load_from_file(
                Macros.table_dir / "data-mutants-major.tex"
            )
            mutant_major_time = float(
                mutant_time_major_macros["avg-r0-mutation-time-major"].value
            )

        # sum of unit tests time
        unit_time = dev_time + randoop_time + evosuite_time
        file.append(latex.Macro("avg-unit-time", f"{unit_time:{fmt_f}}"))
        # overhead of r1
        file.append(
            latex.Macro("avg-r1-time-minus-unit-time", f"{r1_time - unit_time:{fmt_f}}")
        )
        file.append(
            latex.Macro(
                "overhead-r1-time-gt-unit-time", f"{(r1_time / unit_time - 1):{fmt_f}}"
            )
        )

        # r2 time
        r2_um_time = r1_time + mutant_um_time
        file.append(latex.Macro("avg-r2-um-time", f"{r2_um_time:{fmt_f}}"))
        file.append(
            latex.Macro(
                "overhead-r2-um-time-gt-unit-time",
                f"{(r2_um_time / unit_time - 1):{fmt_f}}",
            )
        )

        if (Macros.table_dir / "data-mutants-major.tex").exists():
            r2_major_time = r1_time + mutant_major_time
            file.append(latex.Macro("avg-r2-major-time", f"{r2_major_time:{fmt_f}}"))
            file.append(
                latex.Macro(
                    "overhead-r2-major-time-gt-unit-time",
                    f"{(r2_major_time / unit_time - 1):{fmt_f}}",
                )
            )

        file.save()


if __name__ == "__main__":
    se.log.setup(Macros.log_file, se.log.WARNING)
    CLI(Table, as_positional=False)
