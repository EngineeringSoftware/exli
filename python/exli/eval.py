import collections
import glob
import os
import time
import traceback
from typing import Dict, List, Set

import seutil as se
from exli.macros import Macros
from exli.reduce import reduce_suite
from exli.util import Util
from jsonargparse import CLI
from tqdm import tqdm
from exli.maven import MavenProject


class Eval:
    def replace_if(self, s: str):
        # remove if from the original code
        if s.startswith("if"):
            s = s[2:].strip()
        if s.endswith("{"):
            s = s[:-1].strip()
        if s.startswith("(") and s.endswith(")"):
            # remove () from the original code
            s = s[1:-1].strip()
        return s

    # python -m exli.eval run_tests_with_mutants --project_name Asana_java-asana
    # install inlinetest-internal/java
    def run_tests_with_mutants(
        self,
        project_name: str,
        sha: str,
        test_types: List[str] = None,
        mutator: str = "universalmutator",
        log_path: str = None,
        seed: int = 42,
    ):
        """
        Apply each mutant to the project and run the inline tests to check if tests can kill the mutant.

        Args:
            project_name (str): The name of the project.
            sha (str): The commit sha of the project.
            test_types (List[str], optional): The types of tests to run. Available options are ["all", "reduced", "unit", "randoop", "evosuite"]. Defaults to None. If None, all types of tests will be run.
            mutator (str, optional): The type of mutator. Available options are ["universalmutator", "major"]. Defaults to "universalmutator".
            log_path (str, optional): The path to save the log file. Defaults to None.
        """
        if sha is None:
            sha = Util.get_sha(project_name)

        if mutator in ["universalmutator", "major"]:
            mutants_file = Macros.mutants_dir / f"{project_name}-{sha}-{mutator}.json"
        else:
            raise Exception(f"Unknown mutant type: {mutator}")
        if not mutants_file.exists():
            print(f"no mutants for {project_name}")
            return

        eval_log = Macros.log_dir / "eval"
        if not eval_log.exists():
            se.bash.run(f"mkdir -p {eval_log}")
        temp_dir = Macros.log_dir / "eval" / "temp"
        if not temp_dir.exists():
            se.bash.run(f"mkdir -p {temp_dir}")

        Util.prepare_project(project_name, sha)

        # execute reduced tests first to check if there is compilation failure
        if test_types is None:
            test_types = ["all", "reduced", "unit", "randoop", "evosuite"]
        for test_type in test_types:
            mutants = se.io.load(mutants_file, se.io.Fmt.json)
            if not mutants:
                print(f"no mutants for {project_name}")
                return
            res = []
            updated_mutants = []
            for index, mutant in enumerate(tqdm(mutants)):
                if "compilation_failure" in mutant and mutant["compilation_failure"]:
                    continue
                original_code = mutant["orginal_code"].strip()
                mutated_code = mutant["mutated_code"].strip()
                file_path = mutant["filepath"]
                line_num = mutant["linenumber"]
                inline_test_name = (
                    file_path.split("/")[-1].split(".")[0] + f"_{line_num}Test.java"
                )
                mutant_res = {}
                # add inline tests to the file
                Util.prepare_project(project_name, sha)
                with se.io.cd(Macros.downloads_dir / project_name):
                    if test_type in ["unit", "randoop", "evosuite"]:
                        # replace the original code with the mutated code
                        file_content = se.io.load(file_path, se.io.Fmt.txt)
                        lines = file_content.splitlines()
                        lines[line_num - 1] = mutated_code
                        se.io.dump(file_path, "\n".join(lines), se.io.Fmt.txt)
                    elif test_type in ["all", "reduced"]:
                        inline_test_fqn = Util.get_full_class_name(file_path)
                        inline_test_path_with_package = (
                            inline_test_fqn.replace(".", "/") + ".java"
                        )
                        if test_type == "all":
                            file_path_with_inline_test = Macros.all_tests_dir
                        else:
                            file_path_with_inline_test = Macros.reduced_tests_dir
                        file_path_with_inline_test = (
                            file_path_with_inline_test
                            / f"{project_name}-{sha}"
                            / inline_test_path_with_package
                        )
                        if not file_path_with_inline_test.exists():
                            print("file not exist", file_path_with_inline_test)
                            continue
                        file_path_with_inline_test_temp = (
                            temp_dir / inline_test_path_with_package
                        )
                        se.bash.run(
                            f"mkdir -p {os.path.dirname(file_path_with_inline_test_temp)}"
                        )
                        se.bash.run(
                            f"cp {file_path_with_inline_test} {file_path_with_inline_test_temp}"
                        )
                        file_content = se.io.load(
                            file_path_with_inline_test_temp, se.io.Fmt.txt
                        )

                        if original_code in file_content:
                            file_content = file_content.replace(
                                original_code, mutated_code
                            )
                            se.io.dump(
                                file_path_with_inline_test_temp,
                                file_content,
                                se.io.Fmt.txt,
                            )
                        else:
                            # replace the original code with the mutated code
                            # String buildNumber = matcher.group( 4 ) in the file content may be String buildNumber = matcher.group(4)
                            remove_space_original_code = original_code.replace(" ", "")
                            lines = file_content.splitlines()
                            replace = False
                            new_lines = []
                            for line in lines:
                                if line != "" and line.strip().replace(
                                    " ", ""
                                ).startswith(remove_space_original_code):
                                    new_line = (
                                        mutated_code
                                        + line.strip().replace(" ", "")[
                                            len(remove_space_original_code) :
                                        ]
                                    )
                                    new_lines.append(new_line)
                                    replace = True
                                else:
                                    new_lines.append(line)
                            if not replace:
                                error_message = f"cannot find {original_code} in {file_path_with_inline_test}"
                                print(error_message)
                                if log_path:
                                    se.io.dump(
                                        log_path,
                                        [error_message],
                                        se.io.Fmt.txtList,
                                        append=True,
                                    )
                                continue

                            se.io.dump(
                                file_path_with_inline_test_temp,
                                "\n".join(new_lines),
                                se.io.Fmt.txt,
                            )
                        # replace the target statement original code with the mutated code
                        # exist, test_path = Util.find_inline_test(
                        #     inline_test_name, inline_test_dir
                        # )
                        # print("exist test path", exist, test_path)
                        # if exist:
                        #     test_path = f"{inline_test_dir}/{test_path}"
                        #     file_content = se.io.load(test_path, se.io.Fmt.txt)
                        if test_type == "all":
                            Util.parse_inline_tests(
                                project_name,
                                sha,
                                f"{Macros.all_tests_dir}/{project_name}-{sha}",
                                f"{Macros.all_its_dir}/{project_name}-{sha}",
                                file_path_with_inline_test_temp,
                            )
                        elif test_type == "reduced":
                            Util.parse_inline_tests(
                                project_name,
                                sha,
                                f"{Macros.reduced_tests_dir}/{project_name}-{sha}",
                                f"{Macros.reduced_its_dir}/{project_name}-{sha}",
                                file_path_with_inline_test_temp,
                            )
                        # clean the temp file
                        se.bash.run(f"rm {file_path_with_inline_test_temp}")
                    # add timeout when running tests
                    if test_type in ["reduced", "all"]:
                        log_file = (
                            eval_log
                            / f"{project_name}-{sha}-{test_type}-{inline_test_name}-{index}-{mutator}.log"
                        )
                    else:
                        # no enough space to save all the log files
                        log_file = (
                            eval_log / f"{project_name}-{sha}-{test_type}-{mutator}.log"
                        )
                    if log_file.exists():
                        # remove the log file if it exists
                        se.bash.run(f"rm {log_file}")
                    try:
                        with se.TimeUtils.time_limit(600):
                            deps_file = (
                                Macros.unit_tests_dir
                                / f"{project_name}-{sha}"
                                / "deps.txt"
                            )
                            end_time = -1
                            start_time = time.time()
                            if test_type == "all":
                                # run all inline tests
                                run_res, returncode = Util.run_inline_tests(
                                    project_name,
                                    sha,
                                    f"{Macros.all_its_dir}/{project_name}-{sha}",
                                    f"{Macros.all_tests_dir}/{project_name}-{sha}/{Macros.INLINE_GEN_DIR_NAME}",
                                    deps_file,
                                    inline_test_name,
                                )
                            elif test_type == "reduced":
                                # run inline tests
                                run_res, returncode = Util.run_inline_tests(
                                    project_name,
                                    sha,
                                    f"{Macros.reduced_its_dir}/{project_name}-{sha}",
                                    f"{Macros.all_tests_dir}/{project_name}-{sha}/{Macros.INLINE_GEN_DIR_NAME}",
                                    deps_file,
                                    inline_test_name,
                                )
                            elif test_type == "unit":
                                # run unit tests
                                returncode = Util.run_dev_written_unit_tests(
                                    project_name, log_file
                                )
                            elif test_type == "randoop":
                                # run randoop tests
                                generated_tests_dir = (
                                    Macros.unit_tests_dir
                                    / f"{project_name}-{sha}"
                                    / f"randoop-tests-{seed}"
                                )
                                returncode = Util.run_randoop(
                                    project_name, generated_tests_dir, log_file
                                )
                            elif test_type == "evosuite":
                                # run evosuite tests
                                generated_tests_dir = (
                                    Macros.unit_tests_dir
                                    / f"{project_name}-{sha}"
                                    / f"evosuite-tests-{seed}"
                                )
                                returncode = Util.run_evosuite_command_line(
                                    project_name,
                                    generated_tests_dir,
                                    deps_file,
                                    log_file,
                                )
                            end_time = time.time()
                            if test_type == "all" or test_type == "reduced":
                                if run_res == "compilation failure":
                                    mutant["compilation_failure"] = True
                                else:
                                    mutant["compilation_failure"] = False
                                updated_mutants.append(mutant)
                                if mutant["compilation_failure"]:
                                    continue
                                se.io.dump(log_file, run_res, se.io.Fmt.jsonPretty)
                    except se.TimeoutException:
                        mutant_res[f"{test_type}-killed"] = False
                        mutant_res[f"{test_type}-time"] = 600
                        res.append(mutant_res)
                        continue
                    except Exception as e:
                        print("error", e)
                        if end_time == -1:
                            end_time = time.time()
                        mutant_res[f"{test_type}-killed"] = False
                        mutant_res[f"{test_type}-time"] = end_time - start_time
                        res.append(mutant_res)
                        continue
                    if returncode == 0:
                        mutant_res[f"{test_type}-killed"] = False
                    else:
                        mutant_res[f"{test_type}-killed"] = True
                    mutant_res[f"{test_type}-time"] = end_time - start_time
                print("mutant_res", mutant_res)
                res.append(mutant_res)
            # save the results
            mutants_result_dir = Macros.results_dir / "mutants-eval-results"
            if not os.path.exists(mutants_result_dir):
                se.bash.run(f"mkdir -p {mutants_result_dir}")
            output_file = (
                mutants_result_dir / f"{project_name}-{sha}-{mutator}-{test_type}.json"
            )
            se.io.dump(
                output_file,
                res,
                se.io.Fmt.jsonPretty,
            )
            if test_type == "reduced" or test_type == "all":
                se.io.dump(
                    mutants_file,
                    updated_mutants,
                    se.io.Fmt.jsonPretty,
                )

    # python -m exli.eval batch_run_tests_with_mutants
    def batch_run_tests_with_mutants(
        self,
        test_types: List[str] = None,
        mutator: str = "universalmutator",
        test_project_name: str = None,
    ):
        """
        Batch process all projects to run tests after applying each mutant to source, and check if tests can kill the mutant.

        Args:
            test_types (List[str], optional): The types of tests to run. Available options are ["all", "reduced", "unit", "randoop", "evosuite"]. Defaults to None. If None, all types of tests will be run.
            mutator (str, optional): The type of mutator. Available options are ["universalmutator", "major"]. Defaults to "universalmutator".
            test_project_name (str, optional): The name of the project to be tested. If None, run tests for all projects. Defaults to None.
        """
        if test_types is None:
            test_types = ["all", "reduced", "unit", "randoop", "evosuite"]

        time_file = (
            Macros.results_dir / "time" / f"batch-run-tests-with-mutants-{mutator}.json"
        )
        if time_file.exists():
            res_dict = se.io.load(time_file, se.io.Fmt.json)
        else:
            res_dict = {}

        log_path = Macros.log_dir / "run-tests-with-mutants.log"
        if log_path.exists():
            se.bash.run(f"rm {log_path}")

        proj_sha_list = Util.get_project_names_list_with_sha()
        for project_name, sha in proj_sha_list:
            if test_project_name is not None and project_name != test_project_name:
                continue

            start_time = time.time()
            self.run_tests_with_mutants(
                project_name,
                sha,
                test_types,
                mutator,
                log_path,
            )
            end_time = time.time()
            res_dict[f"{project_name}-time"] = end_time - start_time

        se.io.dump(
            time_file,
            res_dict,
            se.io.Fmt.jsonPretty,
        )

    # python -m exli.eval batch_test_to_killed_mutants --mutator "universalmutator"
    def batch_test_to_killed_mutants(
        self, mutator: str = "universalmutator", test_project_name: str = None
    ):
        """
        Batch process all projects to get the killed mutants for each test.

        Args:
            mutator (str, optional): The tool used to generate mutants. Defaults to "universalmutator".
            test_project_name (str, optional): The name of the project to be tested. If None, collect the mapping from test to killed mutants for all projects. Defaults to None.
        """
        for project_name, sha in Util.get_project_names_list_with_sha():
            if test_project_name is not None and project_name != test_project_name:
                continue
            self.test_to_killed_mutants(project_name, sha, mutator, "all")
            self.test_to_killed_mutants(project_name, sha, mutator, "reduced")

    # python -m exli.eval test_to_killed_mutants
    # --test_type "reduced"
    def test_to_killed_mutants(
        self,
        project_name: str,
        sha: str,
        mutator: str = "universalmutator",
        test_type: str = "all",
    ):
        """
        Get the killed mutants for each test.

        Args:
            project_name (str): The name of the project.
            sha (str): The commit sha of the project.
            mutator (str, optional): The type of mutator. Available options are ["universalmutator", "major"]. Defaults to "universalmutator".
            test_type (str, optional): The type of tests to run. Available options are ["all", "reduced"]. Defaults to "all".
        """
        killed_mutants_file = (
            Macros.results_dir
            / "killed-mutants"
            / f"{project_name}-{sha}-{mutator}-{test_type}.json"
        )

        killed_mutants_res = []

        if mutator in ["universalmutator", "major"]:
            mutants_file = Macros.mutants_dir / f"{project_name}-{sha}-{mutator}.json"
        else:
            raise Exception("unknown mutant type")

        if not mutants_file.exists():
            return
        mutants = se.io.load(mutants_file, se.io.Fmt.json)
        for index, mutant in enumerate(mutants):
            # log/eval/AquaticInformatics_aquarius-sdk-java-8f4edb9-all-AquariusServerVersion_19Test.java-0-{mutator}.log
            filepath = mutant["filepath"]
            linenumber = mutant["linenumber"]
            test_name = (
                filepath.split("/")[-1].replace(".java", "") + f"_{linenumber}Test.java"
            )
            mutation_res_file = (
                Macros.log_dir
                / "eval"
                / f"{project_name}-{sha}-{test_type}-{test_name}-{index}-{mutator}.log"
            )
            if not mutation_res_file.exists():
                print(f"file not exist: {mutation_res_file}")
                continue
            report = se.io.load(mutation_res_file, se.io.Fmt.json)
            if report is None or "testcase" not in report["testsuite"]:
                print(f"{mutation_res_file} is null")
                continue
            test_cases = report["testsuite"]["testcase"]
            if not isinstance(test_cases, list):
                test_cases = [test_cases]
            for test_case in test_cases:
                if "failure" in test_case or "error" in test_case:
                    target_stmt_linenumber = (
                        test_case["@classname"]
                        .split(".")[-1]
                        .split("_")[-1]
                        .replace("Test", "")
                    )
                    inline_test_linenumber = (
                        test_case["@name"].replace("testLine", "").replace("()", "")
                    )
                    killed_mutants_item = {
                        "test_class_name": test_case["@classname"],
                        "test_method_name": test_case["@name"],
                        "target_stmt_linenumber": target_stmt_linenumber,
                        "inline_test_linenumber": inline_test_linenumber,
                        "killed_mutant_index": index,
                        "killed_mutant_file_path": filepath,
                    }
                    killed_mutants_res.append(killed_mutants_item)

        se.io.dump(
            killed_mutants_file,
            killed_mutants_res,
            se.io.Fmt.jsonPretty,
        )

    # python -m exli.eval format_test_to_killed_mutants
    # --test_type all --test_type reduced
    def format_test_to_killed_mutants(
        self, test_type: str, mutator: str = "universalmutator"
    ):
        result_file = (
            Macros.results_dir / f"test-to-killed-mutants-{test_type}-{mutator}.txt"
        )
        results = []
        test_to_killed_mutants_dict = collections.defaultdict(set)
        for project_name, sha in Util.get_project_names_list_with_sha():
            test_to_killed_mutants_dict.update(
                self.get_test_to_killed_mutants(project_name, sha, test_type, mutator)
            )
        for test_name, killed_mutants in test_to_killed_mutants_dict.items():
            results.append(test_name + "," + ",".join(killed_mutants))
        se.io.dump(result_file, results, se.io.Fmt.txtList)

    def get_test_to_killed_mutants(
        self,
        project_name: str,
        sha: str,
        test_type: str,
        mutator: str = "universalmutator",
    ):
        test_to_killed_mutants_dict = collections.defaultdict(set)
        killed_mutants_file = (
            Macros.results_dir
            / "killed-mutants"
            / f"{project_name}-{sha}-{mutator}-{test_type}.json"
        )
        if not killed_mutants_file.exists():
            return test_to_killed_mutants_dict
        killed_mutants = se.io.load(killed_mutants_file, se.io.Fmt.json)
        for killed_mutant in killed_mutants:
            test_class_name = killed_mutant["test_class_name"]
            test_method_name = killed_mutant["test_method_name"]
            mutant_index = killed_mutant["killed_mutant_index"]
            test_to_killed_mutants_dict[
                project_name + "#" + test_class_name + "#" + test_method_name
            ].add(f"{project_name}-{mutant_index}")
        return test_to_killed_mutants_dict

    # python -m exli.eval check_minimized_results
    def check_minimized_results(self):
        minizied_results_dir = Macros.results_dir / "minimized-inline-tests"
        # iterate over all minimized results
        for minimized_result_file in minizied_results_dir.glob("*.txt"):
            minimized_results = se.io.load(minimized_result_file, se.io.Fmt.txtList)
            # extract file name
            print(minimized_result_file.name, len(minimized_results))

    # python -m exli.eval add_back_tests
    def add_back_tests(
        self, project_name: str, sha: str, mutator: str = "universalmutator"
    ):
        # add back tests in R0 that can kill mutants not killed by tests in R1
        if mutator in ["universalmutator", "major"]:
            initial_mutants_result_file = (
                Macros.results_dir
                / "mutants-eval-results"
                / f"{project_name}-{sha}-{mutator}-all.json"
            )
        else:
            raise Exception("Invalid mutant type")

        if not initial_mutants_result_file.exists():
            return []
        initial_mutants_result = se.io.load(initial_mutants_result_file, se.io.Fmt.json)

        if mutator in ["universalmutator", "major"]:
            reduced_mutants_result_file = (
                Macros.results_dir
                / "mutants-eval-results"
                / f"{project_name}-{sha}-{mutator}-reduced.json"
            )
        else:
            raise Exception("Invalid mutant type")

        if not reduced_mutants_result_file.exists():
            return []
        reduced_mutants_result = se.io.load(reduced_mutants_result_file, se.io.Fmt.json)

        killed_mutant_to_tests_dict = collections.defaultdict(set)
        killed_mutants_file = (
            Macros.results_dir
            / "killed-mutants"
            / f"{project_name}-{sha}-{mutator}-all.json"
        )

        if not killed_mutants_file.exists():
            return []
        killed_mutants = se.io.load(killed_mutants_file, se.io.Fmt.json)
        for killed_mutant in killed_mutants:
            test_class_name = killed_mutant["test_class_name"]
            test_method_name = killed_mutant["test_method_name"]
            mutant_index = killed_mutant["killed_mutant_index"]
            # have to mark the source here, because the inline test line number is different between all and reduced
            killed_mutant_to_tests_dict[mutant_index].add(
                project_name + "#" + test_class_name + "#" + test_method_name + "#all"
            )

        mutants_to_add_back_tests = collections.defaultdict(set)
        for index, mutated_result in enumerate(reduced_mutants_result):
            if mutated_result["reduced-killed"]:
                continue
            else:
                initial_killed = initial_mutants_result[index]["all-killed"]
                if initial_killed:
                    # add back the test that can kill the mutant
                    if killed_mutant_to_tests_dict[index]:
                        mutants_to_add_back_tests[f"{project_name}-{index}"].update(
                            killed_mutant_to_tests_dict[index]
                        )
        return mutants_to_add_back_tests

    # python -m exli.eval batch_add_back_tests
    def batch_add_back_tests(
        self, mutator: str = "universalmutator", test_project_name: str = None
    ):
        """
        Batch process all projects to add back tests (from all inline tests) for mutants that are not killed by reduced tests.

        Args:
            mutator (str, optional): The type of mutator. Defaults to "universalmutator".
            test_project_name (str, optional): The name of the project to be tested. If None, adding back tests for all projects. Defaults to None.
        """
        all_mutants_to_add_back_tests = collections.defaultdict(set)
        for project_name, sha in Util.get_project_names_list_with_sha():
            if test_project_name is not None and project_name != test_project_name:
                continue
            mutants_to_add_back_tests = self.add_back_tests(project_name, sha, mutator)
            print(project_name, len(mutants_to_add_back_tests))
            all_mutants_to_add_back_tests.update(mutants_to_add_back_tests)
        # all mutants to add back tests -> test to killed mutants
        addback_t2m = collections.defaultdict(set)
        for mutant, tests in all_mutants_to_add_back_tests.items():
            for test in tests:
                addback_t2m[test].add(mutant)
        # dump the results
        se.io.dump(
            Macros.results_dir / f"add-back-tests-to-killed-mutants-{mutator}.txt",
            [
                test + "," + ",".join(sorted(mutants))
                for test, mutants in addback_t2m.items()
            ],
            se.io.Fmt.txtList,
        )

        # merge with reduced tests
        reduced_t2m = self.get_test_to_killed_mutants("reduced", mutator)
        merged_t2m = collections.defaultdict(set)
        for test, mutants in reduced_t2m.items():
            merged_t2m[test].update(mutants)
        for test, mutants in addback_t2m.items():
            merged_t2m[test].update(mutants)
        se.io.dump(
            Macros.results_dir / f"merged-tests-to-killed-mutants-{mutator}.txt",
            [
                test + "," + ",".join(sorted(mutants))
                for test, mutants in merged_t2m.items()
            ],
            se.io.Fmt.txtList,
        )

    # python -m exli.eval minimize_tests
    def minimize_tests(self, mutator: str = "universalmutator"):
        """
        Minimize the tests that can kill the mutants.

        Args:
            mutator (str, optional): The type of mutator. Defaults to "universalmutator".
        """
        data_file = Macros.results_dir / f"merged-tests-to-killed-mutants-{mutator}.txt"
        orig_file = se.io.mktmp("exli")
        se.bash.run(f"cut -d, -f1 '{data_file}' > '{orig_file}'", 0)
        for algorithm in Macros.test_minimization_algorithms:
            out_file = Macros.results_dir / "minimized" / f"{algorithm}-{mutator}.txt"
            # run test minimization scripts
            reduce_suite(
                data_file=data_file,
                orig_file=orig_file,
                algorithm=algorithm,
                out=out_file,
                tiebreak_map={},  # no tiebreak
            )
            # sort results
            selected_tests = se.io.load(out_file, se.io.Fmt.txtList)
            se.io.dump(out_file, sorted(selected_tests), se.io.Fmt.txtList)
        se.io.rm(orig_file)

    # python -m exli.eval get_not_mutated_inline_tests
    def get_not_mutated_inline_tests(self, mutator: str = "universalmutator"):
        # format of reduced-passed-tests.txt
        # mp911de_logstash-gelf;biz.paluch.logging.gelf.wildfly.WildFlyJsonFormatter;119;120
        target_stmt_to_inline_tests = Util.get_target_stmt_to_inline_tests(
            Macros.results_dir / "reduced-passed-tests.txt"
        )
        print(f"{len(target_stmt_to_inline_tests)=}")
        mutated_target_stmts = set()
        for project_name in Util.get_project_names_list():
            if mutator == "universalmutator":
                mutant_file = Macros.results_dir / "mutants" / f"{project_name}.json"
            elif mutator == "major":
                mutant_file = (
                    Macros.results_dir / "mutants" / f"{project_name}-major.json"
                )
            else:
                raise Exception("unknown mutant type")

            if not mutant_file.exists():
                continue
            print(f"loading {mutant_file}")
            mutated_results = se.io.load(mutant_file)
            for mutated_result in mutated_results:
                classname = Util.file_path_to_class_name(mutated_result["filepath"])
                mutated_target_stmt = (
                    f"{project_name};{classname};{mutated_result['linenumber']}"
                )
                mutated_target_stmts.add(mutated_target_stmt)

        print(f"{len(mutated_target_stmts)=}")
        not_mutated_inline_tests = set()
        for target_stmt, inline_tests in target_stmt_to_inline_tests.items():
            if target_stmt not in mutated_target_stmts:
                not_mutated_inline_tests.update(inline_tests)
        print("number of not mutated inline tests:", len(not_mutated_inline_tests))
        return not_mutated_inline_tests

    # python -m exli.eval save_not_mutated_inline_tests
    def save_not_mutated_inline_tests(self, mutator: str = "universalmutator"):
        se.io.dump(
            Macros.results_dir / f"not-mutated-inline-tests-{mutator}.txt",
            sorted(self.get_not_mutated_inline_tests(mutator=mutator)),
            se.io.Fmt.txtList,
        )

    # python -m exli.eval save_r2_inline_test_no_source_code
    def save_r2_inline_test_no_source_code(self, mutator: str = "universalmutator"):
        not_mutated_inline_tests = se.io.load(
            Macros.results_dir / f"not-mutated-inline-tests-{mutator}.txt",
            se.io.Fmt.txtList,
        )
        updated_not_mutated_inline_tests = []
        # format tests in not_mutated_inline_tests
        # from wmixvideo_nfe;com.fincatto.documentofiscal.validadores.DFStringValidador;823;874
        # to Asana_java-asana#com.asana.resources.ProjectStatuses_24Test#testLine28()
        for not_mutated_inline_test in not_mutated_inline_tests:
            (
                project_name,
                classname,
                target_line,
                inline_test_line,
            ) = not_mutated_inline_test.split(";")
            updated_not_mutated_inline_test = f"{project_name}#{classname}_{target_line}Test#testLine{inline_test_line}()"
            updated_not_mutated_inline_tests.append(updated_not_mutated_inline_test)
        for algorithm in Macros.test_minimization_algorithms:
            minimized_file = (
                Macros.results_dir / "minimized" / f"{algorithm}-{mutator}.txt"
            )
            minimized_tests = se.io.load(minimized_file, se.io.Fmt.txtList)
            r2_inline_tests = []
            r2_inline_tests.extend(minimized_tests)
            r2_inline_tests.extend(updated_not_mutated_inline_tests)
            se.io.dump(
                Macros.results_dir / "r2" / f"{algorithm}-{mutator}.txt",
                sorted(r2_inline_tests),
                se.io.Fmt.txtList,
            )

    # python -m exli.eval check_set_of_reduction_results
    def check_set_of_reduction_results(self):
        algo_to_tests = collections.defaultdict(list)
        new_algo_to_tests = collections.defaultdict(list)
        for algorithm in Macros.test_minimization_algorithms:
            file_path = (
                Macros.results_dir / "minimized" / f"{algorithm}-minimized-all.txt"
            )
            tests = se.io.load(file_path, se.io.Fmt.txtList)
            algo_to_tests[algorithm].extend(tests)

            new_file_path = (
                Macros.results_dir / "minimized-o" / f"{algorithm}-minimized-all.txt"
            )
            new_tests = se.io.load(new_file_path, se.io.Fmt.txtList)
            new_algo_to_tests[algorithm].extend(new_tests)
        # check if the list of tests are the same
        for algo1, tests1 in algo_to_tests.items():
            for algo2, tests2 in algo_to_tests.items():
                if algo1 == algo2:
                    continue
                if set(tests1) != set(tests2):
                    # find the difference
                    diff = set(tests1) - set(tests2)
                    print(algo1, algo2, len(diff))
            new_tests = new_algo_to_tests[algo1]
            if set(tests1) != set(new_tests):
                # find the difference
                diff = set(tests1) - set(new_tests)
                print(algo1, "new", len(diff))

    def line_number_to_test(self, test_type: str, project_name: str, sha: str = None):
        if sha is None:
            sha = Util.get_sha(project_name)

        with se.io.cd(Macros.downloads_dir / project_name):
            se.bash.run("git clean -xfd")
            se.bash.run("git checkout .")
            se.bash.run(f"git checkout {sha}")
        line_no_to_test = dict()
        if test_type == "reduced":
            source_code_dir_path = Macros.reduced_tests_dir / f"{project_name}-{sha}"
        elif test_type == "all":
            source_code_dir_path = Macros.all_tests_dir / f"{project_name}-{sha}"
        else:
            raise Exception(f"invalid test type: {test_type}")
        java_files = glob.glob(
            f"{source_code_dir_path}" + "/**/*.java",
            recursive=True,
        )
        for java_file in java_files:
            classlastname = java_file.replace(".java", "").split("/")[-1]
            java_file_content = se.io.load(java_file, se.io.Fmt.txtList)
            line_index = 0
            while line_index < len(java_file_content):
                line = java_file_content[line_index]
                if line.strip().startswith("package"):
                    package_name = line.strip().replace(";", "").split(" ")[1].strip()
                    classname = f"{package_name}.{classlastname}"
                elif line.strip().startswith("new Here"):
                    line_no = line_index + 1
                    inline_test_code = line.strip()
                    while not line.strip().endswith(";"):
                        line_index += 1
                        line = java_file_content[line_index]
                        inline_test_code += line.strip()
                    # /home/user/projects/exli-internal/_downloads/wmixvideo_nfe/src/main/java/com/fincatto/documentofiscal/validadores/DFBigDecimalValidador.java;83;new Here("Unit", 83).given(tamanho,7).given(valor,"50.xml").given(posicaoPontoFlutuante,2).checkFalse(group());
                    target_stmt_line_no = (
                        inline_test_code.split(")")[0].split(",")[-1].strip()
                    )
                    # find the java file path with class name
                    filepaths = glob.glob(
                        f"{Macros.downloads_dir}/{project_name}"
                        + f"/**/{classname.replace(r'.', r'/')}.java",
                        recursive=True,
                    )
                    if len(filepaths) != 1:
                        print(filepaths)
                        raise Exception(
                            f"cannot find the file path for {classlastname}"
                        )
                    line_no_to_test[classname + "#" + str(line_no)] = (
                        filepaths[0]
                        + ";"
                        + target_stmt_line_no
                        + ";"
                        + inline_test_code
                    )
                line_index += 1
        return line_no_to_test

    # python -m exli.eval add_merged_tests_to_log_file
    def add_merged_tests_to_log_file(
        self, input_type: str = "merged", mutator: str = "universalmutator"
    ):
        # load merged tests
        if input_type == "merged":
            merged_tests_to_killed_mutants_file = (
                Macros.results_dir / f"merged-tests-to-killed-mutants-{mutator}.txt"
            )
            merged_tests_to_killed_mutants = se.io.load(
                merged_tests_to_killed_mutants_file, se.io.Fmt.txtList
            )
            merged_tests = [
                merged_test.split(",")[0]
                for merged_test in merged_tests_to_killed_mutants
            ]
        else:
            merged_tests = se.io.load(
                Macros.results_dir / "r2" / f"{input_type}-{mutator}.txt",
                se.io.Fmt.txtList,
            )
        proj_to_merged_tests = collections.defaultdict(list)
        for merged_test in merged_tests:
            if not merged_test:
                continue
            # mpatric_mp3agic#com.mpatric.mp3agic.MpegFrame_92Test#testLine250()#all
            proj = merged_test.split("#")[0]
            proj_to_merged_tests[proj].append(merged_test)
        for proj, merged_test_list in proj_to_merged_tests.items():
            sha = Util.get_sha(proj)
            res_file_path = (
                Macros.reduced_tests_dir
                / f"{proj}-{sha}"
                / f"inlinetest-log-{input_type}.txt"
            )
            res_list = []
            # load class to inline tests
            class_line_no_to_all_inline_test = self.line_number_to_test(
                "all", proj, sha
            )
            class_line_no_to_reduced_inline_test = self.line_number_to_test(
                "reduced", proj, sha
            )
            for merged_test in merged_test_list:
                # test_class_lastname = (
                #     merged_test.split("#")[1].split("_")[-2].split(".")[-1]
                # )
                test_class = merged_test.split("#")[1].rsplit("_", 1)[0]
                test_method = merged_test.split("#")[2]
                test_line_no = (
                    merged_test.split("#")[2].replace("testLine", "").replace("()", "")
                )
                print(proj, merged_test, test_class, test_method, test_line_no)
                if merged_test.endswith("all"):
                    res_list.append(
                        class_line_no_to_all_inline_test[
                            test_class + "#" + test_line_no
                        ]
                    )
                else:
                    res_list.append(
                        class_line_no_to_reduced_inline_test[
                            test_class + "#" + test_line_no
                        ]
                    )

            se.io.dump(res_file_path, res_list, se.io.Fmt.txtList)

    # python -m exli.eval batch_add_merged_tests_to_log_file
    def batch_add_merged_tests_to_log_file(self):
        self.add_merged_tests_to_log_file("merged")
        for algo in Macros.test_minimization_algorithms:
            self.add_merged_tests_to_log_file(algo)

    # python -m exli.eval batch_parse_log_file
    def batch_parse_log_file(self):
        log_path = Macros.log_dir / "parse-log.log"
        for input_type in ["merged"] + Macros.test_minimization_algorithms:
            generated_tests_dir = Macros.project_dir / f"{input_type}-tests"
            se.io.mkdir(generated_tests_dir, fresh=True)

            for project_name, sha in Util.get_project_names_list_with_sha():
                inline_test_log_path = f"{Macros.reduced_tests_dir}/{project_name}-{sha}/inlinetest-log-{input_type}.txt"
                if not os.path.exists(inline_test_log_path):
                    continue

                proj_generated_tests_dir = f"{generated_tests_dir}/{project_name}-{sha}"
                # create the directory if not exist
                if not os.path.exists(proj_generated_tests_dir):
                    os.makedirs(proj_generated_tests_dir)

                Util.parse_log(
                    project_name,
                    sha,
                    inline_test_log_path,
                    proj_generated_tests_dir,
                    log_path,
                )

    # python -m exli.eval add_passing_tests_into_java_files
    # --test_type "reduced" or "all"
    def add_passing_tests_into_java_files(self, test_type: str = "all"):
        all_pass_test_file = Macros.results_dir / f"{test_type}-passed-tests.txt"
        if test_type == "all":
            java_files_root_dir = (
                Macros.project_dir / "supplementary-materials" / "R0-tests"
            )
        elif test_type == "reduced":
            java_files_root_dir = (
                Macros.project_dir / "supplementary-materials" / "R1-tests"
            )
        else:
            raise ValueError(f"Unknown test type: {test_type}")
        all_proj_to_stmts, _ = Util.get_projs_to_stmts_and_inline_tests(
            all_pass_test_file
        )
        total_excluded_inline_tests = 0
        total_kept_inline_tests = 0
        for project_name, sha in Util.get_project_names_list_with_sha():
            excluded_inline_tests = 0
            passed_stmts = all_proj_to_stmts[project_name]
            java_files_dir = java_files_root_dir / f"{project_name}-{sha}"
            if not os.path.exists(java_files_dir):
                print(f"java files dir not exist: {java_files_dir}")
                continue
            java_files = glob.glob(f"{java_files_dir}/**/*.java", recursive=True)
            for java_file in java_files:
                file_kept_inline_tests = 0
                newlines = []
                java_file_content = se.io.load(java_file, se.io.Fmt.txtList)
                index = 0
                while index < len(java_file_content):
                    line = java_file_content[index]
                    if line.strip().startswith("new Here("):
                        while not java_file_content[index].strip().endswith(";"):
                            index += 1
                        # target stmt line no
                        classlastname = (
                            java_file.replace(".java", "").split("/")[-1].strip()
                        )
                        target_stmt_line_no = (
                            line.strip()
                            .split("new Here(")[1]
                            .split(")")[0]
                            .split(",")[1]
                            .strip()
                        )
                        key = f".{classlastname}:{target_stmt_line_no}"
                        find_target_stmt = False
                        for passed_stmt in passed_stmts:
                            if passed_stmt.endswith(key):
                                find_target_stmt = True
                                break

                        if not find_target_stmt:
                            excluded_inline_tests += 1
                            index += 1
                            continue
                        else:
                            file_kept_inline_tests += 1
                            total_kept_inline_tests += 1
                    newlines.append(line)
                    index += 1
                if file_kept_inline_tests > 0:
                    se.io.dump(java_file, newlines, se.io.Fmt.txtList)
                else:
                    os.remove(java_file)
            total_excluded_inline_tests += excluded_inline_tests
            print(f"{project_name} excluded inline tests: {excluded_inline_tests}")
        print(f"total excluded inline tests: {total_excluded_inline_tests}")
        print(f"total kept inline tests: {total_kept_inline_tests}")

    # python -m exli.eval check_num_of_inline_tests
    def check_num_of_inline_tests(self):
        for input_type in ["merged"] + Macros.test_minimization_algorithms:
            for project_name, commit in Util.get_project_names_list_with_sha():
                INLINE_TEST_LOG_FILE_PATH = f"{Macros.reduced_tests_dir}/{project_name}-{commit}/inlinetest-log-{input_type}.txt"
                if not os.path.exists(INLINE_TEST_LOG_FILE_PATH):
                    continue
                inline_tests = se.io.load(INLINE_TEST_LOG_FILE_PATH, se.io.Fmt.txtList)
                logged_inline_test = len(
                    [inline_test for inline_test in inline_tests if inline_test]
                )
                sha = Util.get_sha(project_name)
                added_inline_test = se.bash.run(
                    f"grep -rn 'new Here(' {Macros.project_dir}/{input_type}-tests/{project_name}-{sha}/* | wc -l"
                ).stdout
                if logged_inline_test != int(added_inline_test):
                    print(
                        input_type, project_name, logged_inline_test, added_inline_test
                    )

    # python -m exli.eval batch_filter_mutants_with_all_inline_tests
    def batch_filter_mutants_with_all_inline_tests(self):
        for project_name, sha in Util.get_project_names_list_with_sha():
            self.filter_mutants_with_all_inline_tests(project_name, sha)

    # python -m exli.eval compute_r2_mutants_results --mutator "universalmutator"
    # the mutator here is the mutantion tool used during R2 reduction; the eval mutation tool is always universalmutator
    def compute_r2_mutants_results(
        self, mutator: str = "universalmutator", algorithm: str = "greedy"
    ):
        r2_tests = se.io.load(
            Macros.results_dir / "r2" / f"{algorithm}-{mutator}.txt",
            se.io.Fmt.txtList,
        )
        proj_2_r2_tests = collections.defaultdict(list)
        for test in r2_tests:
            proj_2_r2_tests[test.split("#")[0]].append(test)

        # mappings from R0/R1 tests to killed mutants, for computing mutation score
        r0_t2m_txt = se.io.load(
            Macros.results_dir / "test-to-killed-mutants-all-universalmutator.txt",
            se.io.Fmt.txtList,
        )
        r0_t2m: Dict[str, Set[int]] = {}
        for line in r0_t2m_txt:
            test, *mutants = line.split(",")
            r0_t2m[test] = {int(mutant.split("-")[-1]) for mutant in mutants}

        r1_t2m_txt = se.io.load(
            Macros.results_dir / "test-to-killed-mutants-reduced-universalmutator.txt",
            se.io.Fmt.txtList,
        )
        r1_t2m: Dict[str, Set[int]] = {}
        for line in r1_t2m_txt:
            test, *mutants = line.split(",")
            r1_t2m[test] = {int(mutant.split("-")[-1]) for mutant in mutants}

        # mappings from R0/R1 tests to target stmts, for computing number of inline tests with mutants
        r0_stmt_tests = se.io.load(
            Macros.results_dir / "all-passed-tests.txt", se.io.Fmt.txtList
        )
        r0_t2s: Dict[str, str] = {}
        for line in r0_stmt_tests:
            pname, clz, stmtno, testno = line.split(";")
            r0_t2s[f"{pname}#{clz}_{stmtno}Test#testLine{testno}()"] = f"{clz};{stmtno}"

        r1_stmt_tests = se.io.load(
            Macros.results_dir / "reduced-passed-tests.txt", se.io.Fmt.txtList
        )
        r1_t2s: Dict[str, str] = {}
        for line in r1_stmt_tests:
            pname, clz, stmtno, testno = line.split(";")
            r1_t2s[f"{pname}#{clz}_{stmtno}Test#testLine{testno}()"] = f"{clz};{stmtno}"

        for pname in Util.get_project_names_list():
            mutants = se.io.load(Macros.results_dir / "mutants" / f"{pname}.json")
            mutated_stmts = set()
            for mutant in mutants:
                clz = Util.file_path_to_class_name(mutant["filepath"])
                stmtno = mutant["linenumber"]
                mutated_stmts.add(f"{clz};{stmtno}")

            r2_tests_proj = proj_2_r2_tests[pname]
            r2_killed: List[bool] = [False for _ in range(len(mutants))]

            num_test_with_mutants = 0
            for test in r2_tests_proj:
                if test.endswith("#all"):
                    test = test.replace("#all", "")
                    if test in r0_t2m:
                        for mutant in r0_t2m[test]:
                            r2_killed[mutant] = True

                    if r0_t2s[test] in mutated_stmts:
                        num_test_with_mutants += 1
                else:
                    if test in r1_t2m:
                        for mutant in r1_t2m[test]:
                            r2_killed[mutant] = True

                    if r1_t2s[test] in mutated_stmts:
                        num_test_with_mutants += 1

            results = [
                {
                    f"r2-{mutator}-killed": k,
                    f"r2-{mutator}-time": 0,  # no time info because it is computed
                }
                for k in r2_killed
            ]

            se.io.dump(
                Macros.results_dir
                / "mutants-eval-results"
                / f"{pname}-r2-{mutator}.json",
                results,
                se.io.Fmt.jsonPretty,
            )
            se.io.dump(
                Macros.results_dir
                / "mutants-eval-results"
                / f"{pname}-r2-{mutator}-num.json",
                num_test_with_mutants,
            )

    # python -m exli.eval count --project_name="AquaticInformatics_aquarius-sdk-java" --commit="8f4edb9"
    def count(
        self,
        project_name: str,
        sha: str = "",
        randoop: bool = True,
        unit: bool = True,
        evosuite: bool = True,
        seed: int = Macros.DEFAULT_SEED,
    ):
        ################################## process input, prepare project ##################################
        inputs = f"--project_name={project_name} --commit={sha} --randoop={randoop} --unit={unit}"
        se.bash.run(f'echo "{inputs}" >> {Macros.log_dir}/raninline.log')
        # parse input
        project_name = project_name.replace("/", "_")

        Util.remove_jacoco_extension()

        # clone project
        print("preparing project...")
        project = Util.prepare_project(project_name, sha)

        print("cleaning project...")
        with se.io.cd(Macros.downloads_dir / project_name):
            full_file_paths = Util.list_java_files(
                f"{Macros.downloads_dir}/{project_name}"
            )

        # create a folder to store the reduced inline tests
        proj_generated_tests_dir = f"{Macros.all_tests_dir}/{project_name}-{sha}"
        se.io.mkdir(proj_generated_tests_dir)

        log_file_path = Macros.log_dir / "counter.log"
        INLINE_TEST_LOG_FILE_PATH = f"{proj_generated_tests_dir}/i-log.txt"

        ################################## Instrument ##################################
        with se.io.cd(Macros.downloads_dir / project_name):
            se.bash.run("mvn test-compile " + Macros.SKIPS, 0)

        print("inserting print statement...")
        with se.io.cd(Macros.java_raninline_dir):
            se.bash.run("mvn clean install -DskipTests " + Macros.SKIPS, 0)
            for full_file_path in full_file_paths:
                se.bash.run(
                    f'mvn exec:java -Dexec.mainClass="org.raninline.App" -Dexec.args="counter {full_file_path} {log_file_path} {INLINE_TEST_LOG_FILE_PATH}"',
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
            deps_file_path = f"{Macros.unit_tests_dir}/{project_name}-{sha}/deps.txt"
            unit_tests_dir = f"{Macros.unit_tests_dir}/{project_name}-{sha}/evosuite-tests-{seed}/evosuite-tests"
            Util.run_unit_tests(
                "EvoSuite",
                project_name,
                run_tests_log_path,
                maven_project,
                unit_tests_dir,
                deps_file_path,
            )
        if randoop:
            unit_tests_dir = f"{Macros.unit_tests_dir}/{project_name}-{sha}/randoop-tests-{seed}/randoop-tests"
            Util.run_unit_tests(
                "Randoop",
                project_name,
                run_tests_log_path,
                maven_project,
                unit_tests_dir,
            )

        ################################## Save serialized data ##################################
        se.bash.run(
            f"cp -r {Macros.downloads_dir}/{project_name}/{Macros.INLINE_GEN_DIR_NAME}/unique-inline-tests-counter.txt {proj_generated_tests_dir}/{Macros.INLINE_GEN_DIR_NAME}/unique-inline-tests-counter.txt"
        )
        se.bash.run(
            f"cp -r {Macros.downloads_dir}/{project_name}/{Macros.INLINE_GEN_DIR_NAME}/all-target-stmts-hit-counter.txt {proj_generated_tests_dir}/{Macros.INLINE_GEN_DIR_NAME}/all-target-stmts-hit-counter.txt"
        )

    # python -m exli.main batch_count
    def batch_count(self):
        projects_with_shas = Util.get_project_names_list_with_sha()
        for project_name, sha in projects_with_shas:
            try:
                self.count(project_name, sha, True, True, True)
            except Exception as e:
                print(e)
                se.io.dump(
                    Macros.log_dir / "batchcount.txt",
                    [f"{project_name} {sha}: {traceback.format_exc()}"],
                    se.io.Fmt.txtList,
                    append=True,
                )
                continue

    # python -m exli.eval collect_randoop_tests_time
    def collect_randoop_tests_time(cls):
        res_file_path = Macros.results_dir / "randoop-time.json"
        res = dict()
        for project_name, sha in Util.get_project_names_list_with_sha():
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


if __name__ == "__main__":
    se.log.setup(Macros.log_file)
    CLI(Eval, as_positional=False)
