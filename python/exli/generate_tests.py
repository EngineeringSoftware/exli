import os

import seutil as se
from exli.filter import Filter
from exli.macros import Macros
from exli.util import Util
from jsonargparse import CLI


class Generate:
    def generate_tests(
        self,
        project_name: str,
        sha: str,
        test_type: str,
        output_dir: str = None,
        log_dir: str = None,
        seed: int = Macros.DEFAULT_SEED,
        time_limit: int = 100,
        dep_file_path: str = None,
        classpath_list_path: str = None,
    ):
        """
        Generate tests for a project with one seed

        Args:
            project_name (str): The name of the project
            sha (str): The commit hash of the project
            test_type (str): The type of test, either randoop or evosuite
            output_dir (str, optional): The directory to store the generated tests. Defaults to None.
            log_dir (str, optional): The directory to store the logs. Defaults to None.
            seed (int, optional): The seed for the test generation. Defaults to Macros.DEFAULT_SEED.
            time_limit (int, optional): The time limit (seconds per class) for the test generation. Defaults to 100.
            dep_file_path (str, optional): The path to the dependency file. Defaults to None.
            classpath_list_path (str, optional): The path to the classpath list file. Defaults to None.
        """
        Util.prepare_project_for_test_generation(
            project_name,
            sha,
            dep_file_path,
            classpath_list_path,
            (
                log_dir / f"prepare-project.log"
                if log_dir
                else Macros.log_dir / "prepare-project.log"
            ),
        )
        Util.avoid_permission_error(project_name)
        if test_type == Macros.randoop:
            res = Util.generate_randoop_tests(
                project_name,
                seed,
                output_dir,
                log_dir,
                time_limit,
                dep_file_path,
                classpath_list_path,
            )
            Util.fix_randoop_generated_tests_helper(project_name, output_dir)
        elif test_type == Macros.evosuite:
            # get target statements, and parse into classpath-list.txt
            target_stmts_path = (
                Macros.results_dir / "target-stmt" / f"{project_name}-{sha}.txt"
            )
            if target_stmts_path.exists():
                lines = se.io.load(target_stmts_path, se.io.Fmt.txtList)
                parsed_classpath_list = [
                    Util.file_path_to_class_name(line.split(";")[1]) for line in lines
                ]
                # filter in all classpath list because there are some inner classes that start with parsed_classpath + $
                all_classpath_list = se.io.load(classpath_list_path, se.io.Fmt.txtList)
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
            res = Util.generate_evosuite_tests(
                project_name,
                seed,
                output_dir,
                log_dir,
                time_limit,
                dep_file_path,
                classpath_list_path,
            )
        else:
            res = f"Unknown test type: {test_type}"
        print(f"When seed is {seed}, {res}")

    def batch_generate_coverage(self, test_project_name: str = None):
        """
        Generate coverage for all projects

        Args:
            test_project_name (str, optional): The name of the project to test. Defaults to None.
        """
        if not os.path.exists(Macros.java_dir / "minimization" / "coverage-mapper" / "lib" / "asm-9.2.jar"):
            with se.io.cd(Macros.java_dir / "minimization" / "coverage-mapper"):
                se.bash.run("bash lib.sh")
        for project_name, sha in Util.get_project_names_list_with_sha():
            if test_project_name and project_name != test_project_name:
                continue
            for test_type in [Macros.dev, Macros.randoop, Macros.evosuite]:
                self.generate_coverage(
                    project_name, sha, [Macros.DEFAULT_SEED], test_type
                )

    def generate_coverage(
        self,
        project_name: str,
        sha: str,
        seeds: list[int] = [Macros.DEFAULT_SEED],
        test_type: str = Macros.randoop,
    ):
        """
        Generate coverage for a project with different seeds

        Args:
            project_name (str): The name of the project
            sha (str): The commit hash of the project
            seeds (list[int]): The list of seeds
            test_type (str, optional): The type of tests. Defaults to Macros.randoop.
        """
        res_dir = f"{Macros.results_dir}/coverage"
        if not os.path.exists(res_dir):
            os.makedirs(res_dir)
        for seed in seeds:
            generated_tests_dir = (
                Macros.unit_tests_dir
                / f"{project_name}-{sha}"
                / f"{test_type}-tests-{seed}"
                / f"{test_type}-tests"
            )
            self.generate_coverage_helper(
                project_name, sha, seed, res_dir, test_type, generated_tests_dir
            )

    def generate_coverage_helper(
        self,
        project_name: str,
        sha: str,
        seed: int,
        results_dir: str,
        test_type: str = Macros.randoop,
        generated_tests_dir: str = None,
    ):
        if test_type not in [Macros.dev, Macros.randoop, Macros.evosuite]:
            raise ValueError(f"Unknown test type: {test_type}")

        if test_type in [Macros.evosuite, Macros.randoop] and not os.path.exists(
            generated_tests_dir
        ):
            print(f"{test_type}_tests_dir: {generated_tests_dir} does not exist")
            return
        Util.prepare_project(project_name, sha)
        print(f"project_name: {project_name}, sha: {sha}")
        covMap_file = (
            f"{results_dir}/{project_name}-{sha}-{test_type}-{seed}-covMap.json"
        )

        if test_type in [Macros.dev, Macros.randoop]:
            if test_type == Macros.randoop:
                Util.copy_randoop_tests_to_src_test_java(
                    project_name, generated_tests_dir
                )
            # set checkout to False because Randoop tests are copied into the repo
            Util.run_with_jacoco(project_name, sha, False, test_type)
            jacoco_exec_file = f"{Macros.downloads_dir}/{project_name}/target/jacoco.exec"
        elif test_type == Macros.evosuite:
            deps_file_path = f"{Macros.unit_tests_dir}/{project_name}-{sha}/deps.txt"
            log_path = f"{Macros.log_dir}/jacoco/{project_name}-{sha}-{test_type}-tests.log"
            Util.run_evosuite_command_line(
                project_name, generated_tests_dir, deps_file_path, log_path
            )
            jacoco_exec_file = f"{Macros.downloads_dir}/{project_name}/jacoco.exec"
        # parse into covMap.json
        if not os.path.exists(jacoco_exec_file):
            # search for .exec file in Macros.downloads_dir/{project_name} and its subdirectories
            for root, _, files in os.walk(f"{Macros.downloads_dir}/{project_name}"):
                for file in files:
                    if file.endswith(".exec"):
                        jacoco_exec_file = f"{root}/{file}"
                        break
        if not os.path.exists(jacoco_exec_file):
            print(f"jacoco_exec_file: {jacoco_exec_file} does not exist")
            return
        Filter().generate_jacoco_report(
            os.path.dirname(jacoco_exec_file),
            f"{Macros.downloads_dir}/{project_name}/target/classes/",
            covMap_file,
        )

    # python -m exli.generate_tests generate_tests_for_uncovered_stmts
    def generate_tests_for_uncovered_stmts(
        self,
        project_name: str,
        sha: str,
        seeds: list[int],
        test_type: str = Macros.randoop,
    ):
        # TODO: need updating
        if test_type == Macros.randoop:
            time_limit = 100
            not_covered_classes = self.get_not_covered_classes(project_name, "path")
            if not not_covered_classes:
                print(f"not_covered_classes is empty for {project_name}")
                return
            deps = set()
            for not_covered_class in not_covered_classes:
                clazz_deps = Util.get_dependencies(project_name, sha, not_covered_class)
                deps.update(clazz_deps)
            classpath_list = list(deps)
        elif test_type == Macros.evosuite:
            time_limit = 120
            not_covered_classes = self.get_not_covered_classes(project_name, "name")
            if not not_covered_classes:
                print(f"not_covered_classes is empty for {project_name}")
                return
            classpath_list = list(not_covered_classes)

        for seed in seeds:
            # generate tests
            generated_unit_tests_dir = (
                Macros.unit_tests_dir
                / f"{project_name}-{sha}"
                / f"{test_type}-tests-{seed}"
            )
            deps_file_path = f"{Macros.unit_tests_dir}/{project_name}-{sha}/deps.txt"
            classpath_list_path = f"{generated_unit_tests_dir}/classpath-list.txt"
            log_file_path = Macros.log_dir / f"raninline-{test_type}-with-seeds.log"
            Util.prepare_project_for_test_generation(
                project_name,
                sha,
                deps_file_path,
                classpath_list_path,
                log_file_path,
            )
            se.io.dump(
                classpath_list_path,
                classpath_list,
                se.io.Fmt.txtList,
            )
            log_dir = Macros.log_dir / test_type
            self.generate_tests(
                project_name,
                sha,
                test_type,
                generated_unit_tests_dir,
                log_dir,
                seed,
                time_limit,
                deps_file_path,
                classpath_list_path,
            )

    def get_not_covered_classes(self, project_name: str, res_type: str = "path"):
        target_stmts_not_covered_path = (
            Macros.results_dir / "target-statements-not-covered.json"
        )
        target_stmts_not_covered = se.io.load(target_stmts_not_covered_path)
        not_covered_classes = set()
        for target_stmt in target_stmts_not_covered:
            if target_stmt["project"] == project_name:
                if res_type == "path":
                    not_covered_classes.add(
                        Util.file_path_to_class_path(target_stmt["filename"])
                    )
                elif res_type == "name":
                    not_covered_classes.add(
                        Util.file_path_to_class_name(target_stmt["filename"])
                    )
        return not_covered_classes

    # python -m exli.generate_tests analyze_covered_stmts --project_name="jkuhnert_ognl" --commit="5c30e1e"
    def analyze_covered_stmts(
        self,
        project_name: str,
        sha: str,
        seeds: list[int],
        test_type: str = Macros.randoop,
    ):
        """
        For statements that are not covered by the initial tests, if we generate tests with different seeds,
        see if they are covered by the new tests.

        Args:
            project_name (str): The name of the project
            sha (str): The commit hash of the project
            seeds (list[int]): The list of seeds
            test_type (str, optional): The type of tests. Defaults to Macros.randoop.
        """
        # get the class name and line number
        target_stmts_not_covered_path = (
            Macros.results_dir / "target-statements-not-covered.json"
        )
        target_stmts_not_covered = se.io.load(target_stmts_not_covered_path)
        target_stmts = []
        for target_stmt in target_stmts_not_covered:
            if target_stmt["project"] == project_name:
                target_stmts.append(target_stmt)
        print(f"target_stmts: {len(target_stmts)}")
        if not target_stmts:
            print(f"target_stmts is empty for {project_name}")
            return
        for seed in seeds:
            res = []
            cov_map_path = f"{Macros.results_dir}/coverage/{project_name}-{sha}-{test_type}-{seed}-covMap.json"
            if not os.path.exists(cov_map_path):
                print(f"cov_map_path: {cov_map_path} does not exist")
                continue
            for target_stmt in target_stmts:
                class_name = Util.file_path_to_class_name(target_stmt["filename"])
                line_number = target_stmt["line_number"]
                covered_map = Util.analyze_coverage(
                    cov_map_path, class_name, line_number, test_type
                )
                print(f"covered_map: {covered_map}")
                target_stmt.update(covered_map)
                res.append(target_stmt)
            se.io.dump(
                f"{Macros.results_dir}/covered-stmts/{project_name}-{sha}-{test_type}-{seed}.json",
                res,
                se.io.Fmt.jsonPretty,
            )

    # python -m exli.generate_tests count_covered_stmts
    def count_covered_stmts(self, seeds: list[int], test_type: str = "randoop"):
        covered_stmt = set()
        projs = set()
        for project_name, sha in Util.get_project_names_list_with_sha():
            for seed in seeds:
                file_path = f"{Macros.results_dir}/covered-stmts/{project_name}-{sha}-{test_type}-{seed}.json"
                if not os.path.exists(file_path):
                    continue
                file_content = se.io.load(file_path)
                for item in file_content:
                    if item[f"{test_type}_stmt_covered"]:
                        covered_stmt.add(item["filename"] + item["line_number"])
                        projs.add(item["project"])
        print("num of covered stmts: ", len(covered_stmt))
        # print(covered_stmt)
        print("num of projs: ", len(projs))

        total_not_covered_stmts = set()
        total_projs = set()
        updated_not_covered_res = []
        not_covered_stmts = se.io.load(
            Macros.results_dir / "target-statements-not-covered.json"
        )
        for item in not_covered_stmts:
            k = item["filename"] + item["line_number"]
            total_not_covered_stmts.add(k)
            total_projs.add(item["project"])

            if k not in covered_stmt:
                updated_not_covered_res.append(item)
        print("num of total not covered stmts: ", len(total_not_covered_stmts))

        res_dir = Macros.results_dir / "not-covered"
        se.io.mkdir(res_dir)
        se.io.dump(
            res_dir / f"{test_type}-not-covered.json",
            updated_not_covered_res,
            se.io.Fmt.jsonPretty,
        )


if __name__ == "__main__":
    CLI(Generate, as_positional=False)
