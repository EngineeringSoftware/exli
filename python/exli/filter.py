import collections
import os
import re
import time
import traceback

import seutil as se
from exli.macros import Macros
from exli.util import Util
from jsonargparse import CLI

logger = se.log.get_logger(__name__)


class Filter:
    # python -m exli.filter classify_target_statements
    def classify_target_statements(self, seed: int = Macros.DEFAULT_SEED):
        """
        Classify target statements:
        1. stream, regex, string, bit
        2. covered by dev, randoop, evosuite
        """
        jacoco_results = []
        repos = Util.get_project_names_list_with_sha()
        for project_name, sha in repos:
            cov_map_exists = True
            for test_type in [Macros.dev, Macros.randoop, Macros.evosuite]:
                tests_cov_file = (
                    Macros.results_dir
                    / f"coverage"
                    / f"{project_name}-{sha}-{test_type}-{seed}-covMap.json"
                )
                if not tests_cov_file.exists():
                    logger.warning(f"{tests_cov_file} does not exist")
                    cov_map_exists = False
            if not cov_map_exists:
                logger.warning(project_name + " coverage file does not exist...")
                continue

            keyword_target_statements_dict = dict()
            target_stmts_path = (
                Macros.results_dir / "target-stmt" / f"{project_name}-{sha}.txt"
            )
            if target_stmts_path.exists():
                log = se.io.load(target_stmts_path, se.io.Fmt.txtList)
                for line in log:
                    if line.startswith("target stmt"):
                        stmt = dict()
                        filename = line.split(";")[1]
                        if filename.startswith(Macros.downloads_dir_str):
                            filename = filename.replace(Macros.downloads_dir_str, "")
                        stmt["filename"] = filename
                        stmt["type"] = line.split(";")[0].split(" ")[-1]
                        stmt["line_number"] = line.split(";")[2]
                        key = f"{stmt['filename']}-{stmt['line_number']}"
                        if key in keyword_target_statements_dict:
                            # update type
                            if stmt["type"] == "stream":
                                keyword_target_statements_dict[key]["type"] = "stream"
                            elif stmt["type"] == "regex":
                                keyword_target_statements_dict[key]["type"] = "regex"
                            elif stmt["type"] == "string":
                                keyword_target_statements_dict[key]["type"] = "string"
                            elif stmt["type"] == "bit":
                                keyword_target_statements_dict[key]["type"] = "bit"
                            continue
                        keyword_target_statements_dict[key] = stmt
                    else:
                        break
            else:
                logger.warning(f"{target_stmts_path} does not exist for {project_name}")
                continue

            keyword_target_statements = list(keyword_target_statements_dict.values())
            if not keyword_target_statements:
                logger.warning("no keyword target statements...")
                continue
            logger.debug("keyword target statements exist...")

            for stmt in keyword_target_statements:
                stmt["project"] = project_name
                class_name = Util.file_path_to_class_name(stmt["filename"])
                line_number = stmt["line_number"]

                for test_type in [Macros.dev, Macros.randoop, Macros.evosuite]:
                    cov_map_path = (
                        Macros.results_dir
                        / f"coverage"
                        / f"{project_name}-{sha}-{test_type}-{seed}-covMap.json"
                    )
                    covered_map = Util.analyze_coverage(
                        cov_map_path, class_name, line_number, test_type
                    )
                    stmt.update(covered_map)
                jacoco_results.append(stmt)
            se.io.dump(
                Macros.results_dir / "target-statements.json",
                jacoco_results,
                fmt=se.io.Fmt.jsonPretty,
            )

    ############ fileter project in teco paper's Java projects ############
    # python -m exli.filter filter_teco_projects
    # filter single module projects with latest commit date after 2019-01-01
    def filter_teco_projects(self):
        res_list = []
        repos = se.io.load(Macros.data_dir / "teco" / "repos.json")
        se.io.mkdir(Macros.log_dir / "teco")
        for index, repo in enumerate(repos):
            try:
                if repo["mvn_multi_module"]:
                    continue
                repo.update(self.get_project_git_info(repo["full_name"], repo["sha"]))
                if "date" not in repo or (
                    "date" in repo and repo["date"] < "2019-01-01"
                ):
                    se.io.rmdir(Macros.downloads_dir / repo["full_name"])
                res_list.append(repo)
            except Exception as e:
                se.io.dump(
                    f"{Macros.log_dir}/teco/filter-teco-projects.log",
                    [f"{e}"],
                    se.io.Fmt.txtList,
                    append=True,
                )
                continue
        se.io.dump(
            Macros.results_dir / "teco-projects.json", res_list, se.io.Fmt.jsonPretty
        )

    def get_project_git_info(self, project_name: str, sha: str):
        res = {}
        # clone project
        Util.prepare_project(project_name, sha)
        with se.io.cd(Macros.downloads_dir / project_name):
            se.bash.run(
                f"cloc . --yaml --out={Macros.log_dir}/teco/{project_name}-cloc.yaml", 0
            )
            project_cloc = se.io.load(f"{Macros.log_dir}/teco/{project_name}-cloc.yaml")
            res["loc"] = project_cloc["Java"]["code"]
            print("getting date...")
            date = se.bash.run(r"git log -1 --format=%ci", 0).stdout.strip()
            res["date"] = date
        return res

    # python -m exli.filter filter_teco_projects_with_conditions
    def filter_teco_projects_with_conditions(
        self,
        source_path: str = None,
        target_path: str = None,
        log_path: str = None,
        date: str = "2022-01-01",
        unit_tests: bool = True,
        jacoco: bool = True,
        randoop: bool = True,
        tested_project_name: str = None,
    ):
        res_list = []
        # process inputs
        if not source_path:
            source_path = Macros.results_dir / "teco-projects.json"
        else:
            source_path = Macros.project_dir / source_path

        if not target_path:
            target_filepath = (
                "teco-projects"
                + (f"-{date}" if date else "")
                + ("-unit-tests" if unit_tests else "")
                + ("-jacoco" if jacoco else "")
                + ("-randoop" if randoop else "")
                + ".json"
            )
            target_path = Macros.results_dir / target_filepath
        else:
            target_path = Macros.project_dir / target_path

        if not log_path:
            log_filepath = (
                "filter-teco-projects"
                + (f"-{date}" if date else "")
                + ("-unit-tests" if unit_tests else "")
                + ("-jacoco" if jacoco else "")
                + ("-randoop" if randoop else "")
                + ".log"
            )
            log_path = Macros.log_dir / "teco" / log_filepath
        else:
            log_path = Macros.project_dir / log_path

        # running experiments
        Util.remove_jacoco_extension()
        repos = se.io.load(source_path)
        for index, repo in enumerate(repos):
            try:
                if tested_project_name and repo["full_name"] != tested_project_name:
                    continue
                if date and repo["date"] < date:
                    continue
                if unit_tests:
                    unit_tests_res = self.run_unit_tests(repo["full_name"], repo)
                    repo.update(unit_tests_res)
                    if not repo["compile"]:
                        if jacoco:
                            repo["jacoco"] = False
                        if randoop:
                            repo["randoop"] = False
                        res_list.append(repo)
                        continue
                if jacoco:
                    jacoco_res = Util.run_with_jacoco(repo["full_name"], repo)
                    if jacoco_res["jacoco"]:
                        self.parse_jacoco_helper(repo["full_name"], Macros.dev)
                    repo.update(jacoco_res)
                    if not repo["jacoco"]:
                        if randoop:
                            repo["randoop"] = False
                        res_list.append(repo)
                        continue
                if randoop:
                    randoop_res = Util.generate_randoop_tests(repo["full_name"], repo)
                    repo.update(randoop_res)
                    if repo["randoop"]:
                        self.fix_randoop_generated_tests(repo["full_name"])
                        Util.prepare_project(repo["full_name"], repo["sha"])
                        Util.copy_randoop_tests_to_src_test_java(repo["full_name"])
                        # set checkout to False because Randoop tests are copied into the repo
                        Util.run_with_jacoco(
                            repo["full_name"], repo["sha"], False, Macros.randoop
                        )
                        self.parse_jacoco_helper(repo["full_name"], Macros.randoop)
                res_list.append(repo)
            except Exception as e:
                se.io.dump(log_path, [f"{e}"], se.io.Fmt.txtList, append=True)
                continue
        if not tested_project_name:
            se.io.dump(target_path, res_list, se.io.Fmt.jsonPretty)
        else:
            print(res_list)

    def run_unit_tests(self, project_name: str, sha: str):
        res = {}
        Util.prepare_project(project_name, sha)
        with se.io.cd(Macros.downloads_dir / project_name):
            try:
                print("compiling project...")
                Util.remove_jacoco_extension()
                se.bash.run(
                    f"mvn clean test-compile {Macros.SKIPS} > {Macros.log_dir}/teco/{project_name}-compile.txt",
                    0,
                    timeout=600,
                )
            except Exception as e:
                res["compile"] = False
                res["unit-test"] = False
                res["time-unit-tests"] = -1
                return res

            res["compile"] = True
            try:
                print("running tests...")
                start = time.time()
                se.bash.run(
                    f"mvn test {Macros.SKIPS} > {Macros.log_dir}/teco/{project_name}-test.txt",
                    0,
                    timeout=1200,
                )
                end = time.time()
                res["unit-test"] = True
                res["time-unit-tests"] = end - start
            except Exception as e:
                res["unit-test"] = False
                res["time-unit-tests"] = -1
            return res

    # python -m exli.filter fix_randoop_generated_tests
    def fix_randoop_generated_tests(self, tested_project_name: str = None):
        print("fix randoop generated tests when there is no RegressionTest.java...")
        project_names = Util.get_project_names_list()
        for project_name in project_names:
            if tested_project_name is not None and project_name != tested_project_name:
                continue
            Util.fix_randoop_generated_tests_helper(project_name)

    def generate_jacoco_report(
        self, jacoco_exec_dir: str, classes_dir: str, output_path: str
    ):
        with se.io.cd(Macros.java_dir / "minimization" / "coverage-mapper"):
            se.bash.run(
                "javac -d . -cp lib/asm-9.2.jar:lib/jacoco.report-0.8.7.jar:lib/jacoco.core-0.8.7.jar:lib/json.jar CoverageMapGenerator.java",
                0,
            )
            se.bash.run(
                f"java -cp .:lib/asm-9.2.jar:lib/jacoco.core-0.8.7.jar:lib/asm-tree-9.2.jar:lib/asm-commons-9.2.jar:lib/jacoco.report-0.8.7.jar:lib/json.jar edu.cornell.minimizer.CoverageMapGenerator {jacoco_exec_dir} {classes_dir}",
                0,
            )
            print(se.bash.run("find . -name 'covMap.json'").stdout)
            se.bash.run(f"mv covMap.json {output_path}")

    # python -m exli.filter parse_jacoco_helper --project_name ralscha_extdirectspring --test_type unit
    def parse_jacoco_helper(
        self, project_name: str, test_type: str, jacoco_path: str = None
    ):
        if jacoco_path is None:
            jacoco_path = f"{Macros.downloads_dir}/{project_name}/target/jacoco.exec"
        jacoco_exec_folder_path = os.path.dirname(jacoco_path)
        if not os.path.exists(jacoco_path):
            print(f"jacoco.exec file does not exist for {project_name}")
            return
        self.generate_jacoco_report(
            f"{jacoco_exec_folder_path}",
            f"{Macros.downloads_dir}/{project_name}/target/classes/",
            f"{Macros.results_dir}/teco-{test_type}-tests/{project_name}-covMap.json",
        )

    # python -m exli.filter update_randoop_tests_can_run_results
    def update_randoop_tests_can_run_results(
        self, source_file: str = None, target_file: str = None
    ):
        if source_file:
            source_file = Macros.project_dir / source_file
        else:
            source_file = (
                Macros.results_dir
                / "teco-projects-2022-01-01-unit-tests-jacoco-randoop.json"
            )

        if target_file:
            target_file = Macros.project_dir / target_file
        else:
            target_file = (
                Macros.results_dir
                / "teco-projects-2022-01-01-unit-tests-jacoco-randoop.json"
            )

        projects_dict = se.io.load(source_file, se.io.Fmt.json)
        res = []
        for project in projects_dict:
            project_name = project["full_name"]
            cov_map_path = (
                f"{Macros.results_dir}/teco-randoop-tests/{project_name}-covMap.json"
            )
            if os.path.exists(cov_map_path):
                cov_map = se.io.load(cov_map_path)
                if not cov_map:
                    project["randoop"] = False
            res.append(project)
        se.io.dump(target_file, res, se.io.Fmt.jsonPretty)

    # python -m exli.filter filter_target_statements_not_covered
    def filter_target_statements_not_covered(self):
        res = []
        mtd_covered_by_all_tests = 0
        mtd_not_covered_by_all_tests = 0
        target_statements_file = Macros.results_dir / "target-statements.json"
        target_stmts = se.io.load(target_statements_file, se.io.Fmt.json)
        for target_statement in target_stmts:
            if (
                target_statement[f"{Macros.dev}_stmt_covered"] == False
                and target_statement[f"{Macros.randoop}_stmt_covered"] == False
                and target_statement[f"{Macros.evosuite}_stmt_covered"] == False
            ):
                res.append(target_statement)
                if (
                    target_statement[f"{Macros.randoop}_method_covered"] == True
                    and target_statement[f"{Macros.dev}_method_covered"] == True
                    and target_statement[f"{Macros.evosuite}_method_covered"] == True
                ):
                    mtd_covered_by_all_tests += 1
                if (
                    target_statement[f"{Macros.randoop}_method_covered"] == False
                    and target_statement[f"{Macros.dev}_method_covered"] == False
                    and target_statement[f"{Macros.evosuite}_method_covered"] == False
                ):
                    mtd_not_covered_by_all_tests += 1
        print("mtd_covered_by_all_tests", mtd_covered_by_all_tests)
        print("mtd_not_covered_by_all_tests", mtd_not_covered_by_all_tests)
        se.io.dump(
            Macros.results_dir / "target-statements-not-covered.json",
            res,
            fmt=se.io.Fmt.jsonPretty,
        )

    # python -m exli.filter check_target_stmts_not_covered
    def check_target_stmts_not_covered(self):
        not_covered = se.io.load(
            Macros.results_dir / "target-statements-not-covered.json"
        )
        classes = collections.Counter()
        total_classes = collections.Counter()
        for not_covered_item in not_covered:
            if "note" in not_covered_item:
                classes[not_covered_item["filename"]] += 1
            total_classes[not_covered_item["filename"]] += 1
        print("total number of classes", len(classes))
        # sort by value
        print("classes", sorted(classes.items(), key=lambda x: x[1], reverse=True))
        print(
            "total classes",
            sorted(total_classes.items(), key=lambda x: x[1], reverse=True),
        )

    # python -m exli.filter check_diff_in_target_stmts
    def check_diff_in_target_stmts(self):
        """
        Sanity check for the difference between r1 and r0 target statements
        """
        r1_pass_test_file = Macros.results_dir / "r1-passed-tests.txt"
        r1_proj_to_stmts, _ = Util.get_projs_to_stmts_and_inline_tests(
            r1_pass_test_file
        )
        print(
            "total number of r1 target statements",
            sum([len(stmts) for stmts in r1_proj_to_stmts.values()]),
        )

        r0_pass_test_file = Macros.results_dir / "r0-passed-tests.txt"
        r0_proj_to_stmts, _ = Util.get_projs_to_stmts_and_inline_tests(
            r0_pass_test_file
        )
        # total number of target statements
        print(
            "total number of r0 target statements",
            sum([len(stmts) for stmts in r0_proj_to_stmts.values()]),
        )

        for proj, r1_stmts in r1_proj_to_stmts.items():
            if proj in r0_proj_to_stmts:
                r0_stmts = r0_proj_to_stmts[proj]
                # in reduced but not in all
                diff_stmts = [stmt for stmt in r1_stmts if stmt not in r0_stmts]
                if diff_stmts:
                    print(f"{proj}: {diff_stmts} in r1 but not in r0")
                # in all but not in reduced
                diff_stmts = [stmt for stmt in r0_stmts if stmt not in r1_stmts]
                if diff_stmts:
                    print(f"{proj}: {diff_stmts} in all but not in reduced")


if __name__ == "__main__":
    se.log.setup(Macros.log_file, se.log.INFO)
    CLI(Filter, as_positional=False)
