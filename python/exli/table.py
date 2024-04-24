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
    "unit": "dev",
    "randoop": "randoop",
    "evosuite": "evosuite",
    "all": "r0",
    "all": "r0",
    "reduced": "r1",
    "r2-universalmutator": "r2-um",
    "r2-major": "r2-major",
}


class Table:
    # python -m exli.table data_target_stmts_found
    def data_target_stmts_found(self):
        file = latex.File(Macros.table_dir / "data-target-statements-found.tex")
        target_stmts_dict = se.io.load(
            Macros.results_dir / "target-statements.json"
        )
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

        df["tests_stmt_covered"] = (
            df["unit_stmt_covered"]
            | df["randoop_stmt_covered"]
            | df["evosuite_stmt_covered"]
        )
        df["tests_method_covered"] = (
            df["unit_method_covered"]
            | df["randoop_method_covered"]
            | df["evosuite_method_covered"]
        )
        for tool in ["unit", "randoop", "evosuite", "tests"]:
            if tool == "tests":
                tmacro = "unit"
            else:
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
