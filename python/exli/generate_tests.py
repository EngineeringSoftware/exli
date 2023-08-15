import os
import time

import seutil as se
from exli.filter import Filter
from exli.macros import Macros
from exli.util import Util
from jsonargparse import CLI


class Generate:
    # python -m generate_tests generate_tests_with_different_seeds --project_name="jkuhnert_ognl" --commit="5c30e1e"
    def generate_tests_with_different_seeds(
        self,
        project_name: str,
        commit: str,
        num_seeds: int = 5,
        test_type: str = "randoop",
    ):
        if test_type == "randoop":
            not_covered_classes = self.get_not_covered_classes(project_name, "path")
            if not not_covered_classes:
                print(f"not_covered_classes is empty for {project_name}")
                return
            deps = set()
            for not_covered_class in not_covered_classes:
                clazz_deps = Util.get_dependencies(
                    project_name, commit, not_covered_class
                )
                deps.update(clazz_deps)
            classpath_list = list(deps)
        elif test_type == "evosuite":
            not_covered_classes = self.get_not_covered_classes(project_name, "name")
            if not not_covered_classes:
                print(f"not_covered_classes is empty for {project_name}")
                return
            classpath_list = list(not_covered_classes)
        for seed in range(1, num_seeds + 1):
            # generate tests
            self.generate_tests_with_one_seed(
                project_name, commit, test_type, None, seed, classpath_list
            )

    def generate_tests_with_one_seed(self, 
        project_name: str,
        commit: str,
        test_type: str = "randoop",
        output_dir: str = None,
        seed: int = 42,
        classpath_list: list = None,
    ):
        if test_type == "randoop":
            res = Util.generate_randoop_tests(
                project_name, commit, seed, output_dir, 100, classpath_list
            )
            Util.fix_randoop_generated_tests_helper(project_name, output_dir)
        elif test_type == "evosuite":
            res = Util.generate_evosuite_tests(
                project_name, commit, seed, f"{output_dir}", 120, classpath_list
            )
        else:
            res = f"Unknown test type: {test_type}"
        print(f"When seed is {seed}, {res}")

    # python -m generate_tests generate_coverage --project_name="jkuhnert_ognl" --commit="5c30e1e"
    def generate_coverage(
        self,
        project_name: str,
        commit: str,
        num_seeds: int = 5,
        test_type: str = "randoop",
    ):
        res_dir = f"{Macros.results_dir}/{test_type}-tests-seeds"
        if not os.path.exists(res_dir):
            os.makedirs(res_dir)
        for seed in range(1, num_seeds + 1):
            self.generate_coverage_helper(
                project_name, commit, seed, res_dir, test_type
            )

    def generate_coverage_helper(
        self,
        project_name: str,
        commit: str,
        seed: int,
        results_dir: str,
        test_type: str = "randoop",
    ):
        if seed > 0:
            generated_tests_dir = f"{Macros.log_dir}/teco-{test_type}-test/{project_name}/{test_type}-tests-{seed}"
        else:
            generated_tests_dir = f"{Macros.log_dir}/teco-{test_type}-test/{project_name}/{test_type}-tests"
        if not os.path.exists(generated_tests_dir):
            print(f"{test_type}_tests_dir: {generated_tests_dir} does not exist")
            return
        Util.prepare_project(project_name, commit)
        print(f"project_name: {project_name}, commit: {commit}")
        Util.copy_randoop_tests_to_src_test_java(project_name, generated_tests_dir)
        if seed > 0:
            covMap_file = f"{results_dir}/{project_name}-covMap-{seed}.json"
        else:
            covMap_file = f"{results_dir}/{project_name}-covMap.json"
        if test_type == "randoop":
            # set checkout to False because Randoop tests are copied into the repo
            Util.run_jacoco(project_name, commit, False, "randoop")
            # parse into covMap.json
            if not os.path.exists(
                f"{Macros.downloads_dir}/{project_name}/target/jacoco.exec"
            ):
                print(f"jacoco.exec file does not exist for {project_name}")
            Filter().generate_jacoco_report(
                f"{Macros.downloads_dir}/{project_name}/target",
                f"{Macros.downloads_dir}/{project_name}/target/classes/",
                covMap_file,
            )
        elif test_type == "evosuite":
            log_file_path = Macros.log_dir / "teco" / "evosuite.txt"
            try:
                Util.run_evosuite_command_line(
                    project_name, log_file_path, generated_tests_dir
                )
            except Exception as e:
                print(f"Exception: {e}")
            if not os.path.exists(f"{Macros.downloads_dir}/{project_name}/jacoco.exec"):
                print(f"jacoco.exec file does not exist for {project_name}")
            Filter().generate_jacoco_report(
                f"{Macros.downloads_dir}/{project_name}",
                f"{Macros.downloads_dir}/{project_name}/target/classes/",
                covMap_file,
            )

    def get_classes(self, project_name: str, res_type: str = "path"):
        target_stmts = se.io.load(Macros.results_dir / "teco-target-statements.json")
        classes = set()
        for target_stmt in target_stmts:
            if target_stmt["project"] == project_name:
                if res_type == "path":
                    classes.add(Util.file_path_to_class_path(target_stmt["filename"]))
                elif res_type == "name":
                    classes.add(Util.file_path_to_class_name(target_stmt["filename"]))
        return classes

    def get_not_covered_classes(self, project_name: str, res_type: str = "path"):
        target_stmts_not_covered_path = (
            Macros.results_dir / "teco-target-statements-not-covered.json"
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

    # python -m generate_tests analyze_covered_stmts --project_name="jkuhnert_ognl" --commit="5c30e1e"
    def analyze_covered_stmts(
        self,
        project_name: str,
        commit: str,
        num_seeds: int = 5,
        test_type: str = "randoop",
    ):
        # get the class name and line number
        target_stmts_not_covered_path = (
            Macros.results_dir / "teco-target-statements-not-covered.json"
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
        for seed in range(1, num_seeds + 1):
            res = []
            cov_map_path = f"{Macros.results_dir}/{test_type}-tests-seeds/{project_name}-covMap-{seed}.json"
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
                f"{Macros.results_dir}/{test_type}-tests-seeds/{project_name}-target-stmts-{seed}.json",
                res,
                se.io.Fmt.jsonPretty,
            )

    # python -m generate_tests batch_run_tool
    def batch_run_tool(self, test_type: str = "randoop", num_seeds: int = 5):
        for project_name, sha in Util.get_project_names_list_with_sha():
            self.generate_tests_with_different_seeds(
                project_name, sha, num_seeds, test_type
            )
            self.generate_coverage(project_name, sha, num_seeds, test_type)
            self.analyze_covered_stmts(project_name, sha, num_seeds, test_type)

    # python -m generate_tests count_covered_stmts
    def count_covered_stmts(self, num_seeds: int = 5, test_type: str = "randoop"):
        covered_stmt = set()
        projs = set()
        for project_name, sha in Util.get_project_names_list_with_sha():
            for seed in range(1, num_seeds + 1):
                file_path = f"{Macros.results_dir}/{test_type}-tests-seeds/{project_name}-target-stmts-{seed}.json"
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
            Macros.results_dir / "teco-target-statements-not-covered.json"
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

    # python -m generate_tests batch_generate_tests --test_type evosuite
    def batch_generate_tests(
        self,
        test_type: str,
        proj_name: str = None,
        skip_existing: bool = False,
        seed: int = 42,
    ):
        time_file = Macros.results_dir / "time" / f"generate-{test_type}.json"
        if os.path.exists(time_file):
            time_dict = se.io.load(time_file)
        else:
            time_dict = {}

        for project_name, commit in Util.get_project_names_list_with_sha():
            if proj_name is not None and project_name != proj_name:
                continue
            if project_name in Util.get_excluded_projects():
                continue
            output_dir = (
                Macros.log_dir
                / f"teco-{test_type}-test"
                / project_name
                / f"{test_type}-tests"
            )
            if not os.path.exists(output_dir.parent):
                se.bash.run(f"mkdir -p {output_dir.parent}")
            if skip_existing:
                if os.path.exists(output_dir):
                    continue
            else:
                if os.path.exists(output_dir):
                    # remove the existing directory
                    se.bash.run(f"rm -rf {output_dir}")
            if test_type == "evosuite":
                classes = self.get_classes(project_name, "name")
                classpath_list = list(classes)
                start_time = time.time()
                try:
                    with se.TimeUtils.time_limit(10800):
                        res = Util.generate_evosuite_tests(
                            project_name,
                            commit,
                            seed,
                            f"{output_dir}",
                            120,
                            classpath_list,
                        )
                        print(f"res: {res}")
                except se.TimeoutException:
                    print(f"TimeoutException for {project_name}")
            elif test_type == "randoop":
                classes = self.get_classes(project_name, "path")
                deps = set()
                for not_covered_class in classes:
                    clazz_deps = Util.get_dependencies(
                        project_name, commit, not_covered_class
                    )
                    deps.update(clazz_deps)
                classpath_list = list(deps)
                start_time = time.time()
                try:
                    with se.TimeUtils.time_limit(10800):
                        res = Util.generate_randoop_tests(
                            project_name,
                            commit,
                            42,
                            f"{output_dir}",
                            100,
                            classpath_list,
                        )
                        Util.fix_randoop_generated_tests_helper(
                            project_name, output_dir
                        )
                except se.TimeoutException:
                    print(f"TimeoutException for {project_name}")
            end_time = time.time()
            total_time = end_time - start_time
            time_dict[f"{project_name}-{test_type}"] = total_time
            if "seed" in res:
                time_dict[f"{project_name}-{test_type}-seed"] = res["seed"]
        se.io.dump(time_file, time_dict, se.io.Fmt.jsonPretty)

    # python -m generate_tests batch_generate_coverage
    def batch_generate_coverage(self):
        for project_name, commit in Util.get_project_names_list_with_sha():
            if project_name in Util.get_excluded_projects():
                continue
            if project_name != "red6_pdfcompare":
                continue
            res_dir = f"{Macros.results_dir}/teco-evosuite-tests"
            if not os.path.exists(res_dir):
                os.makedirs(res_dir)
            self.generate_coverage_helper(project_name, commit, 0, res_dir, "evosuite")


if __name__ == "__main__":
    CLI(Generate, as_positional=False)
