import collections
import glob
import os
import re
import subprocess
import traceback
from os.path import expanduser
from pathlib import Path
from typing import List

import seutil as se
import xmltodict
from exli.macros import Macros
from exli.maven import MavenProject
from tqdm import tqdm


class Util:
    # assume this method is invoked in maven project, the project has run mvn test-compile
    # return: string of dependencies appending with ":"
    @classmethod
    def find_dependencies(cls, project_classpath_included: bool = True):
        se.bash.run(
            "mvn dependency:build-classpath -Dmdep.outputFile=raninline-classpath.txt",
            0,
        )
        classpath_files = se.bash.run('find . -name "raninline-classpath.txt"').stdout
        dependencies_set = set()
        for classpath_file in classpath_files.split("\n"):
            if classpath_file:
                current_file_dependencies = (
                    se.bash.run(f"cat {classpath_file}").stdout.strip().split(":")
                )
                dependencies_set.update(current_file_dependencies)
        dependencies = ":".join(dependencies_set)

        if not project_classpath_included:
            return dependencies

        current_project_dependencies_set = set()
        for f in glob.glob(
            f"**/target/classes",
            recursive=True,
        ):
            current_project_dependencies_set.add(f)
        for f in glob.glob(
            f"**/target/test-classes",
            recursive=True,
        ):
            current_project_dependencies_set.add(f)
        current_project_dependencies = ":".join(current_project_dependencies_set)
        dependencies = (
            current_project_dependencies + ":" + dependencies
            if dependencies
            else current_project_dependencies
        )
        return dependencies

    @classmethod
    def get_sha(cls, project_name: str):
        project_dict = se.io.load(
            Macros.results_dir
            / "teco-projects-2022-01-01-unit-tests-jacoco-randoop.json"
        )
        for project in project_dict:
            if project["full_name"] == project_name:
                return project["sha"][:7]
        return None

    @classmethod
    def get_project_names_list(cls):
        project_dict = se.io.load(
            Macros.results_dir
            / "teco-projects-2022-01-01-unit-tests-jacoco-randoop.json"
        )
        return [
            project["full_name"]
            for project in project_dict
            if project["jacoco"] and project["randoop"]
        ]

    @classmethod
    def get_project_names_list_with_sha(cls):
        project_dict = se.io.load(
            Macros.results_dir
            / "teco-projects-2022-01-01-unit-tests-jacoco-randoop.json"
        )
        return [
            (project["full_name"], project["sha"][:7])
            for project in project_dict
            if project["jacoco"] and project["randoop"]
        ]

    @classmethod
    def copy_jacoco_extension(cls):
        se.bash.run(
            f"cp {Macros.project_dir}/jars/jacoco-extension-1.0-SNAPSHOT.jar $MAVEN_HOME/lib/ext/"
        )

    @classmethod
    def remove_jacoco_extension(cls):
        se.bash.run(f"rm $MAVEN_HOME/lib/ext/jacoco-extension-1.0-SNAPSHOT.jar")

    @classmethod
    def configure_tests_for_filtering(
        cls, project_name: str, test_type: str, maven_project: MavenProject
    ):
        # remove skip tests
        with se.io.cd(Macros.downloads_dir / project_name):
            pom = se.io.load("pom.xml", se.io.Fmt.txt)
            if "<maven.test.skip>true</maven.test.skip>" in pom:
                pom.replace("<maven.test.skip>true</maven.test.skip>", "")
                se.io.dump("pom.xml", pom, se.io.Fmt.txt)
            if "<skipTests>true</skipTests>" in pom:
                pom.replace(
                    "<skipTests>true</skipTests>", "<skipTests>false</skipTests>"
                )
                se.io.dump("pom.xml", pom, se.io.Format.txt)
        if test_type == "unit":
            if project_name not in [
                "FasterXML_woodstox",
                "restfb_restfb",
                "kbss-cvut_jb4jsonld-jackson",
                "craftercms_deployer",
                "netceteragroup_trema-core",
                "red6_pdfcompare",
                "craftercms_deployer",
                "mp911de_logstash-gelf",
            ]:
                maven_project.hack_pom_delete_plugin("maven-surefire-plugin")
                maven_project.hack_pom_delete_plugin("jacoco-maven-plugin")
        if test_type == "randoop" or test_type == "randoop-1200":
            if project_name in ["craftercms_deployer"]:
                maven_project.hack_pom_add_dependency("junit", "junit", "4.13")
            else:
                maven_project.hack_pom_add_dependency("junit", "junit", "4.13.2")
            if project_name not in [
                "FasterXML_woodstox",
                "uwolfer_gerrit-rest-java-client",
            ]:
                cls.fix_pom_when_using_jacoco(maven_project)
            if project_name in ["uwolfer_gerrit-rest-java-client"]:
                maven_project.hack_pom_delete_plugin("org.testng", False)
                maven_project.hack_pom_delete_plugin("testng", False)

    @classmethod
    def configure_tests_for_jacoco_agent(
        cls, project_name: str, test_type: str, maven_project: MavenProject
    ):
        if test_type == "randoop":
            if project_name in [
                "Bernardo-MG_maven-site-fixer",
                "Bernardo-MG_velocity-config-tool",
                "FasterXML_woodstox",
                "mp911de_logstash-gelf",
                "netceteragroup_trema-core",
                "ralscha_extdirectspring",
                "restfb_restfb",
                "jkuhnert_ognl",
                "mojohaus_build-helper-maven-plugin",
                "uwolfer_gerrit-rest-java-client",
            ]:
                se.bash.run(
                    f"cp {Macros.project_dir}/poms/{project_name}-pom.xml {Macros.downloads_dir}/{project_name}/pom.xml"
                )
                if project_name == "mp911de_logstash-gelf":
                    maven_project.hack_pom_add_dependency("junit", "junit", "4.13.2")
                    maven_project.hack_pom_delete_plugin("junit-jupiter-engine", False)
                    maven_project.hack_pom_delete_plugin("junit-platform-runner", False)
                    maven_project.hack_pom_delete_plugin(
                        "junit-platform-launcher", False
                    )
                    maven_project.hack_pom_delete_plugin("junit-vintage-engine", False)
                    maven_project.hack_pom_delete_plugin("junit-jupiter-params", False)
                    maven_project.hack_pom_delete_plugin("junit-jupiter-api", False)
                    maven_project.hack_pom_delete_plugin("junit-bom", False)
                    maven_project.hack_pom_delete_plugin("mockito-junit-jupiter", False)
                    maven_project.hack_pom_delete_plugin(
                        "arquillian-junit-container", False
                    )
                    maven_project.hack_pom_delete_plugin("kafka-junit", False)
                    return
                elif project_name == "uwolfer_gerrit-rest-java-client":
                    return
        cls.configure_tests_for_filtering(project_name, test_type, maven_project)
        if test_type == "unit":
            if project_name in [
                "Bernardo-MG_maven-site-fixer",
                "Bernardo-MG_velocity-config-tool",
                "FasterXML_woodstox",
                "mp911de_logstash-gelf",
                "netceteragroup_trema-core",
                "ralscha_extdirectspring",
                "restfb_restfb",
                "jkuhnert_ognl",
                "mojohaus_build-helper-maven-plugin",
            ]:
                se.bash.run(
                    f"cp {Macros.project_dir}/poms/{project_name}-pom.xml {Macros.downloads_dir}/{project_name}/pom.xml"
                )

    @classmethod
    def fix_pom_when_using_jacoco(cls, maven_project: MavenProject):
        print(
            "clean pom by removing maven-surefire-plugin, jacoco-maven-plugin, junit-jupiter-engine..."
        )
        maven_project.hack_pom_delete_plugin("maven-surefire-plugin")
        maven_project.hack_pom_delete_plugin("jacoco-maven-plugin")
        maven_project.hack_pom_delete_plugin("junit-jupiter-engine", False)
        maven_project.hack_pom_delete_plugin("junit-platform-runner", False)
        maven_project.hack_pom_delete_plugin("junit-platform-launcher", False)
        maven_project.hack_pom_delete_plugin("junit-vintage-engine", False)
        maven_project.hack_pom_delete_plugin("junit-jupiter-params", False)
        maven_project.hack_pom_delete_plugin("junit-jupiter-api", False)

    @classmethod
    def prepare_project(cls, project_name: str, sha: str, checkout: bool = True):
        project = se.project.Project(
            url=f"https://github.com/{project_name.replace('_', '/')}",
            full_name=project_name,
        )
        project.clone(Macros.downloads_dir)
        if checkout:
            with se.io.cd(Macros.downloads_dir / project_name):
                se.bash.run(f"git checkout -f {sha}")
                se.bash.run("git checkout .")
                se.bash.run(f"git clean -xfd")
        return project

    @classmethod
    def list_java_files(self, dir: str):
        with se.io.cd(dir):
            # list all the java files in the project
            java_files = glob.glob(
                f"{dir}" + "/**/*.java",
                recursive=True,
            )
            full_file_paths = [
                f"{file_path}"
                for file_path in java_files
                if "src/test/java" not in file_path
            ]
            return full_file_paths

    @classmethod
    def parse_inline_tests(
        cls,
        project_name: str,
        sha: str = None,
        generated_tests_dir: str = f"{Macros.reduced_tests_dir}",
        inline_tests_dir: str = f"{Macros.reduced_inline_tests_dir}",
        file_path_with_inline_tests: str = None,
    ):
        if file_path_with_inline_tests is not None:
            # if file path is provided, only parse the inline tests in that file
            file_paths_with_inline_tests = [file_path_with_inline_tests]
        else:
            # find all java files with inline tests
            generated_tests_dir = f"{generated_tests_dir}/{project_name}-{sha}"
            file_paths_with_inline_tests = cls.list_java_files(generated_tests_dir)
            if len(file_paths_with_inline_tests) == 0:
                print(f"no inline tests found in {project_name}")
                return
        # copy the generated test cases to a package
        inlinetest_package_dir = f"{inline_tests_dir}/{project_name}-{sha}"
        if os.path.exists(inlinetest_package_dir):
            se.bash.run(f"rm -rf {inlinetest_package_dir}")
        se.bash.run(f"mkdir -p {inlinetest_package_dir}")
        # for each java file, parse the inline tests to JUnit tests
        for file_path in file_paths_with_inline_tests:
            # restfb has two packages, one is in src/main/java, the other is in src/main/lombok
            if project_name == "restfb_restfb":
                app_src_path = f"{Macros.downloads_dir}/{project_name}/src/main/java:{Macros.downloads_dir}/{project_name}/src/main/lombok:{Macros.downloads_dir}/{project_name}/src/test/java"
            else:
                app_src_path = f"{Macros.downloads_dir}/{project_name}/src/main/java:{Macros.downloads_dir}/{project_name}/src/test/java"
            command = f"java -cp {Macros.itest_jar} org.inlinetest.InlineTestRunnerSourceCode --input_file={file_path} --assertion_style=junit --output_dir={inlinetest_package_dir} --multiple_test_classes=true --dep_file_path={Macros.log_dir}/teco-randoop-test/{project_name}/randoop-tests/randoop-deps.txt --app_src_path={app_src_path}"
            try:
                se.bash.run(command, 0, timeout=180)
            except subprocess.TimeoutExpired as e:
                print(
                    f"timeout when parsing inline tests {file_path} for {project_name}"
                )
                continue
            except Exception as e:
                print(f"error when parsing inline tests {file_path} for {project_name}")
                continue
        for file_path in os.listdir(inlinetest_package_dir):
            content = se.io.load(
                f"{inlinetest_package_dir}/{file_path}", se.io.Fmt.txtList
            )
            package = content[0]
            package = package.replace("package ", "")
            package = package.replace(";", "")
            package_to_dir = package.replace(".", "/")
            # create package dir
            se.bash.run(f"mkdir -p {inlinetest_package_dir}/{package_to_dir}")
            # move file to package
            se.bash.run(
                f"mv {inlinetest_package_dir}/{file_path} {inlinetest_package_dir}/{package_to_dir}/{file_path}"
            )

    @classmethod
    def run_inline_tests(
        cls,
        project_name: str,
        commit: str = None,
        inlinetest_dir: str = None,
        test_name: str = None,
    ):
        if commit is None:
            commit = cls.get_sha(project_name)
        if inlinetest_dir is None:
            inlinetest_dir = (
                f"{Macros.reduced_inline_tests_dir}/{project_name}-{commit}"
            )
        if not os.path.exists(inlinetest_dir):
            return None, None
        with se.io.cd(Macros.downloads_dir / project_name):
            # compile the project
            se.bash.run(f"mvn clean compile {Macros.SKIPS}", 0)
            # copy the cached file
            if (
                Macros.reduced_tests_dir / f"{project_name}-{commit}" / ".inlinegen"
            ).exists():
                se.bash.run(
                    f"cp -r {Macros.reduced_tests_dir}/{project_name}-{commit}/.inlinegen .",
                    0,
                )
            # copy the inline tests
            if test_name:
                exist, test_path = cls.find_inline_test(test_name, inlinetest_dir)
                if exist:
                    test_path_dir = "/".join(test_path.split("/")[:-1])
                    se.bash.run(
                        f"mkdir -p {Macros.downloads_dir}/{project_name}/{Macros.INLINE_TEST_PACKAGE}/{test_path_dir}",
                        0,
                    )
                    # copy the test file to the package, not just the root dir
                    se.bash.run(
                        f"cp {inlinetest_dir}/{test_path} {Macros.downloads_dir}/{project_name}/{Macros.INLINE_TEST_PACKAGE}/{test_path_dir}",
                        0,
                    )
                else:
                    return None, None
            else:
                se.bash.run(
                    f"cp -r {inlinetest_dir} {Macros.downloads_dir}/{project_name}/{Macros.INLINE_TEST_PACKAGE}",
                    0,
                )
            # compile
            deps_file = f"{Macros.log_dir}/teco-randoop-test/{project_name}/randoop-tests/randoop-deps.txt"
            comp_str = f"javac -cp {Macros.itest_jar}:{Macros.jar_dir}/junit-platform-console-standalone-1.9.0-RC1.jar:{Macros.raninline_jar}:$(< {deps_file}) $(find {Macros.INLINE_TEST_PACKAGE} -name '*.java')"
            comp_failed_tests = []
            try:
                se.bash.run(comp_str, 0)
            except Exception as e:
                if test_name:
                    print(e)
                    return "compilation failure", -1
                else:
                    print(e)
                    # compile file one by one, and remove the failed file
                    java_files = []
                    for file_path in glob.glob(
                        f"{Macros.INLINE_TEST_PACKAGE}/**/*.java", recursive=True
                    ):
                        print("recompiling", file_path, "...")
                        java_files.append(file_path)
                        comp_str = f"javac -cp {Macros.itest_jar}:{Macros.jar_dir}/junit-platform-console-standalone-1.9.0-RC1.jar:{Macros.raninline_jar}:$(< {deps_file}) {file_path}"
                        try:
                            se.bash.run(comp_str, 0)
                        except Exception as e:
                            print(e)
                            comp_failed_tests.append(
                                file_path + "," + traceback.format_exc()
                            )
                            se.bash.run(f"rm {file_path}")
                    if len(comp_failed_tests) == len(java_files):
                        return "compilation failure", -1
            if f"{Macros.reduced_inline_tests_dir}" in inlinetest_dir:
                comp_failed_tests_file = f"{Macros.reduced_inline_tests_report_dir}/{project_name}-comp-failed-tests.txt"
            elif f"{Macros.all_inline_tests_dir}" in inlinetest_dir:
                comp_failed_tests_file = f"{Macros.all_inline_tests_report_dir}/{project_name}-comp-failed-tests.txt"
            if os.path.exists(comp_failed_tests_file):
                os.remove(comp_failed_tests_file)
            if comp_failed_tests:
                se.io.dump(comp_failed_tests_file, comp_failed_tests, se.io.Fmt.txtList)
            # get package list
            package_list = []
            for dir in os.listdir(
                Macros.downloads_dir / project_name / Macros.INLINE_TEST_PACKAGE
            ):
                if os.path.isdir(
                    Macros.downloads_dir
                    / project_name
                    / f"{Macros.INLINE_TEST_PACKAGE}/{dir}"
                ):
                    package_list.append(f"--select-package {dir}")
            # run tests
            deps = se.io.load(deps_file, se.io.Fmt.txt)
            if "testng" in deps:
                deps_str = ":".join(
                    [dep for dep in deps.split(":") if "testng" not in dep]
                )
                deps_file = "deps.txt"
                se.io.dump(deps_file, deps_str, se.io.Fmt.txt)
            run_str = f"java -jar {Macros.jar_dir}/junit-platform-console-standalone-1.9.0-RC1.jar -cp {Macros.itest_jar}:{Macros.INLINE_TEST_PACKAGE}:{Macros.raninline_jar}:$(< {deps_file}) {' '.join(package_list)} --reports-dir reports"
            run_res = se.bash.run(run_str)
            junit_report_file = "reports/TEST-junit-jupiter.xml"
            if os.path.exists(junit_report_file):
                report_xml = se.io.load(junit_report_file, se.io.Fmt.txt)
                report_json = xmltodict.parse(report_xml)
                return report_json, run_res.returncode
            else:
                return None, run_res.returncode

    @classmethod
    def find_inline_test(cls, test_name: str, inline_test_dir: str = None):
        with se.io.cd(inline_test_dir):
            test_path = se.bash.run(f"find . -name {test_name}").stdout.strip()
            if test_path == "":
                return False, None
        return True, test_path

    @classmethod
    def get_maven_project(cls, parsed_project_name: str):
        project = se.project.Project(
            url=f"https://github.com/{parsed_project_name.replace('_', '/', 1)}",
            full_name=parsed_project_name,
        )
        project.clone(Macros.downloads_dir)
        maven_project = MavenProject.from_project(project)
        return maven_project

    @classmethod
    def run_unit_tests(
        cls,
        parsed_project_name: str,
        log_file_path: str,
        maven_project: MavenProject = None,
        timeout: int = 600,
    ):
        if maven_project is None:
            maven_project = cls.get_maven_project(parsed_project_name)
        Util.configure_tests_for_jacoco_agent(
            parsed_project_name, "unit", maven_project
        )
        print("compiling and executing unit tests...")
        se.io.dump(log_file_path, ["Unit"], se.io.Fmt.txtList, append=True)
        with se.io.cd(Macros.downloads_dir / parsed_project_name):
            if parsed_project_name == "cyclopsgroup_jcli":
                se.bash.run("mvn com.coveo:fmt-maven-plugin:format", 0)
            try:
                with se.TimeUtils.time_limit(timeout):
                    run_res = se.bash.run(
                        f"mvn clean test {Macros.SKIPS_NO_JACOCO} &>> {log_file_path}"
                    )
            except se.TimeoutException:
                return -1
            return run_res.returncode

    @classmethod
    def run_randoop_command_line(
        cls,
        parsed_project_name: str,
        log_file_path: str = "",
        deps_file: str = "randoop-deps.txt",
        timeout: int = 600,
    ):
        with se.io.cd(Macros.downloads_dir / parsed_project_name):
            se.bash.run(f"mvn test-compile {Macros.SKIPS}")
        print("copying Randoop test cases...")
        se.bash.run(
            f"cp -r {Macros.log_dir}/teco-randoop-test/{parsed_project_name}/randoop-tests {Macros.downloads_dir/parsed_project_name}/randoop-tests",
            0,
        )
        with se.io.cd(f"{Macros.downloads_dir/parsed_project_name}"):
            # set field "debug" to true
            for f in glob.glob("randoop-tests/*.java"):
                with open(f, "r") as f_in:
                    test_content = f_in.read()
                    test_content = test_content.replace(
                        "public static boolean debug = false;",
                        "public static boolean debug = true;",
                    )
                with open(f, "w") as f_out:
                    f_out.write(test_content)

        ################################## Execute tests ##################################
        print("compiling and executing test cases...")
        se.io.dump(log_file_path, ["Randoop"], se.io.Fmt.txtList, append=True)
        with se.io.cd(f"{Macros.downloads_dir / parsed_project_name}"):
            comp_str = f"javac -cp {Macros.jar_dir}/junit-platform-console-standalone-1.9.0-RC1.jar:{Macros.raninline_jar}:$(< 'randoop-tests'/{deps_file}) randoop-tests/RegressionTest*.java"
            se.bash.run(comp_str, 0)
            try:
                with se.TimeUtils.time_limit(timeout):
                    # =inclbootstrapclasses=true
                    run_str = f"java -javaagent:{Macros.jar_dir}/org.jacoco.agent-0.8.8-runtime.jar -jar {Macros.jar_dir}/junit-platform-console-standalone-1.9.0-RC1.jar -cp randoop-tests/:{Macros.raninline_jar}:$(< 'randoop-tests'/{deps_file}) --select-class RegressionTest --details=none &>> {log_file_path}"
                    run_res = se.bash.run(run_str)
            except se.TimeoutException:
                return -1
        return run_res.returncode

    @classmethod
    def run_randoop(
        cls,
        parsed_project_name: str,
        log_file_path: str = "",
        randoop_dir: str = None,
        maven_project: MavenProject = None,
        timeout: int = 600,
    ):
        if maven_project is None:
            maven_project = cls.get_maven_project(parsed_project_name)
        Util.configure_tests_for_jacoco_agent(
            parsed_project_name, "randoop", maven_project
        )
        Util.copy_randoop_tests_to_src_test_java(parsed_project_name)
        print("compiling and executing Randoop tests...")
        with se.io.cd(Macros.downloads_dir / parsed_project_name):
            try:
                with se.TimeUtils.time_limit(timeout):
                    run_res = se.bash.run(
                        f"mvn clean test {Macros.SKIPS_NO_JACOCO} &>> {log_file_path}"
                    )
            except se.TimeoutException:
                return -1
            return run_res.returncode

    @classmethod
    def run_jacoco(
        self,
        project_name: str,
        sha: str,
        checkout: bool = True,
        test_type="unit",
        timeout=600,
        allow_test_failure=False,
    ):
        res = {}
        project = Util.prepare_project(project_name, sha, checkout)
        maven_project = MavenProject.from_project(project)
        with se.io.cd(Macros.downloads_dir / project_name):
            try:
                Util.copy_jacoco_extension()
                Util.configure_tests_for_filtering(
                    project_name, test_type, maven_project
                )
                test_rr = se.bash.run(
                    f"mvn clean test {Macros.SKIPS_NO_JACOCO} > {Macros.log_dir}/teco/{project_name}-{test_type}-jacoco.txt",
                    timeout=timeout,
                )
                if test_rr.returncode != 0 and not allow_test_failure:
                    raise RuntimeError(f"Test failed, result: {test_rr}")
                jacoco_exec = glob.glob("**/jacoco.exec", recursive=True)
                if jacoco_exec:
                    print("jacoco.exec found")
                    se.bash.run(
                        f"mvn jacoco:report > {Macros.log_dir}/teco/{project_name}-{test_type}-jacoco-report.txt",
                        timeout=120,
                    )
                    se.bash.run(
                        f"rm -rf {Macros.log_dir}/teco/{project_name}-{test_type}-jacoco-report"
                    )
                    print("copying jacoco report...")
                    se.bash.run(
                        f"cp -r target/site/jacoco {Macros.log_dir}/teco/{project_name}-{test_type}-jacoco-report"
                    )
                    if test_type == "unit":
                        res["jacoco"] = True
                    else:
                        res["randoop-jacoco"] = True
                else:
                    print("jacoco.exec not found")
                    if test_type == "unit":
                        res["jacoco"] = False
                    else:
                        res["randoop-jacoco"] = False
            except Exception as e:
                if test_type == "unit":
                    res["jacoco"] = False
                else:
                    res["randoop-jacoco"] = False
                res["exception"] = traceback.format_exc()
            Util.remove_jacoco_extension()
            return res

    @classmethod
    def find_classes(cls):
        # precodition: execute under the project root
        classpath_list = []
        classes = se.bash.run("find . -name '*.class'", 0).stdout
        for classpath in classes.splitlines():
            # do not test test
            if "target/classes/" not in classpath:
                continue
            classpath = (
                classpath.split("target/classes/")[-1]
                .split("target/test-classes/")[-1]
                .replace(".class", "")
                .replace(r"/", r".")
            )
            classpath_list.append(classpath)
        return classpath_list

    @classmethod
    def generate_randoop_tests(
        cls,
        project_name: str,
        sha: str,
        seed: int = 0,
        output_dir: str = None,
        time_limit: int = 100,
        classpath_list: List[str] = None,
    ):
        print("run randoop...")
        res = {}
        res["seed"] = seed
        se.io.mkdir(Macros.log_dir / "teco-randoop-test")
        project = Util.prepare_project(project_name, sha)
        maven_project = MavenProject.from_project(project)
        if output_dir is None:
            output_dir = Macros.log_dir / "teco-randoop-test" / f"{project_name}" / f"randoop-test-{seed}"
        else:
            output_dir = Path(output_dir)
        if output_dir.exists():
            print(f"output_dir: {output_dir} already exists")
            return
        # create parent dir if not exist
        if not output_dir.parent.exists():
            se.io.mkdir(output_dir.parent)
        try:
            with se.io.cd(Macros.downloads_dir / project_name):
                maven_project.install()
                dependencies = maven_project.exec_classpathes(
                    Macros.downloads_dir / project_name,
                    Macros.log_dir / "raninline.log",
                )
                se.io.mkdir("randoop-tests")
                with open("randoop-tests/randoop-deps.txt", "w") as f:
                    f.write(dependencies)
                print("find classes...")
                if classpath_list is None:
                    classpath_list = cls.find_classes()
                total_time_limit = min(len(classpath_list) * time_limit, 3600)
                print(f"total time limit: {total_time_limit}")
                with open("randoop-tests/classlist.txt", "w") as f:
                    f.write("\n".join(classpath_list))

                with se.io.cd(f"{Macros.downloads_dir/project_name}/randoop-tests"):
                    print("running randoop...")
                    try:
                        se.bash.run(
                            f"java -cp {Macros.randoop_jar}:$(< randoop-deps.txt) randoop.main.Main gentests --time-limit={total_time_limit} --usethreads=true --randomseed={seed} --classlist=classlist.txt > {Macros.log_dir}/teco/{project_name}-randoop.log",
                            0,
                            timeout=total_time_limit + 1800,
                        )
                    except (subprocess.TimeoutExpired, Exception) as e:
                        se.io.dump(
                            f"{Macros.log_dir}/teco/run-randoop.log",
                            [f"{e}"],
                            se.io.Fmt.txtList,
                            append=True,
                        )
                    java_files = se.bash.run(
                        "find . -name 'RegressionTest*.java'"
                    ).stdout
                    if java_files.strip():
                        res["randoop"] = True
                        se.io.mkdir(
                            f"{Macros.log_dir}/teco-randoop-test/{project_name}"
                        )
                        se.bash.run(
                            f"cp -r {Macros.downloads_dir}/{project_name}/randoop-tests {output_dir}"
                        )
                    else:
                        res["randoop"] = False
        except Exception as e:
            print(traceback.format_exc())
            res["randoop"] = False
            se.io.dump(
                f"{Macros.log_dir}/teco/run-randoop.log",
                [f"{e}"],
                se.io.Fmt.txtList,
                append=True,
            )
        return res

    @classmethod
    def generate_evosuite_tests(
        cls,
        project_name: str,
        sha: str,
        seed: int = 0,
        output_dir: str = None,
        time_limit: int = 120,
        classpath_list: List[str] = None,
        target_is_class: bool = True,
    ):
        print("run evosuite...")
        res = {}
        res["seed"] = seed
        project = Util.prepare_project(project_name, sha)
        maven_project = MavenProject.from_project(project)
        if output_dir is None:
            output_dir = Macros.log_dir / "teco-evosuite-test" / f"{project_name}" / f"evosuite-test-{seed}"
        else:
            output_dir = Path(output_dir)
        if output_dir.exists():
            print(f"output_dir: {output_dir} already exists")
            return
        # create parent dir if not exist
        if not output_dir.parent.exists():
            se.io.mkdir(output_dir.parent)
        try:
            with se.io.cd(Macros.downloads_dir / project_name):
                maven_project.install()
                dependencies = maven_project.exec_classpathes(
                    Macros.downloads_dir / project_name,
                    Macros.log_dir / "raninline.log",
                )
                se.io.dump("evosuite-deps.txt", dependencies, se.io.Fmt.txt)
                if target_is_class:
                    print("find classes...")
                    if classpath_list is None:
                        classpath_list = cls.find_classes()
                    for classpath in tqdm(classpath_list):
                        try:
                            # -Dassertion_timeout={time_limit} -Dminimization_timeout={time_limit}
                            command = f"java -jar {Macros.evosuite_jar} -DCP_file_path evosuite-deps.txt -class {classpath} -seed {seed} -Dsearch_budget={time_limit} -Duse_separate_classloader=false -Dminimize=false -Dassertion_strategy=all -Dfilter_assertions=true -Dvirtual_fs=false -Dvirtual_net=false -Dsandbox_mode=OFF -Dfilter_sandbox_tests=true -Dmax_loop_iterations=-1 &> {Macros.log_dir}/teco/{project_name}-evosuite.log"
                            print(command)
                            se.bash.run(command, 0, timeout=5 * time_limit)
                        except (subprocess.TimeoutExpired, Exception) as e:
                            print(traceback.format_exc())
                            se.io.dump(
                                f"{Macros.log_dir}/teco/run-evosuite.log",
                                [f"{e}"],
                                se.io.Fmt.txtList,
                                append=True,
                            )
                else:
                    # target is whole project
                    # check if target/classes exists
                    if not os.path.exists("target/classes"):
                        se.bash.run("mvn compile", 0)
                    command = f"java -jar {Macros.evosuite_jar} -DCP_file_path evosuite-deps.txt -target {Macros.downloads_dir}/{project_name}/target/classes -seed {seed} -Dsearch_budget={time_limit} -Dassertion_timeout={time_limit} -Dminimization_timeout={time_limit} -Duse_separate_classloader=false -Dminimize=false -Dassertion_strategy=all -Dfilter_assertions=true -Dfilter_sandbox_tests=true -Dvirtual_fs=false -Dvirtual_net=false -Dsandbox_mode=OFF -Dmax_loop_iterations=-1 &> {Macros.log_dir}/teco/{project_name}-evosuite.log"
                    print(command)
                    try:
                        se.bash.run(command, 0, timeout=5 * time_limit)
                    except Exception as e:
                        print(traceback.format_exc())
                        res["evosuite"] = False
                        se.io.dump(
                            f"{Macros.log_dir}/teco/run-evosuite.log",
                            [f"{e}"],
                            se.io.Fmt.txtList,
                            append=True,
                        )
                # copy evosuite tests to output dir
                if (Macros.downloads_dir / project_name / "evosuite-tests").exists():
                    # post-process generated tests, change (timeout = 4000) to (timeout = 4000000)
                    se.bash.run(
                        "shopt -s globstar;sed -i 's/@Test(timeout = 4000)/@Test(timeout = 4000000)/g' evosuite-tests/**/*.java"
                    )

                    se.bash.run(
                        f"cp -r {Macros.downloads_dir}/{project_name}/evosuite-tests {output_dir}"
                    )
                    se.bash.run(
                        f"cp {Macros.downloads_dir}/{project_name}/evosuite-deps.txt {output_dir}"
                    )
                    se.bash.run(
                        f"cp -r {Macros.downloads_dir}/{project_name}/evosuite-report {output_dir}"
                    )
                    res["evosuite"] = True
                else:
                    res["evosuite"] = False
        except Exception as e:
            print(traceback.format_exc())
            res["evosuite"] = False
            se.io.dump(
                f"{Macros.log_dir}/teco/run-evosuite.log",
                [f"{e}"],
                se.io.Fmt.txtList,
                append=True,
            )
        return res

    @classmethod
    def run_evosuite_command_line(
        cls,
        parsed_project_name: str,
        log_file_path: str,
        test_dir: str = None,
        deps_file: str = "evosuite-deps.txt",
        target_jacoco_exec_path: str = None,
        time_limit: int = 600,
    ):
        with se.io.cd(Macros.downloads_dir / parsed_project_name):
            se.bash.run(f"mvn test-compile {Macros.SKIPS}")
        print("copying EvoSuite test cases...")
        if not test_dir:
            test_dir = f"{Macros.log_dir}/teco-evosuite-test/{parsed_project_name}/evosuite-tests"
        se.bash.run(
            f"cp -r {test_dir} {Macros.downloads_dir/parsed_project_name}/evosuite-tests",
            0,
        )

        # 1. change separateClassLoader = true into separateClassLoader = false
        # 2. collect class names
        classes = set()
        with se.io.cd(f"{Macros.downloads_dir/parsed_project_name}"):
            # set field "debug" to true
            for f in glob.glob("evosuite-tests/**/*.java", recursive=True):
                if f.endswith("Test.java"):
                    classes.add(
                        f.replace("evosuite-tests/", "")
                        .replace(".java", "")
                        .replace("/", ".")
                    )

        # TODO: hacky way to fix EvoSuite issue: comment out org.evosuite.runtime.GuiSupport
        with se.io.cd(f"{Macros.downloads_dir/parsed_project_name}"):
            for f in glob.glob("evosuite-tests/**/*_scaffolding.java", recursive=True):
                content = se.io.load(f, se.io.Fmt.txt)
                se.io.dump(
                    f,
                    content.replace(
                        "org.evosuite.runtime.GuiSupport",
                        "//org.evosuite.runtime.GuiSupport",
                    ).replace(
                        "org.evosuite.runtime.jvm.ShutdownHookHandler",
                        "//org.evosuite.runtime.jvm.ShutdownHookHandler",
                    ),
                    se.io.Fmt.txt,
                )

        if not classes:
            return 0
        ################################## Execute tests ##################################
        print("compiling and executing test cases...")
        with se.io.cd(f"{Macros.downloads_dir / parsed_project_name}"):
            # add raninline.jar to evosuite-deps.txt
            deps = se.io.load(f"evosuite-tests/{deps_file}", se.io.Fmt.txt).strip()
            if f"{Macros.raninline_jar}" not in deps:
                deps += f":{Macros.raninline_jar}"
            # TODO: hacky fix of file path problems
            deps = re.sub(r"/home/[^/]+/", f"/home/{os.getenv('USER')}/", deps)
            se.io.dump(f"evosuite-tests/{deps_file}", deps, se.io.Fmt.txt)

            comp_str = f"shopt -s globstar; javac -cp {Macros.evosuite_runtime_jar}:{Macros.junit_jar}:{Macros.raninline_jar}:$(< evosuite-tests/{deps_file}) evosuite-tests/**/*.java"
            print(comp_str)
            try:
                se.bash.run(comp_str, 0)
            except Exception as e:
                se.io.dump(log_file_path, traceback.format_exc(), se.io.Fmt.txt)
                return -1
            try:
                with se.TimeUtils.time_limit(time_limit):
                    # =inclbootstrapclasses=true
                    # for each class in classes, build a string like: -c class_name
                    class_str = ""
                    for c in classes:
                        # TODO: hacky way to comment out a class that causes the tests to disappear
                        if c == "de.redsix.pdfcompare.CompareResultImpl_ESTest":
                            continue
                        # class_str += f"-c {c} "
                        class_str += f"{c} "

                    # run_str = f"java -javaagent:{Macros.jacoco_agent_jar} -jar {Macros.junit_jar} -cp evosuite-tests:{Macros.evosuite_runtime_jar}:$(< evosuite-tests/{deps_file}) {class_str} --details=none &>> {log_file_path}"
                    # need to use &>> instead of &> because we want to save EvoSuite, Randoop and Unit tests' logs into one file
                    run_str = f"java -javaagent:{Macros.jacoco_agent_jar} -cp evosuite-tests:{Macros.evosuite_runtime_jar}:$(< evosuite-tests/{deps_file}) org.junit.runner.JUnitCore {class_str} &>> {log_file_path}"
                    print(run_str)
                    run_res = se.bash.run(run_str)

                    jacoco_path = (
                        Macros.downloads_dir / parsed_project_name / "jacoco.exec"
                    )
                    if jacoco_path.exists():
                        # generate jacoco report
                        se.bash.run(
                            f"java -jar {Macros.jar_dir}/jacococli-0.8.10.jar report {jacoco_path} --classfiles target/classes --html {Macros.log_dir}/teco/{parsed_project_name}-evosuite-jacoco-report",
                            0,
                        )
                        if target_jacoco_exec_path is not None:
                            # copy jacoco.exec to target_jacoco_exec_path
                            se.bash.run(
                                f"cp {jacoco_path} {target_jacoco_exec_path}/{parsed_project_name}-evosuite-jacoco.exec",
                                0,
                            )
            except se.TimeoutException:
                return -1
        return run_res.returncode

    @classmethod
    def configure_file(cls, test_name: str, test_path: str = None):
        if test_path is None:
            test_path = expanduser("~") + "/.inlinegenrc"
            se.io.dump(test_path, f"inlinetestname={test_name}", se.io.Fmt.txt)

    @classmethod
    def get_affected_tests(cls, project_name: str, sha: str, line_num: int):
        # TODO: may implement test selection
        pass

    @classmethod
    def get_killed_mutants(cls, project_name: str, test_type_list: List[str]):
        results_list = list()
        for test_type in test_type_list:
            mutant_result_file = (
                Macros.results_dir
                / "mutants-eval-results"
                / f"{project_name}-{test_type}.json"
            )
            if not mutant_result_file.exists():
                continue
            mutated_results = se.io.load(mutant_result_file)
            timeout = 600
            if test_type == "evosuite":
                timeout = 3600
            killed_mutants_set = {
                index
                for index, mutated_result in enumerate(mutated_results)
                if mutated_result[f"{test_type}-killed"]
                or mutated_result[f"{test_type}-time"] >= timeout
            }
            # if len(killed_mutants_set) == 0:
            #     continue
            results_list.append(killed_mutants_set)
        return results_list

    @classmethod
    def copy_randoop_tests_to_src_test_java(
        cls, project_name: str, randoop_test_dir: str = None
    ):
        if randoop_test_dir is None:
            print(f"{randoop_test_dir} does not exist")
        with se.io.cd(Macros.downloads_dir / project_name):
            se.io.rmdir(Macros.downloads_dir / project_name / "src/test/java")
            se.io.mkdir(Macros.downloads_dir / project_name / "src/test/java")
            java_tests_path = f"{Macros.downloads_dir}/{project_name}/src/test/java"
            # avoid copying ErrorTest*.java
            se.bash.run(
                f"cp -r {randoop_test_dir}/RegressionTest*.java {java_tests_path}"
            )

    @classmethod
    def analyze_coverage(
        cls, coverage_file_path: str, class_name: str, line_number: str, test_type: str
    ):
        stmt = dict()
        stmt[f"{test_type}_stmt_covered"] = False
        stmt[f"{test_type}_method_covered"] = False
        stmt[f"{test_type}_inst_count"] = 0
        stmt[f"{test_type}_method_count"] = 0
        cov_map = se.io.load(coverage_file_path)
        if "jacoco" not in cov_map:
            return stmt
        # check keys that start with class_name because inner classes are recorded as class_name$innerclass in cov_map
        for key in cov_map["jacoco"].keys():
            if (
                key == class_name or key.startswith(class_name + r"$")
            ) and line_number in cov_map["jacoco"][key]:
                if cov_map["jacoco"][key][line_number][0] > 1:
                    stmt[f"{test_type}_stmt_covered"] = True
                stmt[f"{test_type}_inst_count"] += cov_map["jacoco"][key][line_number][
                    1
                ]
                stmt[f"{test_type}_method_count"] += cov_map["jacoco"][key][
                    line_number
                ][2]
                if cov_map["jacoco"][key][line_number][2] > 0:
                    stmt[f"{test_type}_method_covered"] = True
        return stmt

    @classmethod
    def file_path_to_class_name(cls, file_path: str):
        return (
            file_path.replace(".java", "")
            .split("src/main/java/")[-1]
            .split("src/main/lombok/")[-1]
            .split("src/main/")[-1]
            .split("src/test/java/")[-1]
            .replace("/", ".")
        )

    @classmethod
    def file_path_to_class_path(cls, file_path: str):
        # replace .java with .class
        # replace src/main/java/ with target/classes/
        # replace src/test/java/ with target/test-classes/
        return (
            file_path.replace(".java", ".class")
            .replace("src/main/java/", "target/classes/")
            .replace("src/main/lombok/", "target/classes/")
            .replace("src/main/", "target/classes/")
        )

    @classmethod
    def get_excluded_projects(cls):
        return (
            Macros.projects_without_target_stmts
            + Macros.projects_without_covered_stmts
            + Macros.projects_needs_to_be_excluded
            + Macros.projects_with_jacoco_exception
            + Macros.project_with_timeout
            + Macros.projects_with_no_inline_tests
        )

    @classmethod
    def get_projs_to_stmts_and_inline_tests(cls, data_file: str):
        proj_to_stmt_set = collections.defaultdict(set)
        proj_to_inline_test_set = collections.defaultdict(set)
        data = se.io.load(data_file, se.io.Fmt.txtList)
        for data_item in data:
            # netceteragroup_trema-core;com.netcetera.trema.core.exporting.AndroidExporter;137;139
            # Asana_java-asana#com.asana.requests.Request_168Test#testLine171()
            if ";" in data_item:
                (
                    project_name,
                    class_name,
                    target_stmt_line_no,
                    inline_test_line_no,
                ) = data_item.split(";")
            elif "#" in data_item:
                tokens = data_item.split("#")
                project_name = tokens[0]
                class_name = tokens[1]
                inline_test_name = tokens[2]
                target_stmt_line_no = class_name.split("_")[-1].replace("Test", "")
                inline_test_line_no = inline_test_name.replace("testLine", "").replace("()", "")
            proj_to_stmt_set[project_name].add(f"{class_name}:{target_stmt_line_no}")
            proj_to_inline_test_set[project_name].add(
                f"{class_name}:{inline_test_line_no}"
            )
        return proj_to_stmt_set, proj_to_inline_test_set

    @classmethod
    def get_num_inline_tests_counter(cls, data_file: str):
        target_stmt_to_num_inline_tests = cls.get_target_stmt_to_num_inline_tests(
            data_file
        )
        num_inline_tests_counter = collections.Counter()
        for k, v in target_stmt_to_num_inline_tests.items():
            num_inline_tests_counter[v] += 1
        return num_inline_tests_counter

    @classmethod
    def get_target_stmt_to_num_inline_tests(cls, data_file: str):
        target_stmt_to_num_inline_tests = collections.Counter()
        inline_tests = se.io.load(data_file, se.io.Fmt.txtList)
        for line in inline_tests:
            tokens = line.strip().split(";")
            target_stmt_to_num_inline_tests[tokens[0] + tokens[1] + tokens[2]] += 1
        return target_stmt_to_num_inline_tests

    @classmethod
    def get_target_stmt_to_inline_tests(cls, data_file: str):
        target_stmt_to_inline_tests = collections.defaultdict(set)
        inline_tests = se.io.load(data_file, se.io.Fmt.txtList)
        for line in inline_tests:
            tokens = line.strip().split(";")
            target_stmt_to_inline_tests[
                tokens[0] + ";" + tokens[1] + ";" + tokens[2]
            ].add(line)
        return target_stmt_to_inline_tests

    @classmethod
    # python -m main parse_log --project_name="Asana_java-asana" --commit="52fef9b"
    def parse_log(
        cls,
        project_name: str,
        commit: str,
        proj_generated_tests_dir: str = "",
        INLINE_TEST_LOG_FILE_PATH: str = "",
        full_file_paths: List[str] = [],
    ):
        if not proj_generated_tests_dir:
            proj_generated_tests_dir = (
                f"{Macros.reduced_tests_dir}/{project_name}-{commit}"
            )
        if not INLINE_TEST_LOG_FILE_PATH:
            INLINE_TEST_LOG_FILE_PATH = f"{proj_generated_tests_dir}/inlinetest-log.txt"

        if not os.path.exists(INLINE_TEST_LOG_FILE_PATH):
            print(f"no inline test log file found at {INLINE_TEST_LOG_FILE_PATH}")
            return

        with se.io.cd(Macros.downloads_dir / project_name):
            # checkout to the original commit for inserting inline tests
            se.bash.run(f"git clean -xfd")
            se.bash.run(f"git checkout .")
            se.bash.run(f"git checkout {commit}")
        print(
            f"parsing log {INLINE_TEST_LOG_FILE_PATH} and adding inline tests to source code..."
        )
        try:
            with se.io.cd(Macros.java_raninline_dir):
                se.bash.run(
                    f'mvn exec:java -Dexec.mainClass="org.raninline.App" -Dexec.args="a {INLINE_TEST_LOG_FILE_PATH}"',
                    0,
                )
        except Exception as e:
            print(e)
        file_paths_with_inline_tests = Util.list_java_files_with_inline_tests(
            project_name, full_file_paths
        )
        file_with_inline_tests = len(file_paths_with_inline_tests)
        for full_file_path in file_paths_with_inline_tests:
            se.bash.run(
                f"cp {full_file_path} {proj_generated_tests_dir}",
                0,
            )
        se.io.dump(
            Macros.results_dir / "parselog.txt",
            [f"{project_name} {commit} {file_with_inline_tests} files"],
            se.io.Fmt.txtList,
            append=True,
        )

    @classmethod
    def list_java_files_with_inline_tests(
        cls, project_name: str, full_file_paths: List[str] = []
    ):
        file_paths_with_inline_tests = []
        if not full_file_paths:
            full_file_paths = Util.list_java_files(
                f"{Macros.downloads_dir}/{project_name}"
            )
        for full_file_path in full_file_paths:
            # check if inline test is added
            file_content = se.io.load(full_file_path, se.io.Fmt.txt)
            if "new Here(" not in file_content:
                continue
            file_paths_with_inline_tests.append(full_file_path)
        return file_paths_with_inline_tests

    @classmethod
    def fix_randoop_generated_tests_helper(
        cls, project_name: str, generated_tests_dir: Path = None
    ):
        if generated_tests_dir is None:
            generated_tests_dir = (
                Macros.log_dir / "teco-randoop-test" / project_name / "randoop-tests"
            )
        if not generated_tests_dir.exists():
            return
        regression_test_file = generated_tests_dir / "RegressionTest.java"

        if not regression_test_file.exists():
            print(f"fixing {project_name}...")
            # list all java files
            regression_test_java_files = generated_tests_dir.glob(
                "RegressionTest*.java"
            )
            regression_test_java_files = list(regression_test_java_files)
            if regression_test_java_files:
                # create a RegressionTest.java file
                with open(regression_test_file, "w") as f:
                    f.write(r"import org.junit.runner.RunWith;" + "\n")
                    f.write(r"import org.junit.runners.Suite;" + "\n")
                    f.write(r"@RunWith(Suite.class)" + "\n")
                    f.write(
                        r"@Suite.SuiteClasses({"
                        + ", ".join(
                            [
                                f"{file.stem}.class"
                                for file in regression_test_java_files
                            ]
                        )
                        + r"})"
                        + "\n"
                    )
                    f.write(r"public class RegressionTest {}")
        else:
            print(f"skip {project_name}...")

    @classmethod
    def get_dependencies(cls, project_name: str, commit: str, clazz: str):
        Util.prepare_project(project_name, commit)
        with se.io.cd(Macros.downloads_dir / project_name):
            se.bash.run("mvn clean compile test-compile", 0)
            # copy the randoop-deps.txt file to the project root
            se.bash.run(
                f"cp {Macros.log_dir}/teco-randoop-test/{project_name}/randoop-tests/randoop-deps.txt ."
            )
            deps_command = (
                f"jdeps -cp $(< randoop-deps.txt) -v -R -dotoutput jdepsoutput {clazz}"
            )
            se.bash.run(deps_command, 0)
            # analyze the output
            deps = set()
            classes_dot_path = "jdepsoutput/classes.dot"
            if not os.path.exists(classes_dot_path):
                return deps
            lines = se.io.load(classes_dot_path, se.io.Fmt.txtList)
            for line in lines:
                if "->" in line:
                    left_dep = cls.parse_jdeps_line(line.split("->")[0])
                    # right_dep = cls.parse_jdeps_line(line.split("->")[1])
                    if left_dep:
                        deps.add(left_dep)
                    # if right_dep:
                    #     deps.add(right_dep)
            deps.add(
                clazz.split("target/classes/")[1]
                .replace(".class", "")
                .replace("/", ".")
            )
            return deps

    @classmethod
    def parse_jdeps_line(cls, line: str):
        dep = line.split("(")[0].strip().replace('"', "")
        if "_downloads/" in dep or dep.endswith(".jar") or dep.endswith(".class"):
            return None
        return dep

    @classmethod
    def compile_raninline(cls):
        with se.io.cd(Macros.java_raninline_dir):
            se.bash.run("mvn clean package", 0)
