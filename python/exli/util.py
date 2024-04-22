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
    @classmethod
    def run_unit_tests(
        cls,
        test_type: str,
        project_name: str,
        log_path: str,
        maven_project: MavenProject,
        tests_dir: str = None,
        deps_file_path: str = None,
        timeout: int = 3600,
    ):
        """
        Run unit tests of a specific type.

        Args:
            test_type(str): Type of the test (Unit, EvoSuite, or Randoop).
            project_name(str): Name of the project.
            log_path(str): Path for the log file.
            maven_project(MavenProject): Maven project. Required for Unit and Randoop.
            tests_dir_dict(str): Directory for tests. Required for EvoSuite and Randoop.
            deps_file_path(str): Dependencies file path. Required for EvoSuite.
            timeout(int): Timeout for the test execution. Defaults to 3600.
        """
        Util.copy_jacoco_extension()
        Util.configure_file(test_type)

        try:
            with se.TimeUtils.time_limit(timeout):
                if test_type == "Unit":
                    Util.run_dev_written_unit_tests(
                        project_name, log_path, maven_project, timeout
                    )
                elif test_type == "EvoSuite":
                    Util.run_evosuite_command_line(
                        project_name, tests_dir, deps_file_path, log_path, None, timeout
                    )
                elif test_type == "Randoop":
                    Util.run_randoop(
                        project_name, tests_dir, log_path, maven_project, timeout
                    )
        except se.TimeoutException as e:
            se.io.dump(log_path, [e], se.io.Fmt.txtList, append=True)
        Util.remove_jacoco_extension()

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
            if project["jacoco"]
            and project["randoop"]
            and (project["full_name"] not in Util.get_excluded_projects())
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
            if project["jacoco"]
            and project["randoop"]
            and (project["full_name"] not in Util.get_excluded_projects())
        ]

    @classmethod
    def copy_jacoco_extension(cls):
        se.bash.run(f"cp {Macros.jacoco_extension_jar} $MAVEN_HOME/lib/ext/")

    @classmethod
    def remove_jacoco_extension(cls):
        se.bash.run(f"rm $MAVEN_HOME/lib/ext/" + Macros.jacoco_extension_jar.name)

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
    def avoid_permission_error(cls, project_name: str):
        se.bash.run(f"chmod -R 777 {Macros.downloads_dir}/{project_name}")

    @classmethod
    def prepare_project_for_test_generation(
        cls,
        project_name: str,
        sha: str,
        dep_file_path: str,
        classpath_list_path: str,
        log_path: str,
    ):
        project = Util.prepare_project(project_name, sha)
        maven_project = MavenProject.from_project(project)
        try:
            with se.io.cd(Macros.downloads_dir / project_name):
                # Add dependencies of raninline.
                maven_project.hack_pom_add_dependency(
                    "org.raninline", "raninline", "1.0-SNAPSHOT"
                )
                maven_project.install()
                # Get dependencies.
                if dep_file_path is not None:
                    dependencies = maven_project.exec_classpathes(
                        Macros.downloads_dir / project_name,
                        log_path,
                    )
                    se.io.dump(dep_file_path, dependencies, se.io.Fmt.txt)
                # Get classpath.
                if classpath_list_path is not None:
                    classpath_list = Util.find_classes()
                    se.io.dump(classpath_list_path, classpath_list, se.io.Fmt.txtList)
        except Exception as e:
            print(e)

    @classmethod
    def list_java_files(cls, dir: str):
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
        sha: str,
        generated_tests_dir: str,
        inline_tests_dir: str,
        file_path_with_inline_tests: str = None,
    ):
        if file_path_with_inline_tests is not None:
            # if file path is provided, only parse the inline tests in that file
            file_paths_with_inline_tests = [file_path_with_inline_tests]
        else:
            # find all java files with inline tests
            file_paths_with_inline_tests = cls.list_java_files(generated_tests_dir)
            if len(file_paths_with_inline_tests) == 0:
                print(f"no inline tests found in {project_name}")
                return
        # copy the generated test cases to a package
        if os.path.exists(inline_tests_dir):
            se.bash.run(f"rm -rf {inline_tests_dir}")
        se.bash.run(f"mkdir -p {inline_tests_dir}")
        # for each java file, parse the inline tests to JUnit tests
        for file_path in file_paths_with_inline_tests:
            # restfb has two packages, one is in src/main/java, the other is in src/main/lombok
            if project_name == "restfb_restfb":
                app_src_path = f"{Macros.downloads_dir}/{project_name}/src/main/java:{Macros.downloads_dir}/{project_name}/src/main/lombok:{Macros.downloads_dir}/{project_name}/src/test/java"
            else:
                app_src_path = f"{Macros.downloads_dir}/{project_name}/src/main/java:{Macros.downloads_dir}/{project_name}/src/test/java"
            deps_file = Util.get_deps_file_path(project_name, sha)
            command = f"java -cp {Macros.itest_jar} org.inlinetest.InlineTestRunnerSourceCode --input_file={file_path} --assertion_style=junit --output_dir={inline_tests_dir} --multiple_test_classes=true --dep_file_path={deps_file} --app_src_path={app_src_path}"
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
        for file_path in os.listdir(inline_tests_dir):
            content = se.io.load(f"{inline_tests_dir}/{file_path}", se.io.Fmt.txtList)
            package = content[0]
            package = package.replace("package ", "")
            package = package.replace(";", "")
            package_to_dir = package.replace(".", "/")
            # create package dir
            se.bash.run(f"mkdir -p {inline_tests_dir}/{package_to_dir}")
            # move file to package
            se.bash.run(
                f"mv {inline_tests_dir}/{file_path} {inline_tests_dir}/{package_to_dir}/{file_path}"
            )

    @classmethod
    def run_inline_tests(
        cls,
        project_name: str,
        sha: str,
        inlinetest_dir: str,
        cached_objects_dir: str,
        deps_file: str,
        test_name: str = None,
        log_path: str = None,
    ):
        if not os.path.exists(inlinetest_dir):
            print(f"{inlinetest_dir} does not exist")
            return None, None
        with se.io.cd(Macros.downloads_dir / project_name):
            # compile the project
            se.bash.run(f"mvn clean compile {Macros.SKIPS}", 0)
            # copy the cached file
            se.bash.run(f"cp -r {cached_objects_dir} .", 0)
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
                    print(f"no inline test {test_name} found in {inlinetest_dir}")
                    return None, None
            else:
                se.bash.run(
                    f"cp -r {inlinetest_dir} {Macros.downloads_dir}/{project_name}/{Macros.INLINE_TEST_PACKAGE}",
                    0,
                )
            if not os.path.exists(deps_file):
                print(f"{deps_file} does not exist")
                deps_file = Util.get_deps_file_path(project_name, sha)
            # compile
            comp_str = f"javac -cp {Macros.itest_jar}:{Macros.jar_dir}/junit-platform-console-standalone-1.9.0-RC1.jar:{Macros.raninline_jar}:$(< {deps_file}) $(find {Macros.INLINE_TEST_PACKAGE} -name '*.java')"
            comp_failed_tests = []
            try:
                se.bash.run(comp_str, 0)
            except Exception as e:
                print(e)
                if test_name:
                    if log_path:
                        se.io.dump(
                            log_path,
                            [
                                f"{project_name} {sha} {test_path}",
                                traceback.format_exc(),
                            ],
                            se.io.Fmt.txtList,
                            append=True,
                        )
                    return "compilation failure", -1
                else:
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
                            if log_path:
                                se.io.dump(
                                    log_path,
                                    [
                                        f"{project_name} {sha} {file_path}",
                                        traceback.format_exc(),
                                    ],
                                    se.io.Fmt.txtList,
                                    append=True,
                                )
                            comp_failed_tests.append(
                                file_path + "," + traceback.format_exc()
                            )
                            se.bash.run(f"rm {file_path}")
                    if len(comp_failed_tests) == len(java_files):
                        return "compilation failure", -1
            if f"{Macros.reduced_its_dir}" in inlinetest_dir:
                comp_failed_tests_file = f"{Macros.reduced_its_report_dir}/{project_name}-comp-failed-tests.txt"
            elif f"{Macros.all_its_dir}" in inlinetest_dir:
                comp_failed_tests_file = (
                    f"{Macros.all_its_report_dir}/{project_name}-comp-failed-tests.txt"
                )
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
    def get_deps_file_path(cls, project_name: str, sha: str):
        # by default, return the deps file in the generated tests dir
        deps_file = Macros.unit_tests_dir / f"{project_name}-{sha}" / "deps.txt"
        if not deps_file.exists():
            Util.prepare_project_for_test_generation(
                project_name, sha, deps_file, None, None
            )
        return deps_file

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
    def run_dev_written_unit_tests(
        cls,
        project_name: str,
        log_file_path: str,
        maven_project: MavenProject = None,
        timeout: int = 600,
    ):
        if maven_project is None:
            maven_project = cls.get_maven_project(project_name)
        Util.configure_tests_for_jacoco_agent(project_name, "unit", maven_project)
        print("compiling and executing unit tests...")
        se.io.dump(log_file_path, ["Unit"], se.io.Fmt.txtList, append=True)
        with se.io.cd(Macros.downloads_dir / project_name):
            if project_name == "cyclopsgroup_jcli":
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
        project_name: str,
        generated_tests_dir: str,
        log_file_path: str = None,
        deps_file: str = None,
        timeout: int = 600,
    ):
        if not os.path.exists(generated_tests_dir):
            return -1
        with se.io.cd(Macros.downloads_dir / project_name):
            se.bash.run(f"mvn test-compile {Macros.SKIPS}")
        print("copying Randoop test cases...")
        se.bash.run(
            f"cp -r {generated_tests_dir} {Macros.downloads_dir/project_name}/randoop-tests",
            0,
        )
        with se.io.cd(f"{Macros.downloads_dir/project_name}"):
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
        with se.io.cd(f"{Macros.downloads_dir / project_name}"):
            comp_str = f"javac -cp {Macros.junit_jar}:{Macros.raninline_jar}:$(< {deps_file}) randoop-tests/RegressionTest*.java"
            se.bash.run(comp_str, 0)
            try:
                with se.TimeUtils.time_limit(timeout):
                    # =inclbootstrapclasses=true
                    run_str = f"java -javaagent:{Macros.jacoco_agent_jar} -jar {Macros.junit_jar} -cp randoop-tests:{Macros.raninline_jar}:$(< {deps_file}) --select-class RegressionTest --details=none &>> {log_file_path}"
                    run_res = se.bash.run(run_str)
            except se.TimeoutException:
                return -1
        return run_res.returncode

    @classmethod
    def run_randoop(
        cls,
        project_name: str,
        generated_tests_dir: str,
        log_file_path: str,
        maven_project: MavenProject = None,
        timeout: int = 600,
    ):
        if not os.path.exists(generated_tests_dir):
            return -1
        if maven_project is None:
            maven_project = cls.get_maven_project(project_name)
        Util.configure_tests_for_jacoco_agent(project_name, "randoop", maven_project)
        try:
            Util.copy_randoop_tests_to_src_test_java(project_name, generated_tests_dir)
        except Exception as e:
            se.io.dump(log_file_path, [f"{e}"], se.io.Fmt.txtList, append=True)
            return -1
        print("compiling and executing Randoop tests...")
        se.io.dump(log_file_path, ["Randoop"], se.io.Fmt.txtList, append=True)
        with se.io.cd(Macros.downloads_dir / project_name):
            try:
                with se.TimeUtils.time_limit(timeout):
                    run_res = se.bash.run(
                        f"mvn clean test {Macros.SKIPS_NO_JACOCO} &>> {log_file_path}"
                    )
            except se.TimeoutException as e:
                se.io.dump(log_file_path, [e], se.io.Fmt.txtList, append=True)
                return -1
            return run_res.returncode

    @classmethod
    def run_jacoco(
        cls,
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
                    f"mvn clean test {Macros.SKIPS_NO_JACOCO} > {Macros.log_dir}/jacoco/{project_name}-{test_type}-jacoco.txt",
                    timeout=timeout,
                )
                if test_rr.returncode != 0 and not allow_test_failure:
                    raise RuntimeError(f"Test failed, result: {test_rr}")
                jacoco_exec = glob.glob("**/jacoco.exec", recursive=True)
                if jacoco_exec:
                    print("jacoco.exec found")
                    se.bash.run(
                        f"mvn jacoco:report > {Macros.log_dir}/jacoco/{project_name}-{test_type}-jacoco-report.txt",
                        timeout=120,
                    )
                    se.bash.run(
                        f"rm -rf {Macros.log_dir}/jacoco/{project_name}-{test_type}-jacoco-report"
                    )
                    print("copying jacoco report...")
                    se.bash.run(
                        f"cp -r target/site/jacoco {Macros.log_dir}/jacoco/{project_name}-{test_type}-jacoco-report"
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
        seed: int = Macros.DEFAULT_SEED,
        output_dir: str = None,
        log_dir: str = None,
        time_limit: int = 100,
        dep_file_path: str = None,
        classpath_file_path: str = None,
    ):
        print("run randoop...")
        res = {}
        res["seed"] = seed
        if log_dir is None:
            randoop_log_dir = Macros.log_dir / "randoop"
        else:
            randoop_log_dir = log_dir
        se.io.mkdir(randoop_log_dir)
        log_path = f"{randoop_log_dir}/{project_name}-randoop.log"
        error_log_path = f"{randoop_log_dir}/run-randoop.log"

        randoop_tests_dir = Macros.downloads_dir / project_name / "randoop-tests"
        se.io.mkdir(randoop_tests_dir)
        try:
            with se.io.cd(randoop_tests_dir):
                print("running randoop...")
                try:
                    classpath_list = se.io.load(classpath_file_path, se.io.Fmt.txtList)
                    total_time_limit = min(len(classpath_list) * time_limit, 10800)
                    print(f"total time limit: {total_time_limit}")
                    se.bash.run(
                        f"java -cp {Macros.randoop_jar}:$(< {dep_file_path}) randoop.main.Main gentests --time-limit={total_time_limit} --usethreads=true --randomseed={seed} --classlist={classpath_file_path} &> {log_path}",
                        0,
                        timeout=total_time_limit + 1800,
                    )
                except (subprocess.TimeoutExpired, Exception) as e:
                    se.io.dump(
                        f"{error_log_path}",
                        [f"{e}"],
                        se.io.Fmt.txtList,
                        append=True,
                    )
                java_files = se.bash.run("find . -name 'RegressionTest*.java'").stdout
                if java_files.strip():
                    res["randoop"] = True
                    se.io.mkdir(Path(output_dir).parent)
                    se.bash.run(f"cp -r {randoop_tests_dir} {output_dir}")
                else:
                    res["randoop"] = False
        except Exception as e:
            print(traceback.format_exc())
            res["randoop"] = False
            se.io.dump(
                f"{error_log_path}",
                [f"{e}"],
                se.io.Fmt.txtList,
                append=True,
            )
        return res

    @classmethod
    def generate_evosuite_tests(
        cls,
        project_name: str,
        seed: int = Macros.DEFAULT_SEED,
        output_dir: str = None,
        log_dir: str = None,
        time_limit: int = 120,
        dep_file_path: str = None,
        classpath_file_path: str = None,
    ):
        print("run evosuite...")
        res = {}
        res["seed"] = seed
        if log_dir is None:
            evosuite_log_dir = Macros.log_dir / "evosuite"
        else:
            evosuite_log_dir = log_dir
        se.io.mkdir(evosuite_log_dir)
        log_path = f"{evosuite_log_dir}/{project_name}-evosuite.log"
        error_log_path = f"{evosuite_log_dir}/run-evosuite.log"

        try:
            with se.io.cd(Macros.downloads_dir / project_name):
                if classpath_file_path is not None:
                    print("find classes...")
                    classpath_list = se.io.load(classpath_file_path, se.io.Fmt.txtList)
                    for classpath in tqdm(classpath_list):
                        command = f"java -jar {Macros.evosuite_jar} -DCP_file_path {dep_file_path} -class {classpath} -seed {seed} -Dsearch_budget={time_limit} -Duse_separate_classloader=false -Dminimize=false -Dassertion_strategy=all -Dfilter_assertions=true -Dvirtual_fs=false -Dvirtual_net=false -Dsandbox_mode=OFF -Dfilter_sandbox_tests=true -Dmax_loop_iterations=-1 &> {log_path}"
                        print(command)
                        try:
                            se.bash.run(command, 0, timeout=5 * time_limit)
                            Util.avoid_permission_error(project_name)
                        except (subprocess.TimeoutExpired, Exception) as e:
                            print(traceback.format_exc())
                            res["evosuite"] = False
                            se.io.dump(
                                f"{error_log_path}",
                                [f"{e}"],
                                se.io.Fmt.txtList,
                                append=True,
                            )
                else:
                    # target is whole project
                    # check if target/classes exists
                    if not os.path.exists("target/classes"):
                        se.bash.run("mvn compile", 0)
                    command = f"java -jar {Macros.evosuite_jar} -DCP_file_path {dep_file_path} -target {Macros.downloads_dir}/{project_name}/target/classes -seed {seed} -Dsearch_budget={time_limit} -Dassertion_timeout={time_limit} -Dminimization_timeout={time_limit} -Duse_separate_classloader=false -Dminimize=false -Dassertion_strategy=all -Dfilter_assertions=true -Dfilter_sandbox_tests=true -Dvirtual_fs=false -Dvirtual_net=false -Dsandbox_mode=OFF -Dmax_loop_iterations=-1 &> {log_path}"
                    print(command)
                    try:
                        se.bash.run(command, 0, timeout=5 * time_limit)
                        Util.avoid_permission_error(project_name)
                    except Exception as e:
                        print(traceback.format_exc())
                        res["evosuite"] = False
                        se.io.dump(
                            f"{error_log_path}",
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
                        f"cp -r {Macros.downloads_dir}/{project_name}/evosuite-report {output_dir}"
                    )
                    res["evosuite"] = True
                else:
                    res["evosuite"] = False
        except Exception as e:
            print(traceback.format_exc())
            res["evosuite"] = False
            se.io.dump(
                f"{error_log_path}",
                [f"{e}"],
                se.io.Fmt.txtList,
                append=True,
            )
        return res

    @classmethod
    def run_evosuite_command_line(
        cls,
        project_name: str,
        generated_tests_dir: str,
        deps_file: str,
        log_file_path: str,
        target_jacoco_exec_path: str = None,
        time_limit: int = 600,
    ):
        if not os.path.exists(generated_tests_dir):
            return -1
        with se.io.cd(Macros.downloads_dir / project_name):
            se.bash.run(f"mvn test-compile {Macros.SKIPS}")
        print("copying EvoSuite test cases...")
        se.io.dump(log_file_path, ["EvoSuite"], se.io.Fmt.txtList, append=True)
        se.bash.run(
            f"cp -r {generated_tests_dir} {Macros.downloads_dir/project_name}/evosuite-tests",
            0,
        )

        # 1. change separateClassLoader = true into separateClassLoader = false
        # 2. collect class names
        classes = set()
        with se.io.cd(f"{Macros.downloads_dir/project_name}"):
            for f in glob.glob("evosuite-tests/**/*.java", recursive=True):
                if f.endswith("Test.java"):
                    classes.add(
                        f.replace("evosuite-tests/", "")
                        .replace(".java", "")
                        .replace("/", ".")
                    )

        # TODO: hacky way to fix EvoSuite issue: comment out org.evosuite.runtime.GuiSupport
        with se.io.cd(f"{Macros.downloads_dir/project_name}"):
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
        print("compiling and executing EvoSuite generated tests...")
        with se.io.cd(f"{Macros.downloads_dir/project_name}"):
            # add raninline.jar to evosuite-deps.txt
            deps = se.io.load(deps_file, se.io.Fmt.txt).strip()
            # TODO: hacky fix of file path problems
            deps = re.sub(r"/home/[^/]+/", f"/home/{os.getenv('USER')}/", deps)
            se.io.dump(deps_file, deps, se.io.Fmt.txt)

            comp_str = f"shopt -s globstar; javac -cp {Macros.evosuite_runtime_jar}:{Macros.junit_jar}:{Macros.raninline_jar}:$(< {deps_file}) evosuite-tests/**/*.java"
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

                    # run_str = f"java -javaagent:{Macros.jacoco_agent_jar} -jar {Macros.junit_jar} -cp evosuite-tests:{Macros.evosuite_runtime_jar}:$(< {deps_file}) {class_str} --details=none &>> {log_file_path}"
                    # need to use &>> instead of &> because we want to save EvoSuite, Randoop and Unit tests' logs into one file
                    run_str = f"java -javaagent:{Macros.jacoco_agent_jar} -Dlogback.configurationFile={Macros.project_dir}/poms/logback.xml -cp evosuite-tests:{Macros.evosuite_runtime_jar}:{Macros.junit_jar}:{Macros.raninline_jar}:$(< {deps_file}) org.junit.runner.JUnitCore {class_str} &>> {log_file_path}"
                    print(run_str)
                    run_res = se.bash.run(run_str)

                    jacoco_path = Macros.downloads_dir / project_name / "jacoco.exec"
                    if jacoco_path.exists():
                        # generate jacoco report
                        se.bash.run(
                            f"java -jar {Macros.jar_dir}/jacococli-0.8.10.jar report {jacoco_path} --classfiles target/classes --html {Macros.log_dir}/jacoco/{project_name}-evosuite-jacoco-report",
                            0,
                        )
                        if target_jacoco_exec_path is not None:
                            # copy jacoco.exec to target_jacoco_exec_path
                            se.bash.run(
                                f"cp {jacoco_path} {target_jacoco_exec_path}/{project_name}-evosuite-jacoco.exec",
                                0,
                            )
            except se.TimeoutException:
                return -1
        return run_res.returncode

    @classmethod
    def configure_file(cls, test_name: str):
        test_path = expanduser("~") + "/.inlinegenrc"
        se.io.dump(test_path, f"inlinetestname={test_name}", se.io.Fmt.txt)

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
        cls, project_name: str, randoop_test_dir: str
    ):
        if not os.path.exists(randoop_test_dir):
            raise RuntimeError(f"{randoop_test_dir} does not exist")
        with se.io.cd(Macros.downloads_dir / project_name):
            se.io.rmdir(Macros.downloads_dir / project_name / "src/test/java")
            se.io.mkdir(Macros.downloads_dir / project_name / "src/test/java")
            java_tests_path = f"{Macros.downloads_dir}/{project_name}/src/test/java"
            # avoid copying ErrorTest*.java
            se.bash.run(
                f"cp -r {randoop_test_dir}/RegressionTest*.java {java_tests_path}", 0
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
                inline_test_line_no = inline_test_name.replace("testLine", "").replace(
                    "()", ""
                )
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
    def get_target_stmts(cls, target_stmts_path: str, filter_with_inline_tests: bool = True, project_name: str = None):
        """
        Get target statements from the target_stmts_path file

        Args:
            target_stmts_path (str): Path to the target statements file.
            filter_with_inline_tests (bool, optional): Whether to filter target statements with inline tests. Defaults to True.
            project_name (str, optional): Project name. Defaults to None.

        Returns:
            set: Set of target statements
        """
        target_stmts = set()
        if not os.path.exists(target_stmts_path):
            print(f"{target_stmts_path} does not exist")
            return target_stmts

        if filter_with_inline_tests and project_name is None:
            raise ValueError("project_name is required when filter_with_inline_tests is True")

        if filter_with_inline_tests:
            reduced_proj_to_target_stmts = cls.get_proj_to_target_stmts("reduced")
            all_proj_to_target_stmts = cls.get_proj_to_target_stmts("all")
            # intersection of reduced and all
            proj_to_target_stmts = {
                k: reduced_proj_to_target_stmts[k] & all_proj_to_target_stmts[k]
                for k in reduced_proj_to_target_stmts.keys()
            }
        lines = se.io.load(target_stmts_path, se.io.Fmt.txtList)
        for line in lines:
            if not line.startswith("target stmt"):
                break
            path = line.split(";")[1]
            class_name = path.split("/")[-1].split(".")[0]
            line_num = line.split(";")[2]
            if filter_with_inline_tests:
                inline_tests_target_stmts = proj_to_target_stmts[project_name]
                if f"{class_name};{line_num}" not in inline_tests_target_stmts:
                    print(f"skip {class_name};{line_num}, not in inline tests")
                    continue
            target_stmt = path + ";" + line_num  # path;line_num
            target_stmts.add(target_stmt)
        return target_stmts
              
    def get_proj_to_target_stmts(cls, inline_test_type: str = "reduced"):
        # project to target statements with passing inline tests
        passed_inline_tests: list[str] = se.io.load(
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
      
    @classmethod
    # python -m main parse_log --project_name="Asana_java-asana" --sha="52fef9b"
    def parse_log(
        cls,
        project_name: str,
        sha: str,
        inline_test_log_path: str,
        proj_generated_tests_dir: str,
        log_path: str,
        timeout: int = 600,
    ):
        # Parse log
        Util.prepare_project(project_name, sha)
        full_file_paths = Util.list_java_files(f"{Macros.downloads_dir}/{project_name}")
        try:
            with se.TimeUtils.time_limit(timeout):
                with se.io.cd(Macros.java_raninline_dir):
                    se.bash.run(
                        f'mvn exec:java -Dexec.mainClass="org.raninline.App" -Dexec.args="a {inline_test_log_path}"',
                        0,
                    )
        except se.TimeoutException as e:
            se.io.dump(log_path, [e], se.io.Fmt.txtList, append=True)
        except Exception as e:
            se.io.dump(
                log_path,
                [f"Exception when adding inline tests back to the source code: {e}"],
                se.io.Fmt.txtList,
                append=True,
            )
        file_paths_with_inline_tests = Util.list_java_files_with_inline_tests(
            project_name, full_file_paths
        )
        for full_file_path in file_paths_with_inline_tests:
            # It is possible that one project has multiple files with the same name
            # create dir starts {Macros.downloads_dir}/{project_name} from to the generated tests dir
            # e.g., {Macros.downloads_dir}/{project_name}/src/main/java/com/google/gson/JsonParser.java
            # to {proj_generated_tests_dir}/com/google/gson/JsonParser.java
            file_path = full_file_path.replace(
                f"{Macros.downloads_dir}/{project_name}/src/main/java",
                f"{proj_generated_tests_dir}",
            )
            if project_name == "restfb_restfb" and "src/main/lombok" in full_file_path:
                file_path = full_file_path.replace(
                    f"{Macros.downloads_dir}/{project_name}/src/main/lombok",
                    f"{proj_generated_tests_dir}",
                )
            se.bash.run(f"mkdir -p {os.path.dirname(file_path)}")
            se.bash.run(f"cp {full_file_path} {file_path}")
        file_with_inline_tests = len(file_paths_with_inline_tests)
        se.io.dump(
            log_path,
            [f"{project_name} {sha} {file_with_inline_tests} files"],
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
            if f"{Macros.ITEST_DECLARE}" not in file_content:
                continue
            file_paths_with_inline_tests.append(full_file_path)
        return file_paths_with_inline_tests

    @classmethod
    def fix_randoop_generated_tests_helper(
        cls, project_name: str, generated_tests_dir: str
    ):
        if not os.path.exists(generated_tests_dir):
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
    def get_dependencies(cls, project_name: str, sha: str, clazz: str):
        Util.prepare_project(project_name, sha)
        with se.io.cd(Macros.downloads_dir / project_name):
            se.bash.run("mvn clean compile test-compile", 0)
            # copy the randoop-deps.txt file to the project root
            deps_file = Util.get_deps_file_path(project_name, sha)
            se.bash.run(f"cp {deps_file} .")
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

    @classmethod
    def get_auto_generated_files(cls):
        auto_generated_files = set()
        excluded_stmts = se.io.load(
            f"{Macros.log_dir}/excluded-stmts.txt", se.io.Fmt.txtList
        )
        for excluded_stmt in excluded_stmts:
            if excluded_stmt.startswith("/home"):
                auto_generated_files.add(excluded_stmt.split(" ")[0])
        return auto_generated_files

    @classmethod
    def is_auto_generated_file(cls, file_path: str):
        # load the file content
        file_content = se.io.load(file_path, se.io.Fmt.txt)
        # check if the first line contains the comment "generated"
        first_line = file_content.splitlines()[0]
        if "generate" in first_line or "Generate" in first_line:
            return True
        return False

    @classmethod
    def get_full_class_name(cls, file_path: str):
        if file_path.endswith(".java"):
            file_path = file_path[0 : len(file_path) - 5]
        if "src/main/java/" in file_path:
            return file_path.split("src/main/java/")[-1].replace("/", ".")
        else:
            return file_path.split("src/main/lombok/")[-1].replace("/", ".")
