import collections
import logging

import matplotlib as mpl
import matplotlib.pyplot as plt
import matplotlib.ticker as ticker
import numpy as np
import seaborn as sns
import seutil as se
import venn
from exli.macros import Macros
from exli.table import Table
from exli.util import Util
from jsonargparse import CLI
from seutil import latex

logger = se.log.get_logger(__name__, se.log.WARNING)


# formats
fmt_f = ",.1f"
fmt_d = ",d"

# list of projects
projects_used_sorted = sorted(
    Util.get_project_names_list(),
    key=lambda x: x.lower(),
)
projects_excluded_sorted = sorted(
    Macros.project_with_timeout + Macros.projects_with_jacoco_exception
)
projects_no_mutant = ["liquibase_liquibase-oracle"]

# macros
name_exli = "ExLi"
name_exli_r1 = "ExLi-Cov"
name_exli_um = "ExLi-UM"
name_exli_major = "ExLi-Major"
name_dev = "Dev"
name_randoop = "Randoop"
name_evosuite = "EvoSuite"
name_unit = "Unit"
name_found = "Found"
name_unit_covered = "Covered by\nUnit Tests"
name_exli_supported = "With ≥1\nInline Tests"
name_unique = "Values"
name_exli_r0 = "ExLi-Base"


class Plot:
    def __init__(self):
        logging.getLogger("fontTools.subset").setLevel(logging.WARNING)
        sns.set(palette="Dark2", context="paper")

        mpl.rcParams["pdf.fonttype"] = 42
        mpl.rcParams["ps.fonttype"] = 42
        mpl.rcParams["font.size"] = 12
        mpl.rcParams["axes.titlesize"] = "x-large"
        mpl.rcParams["axes.labelsize"] = "large"
        mpl.rcParams["xtick.labelsize"] = "large"
        mpl.rcParams["ytick.labelsize"] = "large"
        mpl.rcParams["legend.fontsize"] = "large"

        self.cmap6 = mpl.colors.ListedColormap(sns.color_palette(n_colors=6))
        self.cmap5 = mpl.colors.ListedColormap(sns.color_palette(n_colors=5))
        self.cmap4 = mpl.colors.ListedColormap(sns.color_palette(n_colors=4))
        self.cmap3 = mpl.colors.ListedColormap(sns.color_palette(n_colors=3))
        self.cmap2 = mpl.colors.ListedColormap(sns.color_palette(n_colors=2))

    # python -m exli.plot target_statements_bar_plot
    def target_statements_bar_plot(self):
        plot_data = []

        macros_found = latex.Macro.load_from_file(
            Macros.table_dir / "data-target-statements-found.tex"
        )

        # number of target statements found
        stmt_type_num_list = []
        for stmt_type in Macros.target_stmt_types:
            stmt_type_num_list.append(
                macros_found[f"total-num-stmts-{stmt_type}"].value
            )
        plot_data.append(stmt_type_num_list)

        # number of target statements covered
        for tool in [Macros.unit, Macros.dev, Macros.randoop, Macros.evosuite]:
            test_type_stmt_type_num_list = []
            for stmt_type in Macros.target_stmt_types:
                test_type_stmt_type_num_list.append(
                    macros_found[f"total-{tool}-covered-num-stmts-{stmt_type}"].value
                )
            plot_data.append(test_type_stmt_type_num_list)

        # number of target statements used by ExLi
        macros_passing = latex.Macro.load_from_file(
            Macros.table_dir / "data-target-statements-passing.tex"
        )
        test_type_coverd_by_tests_stmt_type_num_list = []
        for stmt_type in Macros.target_stmt_types:
            key = f"total-r0-num-stmts-{stmt_type}"
            test_type_coverd_by_tests_stmt_type_num_list.append(
                macros_passing[key].value
            )
        plot_data.append(test_type_coverd_by_tests_stmt_type_num_list)

        logger.info(plot_data)
        # reverse plot_data
        plot_data = [list(i) for i in zip(*plot_data)]
        logger.info(plot_data)

        # make a stacked bar plot
        xlabels = [
            name_found,
            name_unit_covered,
            name_dev,
            name_randoop,
            name_evosuite,
            name_exli_supported,
        ]
        width = 0.3
        margin_group = 0.7
        margin_ingroup = 0.1
        fig, ax = plt.subplots()

        indx = [
            0,
            margin_group,
            margin_group + width + margin_ingroup,
            margin_group + 2 * (width + margin_ingroup),
            margin_group + 3 * (width + margin_ingroup),
            2 * margin_group + 3 * (width + margin_ingroup),
        ]
        # specify colors
        # colors = ["#d63031", "#a29bfe", "#fd79a8", "#7f7f7f"]
        bottom = np.zeros(len(xlabels))
        for i in range(len(Macros.target_stmt_types)):
            if i == 0:
                ax.bar(indx, plot_data[i], width, label=Macros.target_stmt_types[i])
            else:
                bottom = np.add(bottom, plot_data[i - 1])
                ax.bar(
                    indx,
                    plot_data[i],
                    width,
                    bottom=bottom,
                    label=Macros.target_stmt_types[i],
                )

        ax.set_ylabel("#target statements")
        # set labels for xticks xlabels
        ax.set_xticks(indx)
        ax.set_xticklabels(xlabels)
        # rotate xlabels
        plt.xticks(rotation=45, rotation_mode="anchor", ha="right", va="top")
        ax.legend()
        fig.tight_layout()
        fig.savefig(Macros.figure_dir / "target-statements.pdf")
