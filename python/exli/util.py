import glob
import os
import subprocess
import traceback

import seutil as se
import xmltodict
from exli.macros import Macros

class Util:
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
