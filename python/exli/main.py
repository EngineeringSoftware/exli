import glob
from typing import Set
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

        try:
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
                        time_dict,
                    )
                    end_time = time.time()
                    time_dict[f"{project_name}-{sha}-r1"] = end_time - start_time
                except Exception as e:
                    se.io.dump(
                        log_path,
                        [f"{project_name} {sha}: {traceback.format_exc()}"],
                        se.io.Fmt.txtList,
                        append=True,
                    )
                    continue
        finally:
            se.io.dump(time_res_file, time_dict, se.io.Fmt.jsonPretty)

    # python -m exli.main run --project_name="Asana_java-asana" --sha="52fef9b"
    # python -m exli.main run --project_name="AquaticInformatics_aquarius-sdk-java" --sha="8f4edb9"
    def run(
        self,
        project_name: str,
        sha: str,
        randoop: bool = True,
        randoop_tl: int = 100,
        dev: bool = True,
        evosuite: bool = True,
        evosuite_tl: int = 120,
        seed: int = Macros.DEFAULT_SEED,
        log_path: str = None,
        time_dict: dict = dict(),
    ):
        """
        Generate inline tests for a project.

        Args:
            project_name (str): The name of the project.
            sha (str, optional): The commit hash. If None, the latest commit is used. Defaults to None.
            randoop (bool, optional): Whether to run Randoop to generate tests. Defaults to True.
            randoop_tl (int, optional): The time limit (seconds per class) for Randoop. Defaults to 100.
            dev (bool, optional): Whether to run developer-written unit tests. Defaults to True.
            evosuite (bool, optional): Whether to run EvoSuite to generate tests. Defaults to True.
            evosuite_tl (int, optional): The time limit (seconds per class) for EvoSuite. Defaults to 120.
            seed (int, optional): The seed for test generation. Defaults to Macros.DEFAULT_SEED.
            log_path (str, optional): The path for the log file. Defaults to None.
            time_dict (dict, optional): The dictionary to store the time for each step. Defaults to dict().
        """
        ################################## process input, prepare project ##################################
        if log_path is None:
            log_path = Macros.log_dir / "raninline.log"
        inputs = f"--project_name={project_name} --sha={sha} --randoop={randoop} --randoop_tl={randoop_tl} --dev={dev} --evosuite={evosuite} --evosuite_tl={evosuite_tl} --seed={seed} --log_path={log_path}"
        se.bash.run(f'echo "{inputs}" >> {log_path}')

        Util.compile_raninline()
        Util.remove_jacoco_extension()

        print("preparing project...")
        project = Util.prepare_project(project_name, sha)

        with se.io.cd(Macros.downloads_dir / project_name):
            java_file_paths = Util.list_java_files(
                f"{Macros.downloads_dir}/{project_name}"
            )

        # create a folder to store the r1(reduced) inline tests
        proj_r1_tests_dir = f"{Macros.r1_tests_dir}/{project_name}-{sha}"
        se.io.mkdir(proj_r1_tests_dir, fresh=True)
        # create a folder to store r0(all) inline tests
        proj_r0_tests_dir = f"{Macros.r0_tests_dir}/{project_name}-{sha}"
        se.io.mkdir(proj_r0_tests_dir, fresh=True)

        r1_log_path = f"{Macros.unit_tests_dir}/{project_name}-{sha}/r1-inlinetests.txt"
        if os.path.exists(r1_log_path):
            os.remove(r1_log_path)
        # related Java code: java/raninline/src/main/java/org/raninline/InstrumentHelper.java line 516
        r0_log_path = f"{Macros.unit_tests_dir}/{project_name}-{sha}/r0-inlinetests.txt"
        if os.path.exists(r0_log_path):
            os.remove(r0_log_path)
        classes_dir = f"{Macros.downloads_dir}/{project_name}/target/classes"
        deps_file_path = f"{Macros.unit_tests_dir}/{project_name}-{sha}/deps.txt"

        ################################## Generate Unit Tests ##################################
        with se.io.cd(Macros.downloads_dir / project_name):
            se.bash.run("mvn test-compile " + Macros.SKIPS, 0)

        # generate tests with Randoop / EvoSuite
        unit_tests_dir_dict = dict()
        for tool in [Macros.randoop, Macros.evosuite]:
            if tool == Macros.randoop and not randoop:
                print("skip Randoop...")
                continue
            if tool == Macros.evosuite and not evosuite:
                print("skip EvoSuite...")
                continue
            generated_unit_tests_dir = (
                Macros.unit_tests_dir / f"{project_name}-{sha}" / f"{tool}-tests-{seed}"
            )
            unit_tests_dir_dict[tool] = generated_unit_tests_dir / f"{tool}-tests"
            if not unit_tests_dir_dict[tool].exists():
                classpath_list_path = f"{generated_unit_tests_dir}/classpath-list.txt"
                log_dir = Macros.log_dir / tool
                if tool == Macros.randoop:
                    time_limit = randoop_tl
                elif tool == Macros.evosuite:
                    time_limit = evosuite_tl

                generate_start_time = time.time()
                Generate().generate_tests(
                    project_name,
                    sha,
                    tool,
                    generated_unit_tests_dir,
                    log_dir,
                    seed,
                    time_limit,
                    deps_file_path,
                    classpath_list_path,
                )
                generate_end_time = time.time()
                time_dict[f"{project_name}-{sha}-{tool}"] = (
                    generate_end_time - generate_start_time
                )

        ################################## Instrument ##################################
        Util.prepare_project(project_name, sha)
        print("inserting print statement...")

        instrument_start_time = time.time()
        with se.io.cd(Macros.java_raninline_dir):
            for java_file_path in java_file_paths:
                is_auto_generated = Util.is_auto_generated_file(java_file_path)
                if not is_auto_generated:
                    se.bash.run(
                        f'mvn exec:java -Dexec.mainClass="org.raninline.App" -Dexec.args="i {java_file_path} -1 {log_path} {r0_log_path} {r1_log_path} {classes_dir}"',
                        0,
                    )
        instrument_end_time = time.time()
        time_dict[f"{project_name}-{sha}-instrument"] = (
            instrument_end_time - instrument_start_time
        )

        print("recompiling modified file...")
        with se.io.cd(Macros.downloads_dir / project_name):
            maven_project = MavenProject.from_project(project)
            maven_project.hack_pom_add_dependency(
                "org.raninline", "raninline", "1.0-SNAPSHOT"
            )
            se.bash.run("mvn test-compile " + Macros.SKIPS, 0)

        ################################## Run tests ##################################
        run_tests_log_dir = Macros.log_dir / "run-unit-tests"

        run_tests_start_time = time.time()
        if dev:
            run_tests_log_path = run_tests_log_dir / f"{project_name}-{sha}-dev.log"
            if run_tests_log_path.exists():
                run_tests_log_path.unlink()
            Util.run_unit_tests(
                Macros.dev, project_name, f"{run_tests_log_path}", maven_project
            )
        if evosuite:
            run_tests_log_path = (
                run_tests_log_dir / f"{project_name}-{sha}-evosuite.log"
            )
            if run_tests_log_path.exists():
                run_tests_log_path.unlink()
            Util.run_unit_tests(
                Macros.evosuite,
                project_name,
                f"{run_tests_log_path}",
                maven_project,
                unit_tests_dir_dict[Macros.evosuite],
                deps_file_path,
            )
        if randoop:
            run_tests_log_path = run_tests_log_dir / f"{project_name}-{sha}-randoop.log"
            if run_tests_log_path.exists():
                run_tests_log_path.unlink()
            Util.run_unit_tests(
                Macros.randoop,
                project_name,
                f"{run_tests_log_path}",
                maven_project,
                unit_tests_dir_dict[Macros.randoop],
            )
        run_tests_end_time = time.time()
        time_dict[f"{project_name}-{sha}-run-tests"] = (
            run_tests_end_time - run_tests_start_time
        )

        ################################## Save serialized data ##################################
        se.bash.run(
            f"cp -r {Macros.downloads_dir}/{project_name}/{Macros.INLINE_GEN_DIR_NAME} {proj_r0_tests_dir}"
        )

        ################################## Parse log ##################################
        Util.parse_log(
            project_name,
            sha,
            r1_log_path,
            proj_r1_tests_dir,
            log_path,
        )

        # parse r0 inline tests: for evaluation purposes
        Util.parse_log(
            project_name,
            sha,
            r0_log_path,
            proj_r0_tests_dir,
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
                        Macros.r0_tests_dir
                        / f"{project_name}-{sha}"
                        / Macros.INLINE_GEN_DIR_NAME
                    )
                    start_time = time.time()
                    self.run_inline_tests(
                        project_name,
                        sha,
                        f"{Macros.r1_tests_dir}/{project_name}-{sha}",
                        f"{Macros.r1_its_dir}/{project_name}-{sha}",
                        f"{Macros.r1_its_report_dir}/{project_name}-{sha}.json",
                        cached_objects_dir,
                        deps_file,
                        True,
                        log_path,
                    )
                    end_time = time.time()
                    time_dict[f"{project_name}-{Macros.r1}"] = end_time - start_time

                    start_time = time.time()
                    self.run_inline_tests(
                        project_name,
                        sha,
                        f"{Macros.r0_tests_dir}/{project_name}-{sha}",
                        f"{Macros.r0_its_dir}/{project_name}-{sha}",
                        f"{Macros.r0_its_report_dir}/{project_name}-{sha}.json",
                        cached_objects_dir,
                        deps_file,
                        True,
                        log_path,
                    )
                    end_time = time.time()
                    time_dict[f"{project_name}-{Macros.r0}"] = end_time - start_time
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
        generated_tests_dir: str = None,
        inline_tests_dir: str = None,
        inlinetest_report_path: str = None,
        cached_objects_dir: str = None,
        deps_file: str = None,
        parse_inline_tests: bool = False,
        log_path: str = None,
    ):
        """
        Run inline tests for a project.

        Args:
            project_name (str): The name of the project.
            sha (str): The commit hash.
            generated_tests_dir (str, optional): The path to the generated tests.
            inline_tests_dir (str, optional): The path to the inline tests.
            inlinetest_report_path (str, optional): The path to store the inline test report.
            cached_objects_dir (str, optional): The path to the cached objects.
            deps_file (str, optional): The path to the dependencies file.
            parse_inline_tests (bool, optional): Whether to force parsing inline tests when inline tests dir is not empty. Defaults to False.
            log_path (str, optional): The path for the log file. Defaults to None.
        """
        if generated_tests_dir is None:
            generated_tests_dir = f"{Macros.r0_tests_dir}/{project_name}-{sha}"
        if inline_tests_dir is None:
            inline_tests_dir = f"{Macros.r0_its_dir}/{project_name}-{sha}"
        if inlinetest_report_path is None:
            inlinetest_report_path = (
                f"{Macros.r0_its_report_dir}/{project_name}-{sha}.json"
            )
        if cached_objects_dir is None:
            cached_objects_dir = (
                Macros.r0_tests_dir
                / f"{project_name}-{sha}"
                / Macros.INLINE_GEN_DIR_NAME
            )
        if deps_file is None:
            deps_file = Util.get_deps_file_path(project_name, sha)

        # source files with inline tests do not exist
        if not os.path.exists(generated_tests_dir):
            print(f"{generated_tests_dir} does not exist")
            return

        inputs = f"--project_name={project_name} --sha={sha} --generated_tests_dir={generated_tests_dir} --inline_tests_dir={inline_tests_dir} --inlinetest_report_path={inlinetest_report_path} --cached_objects_dir={cached_objects_dir} --deps_file={deps_file} --parse_inline_tests={parse_inline_tests} --log_path={log_path}"
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

    # python -m exli.main analyze_inline_tests_reports --inline_test_type="r1"
    def analyze_inline_tests_reports(self, inline_test_type: str):
        """
        Generate a txt file that contains a list of failed tests and a list of passed tests.

        Args:
            inline_test_type(str): r0 or r1
        """
        if inline_test_type == Macros.r0:
            test_report_dir = Macros.r0_its_report_dir
        elif inline_test_type == Macros.r1:
            test_report_dir = Macros.r1_its_report_dir
        else:
            raise Exception("unknown inline test type")
        if not os.path.exists(test_report_dir):
            print(f"{test_report_dir} does not exist")
            return
        # iterate all reports in the report directory
        failed_test_file_path = (
            f"{Macros.results_dir}/{inline_test_type}-failed-tests.txt"
        )
        passed_test_file_path = (
            f"{Macros.results_dir}/{inline_test_type}-passed-tests.txt"
        )
        if os.path.exists(failed_test_file_path):
            failed_tests = set(se.io.load(failed_test_file_path, se.io.Fmt.txtList))
        else:
            failed_tests = set()
        passed_tests = set()
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
                    failed_tests.add(
                        f"{project_name};{class_name};{target_stmt_linenumber};{inline_test_linenumber}"
                    )
                else:
                    # collect the passed test
                    passed_tests.add(
                        f"{project_name};{class_name};{target_stmt_linenumber};{inline_test_linenumber}"
                    )

        se.io.dump(
            failed_test_file_path,
            sorted(list(failed_tests)),
            se.io.Fmt.txtList,
        )
        se.io.dump(
            passed_test_file_path,
            sorted(list(passed_tests)),
            se.io.Fmt.txtList,
        )

    # python -m exli.main remove_failed_tests --inline_test_type r1
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

        removed_failed_tests_path = (
            Macros.results_dir / f"{inline_test_type}-removed-failed-tests.json"
        )
        if removed_failed_tests_path.exists():
            removed_failed_tests = se.io.load(removed_failed_tests_path)
        else:
            removed_failed_tests = []

        num_of_failed_tests = 0
        for (
            project_name,
            failed_tests,
        ) in project_to_failed_tests_to_line_nums.items():
            sha = Util.get_sha(project_name)

            for full_class_with_line_num, line_nums in failed_tests.items():
                full_class_name = full_class_with_line_num.split(";")[0]
                target_line_num = full_class_with_line_num.split(";")[1]

                if inline_test_type == Macros.r0:
                    file_path = Macros.r0_tests_dir
                elif inline_test_type == Macros.r1:
                    file_path = Macros.r1_tests_dir
                else:
                    raise Exception("unknown inline test type")
                file_path_with_inline_test = (
                    file_path
                    / f"{project_name}-{sha}"
                    / (full_class_name.split(r"$")[0].replace(".", "/") + ".java")
                )
                if not os.path.exists(file_path_with_inline_test):
                    print(f"no inline test file {file_path_with_inline_test}")
                    continue
                file_content = se.io.load(file_path_with_inline_test, se.io.Fmt.txtList)
                for line_num in line_nums:
                    failed_test = {
                        "project": project_name,
                        "file_path": f"{file_path_with_inline_test}",
                        "full_class": full_class_name,
                        "target_line_number": target_line_num,
                        "it_line_number": line_num,
                        "it": file_content[int(line_num) - 1],
                    }
                    removed_failed_tests.append(failed_test)
                    if file_content[int(line_num) - 1] != "":
                        num_of_failed_tests += 1
                    file_content[int(line_num) - 1] = ""
                # check if there are inline tests left
                num_its = 0
                for line in file_content:
                    if line.strip().startswith(Macros.ITEST_DECLARE + "("):
                        num_its += 1
                if num_its > 0:
                    se.io.dump(
                        file_path_with_inline_test,
                        file_content,
                        se.io.Fmt.txtList,
                    )
                else:
                    se.bash.run(f"rm {file_path_with_inline_test}")

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
        time_file_path = Macros.results_dir / "time" / f"find-target-stmts.json"
        if time_file_path.exists():
            time_dict = se.io.load(time_file_path, se.io.Fmt.json)
        else:
            time_dict = {}

        projects = Util.get_project_names_list_with_sha()
        for project_name, sha in projects:
            if test_project_name is not None and project_name != test_project_name:
                continue
            start_time = time.time()
            target_stmts_path = (
                Macros.results_dir / "target-stmt" / f"{project_name}-{sha}.txt"
            )
            if not target_stmts_path.parent.exists():
                target_stmts_path.parent.mkdir(parents=True)
            self.find_target_stmts(project_name, sha, target_stmts_path)
            end_time = time.time()
            time_dict[project_name] = end_time - start_time
        se.io.dump(time_file_path, time_dict, se.io.Fmt.jsonPretty)

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
        mutator: str = Macros.universalmutator,
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
        time_file_path = (
            Macros.results_dir / "time" / f"generate-mutants-{mutator}.json"
        )
        if time_file_path.exists():
            time_dict = se.io.load(time_file_path, se.io.Fmt.json)
        else:
            time_dict = {}

        for project_name, sha in Util.get_project_names_list_with_sha():
            if test_project_name is not None and project_name != test_project_name:
                continue
            if filter_with_inline_tests:
                output_path = (
                    Macros.mutants_dir / f"{project_name}-{sha}-{mutator}.json"
                )
            else:
                output_path = (
                    Macros.all_mutants_dir / f"{project_name}-{sha}-{mutator}.json"
                )

            if skip_existing and output_path.exists():
                print(
                    f"Skip {project_name} {sha} because the mutants file already exists"
                )
                continue

            target_stmts_path = (
                f"{Macros.results_dir}/target-stmt/{project_name}-{sha}.txt"
            )

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
        mutator: str = Macros.universalmutator,
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
        if mutator == Macros.universalmutator:
            for target_stmt in target_stmts:
                orig_path = target_stmt.split(";")[0]
                line_num = target_stmt.split(";")[1]
                line_results = self.generate_mutants_for_each_line(
                    project_name, orig_path, line_num
                )
                result.extend(line_results)
        elif mutator == Macros.major:
            file_to_line_nums = collections.defaultdict(set)
            for target_stmt in target_stmts:
                orig_path = target_stmt.split(";")[0]
                line_num = target_stmt.split(";")[1]
                file_to_line_nums[orig_path].add(line_num)
            for orig_path, line_nums in file_to_line_nums.items():
                line_results = self.generate_mutants_for_each_file(
                    project_name, sha, orig_path, line_nums
                )
                result.extend(line_results)

        # save results
        if result:
            # for each item in result, add index
            for i, item in enumerate(result):
                item["id"] = i
            se.io.dump(
                output_path,
                result,
                se.io.Fmt.jsonPretty,
            )

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
        self, project_name: str, sha: str, orig_path: str, line_nums: Set[str]
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
            deps_path = f"{Macros.unit_tests_dir}/{project_name}-{sha}/deps.txt"
            se.bash.run(f"cp {deps_path} .", 0)

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
