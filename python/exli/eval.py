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


class Eval:
    # python -m exli.eval batch_run_generate_mutants
    def batch_run_generate_mutants(
        self,
        skip_existing: bool = False,
        filter_with_inline_tests: bool = True,
        tool: str = "universalmutator",
        test_project_name: str = None,
    ):
        time_file_path = Macros.results_dir / "time" / f"generate-mutants-{tool}.json"
        if time_file_path.exists():
            time_dict = se.io.load(time_file_path, se.io.Fmt.json)
        else:
            time_dict = {}

        if filter_with_inline_tests:
            reduced_proj_to_target_stmts = self.proj_to_target_stmts("reduced")
            all_proj_to_target_stmts = self.proj_to_target_stmts("all")
            # intersection of reduced and all
            proj_to_target_stmts = {
                k: reduced_proj_to_target_stmts[k] & all_proj_to_target_stmts[k]
                for k in reduced_proj_to_target_stmts.keys()
            }

        for project_name, sha in Util.get_project_names_list_with_sha():
            if test_project_name is not None and project_name != test_project_name:
                continue
            if filter_with_inline_tests:
                if tool != "universalmutator":
                    output_path = Macros.mutants_dir / f"{project_name}-{tool}.json"
                else:
                    output_path = Macros.mutants_dir / f"{project_name}.json"
            else:
                if tool != "universalmutator":
                    output_path = Macros.all_mutants_dir / f"{project_name}-{tool}.json"
                else:
                    output_path = Macros.all_mutants_dir / f"{project_name}.json"

            if skip_existing and output_path.exists():
                continue
            Util.prepare_project(project_name, sha)

            input_path = f"{Macros.results_dir}/target-stmt/{project_name}.txt"
            if not os.path.exists(input_path):
                continue
            lines = se.io.load(input_path, se.io.Fmt.txtList)
            target_stmts = set()
            for line in lines:
                if not line.startswith("target stmt"):
                    break
                path = line.split(";")[1].replace("inlinegen-research", "exli-internal")
                class_name = path.split("/")[-1].split(".")[0]
                line_num = line.split(";")[2]
                if filter_with_inline_tests:
                    inline_tests_target_stmts = proj_to_target_stmts[project_name]
                    if f"{class_name};{line_num}" not in inline_tests_target_stmts:
                        print(f"skip {class_name};{line_num}, not in inline tests")
                        continue
                target_stmt = path + ";" + line_num  # path;line_num
                target_stmts.add(target_stmt)

            start_time = time.time()
            self.generate_mutants(project_name, target_stmts, output_path, tool)
            end_time = time.time()
            time_dict[project_name] = end_time - start_time
        se.io.dump(time_file_path, time_dict, se.io.Fmt.jsonPretty)

    # python -m exli.eval proj_to_target_stmts
    def proj_to_target_stmts(self, inline_test_type: str = "reduced"):
        # project to target statements with passing inline tests
        passed_inline_tests: List[str] = se.io.load(
            Macros.results_dir / f"{inline_test_type}-passed-tests.txt",
            se.io.Fmt.txtList,
        )
        proj_to_target_stmts = collections.defaultdict(set)
        for passed_inline_test in passed_inline_tests:
            proj = passed_inline_test.split(";")[0]
            classname = passed_inline_test.split(";")[1].split(".")[-1]
            target_stmt_line_num = passed_inline_test.split(";")[2]
            proj_to_target_stmts[proj].add(f"{classname};{target_stmt_line_num}")
        return proj_to_target_stmts

    # https://stackoverflow.com/questions/845058/how-to-get-line-count-of-a-large-file-cheaply-in-python
    def file_len(self, filename: str) -> int:
        with open(filename) as f:
            for i, _ in enumerate(f):
                pass
        return i + 1

    def get_line(self, filename: str, line_num: int) -> str:
        lines = se.io.load(filename, se.io.Fmt.txtList)
        for i, line in enumerate(lines):
            if (i + 1) == line_num:
                return line

    # python -m exli.eval generate_mutants --input_path eval-data-input.txt
    # download Asana_java-asana in ~/projects/exli-internal/_downalods, checkout to SHA 52fef9bcb189ccb405069ecb0e0d560d9ee17451 and test the code
    # output: a json file with mutants
    # {
    #    "filepath": "~/projects/exli-internal/_downloads/Asana_java-asana/src/main/java/com/asana/requests/Request.java",
    #    "linenumber": 155,
    #    "orginal_code": "flagsAccountedFor.addAll(Arrays.asList(header.split(",")));",
    #    "mutated_code": "flagsAccountedFor.removeAll(Arrays.asList(header.split(",")));",
    # }
    def generate_mutants(
        self,
        project_name: str,
        target_stmts: set,
        output_path: str,
        tool: str = "universalmutator",
    ):
        result = []
        # loop through lines in file:https://stackoverflow.com/questions/48124206/iterate-through-a-file-lines-in-python
        if tool == "universalmutator":
            for target_stmt in target_stmts:
                orig_path = target_stmt.split(";")[0]
                line_num = target_stmt.split(";")[1]
                line_results = self.generate_mutants_for_each_line(
                    project_name, orig_path, line_num
                )
                result.extend(line_results)
        elif tool == "major":
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

    # python -m exli.eval generate_mutants_for_each_line --project_name Asana_java-asana --orig_path "/home/liuyu/projects/exli-internal/_downloads/AquaticInformatics_aquarius-sdk-java/src/main/java/com/aquaticinformatics/aquarius/sdk/helpers/SdkServiceClient.java" --line_num 191
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
        sha: str = None,
        test_types: List[str] = None,
        mutant_type: str = "universalmutator",
        log_path: str = None,
    ):
        if sha is None:
            sha = Util.get_sha(project_name)

        if mutant_type == "universalmutator":
            mutants_file = Macros.mutants_dir / f"{project_name}.json"
        elif mutant_type == "major":
            mutants_file = Macros.mutants_dir / f"{project_name}-major.json"
        else:
            raise Exception(f"Unknown mutant type: {mutant_type}")

        if not mutants_file.exists():
            print(f"no mutants for {project_name}")
            return
        eval_log = Macros.log_dir / "eval"
        if not eval_log.exists():
            se.bash.run(f"mkdir -p {eval_log}")
        temp_dir = Macros.log_dir / "eval" / "temp"
        if not temp_dir.exists():
            se.bash.run(f"mkdir -p {temp_dir}")
        # execute reduced tests first to check if there is compilation failure
        if test_types is None:
            test_types = ["baseline", "reduced", "unit", "randoop", "evosuite"]
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
                    elif test_type in ["baseline", "reduced"]:
                        inline_test_fqn = Util.get_full_class_name(file_path)
                        inline_test_path_with_package = (
                            inline_test_fqn.replace(".", "/") + ".java"
                        )
                        if test_type == "baseline":
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
                        if test_type == "baseline":
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
                    if test_type in ["reduced", "baseline"]:
                        log_file = (
                            eval_log
                            / f"{project_name}-{sha}-{test_type}-{inline_test_name}-{index}-{mutant_type}.log"
                        )
                    else:
                        # no enough space to save all the log files
                        log_file = (
                            eval_log
                            / f"{project_name}-{sha}-{test_type}-{mutant_type}.log"
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
                            if test_type == "baseline":
                                # run baseline tests
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
                                returncode = Util.run_randoop(project_name, log_file)
                            elif test_type == "evosuite":
                                # run evosuite tests
                                generated_tests_dir = (
                                    Macros.unit_tests_dir
                                    / f"{project_name}-{sha}"
                                    / "evosuite-tests"
                                )
                                returncode = Util.run_evosuite_command_line(
                                    project_name, log_file, generated_tests_dir
                                )
                            end_time = time.time()
                            if test_type == "baseline" or test_type == "reduced":
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
            if mutant_type == "universalmutator":
                output_file = mutants_result_dir / f"{project_name}-{test_type}.json"
            elif mutant_type == "major":
                output_file = (
                    mutants_result_dir / f"{project_name}-{test_type}-major.json"
                )
            se.io.dump(
                output_file,
                res,
                se.io.Fmt.jsonPretty,
            )
            if test_type == "reduced" or test_type == "baseline":
                se.io.dump(
                    mutants_file,
                    updated_mutants,
                    se.io.Fmt.jsonPretty,
                )

    # python -m exli.eval batch_run_tests_with_mutants
    def batch_run_tests_with_mutants(
        self,
        skip_existing: bool = True,
        test_types: List[str] = None,
        mutant_type: str = "universalmutator",
    ):
        if test_types is None:
            test_types = ["baseline", "reduced", "unit", "randoop", "evosuite"]

        if mutant_type == "universalmutator":
            time_file = (
                Macros.results_dir / "time" / "batch-run-tests-with-mutants.json"
            )
        elif mutant_type == "major":
            time_file = (
                Macros.results_dir / "time" / "batch-run-tests-with-mutants-major.json"
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
            if skip_existing:
                if mutant_type == "universalmutator":
                    baseline_file = (
                        Macros.results_dir
                        / "mutants-eval-results"
                        / f"{project_name}-baseline.json"
                    )
                elif mutant_type == "major":
                    baseline_file = (
                        Macros.results_dir
                        / "mutants-eval-results"
                        / f"{project_name}-major.json"
                    )
                else:
                    raise Exception("unknown mutant type")

                if (baseline_file).exists():
                    continue
            Util.prepare_project(project_name, sha)
            start_time = time.time()
            self.run_tests_with_mutants(
                project_name,
                sha,
                test_types,
                mutant_type,
                log_path,
            )
            end_time = time.time()
            res_dict[f"{project_name}-time"] = end_time - start_time

        se.io.dump(
            time_file,
            res_dict,
            se.io.Fmt.jsonPretty,
        )

    # python -m exli.eval killed_mutants
    # --test_type "reduced"
    def killed_mutants(
        self,
        project_name: str,
        sha: str = None,
        test_type: str = "baseline",
        mutant_type: str = "universalmutator",
    ):
        if sha is None:
            sha = Util.get_sha(project_name)
        killed_mutants_file = (
            Macros.results_dir
            / "killed-mutants"
            / f"{project_name}-{test_type}-{mutant_type}.json"
        )

        killed_mutants_res = []

        if mutant_type == "universalmutator":
            mutants_file = Macros.results_dir / "mutants" / f"{project_name}.json"
        elif mutant_type == "major":
            mutants_file = Macros.results_dir / "mutants" / f"{project_name}-major.json"
        else:
            raise Exception("unknown mutant type")

        if not mutants_file.exists():
            return
        mutants = se.io.load(mutants_file, se.io.Fmt.json)
        for index, mutant in enumerate(mutants):
            # log/eval/AquaticInformatics_aquarius-sdk-java-8f4edb9-baseline-AquariusServerVersion_19Test.java-0-{mutant_type}.log
            filepath = mutant["filepath"]
            linenumber = mutant["linenumber"]
            test_name = (
                filepath.split("/")[-1].replace(".java", "") + f"_{linenumber}Test.java"
            )
            mutation_res_file = (
                Macros.log_dir
                / "eval"
                / f"{project_name}-{sha}-{test_type}-{test_name}-{index}-{mutant_type}.log"
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

    # python -m exli.eval batch_test_to_killed_mutants --mutant_type "universalmutator"
    def batch_test_to_killed_mutants(self, mutant_type: str = "universalmutator"):
        for project_name, sha in Util.get_project_names_list_with_sha():
            self.killed_mutants(project_name, sha, "baseline", mutant_type)
            self.killed_mutants(project_name, sha, "reduced", mutant_type)

    def get_test_to_killed_mutants(
        self, test_type: str, mutant_type: str = "universalmutator"
    ):
        test_to_killed_mutants_dict = collections.defaultdict(set)
        for project_name in Util.get_project_names_list():
            killed_mutants_file = (
                Macros.results_dir
                / "killed-mutants"
                / f"{project_name}-{test_type}-{mutant_type}.json"
            )
            if not killed_mutants_file.exists():
                continue
            killed_mutants = se.io.load(killed_mutants_file, se.io.Fmt.json)
            for killed_mutant in killed_mutants:
                test_class_name = killed_mutant["test_class_name"]
                test_method_name = killed_mutant["test_method_name"]
                mutant_index = killed_mutant["killed_mutant_index"]
                test_to_killed_mutants_dict[
                    project_name + "#" + test_class_name + "#" + test_method_name
                ].add(f"{project_name}-{mutant_index}")
        return test_to_killed_mutants_dict

    # python -m exli.eval test_to_killed_mutants
    # --test_type baseline --test_type reduced
    def test_to_killed_mutants(
        self, test_type: str, mutant_type: str = "universalmutator"
    ):
        result_file = (
            Macros.results_dir / f"test-to-killed-mutants-{test_type}-{mutant_type}.txt"
        )
        results = []
        test_to_killed_mutants_dict = self.get_test_to_killed_mutants(
            test_type, mutant_type
        )
        for test_name, killed_mutants in test_to_killed_mutants_dict.items():
            results.append(test_name + "," + ",".join(killed_mutants))
        se.io.dump(result_file, results, se.io.Fmt.txtList)

    # python -m exli.eval check_minimized_results
    def check_minimized_results(self):
        minizied_results_dir = Macros.results_dir / "minimized-inline-tests"
        # iterate over all minimized results
        for minimized_result_file in minizied_results_dir.glob("*.txt"):
            minimized_results = se.io.load(minimized_result_file, se.io.Fmt.txtList)
            # extract file name
            print(minimized_result_file.name, len(minimized_results))

    # python -m exli.eval add_back_tests
    def add_back_tests(self, project_name: str, mutant_type: str = "universalmutator"):
        # add back tests in R0 that can kill mutants not killed by tests in R1
        if mutant_type == "universalmutator":
            initial_mutants_result_file = (
                Macros.results_dir
                / "mutants-eval-results"
                / f"{project_name}-baseline.json"
            )
        elif mutant_type == "major":
            initial_mutants_result_file = (
                Macros.results_dir
                / "mutants-eval-results"
                / f"{project_name}-baseline-major.json"
            )
        else:
            raise Exception("Invalid mutant type")

        if not initial_mutants_result_file.exists():
            return []
        initial_mutants_result = se.io.load(initial_mutants_result_file, se.io.Fmt.json)

        if mutant_type == "universalmutator":
            reduced_mutants_result_file = (
                Macros.results_dir
                / "mutants-eval-results"
                / f"{project_name}-reduced.json"
            )
        elif mutant_type == "major":
            reduced_mutants_result_file = (
                Macros.results_dir
                / "mutants-eval-results"
                / f"{project_name}-reduced-major.json"
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
            / f"{project_name}-baseline-{mutant_type}.json"
        )

        if not killed_mutants_file.exists():
            return []
        killed_mutants = se.io.load(killed_mutants_file, se.io.Fmt.json)
        for killed_mutant in killed_mutants:
            test_class_name = killed_mutant["test_class_name"]
            test_method_name = killed_mutant["test_method_name"]
            mutant_index = killed_mutant["killed_mutant_index"]
            # have to mark the source here, because the inline test line number is different between baseline and reduced
            killed_mutant_to_tests_dict[mutant_index].add(
                project_name
                + "#"
                + test_class_name
                + "#"
                + test_method_name
                + "#baseline"
            )

        mutants_to_add_back_tests = collections.defaultdict(set)
        for index, mutated_result in enumerate(reduced_mutants_result):
            if mutated_result["reduced-killed"]:
                continue
            else:
                initial_killed = initial_mutants_result[index]["baseline-killed"]
                if initial_killed:
                    # add back the test that can kill the mutant
                    if killed_mutant_to_tests_dict[index]:
                        mutants_to_add_back_tests[f"{project_name}-{index}"].update(
                            killed_mutant_to_tests_dict[index]
                        )
        return mutants_to_add_back_tests

    # python -m exli.eval batch_add_back_tests
    def batch_add_back_tests(self, mutant_type: str = "universalmutator"):
        all_mutants_to_add_back_tests = collections.defaultdict(set)
        for project_name in Util.get_project_names_list():
            mutants_to_add_back_tests = self.add_back_tests(project_name, mutant_type)
            print(project_name, len(mutants_to_add_back_tests))
            all_mutants_to_add_back_tests.update(mutants_to_add_back_tests)
        # all mutants to add back tests -> test to killed mutants
        addback_t2m = collections.defaultdict(set)
        for mutant, tests in all_mutants_to_add_back_tests.items():
            for test in tests:
                addback_t2m[test].add(mutant)
        # dump the results
        se.io.dump(
            Macros.results_dir / f"add-back-tests-to-killed-mutants-{mutant_type}.txt",
            [
                test + "," + ",".join(sorted(mutants))
                for test, mutants in addback_t2m.items()
            ],
            se.io.Fmt.txtList,
        )

        # merge with reduced tests
        reduced_t2m = self.get_test_to_killed_mutants("reduced", mutant_type)
        merged_t2m = collections.defaultdict(set)
        for test, mutants in reduced_t2m.items():
            merged_t2m[test].update(mutants)
        for test, mutants in addback_t2m.items():
            merged_t2m[test].update(mutants)
        se.io.dump(
            Macros.results_dir / f"merged-tests-to-killed-mutants-{mutant_type}.txt",
            [
                test + "," + ",".join(sorted(mutants))
                for test, mutants in merged_t2m.items()
            ],
            se.io.Fmt.txtList,
        )

    # python -m exli.eval minimize_tests
    def minimize_tests(self, mutant_type: str = "universalmutator"):
        data_file = (
            Macros.results_dir / f"merged-tests-to-killed-mutants-{mutant_type}.txt"
        )
        orig_file = se.io.mktmp("exli")
        se.bash.run(f"cut -d, -f1 '{data_file}' > '{orig_file}'", 0)
        for algorithm in Macros.test_minimization_algorithms:
            out_file = (
                Macros.results_dir / "minimized" / f"{algorithm}-{mutant_type}.txt"
            )
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
    def get_not_mutated_inline_tests(self, mutant_type: str = "universalmutator"):
        # format of reduced-passed-tests.txt
        # mp911de_logstash-gelf;biz.paluch.logging.gelf.wildfly.WildFlyJsonFormatter;119;120
        target_stmt_to_inline_tests = Util.get_target_stmt_to_inline_tests(
            Macros.results_dir / "reduced-passed-tests.txt"
        )
        print(f"{len(target_stmt_to_inline_tests)=}")
        mutated_target_stmts = set()
        for project_name in Util.get_project_names_list():
            if mutant_type == "universalmutator":
                mutant_file = Macros.results_dir / "mutants" / f"{project_name}.json"
            elif mutant_type == "major":
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
    def save_not_mutated_inline_tests(self, mutant_type: str = "universalmutator"):
        se.io.dump(
            Macros.results_dir / f"not-mutated-inline-tests-{mutant_type}.txt",
            sorted(self.get_not_mutated_inline_tests(mutant_type=mutant_type)),
            se.io.Fmt.txtList,
        )

    # python -m exli.eval save_r2_inline_test_no_source_code
    def save_r2_inline_test_no_source_code(self, mutant_type: str = "universalmutator"):
        not_mutated_inline_tests = se.io.load(
            Macros.results_dir / f"not-mutated-inline-tests-{mutant_type}.txt",
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
                Macros.results_dir / "minimized" / f"{algorithm}-{mutant_type}.txt"
            )
            minimized_tests = se.io.load(minimized_file, se.io.Fmt.txtList)
            r2_inline_tests = []
            r2_inline_tests.extend(minimized_tests)
            r2_inline_tests.extend(updated_not_mutated_inline_tests)
            se.io.dump(
                Macros.results_dir / "r2" / f"{algorithm}-{mutant_type}.txt",
                sorted(r2_inline_tests),
                se.io.Fmt.txtList,
            )

    # python -m exli.eval check_set_of_reduction_results
    def check_set_of_reduction_results(self):
        algo_to_tests = collections.defaultdict(list)
        new_algo_to_tests = collections.defaultdict(list)
        for algorithm in Macros.test_minimization_algorithms:
            file_path = (
                Macros.results_dir / "minimized" / f"{algorithm}-minimized-baseline.txt"
            )
            tests = se.io.load(file_path, se.io.Fmt.txtList)
            algo_to_tests[algorithm].extend(tests)

            new_file_path = (
                Macros.results_dir
                / "minimized-o"
                / f"{algorithm}-minimized-baseline.txt"
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
        elif test_type == "baseline":
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
        self, input_type: str = "merged", mutant_type: str = "universalmutator"
    ):
        # load merged tests
        if input_type == "merged":
            merged_tests_to_killed_mutants_file = (
                Macros.results_dir / f"merged-tests-to-killed-mutants-{mutant_type}.txt"
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
                Macros.results_dir / "r2" / f"{input_type}-{mutant_type}.txt",
                se.io.Fmt.txtList,
            )
        proj_to_merged_tests = collections.defaultdict(list)
        for merged_test in merged_tests:
            if not merged_test:
                continue
            # mpatric_mp3agic#com.mpatric.mp3agic.MpegFrame_92Test#testLine250()#baseline
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
                "baseline", proj, sha
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
                if merged_test.endswith("baseline"):
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

    # deprecated, we can use `python -m exli.eval batch_run_generate_mutants --filter_with_inline_tests` to generate mutants
    # python -m exli.eval filter_mutants_with_all_inline_tests
    def filter_mutants_with_all_inline_tests(
        self, project_name: str, commit: str = None
    ):
        if commit is None:
            commit = Util.get_sha(project_name)
        if not (Macros.all_mutants_dir / f"{project_name}.json").exists():
            return
        mutants = se.io.load(
            Macros.all_mutants_dir / f"{project_name}.json", se.io.Fmt.json
        )
        passed_tests_list = se.io.load(
            Macros.results_dir / "all-passed-tests.txt", se.io.Fmt.txtList
        )
        passed_tests_set = set()
        for passed_tests in passed_tests_list:
            tokens = passed_tests.split(";")
            if tokens[0] == project_name:
                passed_tests_set.add(tokens[1] + tokens[2])
        res = []
        for idx, mutant in enumerate(mutants):
            mutant["index"] = idx
            file_path = mutant["filepath"]
            line_num = mutant["linenumber"]
            # inline_test_name = (
            #     file_path.split("/")[-1].split(".")[0] + f"_{line_num}Test.java"
            # )
            # exist, _ = Util.find_inline_test(
            #     inline_test_name, f"{Macros.reduced_inline_tests_dir}"
            # )
            # print(project_name, file_path, line_num, exist)
            # if not exist:
            #     continue
            classname = Util.file_path_to_class_name(file_path)
            if f"{classname}{line_num}" in passed_tests_set:
                res.append(mutant)
        # save the results
        if res:
            se.io.dump(
                Macros.mutants_dir / f"{project_name}.json", res, se.io.Fmt.jsonPretty
            )

    # python -m exli.eval batch_filter_mutants_with_all_inline_tests
    def batch_filter_mutants_with_all_inline_tests(self):
        for project_name, sha in Util.get_project_names_list_with_sha():
            self.filter_mutants_with_all_inline_tests(project_name, sha)

    # python -m exli.eval compute_r2_mutants_results --mutant_type "universalmutator"
    # the mutant_type here is the mutantion tool used during R2 reduction; the eval mutation tool is always universalmutator
    def compute_r2_mutants_results(
        self, mutant_type: str = "universalmutator", algorithm: str = "greedy"
    ):
        r2_tests = se.io.load(
            Macros.results_dir / "r2" / f"{algorithm}-{mutant_type}.txt",
            se.io.Fmt.txtList,
        )
        proj_2_r2_tests = collections.defaultdict(list)
        for test in r2_tests:
            proj_2_r2_tests[test.split("#")[0]].append(test)

        # mappings from R0/R1 tests to killed mutants, for computing mutation score
        r0_t2m_txt = se.io.load(
            Macros.results_dir / "test-to-killed-mutants-baseline-universalmutator.txt",
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
                if test.endswith("#baseline"):
                    test = test.replace("#baseline", "")
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
                    f"r2-{mutant_type}-killed": k,
                    f"r2-{mutant_type}-time": 0,  # no time info because it is computed
                }
                for k in r2_killed
            ]

            se.io.dump(
                Macros.results_dir
                / "mutants-eval-results"
                / f"{pname}-r2-{mutant_type}.json",
                results,
                se.io.Fmt.jsonPretty,
            )
            se.io.dump(
                Macros.results_dir
                / "mutants-eval-results"
                / f"{pname}-r2-{mutant_type}-num.json",
                num_test_with_mutants,
            )


if __name__ == "__main__":
    se.log.setup(Macros.log_file)
    CLI(Eval, as_positional=False)
