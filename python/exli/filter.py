import collections
import glob
import os
import re
import time
import traceback

import seutil as se
from exli.macros import Macros
from exli.maven import MavenProject
from exli.util import Util
from jsonargparse import CLI

logger = se.log.get_logger(__name__)


class Filter:
    # python -m exli.filter filter_target_statements
    def filter_target_statements(self):
        jacoco_results = []
        repos = Util.get_project_names_list_with_sha()
        for project_name, sha in repos:
            cov_map_exists = True
            for test_type in ["unit", "randoop", "evosuite"]:
                tests_cov_file = (
                    Macros.results_dir
                    / f"teco-{test_type}-tests"
                    / f"{project_name}-covMap.json"
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

                for test_type in ["unit", "randoop", "evosuite"]:
                    cov_map_path = (
                        Macros.results_dir
                        / f"teco-{test_type}-tests"
                        / f"{project_name}-covMap.json"
                    )
                    covered_map = Util.analyze_coverage(
                        cov_map_path, class_name, line_number, test_type
                    )
                    stmt.update(covered_map)
                jacoco_results.append(stmt)
            se.io.dump(
                Macros.results_dir / "teco-target-statements.json",
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
                    jacoco_res = Util.run_jacoco(repo["full_name"], repo)
                    if jacoco_res["jacoco"]:
                        self.parse_jacoco_helper(repo["full_name"], "unit")
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
                        Util.run_jacoco(
                            repo["full_name"], repo["sha"], False, "randoop"
                        )
                        self.parse_jacoco_helper(repo["full_name"], "randoop")
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
        self, jacoco_exec_folder_path: str, classes_folder_path: str, output_path: str
    ):
        with se.io.cd(Macros.java_dir / "minimization" / "coverage-mapper"):
            se.bash.run(
                "javac -d . -cp lib/asm-9.2.jar:lib/jacoco.report-0.8.7.jar:lib/jacoco.core-0.8.7.jar:lib/json.jar CoverageMapGenerator.java",
                0,
            )
            se.bash.run(
                f"java -cp .:lib/asm-9.2.jar:lib/jacoco.core-0.8.7.jar:lib/asm-tree-9.2.jar:lib/asm-commons-9.2.jar:lib/jacoco.report-0.8.7.jar:lib/json.jar edu.cornell.minimizer.CoverageMapGenerator {jacoco_exec_folder_path} {classes_folder_path}",
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

    # python -m exli.filter parse_jacoco --test_type randoop/unit/randoop-1200/evosuite
    def parse_jacoco(self, test_type: str, test_project_name: str = None):
        Util.remove_jacoco_extension()
        se.io.mkdir(Macros.results_dir / f"teco-{test_type}-tests")

        time_file_path = Macros.results_dir / "time" / f"run-{test_type}-tests.json"
        if time_file_path.exists():
            time_dict = se.io.load(time_file_path)
        else:
            time_dict = {}

        project_list = Util.get_project_names_list_with_sha()
        for project_name, sha in project_list:
            if test_project_name and project_name != test_project_name:
                continue
            try:
                jacoco_path = None
                start_time = time.time()
                if test_type == "randoop" or test_type == "randoop-1200":
                    Util.prepare_project(project_name, sha)
                    Util.copy_randoop_tests_to_src_test_java(project_name)
                    # set checkout to False because Randoop tests are copied into the repo
                    res = Util.run_jacoco(
                        project_name, sha, False, test_type, allow_test_failure=True
                    )
                    if not res["randoop-jacoco"]:
                        time_dict[project_name] = res["exception"]
                elif test_type == "evosuite":
                    Util.prepare_project(project_name, sha)
                    jacoco_path = f"{Macros.downloads_dir}/{project_name}/jacoco.exec"
                    generated_tests_dir = f"{Macros.log_dir}/teco-evosuite-test/{project_name}/evosuite-tests"
                    if not os.path.exists(generated_tests_dir):
                        time_dict[project_name] = "does not have tests"
                        print(f"does not have tests for {project_name}")
                        continue
                    log_file_path = (
                        Macros.log_dir / "teco" / f"{project_name}-evosuite-jacoco.txt"
                    )
                    if log_file_path.exists():
                        os.remove(log_file_path)
                    returncode = Util.run_evosuite_command_line(
                        project_name,
                        log_file_path,
                        generated_tests_dir,
                        "evosuite-deps.txt",
                    )
                    if returncode != 0:
                        time_dict[
                            project_name
                        ] = "evosuite tests failed, return code not 0"
                        print(f"evosuite tests failed for {project_name}")
                        continue
                elif test_type == "unit":
                    res = Util.run_jacoco(project_name, sha)
                    if not res["jacoco"]:
                        time_dict[project_name] = res["exception"]
                else:
                    print(f"test type {test_type} is not supported")
                    return
                end_time = time.time()
                time_dict[f"{project_name}-time"] = end_time - start_time
                print("parsing jacoco.exec file...")
                self.parse_jacoco_helper(project_name, test_type, jacoco_path)
            except Exception as e:
                time_dict[
                    project_name
                ] = f"{test_type} tests failed, exception {traceback.format_exc()}"
                print(traceback.format_exc())
                Util.remove_jacoco_extension()
                continue
            time_dict[project_name] = f"{test_type} tests passed"
        se.io.dump(
            time_file_path,
            time_dict,
            se.io.Fmt.jsonPretty,
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

    # python -m exli.filter comment_failed_tests --project_name=jkuhnert_ognl
    def comment_failed_tests(
        self, project_name: str, test_type: str = "randoop", log_file: str = None
    ):
        if test_type == "randoop":
            if log_file is None:
                log_file = f"{Macros.log_dir}/teco/{project_name}-randoop-jacoco.txt"
            log = se.io.load(log_file, se.io.Fmt.txtList)
            failed_tests = set()
            results = False
            failed_tests_start = False
            error_tests_start = False
            for line in log:
                if "Results" in line:
                    results = True
                if results and "Failed tests:" in line:
                    failed_tests_start = True
                if results and "Tests in error:" in line:
                    error_tests_start = True

                if results and failed_tests_start:
                    if line.strip().startswith("test") and ":" in line:
                        failed_test_class = (
                            line.split(":")[0].split("(")[1].replace(")", "").strip()
                        )
                        failed_test_method = line.split(":")[0].split("(")[0].strip()
                        if failed_test_class and failed_test_method:
                            failed_tests.add(
                                f"{failed_test_class}.{failed_test_method}"
                            )
                if results and error_tests_start:
                    if line.strip().startswith("test") and ":" in line:
                        failed_test_class = (
                            line.split(":")[0].split("(")[1].replace(")", "").strip()
                        )
                        failed_test_method = line.split(":")[0].split("(")[0].strip()
                        if failed_test_class and failed_test_method:
                            failed_tests.add(
                                f"{failed_test_class}.{failed_test_method}"
                            )
                if "BUILD FAILURE" in line:
                    break

            for failed_test in failed_tests:
                test_class = failed_test.split(".")[0]
                test_method = failed_test.split(".")[1]
                test_file = f"{Macros.log_dir}/teco-{test_type}-test/{project_name}/{test_type}-tests/{test_class}.java1"
                if not os.path.exists(test_file):
                    se.bash.run(
                        f"cp {Macros.log_dir}/teco-{test_type}-test/{project_name}/{test_type}-tests/{test_class}.java {test_file}"
                    )
                test_file_content = se.io.load(test_file, se.io.Fmt.txtList)
                failed_test_found = False
                for i, line in enumerate(test_file_content):
                    if test_method + "()" in line:
                        failed_test_found = True
                        test_file_content[i - 1] = "//" + test_file_content[i - 1]
                        test_file_content[i] = "//" + line
                        print(line)
                        print(test_file_content[i])
                        continue
                    if failed_test_found and (line.strip() == "" or "@Test" in line):
                        break
                    if failed_test_found:
                        test_file_content[i] = "//" + line
                        print(test_file_content[i])
                # print(test_file_content)
                se.io.dump(test_file, test_file_content, se.io.Fmt.txtList)
        elif test_type == "evosuite":
            if log_file is None:
                log_file = f"{Macros.log_dir}/teco/{project_name}-failed-evosuite.log"
            times = 0
            while times < 10:
                times += 1
                # run evosuite generated tests
                self.parse_jacoco("evosuite", project_name)
                log = se.io.load(log_file, se.io.Fmt.txt)
                # match the pattern
                # at org.hyperledger.fabric.sdk.helper.DiagnosticFileDumper_ESTest.test00(DiagnosticFileDumper_ESTest.java:37)
                # at string(filename:number)
                pattern = r"at (.*)\((.*):(\d+)\)"
                if "FAILURES" in log:
                    for line in log.split("\n"):
                        match = re.match(pattern, line.strip())
                        if match:
                            test_file = match.group(2)
                            test_line = match.group(3)
                            # find the test file
                            test_file_path = None
                            for dirpath, dirnames, filenames in os.walk(
                                f"{Macros.log_dir}/teco-evosuite-test/{project_name}/evosuite-tests"
                            ):
                                if test_file in filenames:
                                    test_file_path = os.path.join(dirpath, test_file)
                                    break
                            if test_file_path is None:
                                print(f"test file {test_file} not found")
                                continue
                            test_file_content = se.io.load(
                                test_file_path, se.io.Fmt.txtList
                            )
                            test_file_content[int(test_line) - 1] = (
                                "//" + test_file_content[int(test_line) - 1]
                            )
                            print(test_file_content[int(test_line) - 1])
                            se.io.dump(
                                test_file_path, test_file_content, se.io.Fmt.txtList
                            )
                else:
                    break

    # python -m exli.filter filter_target_statements_not_covered
    def filter_target_statements_not_covered(self):
        res = []
        mtd_covered_by_all_tests = 0
        mtd_not_covered_by_all_tests = 0
        target_statements_file = Macros.results_dir / "teco-target-statements.json"
        target_stmts = se.io.load(target_statements_file, se.io.Fmt.json)
        for target_statement in target_stmts:
            if (
                target_statement["unit_stmt_covered"] == False
                and target_statement["randoop_stmt_covered"] == False
            ):
                res.append(target_statement)
                if (
                    target_statement["randoop_method_covered"] == True
                    and target_statement["unit_method_covered"] == True
                ):
                    mtd_covered_by_all_tests += 1
                if (
                    target_statement["randoop_method_covered"] == False
                    and target_statement["unit_method_covered"] == False
                ):
                    mtd_not_covered_by_all_tests += 1
        print("mtd_covered_by_all_tests", mtd_covered_by_all_tests)
        print("mtd_not_covered_by_all_tests", mtd_not_covered_by_all_tests)
        se.io.dump(
            Macros.results_dir / "teco-target-statements-not-covered.json",
            res,
            fmt=se.io.Fmt.jsonPretty,
        )

    # python -m exli.filter check_teco_target_stmts_not_covered
    def check_teco_target_stmts_not_covered(self):
        not_covered = se.io.load(
            Macros.results_dir / "teco-target-statements-not-covered.json"
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
        reduced_pass_test_file = Macros.results_dir / "reduced-passed-tests.txt"
        reduced_proj_to_stmts, _ = Util.get_projs_to_stmts_and_inline_tests(
            reduced_pass_test_file
        )
        print(
            "total number of reduced target statements",
            sum([len(stmts) for stmts in reduced_proj_to_stmts.values()]),
        )

        all_pass_test_file = Macros.results_dir / "all-passed-tests.txt"
        all_proj_to_stmts, _ = Util.get_projs_to_stmts_and_inline_tests(
            all_pass_test_file
        )
        # total number of target statements
        print(
            "total number of all target statements",
            sum([len(stmts) for stmts in all_proj_to_stmts.values()]),
        )

        for proj, reduced_stmts in reduced_proj_to_stmts.items():
            if proj in all_proj_to_stmts:
                all_stmts = all_proj_to_stmts[proj]
                # in reduced but not in all
                diff_stmts = [stmt for stmt in reduced_stmts if stmt not in all_stmts]
                if diff_stmts:
                    print(f"{proj}: {diff_stmts} in reduced but not in all")
                # in all but not in reduced
                diff_stmts = [stmt for stmt in all_stmts if stmt not in reduced_stmts]
                if diff_stmts:
                    print(f"{proj}: {diff_stmts} in all but not in reduced")

    # python -m exli.filter check_duplicate
    def check_duplicate(self):
        filepath = Macros.results_dir / "teco-target-statements.json"
        mutants = se.io.load(filepath)
        m = set()
        for mutant in mutants:
            if mutant["filename"] + str(mutant["line_number"]) in m:
                print(mutant["filename"] + " " + str(mutant["line_number"]))
            m.add(mutant["filename"] + str(mutant["line_number"]))
        print(len(m))
        print(len(mutants))

    # python -m exli.filter prepare_xml
    def prepare_xml(self):
        for test_type in ["R0", "R1", "R2"]:
            path_to_tests = Macros.project_dir.parent / "exli" / f"{test_type}-tests"
            # iterate all the projects
            for project in path_to_tests.iterdir():
                if project.is_dir():
                    project_name = project.name
                    # create a directory "serialized-data" for xml files
                    path_to_serialized_data = (
                        path_to_tests
                        / project_name
                        / Macros.INLINE_GEN_DIR_NAME
                        / "serialized-data"
                    )
                    if not path_to_serialized_data.exists():
                        path_to_serialized_data.mkdir(parents=True)

                    # iterate all the test classes
                    for test_class in project.iterdir():
                        if test_class.is_file() and test_class.name.endswith(".java"):
                            # load the content
                            lines = se.io.load(test_class, se.io.Fmt.txtList)
                            for line in lines:
                                # find string in the format of "number.xml"
                                if re.search(r"\d+\.xml", line):
                                    # get the number in "number.xml"
                                    filename = re.search(r"(\d+)\.xml", line).group()
                                    print(line)
                                    # get the xml file
                                    path_to_xml_file = (
                                        Macros.r1_tests_dir
                                        / project_name
                                        / ".inlinegen"
                                        / "serialized-data"
                                        / f"{filename}"
                                    )
                                    if not path_to_xml_file.exists():
                                        print(f"file {path_to_xml_file} does not exist")
                                        continue
                                    print(path_to_xml_file)
                                    # copy the xml file to the project
                                    se.bash.run(
                                        f"cp {path_to_xml_file} {path_to_serialized_data}"
                                    )


if __name__ == "__main__":
    se.log.setup(Macros.log_file, se.log.INFO)
    CLI(Filter, as_positional=False)
