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

        if not Macros.figure_dir.exists():
            Macros.figure_dir.mkdir(parents=True)

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

    # python -m exli.plot dist_inline_tests_per_target_stmt_boxplot
    def dist_inline_tests_per_target_stmt_boxplot(self, algorithm=Macros.greedy):
        # load data
        _, metrics_list = Table().get_stmts_num_itest(algorithm)
        metrics_list = {k: [v for v in l if v != 0] for k, l in metrics_list.items()}

        data = [
            [x for x in metrics_list[k] if x != 0]
            for k in [Macros.unique, Macros.r0, Macros.r1, Macros.r2_um + "-" + algorithm]
        ]
        x_labels = [
            name_unique,
            name_exli_r0,
            name_exli_r1,
            name_exli_um,
        ]

        # box plot with unbroken y-label
        fig, ax = plt.subplots()
        ax.boxplot(data, meanline=True)
        ax.set_xticklabels(x_labels)
        plt.yscale("log")
        # ax.set_ylim(0, 1000)
        # box with y-label gap
        # fig, (ax, box) = plt.subplots(2, 1, gridspec_kw={'height_ratios': [1, 5]}, sharex=True)
        # box.boxplot(data)
        # ax.boxplot(data)
        # box.set_ylim(0, 12000)
        # ax.set_ylim(35150, 35250)
        # ax.spines['bottom'].set_visible(False)
        # box.spines['top'].set_visible(False)
        # ax.tick_params(labeltop=False)
        # https://stackoverflow.com/questions/59305080/formatting-a-broken-y-axis-in-python-matplotlib
        # https://matplotlib.org/3.1.0/gallery/subplots_axes_and_figures/broken_axis.html
        fig.tight_layout()
        fig.savefig(Macros.figure_dir / "dist-inline-tests-per-stmt-box.pdf")

    # python -m exli.plot venn_mutated_results
    def venn_mutated_results(self, mutator=Macros.universalmutator):
        venn_dir = Macros.figure_dir / "venn"
        venn_dir.mkdir(exist_ok=True)

        test_type_name_pairs = [
            (Macros.r1, name_exli_r1),
            (Macros.r2_um, name_exli_um),
            (Macros.dev, name_dev),
            (Macros.randoop, name_randoop),
            (Macros.evosuite, name_evosuite),
        ]
        test_type_list = [t[0] for t in test_type_name_pairs]
        test_type_list_4 = [
            name_exli_um,
            name_dev,
            name_randoop,
            name_evosuite,
        ]

        data_all = collections.defaultdict(set)
        projects = [p for p in projects_used_sorted if p not in projects_no_mutant]
        # venn diagram for each project
        for project_name in projects:
            sha = Util.get_sha(project_name)
            results_list = Util.get_killed_mutants(project_name, sha, mutator, test_type_list)
            if len(results_list) != len(test_type_list):
                raise RuntimeError(f"Project {project_name} has missing results")
            data_proj = {
                name: results
                for (_, name), results in zip(test_type_name_pairs, results_list)
            }
            fig, ax = plt.subplots(figsize=(7, 7))
            venn.venn(
                {k: data_proj[k] for k in test_type_list_4},
                cmap=self.cmap4,
                ax=ax,
            )
            fig.tight_layout()
            fig.savefig(venn_dir / f"{project_name}-venn.pdf")
            plt.close()

            for name, results in data_proj.items():
                data_all[name].update({f"{project_name}:{r}" for r in results})

        # venn diagram for total, with several variants
        # all 6 groups
        fig, ax = plt.subplots(figsize=(7, 7))
        venn.venn(data_all, cmap=self.cmap5, ax=ax)
        fig.tight_layout()
        fig.savefig(venn_dir / "total-venn-all6.pdf")
        plt.close()

        # w/o ExLi-R1
        fig, ax = plt.subplots(figsize=(6, 6))
        venn.venn(
            {k: data_all[k] for k in test_type_list_4},
            cmap=self.cmap5,
            ax=ax,
        )
        fig.tight_layout()
        fig.savefig(venn_dir / "total-venn.pdf")
        plt.close()

        # ExLi-R1 vs. ExLi-UM vs. Unit
        data_comb_unit = {
            name_exli_r1: data_all[name_exli_r1],
            name_exli_um: data_all[name_exli_um],
            name_unit: data_all[name_dev]
            | data_all[name_randoop]
            | data_all[name_evosuite],
        }
        fig, ax = plt.subplots(figsize=(5, 5))
        venn.venn(data_comb_unit, cmap=self.cmap3, ax=ax)
        fig.tight_layout()
        fig.savefig(venn_dir / "total-venn-comb-unit.pdf")
        plt.close()

        # ExLi vs. Unit
        data_comb_both = {
            name_exli: data_all[name_exli_um],
            name_unit: data_all[name_dev]
            | data_all[name_randoop]
            | data_all[name_evosuite],
        }
        fig, ax = plt.subplots(figsize=(5, 5))
        venn.venn(data_comb_both, cmap=self.cmap2, ax=ax)
        fig.tight_layout()
        fig.savefig(venn_dir / "total-venn-comb-both.pdf")
        plt.close()

        # one latex file with all project's venn diagrams
        latex_file = latex.File(venn_dir / "venn.tex")
        for i, project_name in enumerate(projects):
            # two columns
            if i == 0:
                latex_file.append(r"\begin{figure}[t]")
            elif i % 2 == 0:
                latex_file.append(r"\begin{figure}[t]\ContinuedFloat")
            latex_file.append(r"\begin{subfigure}[b]{0.45\textwidth}")
            latex_file.append(
                r"\includegraphics[width=\textwidth]{"
                + f"figures/venn/{project_name}-venn.pdf"
                + r"}"
            )
            latex_file.append(r"\vspace{-10pt}")
            latex_file.append(
                r"\caption{" + f"{project_name.split('_')[-1].replace('_', ' ')}" + r"}"
            )
            latex_file.append(r"\label{fig:venn-" + f"{project_name}" + r"}")
            latex_file.append(r"\end{subfigure}")
            if i == len(projects) - 1:
                latex_file.append(
                    r"\caption{Sets of mutants killed by inline tests and unit tests.}"
                )
                latex_file.append(r"\label{fig:venn-all}")
                latex_file.append(r"\end{figure}")
                break
            if i % 2 == 0:
                latex_file.append(r"\hfill")
            else:
                latex_file.append(r"\end{figure}")
        latex_file.save()


if __name__ == "__main__":
    se.log.setup(Macros.log_file, se.log.WARNING)
    CLI(Plot, as_positional=False)
