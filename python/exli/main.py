from typing import List
from jsonargparse import CLI
import seutil as se
from exli.maven import MavenProject
import exli.filter as filter
from exli.macros import Macros
import time
import traceback
from exli.util import Util
import os
import collections
from exli.generate_tests import Generate


class Main:
    # python -m exli.main run --project_name="Asana_java-asana" --commit="52fef9b" 
    # python -m exli.main run --project_name="AquaticInformatics_aquarius-sdk-java" --commit="8f4edb9" 
    # --project_name=CycloneDX_cyclonedx-core-java --commit=d933705
    def run(
        self,
        project_name: str,
        commit: str = "",
        time_limit: int = 60,
        randoop: bool = True,
        unit: bool = True,
        evosuite: bool = True,
        seed: int = 42,
    ):
        Util.compile_raninline()
        ################################## process input, prepare project ##################################
        inputs = f"--project_name={project_name} --commit={commit} --time_limit={time_limit} --randoop={randoop} --unit={unit}"
        se.bash.run(f'echo "{inputs}" >> {Macros.log_dir}/raninline.log')
        # parse input
        if "_" in project_name:
            project_name = project_name.replace("_", "/")
        parsed_project_name = project_name.replace("/", "_")

        Util.remove_jacoco_extension()

        # clone project
        print("preparing project...")
        project = se.project.Project(
            url=f"https://github.com/{project_name}", full_name=parsed_project_name
        )
        project.clone(Macros.downloads_dir)

        print("cleaning project...")
        with se.io.cd(Macros.downloads_dir / parsed_project_name):
            se.bash.run("git clean -xfd")  # clean .gitignore directories and files
            se.bash.run("git checkout .")
            # se.bash.run("git reset --hard")
            if commit:
                commit = commit[:7]
                se.bash.run(f"git checkout {commit}")
            else:
                se.bash.run(f"git checkout master")
                commit = se.bash.run(f"git rev-parse HEAD").stdout.strip()[:7]

            full_file_paths = Util.list_java_files(
                f"{Macros.downloads_dir}/{parsed_project_name}"
            )

        # create a folder to store the reduced inline tests
        proj_reduced_tests_dir = (
            f"{Macros.reduced_tests_dir}/{parsed_project_name}-{commit}-{seed}"
        )
        se.io.mkdir(proj_reduced_tests_dir, fresh=True)
        # create a folder to store all inline tests
        proj_all_tests_dir = f"{Macros.all_tests_dir}/{parsed_project_name}-{commit}-{seed}"
        se.io.mkdir(proj_all_tests_dir, fresh=True)

        LOG_FILE_PATH = f"{proj_reduced_tests_dir}/raninline-log.txt"
        INLINE_TEST_LOG_FILE_PATH = f"{proj_reduced_tests_dir}/inlinetest-log.txt"
        ALL_INLINE_TEST_LOG_FILE_PATH = (
            f"{proj_reduced_tests_dir}/inlinetest-log-all.txt"
        )
        CLASSES_DIR = f"{Macros.downloads_dir/parsed_project_name}/target/classes"

        ################################## Instrument ##################################
        with se.io.cd(Macros.downloads_dir / parsed_project_name):
            se.bash.run("mvn test-compile " + Macros.SKIPS, 0)

        # generate tests with Randoop/Evosuite
        randoop_output_dir = Macros.log_dir / "teco-randoop-test" / f"{parsed_project_name}" / f"randoop-tests-{seed}"
        if (
            randoop and not (randoop_output_dir).exists()
        ):
            Generate().generate_tests_with_one_seed(parsed_project_name, commit, "randoop", randoop_output_dir)
        
        evosuite_output_dir = Macros.log_dir / "teco-evosuite-test" / f"{parsed_project_name}" / f"evosuite-tests-{seed}"
        if (
            evosuite and not (evosuite_output_dir).exists()
        ):
            Generate().generate_tests_with_one_seed(parsed_project_name, commit, "evosuite", evosuite_output_dir)

        print("inserting print statement...")
        with se.io.cd(Macros.java_raninline_dir):
            se.bash.run("mvn clean install " + Macros.SKIPS, 0)
            for full_file_path in full_file_paths:
                se.bash.run(
                    f'mvn exec:java -Dexec.mainClass="org.raninline.App" -Dexec.args="i {full_file_path} -1 {LOG_FILE_PATH} {INLINE_TEST_LOG_FILE_PATH} {CLASSES_DIR}"',
                    0,
                )

        print("recompiling modified file...")
        with se.io.cd(Macros.downloads_dir / parsed_project_name):
            maven_project = MavenProject.from_project(project)
            maven_project.hack_pom_add_dependency(
                "org.raninline", "raninline", "1.0-SNAPSHOT"
            )
            se.bash.run("mvn test-compile " + Macros.SKIPS, 0)

        ################################## Run tests ##################################
        if unit:
            ################################## Run unit tests ##################################
            Util.copy_jacoco_extension()
            Util.configure_file("Unit")
            Util.run_unit_tests(parsed_project_name, LOG_FILE_PATH, maven_project)
            Util.remove_jacoco_extension()
        if evosuite:
            ################################## Run EvoSuite tests ##################################
            Util.copy_jacoco_extension()
            Util.configure_file("EvoSuite")
            Util.run_evosuite_command_line(
                parsed_project_name, LOG_FILE_PATH, evosuite_output_dir
            )
            Util.remove_jacoco_extension()
        if randoop:
            ################################## Run Randoop tests ##################################
            Util.copy_jacoco_extension()
            Util.configure_file("Randoop")
            Util.run_randoop(parsed_project_name, LOG_FILE_PATH, maven_project)
            Util.remove_jacoco_extension()

        ################################## Save serialized data ##################################
        se.bash.run(
            f"cp -r {Macros.downloads_dir}/{parsed_project_name}/{Macros.INLINE_GEN_DIR_NAME} {proj_reduced_tests_dir}"
        )

        ################################## Parse log ##################################
        Util.parse_log(
            parsed_project_name,
            commit,
            proj_reduced_tests_dir,
            INLINE_TEST_LOG_FILE_PATH,
            full_file_paths,
        )

        # parse all inline tests: for evaluation purposes
        Util.parse_log(
            parsed_project_name,
            commit,
            proj_all_tests_dir,
            ALL_INLINE_TEST_LOG_FILE_PATH,
            full_file_paths,
        )

    # this method is currently deprecated because Randoop generated tests often cannot run together with existing unit tests
    def run_tests(
        self,
        parsed_project_name: str,
        log_file_path: str,
    ):
        print("copying Randoop test cases...")
        java_tests_path = f"{Macros.downloads_dir}/{parsed_project_name}/src/test/java"
        # avoid copying ErrorTest*.java
        se.bash.run(
            f"cp -r {Macros.log_dir}/teco-randoop-test/{parsed_project_name}/randoop-tests/RegressionTest*.java {java_tests_path}"
        )
        print("compiling and executing tests...")
        with se.io.cd(Macros.downloads_dir / parsed_project_name):
            # remove skip tests in pom file
            pom = se.io.load("pom.xml", se.io.Fmt.txt)
            if "<maven.test.skip>true</maven.test.skip>" in pom:
                pom.replace("<maven.test.skip>true</maven.test.skip>", "")
                se.io.dump("pom.xml", pom, se.io.Fmt.txt)
            if "<skipTests>true</skipTests>" in pom:
                pom.replace(
                    "<skipTests>true</skipTests>", "<skipTests>false</skipTests>"
                )
                se.io.dump("pom.xml", pom, se.io.Format.txt)

            if parsed_project_name == "cyclopsgroup_jcli":
                se.bash.run("mvn com.coveo:fmt-maven-plugin:format", 0)
            se.bash.run(f"mvn test {Macros.SKIPS_NO_JACOCO} &>> {log_file_path}")

    # python -m exli.main run_inline_tests --project_name="Asana_java-asana"
    # python -m exli.main run_inline_tests --project_name "AquaticInformatics_aquarius-sdk-java" --parse_inline_tests True
    def run_inline_tests(
        self,
        project_name: str,
        sha: str = None,
        generated_tests_dir: str = f"{Macros.reduced_tests_dir}",
        inline_tests_dir: str = f"{Macros.reduced_inline_tests_dir}",
        log_dir: str = f"{Macros.reduced_inline_tests_report_dir}",
        parse_inline_tests: bool = False,
    ):
        if sha is None:
            sha = Util.get_sha(project_name)
        # source files with inline tests does not exist
        if not os.path.exists(f"{generated_tests_dir}/{project_name}-{sha}"):
            return
        Util.prepare_project(project_name, sha)

        if not os.path.exists(inline_tests_dir) or parse_inline_tests:
            # parse inline tests
            Util.parse_inline_tests(
                project_name, sha, generated_tests_dir, inline_tests_dir
            )
        # compile and run the generated JUnit tests
        run_res, returncode = Util.run_inline_tests(
            project_name, sha, f"{inline_tests_dir}/{project_name}-{sha}"
        )
        if returncode != 0:
            print(f"inline test failed for {project_name} {sha}")
        if run_res:
            se.io.dump(
                f"{log_dir}/{project_name}.json",
                run_res,
                se.io.Fmt.jsonPretty,
            )

    # python -m exli.main batch_run_inline_tests
    def batch_run_inline_tests(self, test_project_name: str = None):
        time_file_path = Macros.results_dir / "time" / "run-inline-tests.json"
        if time_file_path.exists():
            time_dict = se.io.load(time_file_path)
        else:
            time_dict = {}
        # install I-Test
        with se.io.cd(Macros.itest_java_dir):
            se.bash.run("mvn clean install -DskipTests", 0)
        projects = Util.get_project_names_list_with_sha()
        for project_name, commit in projects:
            if project_name in Util.get_excluded_projects():
                continue
            if test_project_name is not None and project_name != test_project_name:
                continue
            try:
                with se.TimeUtils.time_limit(3600):
                    start_time = time.time()
                    self.run_inline_tests(
                        project_name,
                        commit,
                        f"{Macros.reduced_tests_dir}",
                        f"{Macros.reduced_inline_tests_dir}",
                        f"{Macros.reduced_inline_tests_report_dir}",
                        True,
                    )
                    end_time = time.time()
                    time_dict[f"{project_name}-reduced"] = end_time - start_time

                    start_time = time.time()
                    self.run_inline_tests(
                        project_name,
                        commit,
                        f"{Macros.all_tests_dir}",
                        f"{Macros.all_inline_tests_dir}",
                        f"{Macros.all_inline_tests_report_dir}",
                        True,
                    )
                    end_time = time.time()
                    time_dict[f"{project_name}-all"] = end_time - start_time
            except se.TimeoutException:
                time_dict[project_name] = "timeout"
                time_dict[project_name] = "timeout"
            except Exception as e:
                time_dict[
                    project_name
                ] = f"{project_name} {commit}: {traceback.format_exc()}"
        se.io.dump(time_file_path, time_dict, se.io.Fmt.jsonPretty)

    # python -m exli.main analyze_inline_tests_reports --inline_test_type="reduced"
    # --project_type "excluded"
    def analyze_inline_tests_reports(
        self, inline_test_type: str, project_type: str = None
    ):
        if inline_test_type == "reduced":
            test_report_dir = Macros.reduced_inline_tests_report_dir
        elif inline_test_type == "all":
            test_report_dir = Macros.all_inline_tests_report_dir
        else:
            raise Exception("unknown inline test type")
        # iterate all reports in the report directory
        failed_tests = []
        passed_tests = []
        for report_file in os.listdir(test_report_dir):
            if not report_file.endswith(".json"):
                continue
            project_name = report_file.replace(".json", "")
            if project_type is None:
                if project_name not in Util.get_project_names_list():
                    continue
                if project_name in Util.get_excluded_projects():
                    continue
            else:
                if project_name not in (
                    Macros.project_with_timeout + Macros.projects_with_jacoco_exception
                ):
                    continue
            report = se.io.load(f"{test_report_dir}/{report_file}", se.io.Fmt.json)
            if not report or "compilation failure" in report:
                continue
            # number_of_tests = report["testsuite"]["@tests"]
            # number_of_errors = report["testsuite"]["@errors"]
            # number_of_failures = report["testsuite"]["@failures"]
            # failed tests detail
            if "testcase" not in report["testsuite"]:
                continue
            test_cases = report["testsuite"]["testcase"]
            if not isinstance(test_cases, list):
                test_cases = [test_cases]
            for test_case in test_cases:
                target_stmt_linenumber = (
                    test_case["@classname"]
                    .split(".")[-1]
                    .split("_")[-1]
                    .replace("Test", "")
                )
                class_name = test_case["@classname"].replace(
                    f"_{target_stmt_linenumber}Test", ""
                )
                inline_test_linenumber = (
                    test_case["@name"].replace("testLine", "").replace("()", "")
                )
                if "failure" in test_case or "error" in test_case:
                    # collect the failed test
                    failed_tests.append(
                        f"{project_name};{class_name};{target_stmt_linenumber};{inline_test_linenumber}"
                    )
                else:
                    # target_stmt_key = (
                    #     f"{project_name};{class_name};{target_stmt_linenumber}"
                    # )
                    # if target_stmt_key not in failed_target_stmts:
                    passed_tests.append(
                        f"{project_name};{class_name};{target_stmt_linenumber};{inline_test_linenumber}"
                    )

        if project_type is None:
            failed_test_file_path = (
                f"{Macros.results_dir}/{inline_test_type}-failed-tests.txt"
            )
            passed_test_file_path = (
                f"{Macros.results_dir}/{inline_test_type}-passed-tests.txt"
            )
        else:
            failed_test_file_path = (
                f"{Macros.results_dir}/{inline_test_type}-failed-tests-excluded.txt"
            )
            passed_test_file_path = (
                f"{Macros.results_dir}/{inline_test_type}-passed-tests-excluded.txt"
            )
        se.io.dump(
            failed_test_file_path,
            failed_tests,
            se.io.Fmt.txtList,
        )
        se.io.dump(
            passed_test_file_path,
            passed_tests,
            se.io.Fmt.txtList,
        )

    # python -m exli.main remove_failed_tests --inline_test_type reduced
    def remove_failed_tests(self, inline_test_type: str):
        failed_tests_file = Macros.results_dir / f"{inline_test_type}-failed-tests.txt"
        failed_tests = se.io.load(failed_tests_file, se.io.Fmt.txtList)
        file_path_to_test_cases = collections.defaultdict(set)
        for failed_test in failed_tests:
            (
                project_name,
                class_name,
                target_stmt_linenumber,
                inline_test_linenumber,
            ) = failed_test.split(";")
            sha = Util.get_sha(project_name)
            if inline_test_type == "reduced":
                file_path = Macros.reduced_tests_dir
            elif inline_test_type == "all":
                file_path = Macros.all_tests_dir
            else:
                raise Exception("unknown inline test type")
            file_path = (
                file_path
                / f"{project_name}-{sha}"
                / (class_name.split(".")[-1].split(r"$")[0] + ".java")
            )
            file_path_to_test_cases[file_path].add(int(inline_test_linenumber))
        for file_path, test_cases in file_path_to_test_cases.items():
            if not os.path.exists(file_path):
                continue
            lines = se.io.load(file_path, se.io.Fmt.txtList)
            new_lines = []
            index = 0
            while index < len(lines):
                if index + 1 in test_cases:
                    while index < len(lines):
                        print("skip line from project", file_path, lines[index].strip())
                        if lines[index].strip().endswith(";"):
                            index += 1
                            break
                        index += 1
                    continue
                new_lines.append(lines[index])
                index += 1
            se.io.dump(file_path, new_lines, se.io.Fmt.txtList)

    def remove_compilation_error_tests(self, inline_test_type: str):
        # TODO: remove compilation error tests
        for project_name in Util.get_project_names_list():
            if project_name in Util.get_excluded_projects():
                continue
            sha = Util.get_sha(project_name)
            if inline_test_type == "reduced":
                comp_error_file_path = (
                    Macros.reduced_inline_tests_report_dir
                    / f"{project_name}-comp-failed-tests.txt"
                )
            elif inline_test_type == "all":
                comp_error_file_path = (
                    Macros.all_inline_tests_report_dir
                    / f"{project_name}-comp-failed-tests.txt"
                )
            else:
                raise Exception("unknown inline test type")

            if not os.path.exists(comp_error_file_path):
                continue
            comp_error_tests = se.io.load(comp_error_file_path, se.io.Fmt.txtList)
            for comp_error_test in comp_error_tests:
                test_file_path = comp_error_test.split(",")[0]

    # python -m exli.main batch_run
    def batch_run(self):
        # prepare jacoco extension plugin
        Util.remove_jacoco_extension()
        with se.io.cd(Macros.jacoco_extension_dir):
            se.bash.run("mvn package", 0)
        # run all projects
        time_res_file = Macros.results_dir / "time" / "extract-inline-tests.json"
        if os.path.exists(time_res_file):
            time_dict = se.io.load(time_res_file, se.io.Fmt.json)
        else:
            time_dict = {}

        projects = Util.get_project_names_list_with_sha()
        for project_name, commit in projects:
            if project_name in Util.get_excluded_projects():
                continue
            try:
                start_time = time.time()
                self.run(project_name, commit, 600, True, True, True, False)
                end_time = time.time()
                time_dict[project_name] = end_time - start_time
            except Exception as e:
                print(e)
                se.io.dump(
                    Macros.results_dir / "batchrun.txt",
                    [f"{project_name} {commit}: {traceback.format_exc()}"],
                    se.io.Fmt.txtList,
                    append=True,
                )
                continue
        se.io.dump(time_res_file, time_dict, se.io.Fmt.jsonPretty)

    # python -m exli.main count --project_name="Asana_java-asana" --commit="52fef9b"
    # python -m exli.main count --project_name="AquaticInformatics_aquarius-sdk-java" --commit="8f4edb9"
    def count(
        self,
        project_name: str,
        commit: str = "",
        time_limit: int = 60,
        randoop: bool = True,
        unit: bool = True,
        evosuite: bool = True,
    ):
        ################################## process input, prepare project ##################################
        inputs = f"--project_name={project_name} --commit={commit} --time_limit={time_limit} --randoop={randoop} --unit={unit}"
        se.bash.run(f'echo "{inputs}" >> {Macros.log_dir}/raninline.log')
        # parse input
        if "_" in project_name:
            project_name = project_name.replace("_", "/")
        parsed_project_name = project_name.replace("/", "_")

        Util.remove_jacoco_extension()

        # clone project
        print("preparing project...")
        project = se.project.Project(
            url=f"https://github.com/{project_name}", full_name=parsed_project_name
        )
        project.clone(Macros.downloads_dir)

        print("cleaning project...")
        with se.io.cd(Macros.downloads_dir / parsed_project_name):
            se.bash.run("git clean -xfd")  # clean .gitignore directories and files
            se.bash.run("git checkout .")
            if commit:
                commit = commit[:7]
                se.bash.run(f"git checkout {commit}")
            else:
                se.bash.run(f"git checkout master")
                commit = se.bash.run(f"git rev-parse HEAD").stdout.strip()[:7]

            full_file_paths = Util.list_java_files(
                f"{Macros.downloads_dir}/{parsed_project_name}"
            )

        # create a folder to store the reduced inline tests
        proj_generated_tests_dir = (
            f"{Macros.reduced_tests_dir}/{parsed_project_name}-{commit}"
        )
        se.io.mkdir(proj_generated_tests_dir)

        LOG_FILE_PATH = f"{proj_generated_tests_dir}/counter-log.txt"
        if os.path.exists(LOG_FILE_PATH):
            os.remove(LOG_FILE_PATH)
        INLINE_TEST_LOG_FILE_PATH = f"{proj_generated_tests_dir}/i-log.txt"

        ################################## Instrument ##################################
        with se.io.cd(Macros.downloads_dir / parsed_project_name):
            se.bash.run("mvn test-compile " + Macros.SKIPS, 0)

        print("inserting print statement...")
        with se.io.cd(Macros.java_raninline_dir):
            se.bash.run("mvn clean install " + Macros.SKIPS, 0)
            for full_file_path in full_file_paths:
                se.bash.run(
                    f'mvn exec:java -Dexec.mainClass="org.raninline.App" -Dexec.args="counter {full_file_path} {LOG_FILE_PATH} {INLINE_TEST_LOG_FILE_PATH}"',
                    0,
                )

        print("recompiling modified file...")
        with se.io.cd(Macros.downloads_dir / parsed_project_name):
            maven_project = MavenProject.from_project(project)
            maven_project.hack_pom_add_dependency(
                "org.raninline", "raninline", "1.0-SNAPSHOT"
            )
            se.bash.run("mvn test-compile " + Macros.SKIPS, 0)

        ################################## Run tests ##################################
        if unit:
            ################################## Run unit tests ##################################
            Util.copy_jacoco_extension()
            Util.configure_file("Unit")
            Util.run_unit_tests(parsed_project_name, LOG_FILE_PATH, maven_project)
            Util.remove_jacoco_extension()
        if evosuite:
            ################################## Run EvoSuite tests ##################################
            Util.copy_jacoco_extension()
            Util.configure_file("EvoSuite")
            evosuite_dir = f"{Macros.log_dir}/teco-evosuite-test/{parsed_project_name}/evosuite-tests"
            Util.run_evosuite_command_line(
                parsed_project_name, LOG_FILE_PATH, evosuite_dir
            )
            Util.remove_jacoco_extension()
        if randoop:
            ################################## Run Randoop tests ##################################
            Util.copy_jacoco_extension()
            Util.configure_file("Randoop")
            Util.run_randoop(parsed_project_name, LOG_FILE_PATH, maven_project)
            Util.remove_jacoco_extension()
        ################################## Save serialized data ##################################
        se.bash.run(
            f"cp -r {Macros.downloads_dir}/{parsed_project_name}/{Macros.INLINE_GEN_DIR_NAME}/unique-inline-tests-counter.txt {proj_generated_tests_dir}/.inlinegen/unique-inline-tests-counter.txt"
        )
        se.bash.run(
            f"cp -r {Macros.downloads_dir}/{parsed_project_name}/{Macros.INLINE_GEN_DIR_NAME}/all-target-stmts-hit-counter.txt {proj_generated_tests_dir}/.inlinegen/all-target-stmts-hit-counter.txt"
        )

    # python -m exli.main batch_count
    def batch_count(self):
        projects = Util.get_project_names_list_with_sha()
        for project_name, commit in projects:
            if project_name in Util.get_excluded_projects():
                continue
            try:
                self.count(project_name, commit, 60, True, True)
            except Exception as e:
                print(e)
                se.io.dump(
                    Macros.results_dir / "batchcount.txt",
                    [f"{project_name} {commit}: {traceback.format_exc()}"],
                    se.io.Fmt.txtList,
                    append=True,
                )
                continue

    # python -m exli.main collect_randoop_tests_time
    def collect_randoop_tests_time(self):
        res_file_path = Macros.results_dir / "randoop-time.json"
        res = dict()
        for project_name, sha in Util.get_project_names_list_with_sha():
            if project_name in Util.get_excluded_projects():
                continue
            with se.io.cd(Macros.downloads_dir / project_name):
                se.bash.run("git clean -xfd")
                se.bash.run("git checkout .")
                se.bash.run(f"git checkout {sha}")
            maven_project = Util.get_maven_project(project_name)
            Util.configure_tests_for_jacoco_agent(
                project_name, "randoop", maven_project
            )
            Util.copy_randoop_tests_to_src_test_java(project_name)
            print("compiling and executing Randoop tests...")
            with se.io.cd(Macros.downloads_dir / project_name):
                se.bash.run("mvn clean test-compile " + Macros.SKIPS)
                try:
                    with se.TimeUtils.time_limit(3600):
                        start_time = time.time()
                        run_res = se.bash.run(f"mvn test {Macros.SKIPS}")
                        end_time = time.time()
                        res[project_name] = end_time - start_time
                except se.TimeoutException:
                    continue
                except Exception as e:
                    print(project_name, e)
                    continue
        se.io.dump(res_file_path, res, se.io.Fmt.jsonPretty)

    def find_target_stmts(
        self,
        parsed_project_name: str,
        commit: str,
        log_file_path: str,
    ):
        with se.io.cd(Macros.downloads_dir / parsed_project_name):

            Util.prepare_project(parsed_project_name, commit)

            full_file_paths = Util.list_java_files(
                f"{Macros.downloads_dir}/{parsed_project_name}"
            )
            # find target statements
            print("finding target statements...")
            with se.io.cd(Macros.java_raninline_dir):
                for full_file_path in full_file_paths:
                    se.bash.run(
                        f'mvn exec:java -Dexec.mainClass="org.raninline.App" -Dexec.args="target-stmt {full_file_path} {log_file_path}"',
                        0,
                    )

    # python -m exli.main batch_find_target_stmts
    def batch_find_target_stmts(self):
        projects = Util.get_project_names_list_with_sha()
        for project_name, commit in projects:
            if project_name in Util.get_excluded_projects():
                continue
            target_stmt_log_file_path = (
                Macros.results_dir / "target-stmt" / f"{project_name}.log"
            )
            if not target_stmt_log_file_path.parent.exists():
                target_stmt_log_file_path.parent.mkdir(parents=True)
            self.find_target_stmts(project_name, commit, target_stmt_log_file_path)


if __name__ == "__main__":
    CLI(Main, as_positional=False)
