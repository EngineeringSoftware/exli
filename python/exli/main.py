import glob
from typing import List, Set
from jsonargparse import CLI
import seutil as se
from exli.maven import MavenProject
from exli.macros import Macros
import time
import traceback
from exli.util import Util
import os
import collections
from exli.generate_tests import Generate
import re


class Main:
    # python -m exli.main batch_run
    def batch_run(self, test_project_name: str = None):
        """
        Generate unit tests with Randoop/EvoSuite. Execute
        developer-written or auto-generated unit tests to construct
        inline tests.

        Args:
            test_project_name (str): The name of the project to be tested. If None, all projects are tested.
        """
        log_path = Macros.log_dir / "raninline.log"
        if os.path.exists(log_path):
            os.remove(log_path)

        # prepare jacoco extension plugin
        Util.remove_jacoco_extension()
        with se.io.cd(Macros.jacoco_extension_dir):
            se.bash.run("mvn package", 0)

        # run all projects
        time_res_file = Macros.time_dir / "extract-inline-tests.json"
        if os.path.exists(time_res_file):
            time_dict = se.io.load(time_res_file, se.io.Fmt.json)
        else:
            time_dict = {}

        projects = Util.get_project_names_list_with_sha()
        for project_name, sha in projects:
            if test_project_name is not None and project_name != test_project_name:
                continue
            try:
                start_time = time.time()
                self.run(
                    project_name,
                    sha,
                    True,
                    100,
                    True,
                    True,
                    120,
                    Macros.DEFAULT_SEED,
                    log_path,
                )
                end_time = time.time()
                time_dict[project_name] = end_time - start_time
            except Exception as e:
                se.io.dump(
                    log_path,
                    [f"{project_name} {sha}: {traceback.format_exc()}"],
                    se.io.Fmt.txtList,
                    append=True,
                )
                continue
        se.io.dump(time_res_file, time_dict, se.io.Fmt.jsonPretty)

    # python -m exli.main run --project_name="Asana_java-asana" --sha="52fef9b"
    # python -m exli.main run --project_name="AquaticInformatics_aquarius-sdk-java" --sha="8f4edb9"
    def run(
        self,
        project_name: str,
        sha: str = None,
        randoop: bool = True,
        randoop_tl: int = 100,
        unit: bool = True,
        evosuite: bool = True,
        evosuite_tl: int = 120,
        seed: int = Macros.DEFAULT_SEED,
        log_path: str = None,
    ):
        """
        Generate inline tests for a project.

        Args:
            project_name (str): The name of the project.
            sha (str, optional): The commit hash. If None, the latest commit is used. Defaults to None.
            randoop (bool, optional): Whether to run Randoop to generate tests. Defaults to True.
            randoop_tl (int, optional): The time limit for Randoop. Defaults to 100.
            unit (bool, optional): Whether to run developer-written unit tests. Defaults to True.
            evosuite (bool, optional): Whether to run EvoSuite to generate tests. Defaults to True.
            evosuite_tl (int, optional): The time limit for EvoSuite. Defaults to 120.
            seed (int, optional): The seed for test generation. Defaults to Macros.DEFAULT_SEED.
            log_path (str, optional): The path for the log file. Defaults to None.
        """
        ################################## process input, prepare project ##################################
        if sha is None:
            sha = Util.get_sha(project_name)
        if log_path is None:
            log_path = Macros.log_dir / "raninline.log"
        inputs = f"--project_name={project_name} --sha={sha} --randoop={randoop} --randoop_tl={randoop_tl} --unit={unit} --evosuite={evosuite} --evosuite_tl={evosuite_tl} --seed={seed} --log_path={log_path}"
        se.bash.run(f'echo "{inputs}" >> {log_path}')

        Util.compile_raninline()
        Util.remove_jacoco_extension()

        print("preparing project...")
        project = Util.prepare_project(project_name, sha)

        with se.io.cd(Macros.downloads_dir / project_name):
            java_file_paths = Util.list_java_files(
                f"{Macros.downloads_dir}/{project_name}"
            )

        # create a folder to store the reduced inline tests
        proj_reduced_tests_dir = f"{Macros.reduced_tests_dir}/{project_name}-{sha}"
        se.io.mkdir(proj_reduced_tests_dir, fresh=True)
        # create a folder to store all inline tests
        proj_all_tests_dir = f"{Macros.all_tests_dir}/{project_name}-{sha}"
        se.io.mkdir(proj_all_tests_dir, fresh=True)

        reduced_log_path = (
            f"{Macros.unit_tests_dir}/{project_name}-{sha}/inlinetest-log.txt"
        )
        if os.path.exists(reduced_log_path):
            os.remove(reduced_log_path)
        # by default, all inline tests are saved in a file whose name is reduced_log_path.replace(".txt", "-all.txt")
        # related Java code: java/raninline/src/main/java/org/raninline/InstrumentHelper.java line 516
        all_log_path = (
            f"{Macros.unit_tests_dir}/{project_name}-{sha}/inlinetest-log-all.txt"
        )
        if os.path.exists(all_log_path):
            os.remove(all_log_path)
        classes_dir = f"{Macros.downloads_dir}/{project_name}/target/classes"
        deps_file_path = f"{Macros.unit_tests_dir}/{project_name}-{sha}/deps.txt"

        ################################## Generate Unit Tests ##################################
        with se.io.cd(Macros.downloads_dir / project_name):
            se.bash.run("mvn test-compile " + Macros.SKIPS, 0)

        # generate tests with Randoop / EvoSuite
        unit_tests_dir_dict = dict()
        for tool in ["randoop", "evosuite"]:
            if tool == "randoop" and not randoop:
                continue
            if tool == "evosuite" and not evosuite:
                continue
            generated_unit_tests_dir = (
                Macros.unit_tests_dir / f"{project_name}-{sha}" / f"{tool}-tests-{seed}"
            )
            unit_tests_dir_dict[tool] = generated_unit_tests_dir / f"{tool}-tests"
            if not unit_tests_dir_dict[tool].exists():
                classpath_list_path = f"{generated_unit_tests_dir}/classpath-list.txt"
                Util.prepare_project_for_test_generation(
                    project_name,
                    sha,
                    deps_file_path,
                    classpath_list_path,
                    log_path,
                )
                log_dir = Macros.log_dir / tool
                Util.avoid_permission_error(project_name)
                if tool == "randoop":
                    time_limit = randoop_tl
                elif tool == "evosuite":
                    time_limit = evosuite_tl
                    # get target statements, and parse into classpath-list.txt
                    target_stmts_path = (
                        Macros.results_dir / "target-stmt" / f"{project_name}-{sha}.txt"
                    )
                    if target_stmts_path.exists():
                        lines = se.io.load(target_stmts_path, se.io.Fmt.txtList)
                        parsed_classpath_list = [
                            Util.file_path_to_class_name(line.split(";")[1])
                            for line in lines
                        ]
                        # filter in all classpath list because there are some inner classes that start with parsed_classpath + $
                        all_classpath_list = se.io.load(
                            classpath_list_path, se.io.Fmt.txtList
                        )
                        filtered_classpath_set = set()
                        for c in all_classpath_list:
                            for parsed_classpath in parsed_classpath_list:
                                if c == parsed_classpath or c.startswith(
                                    parsed_classpath + "$"
                                ):
                                    filtered_classpath_set.add(c)
                        se.io.dump(
                            classpath_list_path,
                            list(filtered_classpath_set),
                            se.io.Fmt.txtList,
                        )

                Generate().generate_tests_with_one_seed(
                    project_name,
                    tool,
                    generated_unit_tests_dir,
                    log_dir,
                    seed,
                    time_limit,
                    deps_file_path,
                    classpath_list_path,
                )

        ################################## Instrument ##################################
        Util.prepare_project(project_name, sha)
        print("inserting print statement...")
        with se.io.cd(Macros.java_raninline_dir):
            se.bash.run("mvn clean install " + Macros.SKIPS, 0)
            for java_file_path in java_file_paths:
                is_auto_generated = Util.is_auto_generated_file(java_file_path)
                if not is_auto_generated:
                    se.bash.run(
                        f'mvn exec:java -Dexec.mainClass="org.raninline.App" -Dexec.args="i {java_file_path} -1 {log_path} {reduced_log_path} {classes_dir}"',
                        0,
                    )

        print("recompiling modified file...")
        with se.io.cd(Macros.downloads_dir / project_name):
            maven_project = MavenProject.from_project(project)
            maven_project.hack_pom_add_dependency(
                "org.raninline", "raninline", "1.0-SNAPSHOT"
            )
            se.bash.run("mvn test-compile " + Macros.SKIPS, 0)

        ################################## Run tests ##################################
        run_tests_log_path = (
            Macros.log_dir / "run-unit-tests" / f"{project_name}-{sha}.log"
        )
        if run_tests_log_path.exists():
            run_tests_log_path.unlink()

        if unit:
            Util.run_unit_tests("Unit", project_name, run_tests_log_path, maven_project)
        if evosuite:
            Util.run_unit_tests(
                "EvoSuite",
                project_name,
                run_tests_log_path,
                maven_project,
                unit_tests_dir_dict["evosuite"],
                deps_file_path,
            )
        if randoop:
            Util.run_unit_tests(
                "Randoop",
                project_name,
                run_tests_log_path,
                maven_project,
                unit_tests_dir_dict["randoop"],
            )

        ################################## Save serialized data ##################################
        se.bash.run(
            f"cp -r {Macros.downloads_dir}/{project_name}/{Macros.INLINE_GEN_DIR_NAME} {proj_all_tests_dir}"
        )

        ################################## Parse log ##################################
        Util.parse_log(
            project_name,
            sha,
            reduced_log_path,
            proj_reduced_tests_dir,
            log_path,
        )

        # parse all inline tests: for evaluation purposes
        Util.parse_log(
            project_name,
            sha,
            all_log_path,
            proj_all_tests_dir,
            log_path,
        )

    # python -m exli.main batch_run_inline_tests
    def batch_run_inline_tests(self, test_project_name: str = None):
        """
        Run inline tests for each project.

        Args:
            test_project_name (str, optional): The name of the project to be tested. If None, all projects are tested. Defaults to None.
        """
        time_file_path = Macros.time_dir / "run-inline-tests.json"
        if time_file_path.exists():
            time_dict = se.io.load(time_file_path)
        else:
            time_dict = {}
        # install I-Test
        with se.io.cd(Macros.itest_java_dir):
            se.bash.run("mvn clean install -DskipTests", 0)
        log_path = Macros.log_dir / "run-its.log"
        if os.path.exists(log_path):
            os.remove(log_path)
        projects = Util.get_project_names_list_with_sha()
        for project_name, sha in projects:
            if test_project_name is not None and project_name != test_project_name:
                continue
            try:
                deps_file = Util.get_deps_file_path(project_name, sha)
                with se.TimeUtils.time_limit(3600):
                    cached_objects_dir = (
                        Macros.all_tests_dir
                        / f"{project_name}-{sha}"
                        / Macros.INLINE_GEN_DIR_NAME
                    )
                    start_time = time.time()
                    self.run_inline_tests(
                        project_name,
                        sha,
                        f"{Macros.reduced_tests_dir}/{project_name}-{sha}",
                        f"{Macros.reduced_its_dir}/{project_name}-{sha}",
                        f"{Macros.reduced_its_report_dir}/{project_name}-{sha}.json",
                        cached_objects_dir,
                        deps_file,
                        True,
                        log_path,
                    )
                    end_time = time.time()
                    time_dict[f"{project_name}-reduced"] = end_time - start_time

                    start_time = time.time()
                    self.run_inline_tests(
                        project_name,
                        sha,
                        f"{Macros.all_tests_dir}/{project_name}-{sha}",
                        f"{Macros.all_its_dir}/{project_name}-{sha}",
                        f"{Macros.all_its_report_dir}/{project_name}-{sha}.json",
                        cached_objects_dir,
                        deps_file,
                        True,
                        log_path,
                    )
                    end_time = time.time()
                    time_dict[f"{project_name}-all"] = end_time - start_time
            except se.TimeoutException:
                time_dict[project_name] = "timeout"
            except Exception as e:
                time_dict[project_name] = (
                    f"{project_name} {sha}: {traceback.format_exc()}"
                )
        se.io.dump(time_file_path, time_dict, se.io.Fmt.jsonPretty)

    # python -m exli.main run_inline_tests --project_name "Asana_java-asana" --sha "52fef9b"
    # python -m exli.main run_inline_tests --project_name "AquaticInformatics_aquarius-sdk-java" --sha "8f4edb9" --parse_inline_tests True
    def run_inline_tests(
        self,
        project_name: str,
        sha: str,
        generated_tests_dir: str,
        inline_tests_dir: str,
        inlinetest_report_path: str,
        cached_objects_dir: str,
        deps_file: str,
        parse_inline_tests: bool = False,
        log_path: str = None,
    ):
        """
        Run inline tests for a project.

        Args:
            project_name (str): The name of the project.
            sha (str): The commit hash.
            generated_tests_dir (str): The path to the generated tests.
            inline_tests_dir (str): The path to the inline tests.
            inlinetest_report_path (str): The path to store the inline test report.
            cached_objects_dir (str): The path to the cached objects.
            deps_file (str): The path to the dependencies file.
            parse_inline_tests (bool, optional): Whether to force parsing inline tests when inline tests dir is not empty. Defaults to False.
            log_path (str, optional): The path for the log file. Defaults to None.
        """
        # source files with inline tests do not exist
        if not os.path.exists(generated_tests_dir):
            return

        inputs = f"--project_name={project_name} --sha={sha} --generated_tests_dir={generated_tests_dir} --inline_tests_dir={inline_tests_dir} --inlinetest_report_path={inlinetest_report_path} --cached_objects_dir={cached_objects_dir} --deps_file={deps_file} --parse_inline_tests={parse_inline_tests} --log_file_path={log_path}"
        se.bash.run(f'echo "{inputs}" >> {log_path}')

        Util.prepare_project(project_name, sha)

        if not os.path.exists(inline_tests_dir) or parse_inline_tests:
            # parse inline tests
            Util.parse_inline_tests(
                project_name, sha, generated_tests_dir, inline_tests_dir
            )
        # compile and run the generated JUnit tests
        run_res, returncode = Util.run_inline_tests(
            project_name,
            sha,
            inline_tests_dir,
            cached_objects_dir,
            deps_file,
            None,
            log_path,
        )
        if returncode != 0:
            print(
                f"Some inline tests failed for {project_name} {sha} during execution."
            )
        if run_res:
            se.io.dump(
                inlinetest_report_path,
                run_res,
                se.io.Fmt.jsonPretty,
            )

    # python -m exli.main analyze_inline_tests_reports --inline_test_type="reduced"
    def analyze_inline_tests_reports(self, inline_test_type: str):
        """
        Generate a txt file that contains a list of failed tests and a list of passed tests.

        Args:
            inline_test_type(str): reduced or all
        """
        if inline_test_type == "reduced":
            test_report_dir = Macros.reduced_its_report_dir
        elif inline_test_type == "all":
            test_report_dir = Macros.all_its_report_dir
        else:
            raise Exception("unknown inline test type")
        if not os.path.exists(test_report_dir):
            print(f"{test_report_dir} does not exist")
            return
        # iterate all reports in the report directory
        failed_tests = []
        passed_tests = []
        for report_file in os.listdir(test_report_dir):
            if not report_file.endswith(".json"):
                continue
            match = re.search(r"^(.*)-\w+\.json$", report_file)
            if match:
                project_name = match.group(1)
            else:
                continue
            if project_name not in Util.get_project_names_list():
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
                    # collect the passed test
                    passed_tests.append(
                        f"{project_name};{class_name};{target_stmt_linenumber};{inline_test_linenumber}"
                    )

        failed_test_file_path = (
            f"{Macros.results_dir}/{inline_test_type}-failed-tests.txt"
        )
        passed_test_file_path = (
            f"{Macros.results_dir}/{inline_test_type}-passed-tests.txt"
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
        project_to_failed_tests_to_line_nums = collections.defaultdict(
            lambda: collections.defaultdict(list)
        )
        for failed_test in failed_tests:
            project_name = failed_test.split(";")[0]
            full_class_with_line_num = ";".join(failed_test.split(";")[1:3])
            it_line_num = failed_test.split(";")[-1]
            project_to_failed_tests_to_line_nums[project_name][
                full_class_with_line_num
            ].append(it_line_num)

        removed_failed_tests = []
        removed_failed_tests_path = Macros.log_dir / "removed-failed-tests.json"
        num_of_failed_tests = 0
        for (
            project_name,
            failed_tests,
        ) in project_to_failed_tests_to_line_nums.items():
            sha = Util.get_sha(project_name)

            for full_class_with_line_num, line_nums in failed_tests.items():
                full_class_name = full_class_with_line_num.split(";")[0]
                target_line_num = full_class_with_line_num.split(";")[1]

                if inline_test_type == "reduced":
                    file_path = Macros.reduced_tests_dir
                elif inline_test_type == "all":
                    file_path = Macros.all_tests_dir
                else:
                    raise Exception("unknown inline test type")
                file_path_with_inline_test = (
                    file_path
                    / f"{project_name}-{sha}"
                    / (full_class_name.split(r"$")[0].replace(".", "/") + ".java")
                )
                file_content = se.io.load(file_path_with_inline_test, se.io.Fmt.txtList)
                for line_num in line_nums:
                    num_of_failed_tests += 1
                    failed_test = {
                        "project": project_name,
                        "file_path": f"{file_path_with_inline_test}",
                        "full_class": full_class_name,
                        "target_line_number": target_line_num,
                        "it_line_number": line_num,
                        "it": file_content[int(line_num) - 1],
                    }
                    removed_failed_tests.append(failed_test)
                    file_content[int(line_num) - 1] = ""
                se.io.dump(
                    file_path_with_inline_test,
                    file_content,
                    se.io.Fmt.txtList,
                )

        se.io.dump(
            removed_failed_tests_path,
            removed_failed_tests,
            se.io.Fmt.jsonPretty,
        )

    # python -m exli.main batch_find_target_stmts
    def batch_find_target_stmts(self, test_project_name: str = None):
        """
        Collect target statements for each project.

        Args:
            test_project_name (str): The name of the project to be tested. If None, all projects are tested.
        """
        projects = Util.get_project_names_list_with_sha()
        for project_name, sha in projects:
            if test_project_name is not None and project_name != test_project_name:
                continue
            target_stmts_path = (
                Macros.results_dir / "target-stmt" / f"{project_name}-{sha}.txt"
            )
            if not target_stmts_path.parent.exists():
                target_stmts_path.parent.mkdir(parents=True)
            self.find_target_stmts(project_name, sha, target_stmts_path)

    def find_target_stmts(
        self,
        project_name: str,
        sha: str,
        target_stmts_path: str,
    ):
        """
        Find target statements for a project.

        Args:
            project_name (str): org_repo, e.g., https://github.com/Bernardo-MG/velocity-config-tool, the project name is Bernardo-MG_velocity-config-tool
            sha (str): commit hash
            target_stmts_path (str): path to store the target statements
        """
        Util.prepare_project(project_name, sha)
        with se.io.cd(Macros.downloads_dir / project_name):
            full_file_paths = Util.list_java_files(
                f"{Macros.downloads_dir}/{project_name}"
            )
            # find target statements
            print("finding target statements...")
            with se.io.cd(Macros.java_raninline_dir):
                for full_file_path in full_file_paths:
                    is_auto_generated = Util.is_auto_generated_file(full_file_path)
                    if not is_auto_generated:
                        se.bash.run(
                            f'mvn exec:java -Dexec.mainClass="org.raninline.App" -Dexec.args="target-stmt {full_file_path} {target_stmts_path}"',
                            0,
                        )

    # python -m exli.main batch_generate_mutants
    def batch_generate_mutants(
        self,
        skip_existing: bool = False,
        filter_with_inline_tests: bool = True,
        mutator: str = "universalmutator",
        test_project_name: str = None,
    ):
        """
        Generate mutants for each project.

        Args:
            skip_existing(bool): skip project if the mutants file already exists
            filter_with_inline_tests(bool): only generate mutants for target statements that have inline tests
            tool(str): universalmutator or major
            test_project_name(str): only generate mutants for the specified project
        """
        time_file_path = Macros.results_dir / "time" / f"generate-mutants-{mutator}.json"
        if time_file_path.exists():
            time_dict = se.io.load(time_file_path, se.io.Fmt.json)
        else:
            time_dict = {}

        for project_name, sha in Util.get_project_names_list_with_sha():
            if test_project_name is not None and project_name != test_project_name:
                continue
            if filter_with_inline_tests:
                output_path = Macros.mutants_dir / f"{project_name}-{sha}-{mutator}.json"
            else:
                output_path = (
                    Macros.all_mutants_dir / f"{project_name}-{sha}-{mutator}.json"
                )

            if skip_existing and output_path.exists():
                continue

            target_stmts_path = f"{Macros.results_dir}/target-stmt/{project_name}.txt"

            start_time = time.time()
            self.generate_mutants(
                project_name,
                sha,
                target_stmts_path,
                output_path,
                mutator,
                filter_with_inline_tests,
            )
            end_time = time.time()
            time_dict[project_name] = end_time - start_time
        se.io.dump(time_file_path, time_dict, se.io.Fmt.jsonPretty)

    # python -m exli.main generate_mutants
    def generate_mutants(
        self,
        project_name: str,
        sha: str,
        target_stmts_path: str,
        output_path: str,
        mutator: str = "universalmutator",
        filter_with_inline_tests: bool = True,
    ):
        """
        Generate mutants for a project.

        Args:
            project_name (str): The name of the project.
            sha(str): The commit hash.
            target_stmts_path (str): The path to the target statements.
            output_path (str): The path to store the mutants.
            tool (str, optional): The tool to generate mutants. Defaults to "universalmutator".
            filter_with_inline_tests(bool): only generate mutants for target statements that have inline tests
        """
        result = []

        target_stmts = Util.get_target_stmts(
            target_stmts_path, filter_with_inline_tests, project_name
        )

        Util.prepare_project(project_name, sha)

        # loop through lines in file:https://stackoverflow.com/questions/48124206/iterate-through-a-file-lines-in-python
        if mutator == "universalmutator":
            for target_stmt in target_stmts:
                orig_path = target_stmt.split(";")[0]
                line_num = target_stmt.split(";")[1]
                line_results = self.generate_mutants_for_each_line(
                    project_name, orig_path, line_num
                )
                result.extend(line_results)
        elif mutator == "major":
            file_to_line_nums = collections.defaultdict(set)
            for target_stmt in target_stmts:
                orig_path = target_stmt.split(";")[0]
                line_num = target_stmt.split(";")[1]
                file_to_line_nums[orig_path].add(line_num)
            for orig_path, line_nums in file_to_line_nums.items():
                line_results = self.generate_mutants_for_each_file(
                    project_name, orig_path, line_nums
                )
                result.extend(line_results)

        # save results
        if result:
            se.io.dump(
                output_path,
                result,
                se.io.Fmt.jsonPretty,
            )

    # python -m exli.main generate_mutants_for_each_line --project_name Asana_java-asana --orig_path "/home/liuyu/projects/exli-internal/_downloads/AquaticInformatics_aquarius-sdk-java/src/main/java/com/aquaticinformatics/aquarius/sdk/helpers/SdkServiceClient.java" --line_num 191
    def generate_mutants_for_each_line(
        self, project_name: str, orig_path: str, line_num: str
    ):
        results = []

        mutants_path = Macros.log_dir / f"{project_name}-mutants-temp"
        if not mutants_path.exists():
            se.bash.run(f"mkdir -p {mutants_path}")

        line_num_file_path = Macros.log_dir / f"{project_name}-templinenum.txt"
        se.io.dump(line_num_file_path, line_num, se.io.Fmt.txt)
        # Step 3: call UniversalMutator and append json to results (loop through created mutants)
        # https://www.geeksforgeeks.org/how-to-iterate-over-files-in-directory-using-python/

        with se.io.cd(Macros.downloads_dir / project_name):
            # clean the project
            se.bash.run(f"git clean -xfd", 0)
            se.bash.run(f"git checkout .", 0)

        se.bash.run(
            f"mutate {orig_path} --noCheck --mutantDir {mutants_path} --lines {line_num_file_path}",
            0,
        )
        # count number of lines in original file
        orig_line_num = self.file_len(orig_path)
        for filename in os.scandir(mutants_path):
            if filename.is_file():
                mutant_line_num = self.file_len(filename.path)
                # make json here (ignore mutants that insert or delete a line)
                if orig_line_num == mutant_line_num:
                    # check if the project can be compiled
                    compile_result = self.compile_mutated_code(
                        project_name, orig_path, filename.path, line_num
                    )
                    if compile_result:
                        results.append(compile_result)
        # clean
        se.bash.run(f"rm -rf {mutants_path}")
        se.bash.run(f"rm -rf {line_num_file_path}")
        return results

    # https://stackoverflow.com/questions/845058/how-to-get-line-count-of-a-large-file-cheaply-in-python
    def file_len(self, filename: str) -> int:
        with open(filename) as f:
            for i, _ in enumerate(f):
                pass
        return i + 1

    def get_line(self, filename: str, line_num: int) -> str:
        lines = se.io.load(filename, se.io.Fmt.txtList)
        return lines[line_num - 1]

    def compile_mutated_code(
        self, project_name: str, orig_path: str, mutated_file_path: str, line_num: str
    ):
        mutated_code = self.get_line(mutated_file_path, int(line_num))
        if mutated_code.strip().startswith(r"/*") and mutated_code.strip().endswith(
            r"*/"
        ):
            # ignore mutants that are comments
            return {}
        with se.io.cd(Macros.downloads_dir / project_name):
            # clean the project
            se.bash.run(f"git clean -xfd", 0)
            se.bash.run(f"git checkout .", 0)
            # get the original code
            original_code = self.get_line(orig_path, int(line_num))
            # copy the mutated file to the original file
            se.bash.run(f"cp {mutated_file_path} {orig_path}")
            try:
                se.bash.run(f"mvn compile", 0)
                # if the project can be compiled, save the mutant
                return {
                    "filepath": orig_path,
                    "linenumber": int(line_num),
                    "orginal_code": original_code,
                    "mutated_code": mutated_code,
                }
            except:
                # if the project cannot be compiled, ignore the mutant
                return {}

    def generate_mutants_for_each_file(
        self, project_name: str, orig_path: str, line_nums: Set[str]
    ):
        results = []

        mutants_path = Macros.log_dir / f"{project_name}-mutants-temp"
        if not mutants_path.exists():
            se.bash.run(f"mkdir -p {mutants_path}")

        with se.io.cd(Macros.downloads_dir / project_name):
            # clean the project
            se.bash.run(f"git clean -xfd", 0)
            se.bash.run(f"git checkout .", 0)
            # compile the project with javac (required by Major)
            se.bash.run("mvn test-compile $SKIPS", 0)
            randoop_deps_path = f"{Macros.log_dir}/teco-randoop-test/{project_name}/randoop-tests/randoop-deps.txt"
            se.bash.run(f"cp {randoop_deps_path} .", 0)

        with se.io.cd(mutants_path):
            cmd = f"{Macros.major_script} -cp $(< {Macros.downloads_dir}/{project_name}/randoop-deps.txt) --export export.mutants {orig_path}"
            print(cmd)
            se.bash.run(cmd, 0)
            mutants_log_path = mutants_path / "mutants.log"
            mutants_log = se.io.load(mutants_log_path, se.io.Fmt.txtList)
            line_number_to_mutant_ids = collections.defaultdict(set)
            for mutant in mutants_log:
                tokens = mutant.split(":")
                mutant_id = tokens[0]
                mutant_line_num = tokens[-2]
                if mutant_line_num in line_nums:
                    line_number_to_mutant_ids[mutant_line_num].add(mutant_id)
            mutants_dir = mutants_path / "mutants"
            for line_num, mutant_ids in line_number_to_mutant_ids.items():
                for mutant_id in mutant_ids:
                    # find the java file in mutants_dir / mutant_id
                    java_files = glob.glob(
                        f"{mutants_dir}/{mutant_id}/**/*.java", recursive=True
                    )
                    print(f"{mutants_dir}/{mutant_id}/**/*.java")
                    if len(java_files) != 1:
                        print(f"Error: {mutant_id} has {len(java_files)} java files")
                        continue
                    mutant_path = java_files[0]
                    compile_res = self.compile_mutated_code(
                        project_name, orig_path, mutant_path, line_num
                    )
                    if compile_res:
                        results.append(compile_res)
        # clean
        se.bash.run(f"rm -rf {mutants_path}")
        return results


if __name__ == "__main__":
    CLI(Main, as_positional=False)
