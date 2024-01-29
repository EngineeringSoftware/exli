import collections
import hashlib
import os
import random
from pathlib import Path

import seutil as se
from exli.macros import Macros
from exli.util import Util
from jsonargparse import CLI
from seutil import latex
from unidiff import PatchSet


class Analysis:
    # python -m exli.analysis proj_to_num_bugs
    def proj_to_num_bugs(self):
        project_to_num_bugs = collections.Counter()
        bugs = se.io.load(Macros.data_dir / "pysstubs_filtered.json")
        for bug in bugs:
            project_to_num_bugs[bug["project_name"]] += 1
        project_num_bugs_list = [
            (project, num)
            for project, num in dict(
                sorted(project_to_num_bugs.items(), key=lambda item: -item[1])
            ).items()
        ]
        project_contains_test = []
        for project, num in project_num_bugs_list:
            with se.io.cd(Macros.downloads_dir / project.replace("/", "_")):
                return_code = se.bash.run("find . -name '*test*'").returncode
                if return_code != 0:
                    project_contains_test.append((project, num, False))
                else:
                    project_contains_test.append((project, num, True))
        se.io.dump(
            Macros.data_dir / "project-num-bugs.csv",
            project_contains_test,
            se.io.Fmt.csvList,
        )

    # python -m exli.analysis parse_log
    def parse_log(self):
        res = {"randoop": {}, "unit": {}}
        projects = Util.get_project_names_list_with_sha()
        test_type = "randoop"
        for project_name, sha in projects:
            print(project_name)
            test_log = os.path.join(
                Macros.reduced_tests_dir, f"{project_name}-{sha}", "raninline-log.txt"
            )
            if not os.path.exists(test_log):
                continue
            covered_line_number_map = {"randoop": {}, "unit": {}}
            covered_line_number_map_with_method_call = {"randoop": {}, "unit": {}}
            no_stmt_after = set()
            if_stmt_map = collections.defaultdict(set)
            lines = se.io.load(test_log).splitlines()
            index = 0
            while index < len(lines):
                line = lines[index]
                if line == "Unit":
                    test_type = "unit"
                if line == "Randoop":
                    test_type = "randoop"
                if line.startswith(Macros.TARGET_STMT_START):
                    file_name = line.split(";")[1]
                    line_number = line.split(";")[2]
                    variables_primitive = dict()
                    methods_primitive = dict()
                    has_stmt_after = False
                    index += 1
                    if (
                        f"{file_name}-{line_number}"
                        in covered_line_number_map[test_type]
                    ):
                        continue
                    while index < len(lines):
                        line = lines[index]
                        if line.startswith(Macros.TARGET_STMT_AFTER):
                            has_stmt_after = True
                        if line.startswith(
                            Macros.TARGET_STMT_BEFORE
                        ) or line.startswith(Macros.TARGET_STMT_AFTER):
                            self.check_primitive(line, variables_primitive)
                        elif line.startswith(Macros.TARGET_METHOD_BEFORE):
                            self.check_primitive(line, methods_primitive)
                        else:
                            break
                        index += 1
                    if not has_stmt_after:
                        no_stmt_after.add(f"{file_name}-{line_number}")
                        continue
                    if variables_primitive and all(variables_primitive.values()):
                        covered_line_number_map[test_type][
                            f"{file_name}-{line_number}"
                        ] = True
                    else:
                        covered_line_number_map[test_type][
                            f"{file_name}-{line_number}"
                        ] = False

                    for mtd_name, mtd_is_primitive in methods_primitive.items():
                        var_name = mtd_name.split(".")[0]
                        if (
                            var_name in variables_primitive
                            and (not variables_primitive[var_name])
                            and mtd_is_primitive
                        ):
                            variables_primitive[var_name] = True

                    if variables_primitive and all(variables_primitive.values()):
                        covered_line_number_map_with_method_call[test_type][
                            f"{file_name}-{line_number}"
                        ] = True
                    else:
                        covered_line_number_map_with_method_call[test_type][
                            f"{file_name}-{line_number}"
                        ] = False

                elif line.startswith("target-statement-if-start"):
                    file_name = line.split(";")[1]
                    line_number = line.split(";")[2]
                    if_stmt_map[test_type].add(f"{file_name}-{line_number}")
                index += 1
            for test_type in ["randoop", "unit"]:
                res[test_type][project_name] = collections.Counter()
                res[test_type][project_name]["if_stmt"] = len(if_stmt_map[test_type])
                res[test_type][project_name]["if_stmt_set"] = list(
                    if_stmt_map[test_type]
                )
                res[test_type][project_name]["if_stmt_set"].sort()
                res[test_type][project_name]["assign_stmt"] = len(
                    covered_line_number_map[test_type]
                )
                res[test_type][project_name]["assign_stmt_set"] = list(
                    covered_line_number_map[test_type].keys()
                )
                res[test_type][project_name]["assign_stmt_set"].sort()
                res[test_type][project_name]["not_assign_stmt"] = len(no_stmt_after)
                res[test_type][project_name]["assign_all_primitive"] = sum(
                    [1 for v in covered_line_number_map[test_type].values() if v]
                )
                res[test_type][project_name]["assign_all_primitive_set"] = [
                    k for k, v in covered_line_number_map[test_type].items() if v
                ]
                res[test_type][project_name]["assign_all_primitive_set"].sort()
                res[test_type][project_name][
                    "assign_all_primitive_with_method_call"
                ] = sum(
                    [
                        1
                        for v in covered_line_number_map_with_method_call[
                            test_type
                        ].values()
                        if v
                    ]
                )
                res[test_type][project_name][
                    "assign_all_primitive_with_method_call_set"
                ] = [
                    k
                    for k, v in covered_line_number_map_with_method_call[
                        test_type
                    ].items()
                    if v
                ]
                res[test_type][project_name][
                    "assign_all_primitive_with_method_call_set"
                ].sort()

        for test_type in ["randoop", "unit"]:
            se.io.dump(
                Macros.results_dir / f"primitive-types-{test_type}.json",
                res[test_type],
                se.io.Fmt.jsonPretty,
            )

    def check_primitive(self, line: str, variables: set):
        line = line.strip()
        if (
            line.startswith(Macros.TARGET_STMT_BEFORE)
            or line.startswith(Macros.TARGET_STMT_AFTER)
            or line.startswith(Macros.TARGET_METHOD_BEFORE)
        ):
            var_name = line.split(";")[4]
            var_type = line.split(";")[3]
            if var_type in [
                "int",
                "byte",
                "short",
                "long",
                "float",
                "double",
                "boolean",
                "char",
                "String",
                "int[]",
                "byte[]",
                "short[]",
                "long[]",
                "float[]",
                "double[]",
                "boolean[]",
                "char[]",
                "String[]",
            ]:
                variables[var_name] = True
            else:
                variables[var_name] = False

    # python -m exli.analysis list_inline_tests
    def list_inline_tests(self, inline_tests_type: str = "reduced"):
        if inline_tests_type == "reduced":
            log_name = "inlinetest-log.txt"
        else:
            log_name = "inlinetest-log-all.txt"
        project_names = Util.get_project_names_list_with_sha()
        res = {}
        for project_name, sha in project_names:
            unit_tests_dir = Macros.unit_tests_dir / f"{project_name}-{sha}"
            if unit_tests_dir.exists():
                # inline tests generated by running tests
                file_to_tests = collections.defaultdict(list)
                if (unit_tests_dir / log_name).exists():
                    with open(unit_tests_dir / log_name, "r") as f:
                        content = f.read()
                        for line in content.splitlines():
                            if len(line.split(";")) < 4:
                                print(f"Invalid line: {line} in {project_name}")
                                continue
                            if "_downloads/" not in line.split(";")[0]:
                                print(
                                    f"Invalid line (no _downloads): {line} in {project_name}"
                                )
                                continue
                            tokens = line.split(";")
                            file_path = tokens[0].split("_downloads/")[1]
                            file_name = tokens[0].split("/")[-1]
                            # this line number is not the line number of inline test, but line number of target statement
                            line_number = tokens[1]
                            # append the rest of the tokens
                            inline_test = ";".join(tokens[2:])
                            # inline_test += ";"
                            key = (
                                project_name
                                + ";"
                                + file_name
                                + ";"
                                + line_number
                                + ";"
                                + str(hash(inline_test.replace(" ", "")))
                            )
                            file_to_tests[file_name].append(key)
                            res[key] = {
                                "project-name": project_name,
                                "target-stmt-line-number": line_number,
                                "target-stmt": "",
                                "inline-test": inline_test,
                                "file-path": file_path,
                                "can-add-to-source-code": False,
                                "source": "",  # expect to be Unit or Randoop or EvoSuite
                            }

                if inline_tests_type == "reduced":
                    inline_tests_dir = (
                        Macros.reduced_tests_dir / f"{project_name}-{sha}"
                    )
                elif inline_tests_type == "all":
                    inline_tests_dir = Macros.all_tests_dir / f"{project_name}-{sha}"
                if not inline_tests_dir.exists():
                    continue

                # inline tests that are successfully inserted into the source code
                for test_file in inline_tests_dir.glob("**/*.java"):
                    with open(test_file, "r") as f:
                        content = f.read()
                        test_line_no_to_target_stmt = dict()
                        test_line_no_to_source_code = dict()
                        test_line_no_to_target_stmt_line_no = dict()
                        test_line_no_to_source = dict()
                        for line_index, line in enumerate(content.splitlines()):
                            if line.strip().startswith("itest("):
                                if len(line.split(",")) < 2:
                                    print(f"Invalid line: {line} in {project_name}")
                                    continue
                                # extract the target statement line number in the second parameter of Here constructor
                                line_no_str = line.split(",")[1].split(")")[0].strip()
                                target_stmt_line_no = int(line_no_str)
                                test_line_no = line_index + 1
                                test_line_no_to_target_stmt_line_no[
                                    test_line_no
                                ] = target_stmt_line_no
                                test_line_no_to_target_stmt[test_line_no] = target_stmt
                                # extract the target statement source in the first parameter of Here constructor
                                target_stmt_source = (
                                    line.split(",")[0].split("(")[1].strip()
                                )
                                test_line_no_to_source[
                                    test_line_no
                                ] = target_stmt_source
                                test_line_no_to_source_code[test_line_no] = line.strip()
                            else:
                                target_stmt = line
                        for (
                            test_line_no,
                            target_stmt,
                        ) in test_line_no_to_target_stmt.items():
                            test_file_name = test_file.name
                            source_code = test_line_no_to_source_code[test_line_no]
                            target_stmt_line_no = test_line_no_to_target_stmt_line_no[
                                test_line_no
                            ]
                            key = (
                                project_name
                                + ";"
                                + test_file_name
                                + ";"
                                + str(target_stmt_line_no)
                                + ";"
                                + str(hash(source_code.replace(" ", "")))
                            )
                            if key in res:
                                res[key]["target-stmt"] = target_stmt
                                res[key]["can-add-to-source-code"] = True
                                res[key]["source"] = test_line_no_to_source[
                                    test_line_no
                                ]
                            else:
                                print(f"Cannot find {key} in {project_name}")
        se.io.dump(
            Macros.results_dir / f"{inline_tests_type}-inline-tests.json",
            res,
            se.io.Fmt.jsonPretty,
        )

    def hash(self, s: str):
        return hashlib.md5(s.replace(" ", "").encode("utf-8")).hexdigest()

    # python -m exli.analysis check_mutants_not_killed_all
    def check_mutants_not_killed_all(self):
        # mutants that are not killed by initial inline tests
        res = []
        project_names = Util.get_project_names_list_with_sha()
        for project_name, sha in project_names:
            # mutation result
            mutant_file = Macros.mutants_dir / f"{project_name}.json"
            if not mutant_file.exists():
                continue
            mutants = se.io.load(mutant_file)
            mutation_result_file = (
                Macros.results_dir
                / "mutants-eval-results"
                / f"{project_name}-baseline.json"
            )
            if not mutation_result_file.exists():
                continue
            mutation_results = se.io.load(mutation_result_file)
            for index, mutantion_result in enumerate(mutation_results):
                if not mutantion_result["baseline-killed"]:
                    res_item = mutants[index]
                    res.append(res_item)
        se.io.dump(
            Macros.results_dir / "mutants-not-killed-all.json",
            res,
            se.io.Fmt.jsonPretty,
        )

    # python -m exli.analysis reduced_inline_tests_missed_mutants
    def reduced_inline_tests_missed_mutants(self):
        res = []
        reduced_test_missed_mutants_file = (
            Macros.results_dir / "reduced-test-missed-mutants.json"
        )
        project_names = Util.get_project_names_list_with_sha()
        test_type_list = ["reduced", "baseline", "unit", "randoop"]
        test_type_to_not_killed = collections.Counter()
        test_type_to_not_killed_target_stmt = collections.defaultdict(set)
        test_type_to_not_killed_project = collections.defaultdict(set)
        for project_name, sha in project_names:
            mutants_file = Macros.mutants_dir / f"{project_name}.json"
            if not mutants_file.exists():
                continue
            mutants = se.io.load(mutants_file)
            mutants = [
                mutant
                for mutant in mutants
                if "compilation_failure" in mutant and not mutant["compilation_failure"]
            ]

            results_list = Util.get_killed_mutants(project_name, test_type_list)
            if len(results_list) != len(test_type_list):
                continue
            for index, mutant in enumerate(mutants):
                info = ""
                if (index not in results_list[0]) and (
                    index in results_list[1]
                    or index in results_list[2]
                    or index in results_list[3]
                ):
                    for result_list_index in range(1, len(results_list)):
                        if index in results_list[result_list_index]:
                            info += f"{test_type_list[result_list_index]} killed;"
                            test_type_to_not_killed[
                                test_type_list[result_list_index]
                            ] += 1
                            test_type_to_not_killed_target_stmt[
                                test_type_list[result_list_index]
                            ].add(mutant["filepath"] + str(mutant["linenumber"]))
                            test_type_to_not_killed_project[
                                test_type_list[result_list_index]
                            ].add(project_name)
                    mutant["info"] = info
                    res.append(mutant)
        se.io.dump(reduced_test_missed_mutants_file, res, se.io.Fmt.jsonPretty)

        file = latex.File(Macros.table_dir / "data-reduced-test-missed-mutants.tex")
        for test_type, count in test_type_to_not_killed.items():
            file.append_macro(
                latex.Macro(f"num-reduced-missed-mutants-{test_type}", count)
            )
            file.append_macro(
                latex.Macro(
                    f"num-reduced-missed-mutants-target-stmts-{test_type}",
                    len(test_type_to_not_killed_target_stmt[test_type]),
                )
            )
            file.append_macro(
                latex.Macro(
                    f"num-reduced-missed-mutants-projects-{test_type}",
                    len(test_type_to_not_killed_project[test_type]),
                )
            )
        file.save()

    # python -m exli.analysis check_mutants_all_not_killed
    def check_mutants_all_not_killed(self):
        test_type_to_all_killed = 0
        test_type_to_all_killed_target_stmt = set()
        test_type_to_all_killed_project = set()
        # mutants that are not killed by all kinds of tests
        res = []
        project_names = Util.get_project_names_list_with_sha()
        for project_name, sha in project_names:
            # mutation result
            mutant_file = Macros.mutants_dir / f"{project_name}.json"
            if not mutant_file.exists():
                continue
            mutants = se.io.load(mutant_file)
            test_type_to_not_killed_ = collections.defaultdict(set)
            for test_type in ["baseline", "reduced", "unit", "randoop"]:
                mutation_result_file = (
                    Macros.results_dir
                    / "mutants-eval-results"
                    / f"{project_name}-{test_type}.json"
                )
                if not mutation_result_file.exists():
                    continue
                mutation_results = se.io.load(mutation_result_file)
                for index, mutantion_result in enumerate(mutation_results):
                    if not mutantion_result[f"{test_type}-killed"]:
                        test_type_to_not_killed_[test_type].add(index)
            # intersection of all test types
            not_killed_set = (
                test_type_to_not_killed_["baseline"]
                & test_type_to_not_killed_["reduced"]
                & test_type_to_not_killed_["unit"]
                & test_type_to_not_killed_["randoop"]
            )
            for not_killed_index in not_killed_set:
                res_item = mutants[not_killed_index]
                res.append(res_item)
                test_type_to_all_killed += 1
                test_type_to_all_killed_target_stmt.add(
                    res_item["filepath"] + str(res_item["linenumber"])
                )
                test_type_to_all_killed_project.add(project_name)
        se.io.dump(
            Macros.results_dir / "mutants-all-not-killed.json",
            res,
            se.io.Fmt.jsonPretty,
        )

        file = latex.File(Macros.table_dir / "data-all-tests-missed-mutants.tex")
        file.append_macro(
            latex.Macro(f"num-all-tests-missed-mutants", test_type_to_all_killed)
        )
        file.append_macro(
            latex.Macro(
                f"num-all-tests-missed-mutants-target-stmts",
                len(test_type_to_all_killed_target_stmt),
            )
        )
        file.append_macro(
            latex.Macro(
                f"num-all-tests-missed-mutants-projects",
                len(test_type_to_all_killed_project),
            )
        )
        file.save()

    # python -m exli.analysis check_mutants_all_killed_unit_tests_missed
    def check_mutants_all_killed_unit_tests_missed(self):
        target_stmt_set = set()
        proj_set = set()
        proj_to_target_stmt_dict = collections.defaultdict(set)
        # mutants that are not killed by all kinds of tests
        res = []
        project_names = Util.get_project_names_list_with_sha()
        for project_name, sha in project_names:
            # mutation result
            mutant_file = Macros.mutants_dir / f"{project_name}.json"
            if not mutant_file.exists():
                continue
            mutants = se.io.load(mutant_file)
            test_type_to_killed = collections.defaultdict(set)
            test_type_to_not_killed = collections.defaultdict(set)
            for test_type in ["baseline", "reduced", "unit", "randoop"]:
                mutation_result_file = (
                    Macros.results_dir
                    / "mutants-eval-results"
                    / f"{project_name}-{test_type}.json"
                )
                if not mutation_result_file.exists():
                    continue
                mutation_results = se.io.load(mutation_result_file)
                for index, mutantion_result in enumerate(mutation_results):
                    if not mutantion_result[f"{test_type}-killed"]:
                        test_type_to_not_killed[test_type].add(index)
                    else:
                        test_type_to_killed[test_type].add(index)
            # intersection of all test types
            not_killed_set = (
                test_type_to_killed["baseline"]
                & test_type_to_not_killed["unit"]
                & test_type_to_not_killed["randoop"]
            )
            for not_killed_index in not_killed_set:
                res_item = mutants[not_killed_index]
                res.append(res_item)
                target_stmt_set.add(res_item["filepath"] + str(res_item["linenumber"]))
                proj_set.add(project_name)
                proj_to_target_stmt_dict[project_name].add(
                    res_item["filepath"] + str(res_item["linenumber"])
                )
        print("number of target statements:", len(target_stmt_set))
        print("number of projects:", len(proj_set))
        for proj, proj_target_stmt_set in proj_to_target_stmt_dict.items():
            print(f"{proj}: {len(proj_target_stmt_set)}")
        print(len(res))
        se.io.dump(
            Macros.results_dir / "mutants-all-killed-unit-tests-missed.json",
            res,
            se.io.Fmt.jsonPretty,
        )
        # sample ~100 target statements, each project has at least one
        total_sample_target_stmts = []
        for proj, proj_target_stmt_set in proj_to_target_stmt_dict.items():
            sample_size = int(100 * len(proj_target_stmt_set) / len(target_stmt_set))
            sample_target_stmts = random.sample(
                proj_target_stmt_set, min(sample_size + 1, len(proj_target_stmt_set))
            )
            total_sample_target_stmts.extend(sample_target_stmts)
        sample_res = []
        for sample_target_stmt in total_sample_target_stmts:
            for res_item in res:
                if (
                    res_item["filepath"] + str(res_item["linenumber"])
                    == sample_target_stmt
                ):
                    sample_res.append(res_item)
                    break
        se.io.dump(
            Macros.results_dir / "mutants-all-killed-unit-tests-missed-sample.json",
            sample_res,
            se.io.Fmt.jsonPretty,
        )

    # python -m exli.analysis check_mutant_not_killed_tests
    def check_mutant_not_killed_tests(self, test_type: str = "randoop"):
        covered_res = []
        not_covered_res = []
        project_names = Util.get_project_names_list_with_sha()
        for project_name, sha in project_names:
            # mutation result
            mutant_file = Macros.mutants_dir / f"{project_name}.json"
            if not mutant_file.exists():
                continue
            mutation_result_file = (
                Macros.results_dir
                / "mutants-eval-results"
                / f"{project_name}-{test_type}.json"
            )
            if not mutation_result_file.exists():
                continue
            coverage_file = (
                Macros.results_dir
                / f"teco-{test_type}-tests"
                / f"{project_name}-covMap.json"
            )
            if not coverage_file.exists():
                continue
            mutants = se.io.load(mutant_file)
            valid_mutants = [
                mutant
                for mutant in mutants
                if "compilation_failure" not in mutant
                or not mutant["compilation_failure"]
            ]
            mutation_result = se.io.load(mutation_result_file)

            for index, mutation_item in enumerate(mutation_result):
                if not mutation_item[f"{test_type}-killed"]:
                    # check if the statement is covered by the test
                    if index >= len(valid_mutants):
                        continue
                    mutant = valid_mutants[index]
                    linenumber = str(mutant["linenumber"])
                    classname = Util.file_path_to_class_name(mutant["filepath"])

                    mutated_code = mutant["mutated_code"]
                    original_code = mutant["orginal_code"]
                    mutation_item["mutated_code"] = mutated_code
                    mutation_item["original_code"] = original_code

                    coverage = Util.analyze_coverage(
                        coverage_file, classname, linenumber, test_type
                    )
                    if coverage[f"{test_type}_stmt_covered"]:
                        covered_res.append(mutation_item)
                    else:
                        not_covered_res.append(mutation_item)
        res_filepath = (
            Macros.results_dir / f"{test_type}-mutant-not-killed-tests-covered.json"
        )
        se.io.dump(res_filepath, covered_res, se.io.Fmt.jsonPretty)
        res_filepath = (
            Macros.results_dir / f"{test_type}-mutant-not-killed-tests-not-covered.json"
        )
        se.io.dump(res_filepath, not_covered_res, se.io.Fmt.jsonPretty)

    # python -m exli.analysis analyze_unique_tests
    # number of unique values collected
    def analyze_unique_tests(self):
        result_file_path = Macros.results_dir / "unique-tests.txt"

        results = []
        for project_name, sha in Util.get_project_names_list_with_sha():
            # TODO: not found "unique-inline-tests-counter.txt", found inline-tests-counter.txt, but is that the same file?
            unique_inline_test_file = (
                Macros.all_tests_dir
                / f"{project_name}-{sha}"
                / Macros.INLINE_GEN_DIR_NAME
                / "unique-inline-tests-counter.txt"
            )

            if not unique_inline_test_file.exists():
                continue

            unique_inline_tests = se.io.load(unique_inline_test_file, se.io.Fmt.txtList)
            for line in unique_inline_tests:
                part1, cnt = line.split(";")
                filepath, linenumber = part1.split(":")
                classname = Util.file_path_to_class_name(filepath)
                results.append(f"{project_name};{classname};{linenumber};{cnt}")

        se.io.dump(result_file_path, results, se.io.Fmt.txtList)

    # python -m exli.analysis source_code_of_not_covered_stmt
    def source_code_of_not_covered_stmt(self):
        input_file_path = (
            Macros.results_dir
            / "analyze-teco-randoop-target-statements-not-covered.json"
        )
        inputs = se.io.load(input_file_path, se.io.Fmt.json)
        for input in inputs:
            project_name = input["filename"].split("_downloads/")[1].split("/")[0]
            sha = Util.get_sha(project_name)
            Util.prepare_project(project_name, sha)
            filepath = Macros.downloads_dir / input["filename"].split("_downloads/")[1]
            if not filepath.exists():
                continue
            lines = se.io.load(filepath, se.io.Fmt.txtList)
            first_1 = int(input["first1"])
            first_3 = int(input["first3"])
            if first_3 + 1 == first_1 or (
                first_3 + 2 == first_1 and lines[first_3].strip() == "{"
            ):
                # record the source code of the statement
                input["code"] = lines[first_3 - 1]
            else:
                input["code"] = lines[first_1 - 1]
        se.io.dump(input_file_path, inputs, se.io.Fmt.jsonPretty)


if __name__ == "__main__":
    CLI(Analysis, as_positional=False)
