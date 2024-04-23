from os.path import expanduser
import os
from pathlib import Path


class Macros:
    this_dir: Path = Path(os.path.dirname(os.path.realpath(__file__)))
    home_dir: Path = Path(expanduser("~"))
    project_dir: Path = this_dir.parent.parent
    dataset_dir: Path = project_dir / "_dataset"
    downloads_dir: Path = project_dir / "_downloads"
    downloads_dir_str: str = str(downloads_dir)
    python_dir: Path = project_dir / "python"
    log_file: Path = python_dir / "experiments.log"
    log_dir: Path = project_dir / "log"
    paper_dir: Path = project_dir / "papers" / "paper"
    figure_dir: Path = paper_dir / "figures"
    table_dir: Path = paper_dir / "tables"
    data_dir: Path = project_dir / "data"
    results_dir: Path = project_dir / "results"

    unit_tests_dir: Path = project_dir / "generated-tests"
    r0_tests_dir: Path = project_dir / "r0-tests"
    r0_its_dir: Path = project_dir / "r0-its"
    r0_its_report_dir: Path = results_dir / "r0-its-report"
    r1_tests_dir: Path = project_dir / "r1-tests"
    r1_its_dir: Path = project_dir / "r1-its"
    r1_its_report_dir: Path = results_dir / "r1-its-report"
    java_dir: Path = project_dir / "java"
    java_raninline_dir: Path = project_dir / "java" / "raninline"
    itest_java_dir: Path = project_dir.parent / "inlinetest" / "java"
    all_mutants_dir: Path = results_dir / "all-mutants"
    mutants_dir: Path = results_dir / "mutants"
    jacoco_extension_dir: Path = project_dir / "jacoco-extension"
    time_dir: Path = results_dir / "time"

    jar_dir: Path = project_dir / "jars"
    evosuite_jar = jar_dir / "evosuite-master-1.2.1-SNAPSHOT.jar"
    # evosuite_jar = jar_dir / "evosuite-1.2.0.jar"
    # evosuite_runtime_jar = jar_dir / "evosuite-standalone-runtime-1.2.0.jar"
    evosuite_runtime_jar = jar_dir / "evosuite-master-1.2.1-SNAPSHOT.jar"
    randoop_jar = jar_dir / "randoop-all-4.3.1.jar"
    junit_jar = jar_dir / "junit-platform-console-standalone-1.9.0-RC1.jar"
    itest_jar: str = (
        home_dir / ".m2/repository/org/inlinetest/inlinetest/1.0/inlinetest-1.0.jar"
    )
    jacoco_agent_jar = jar_dir / "org.jacoco.agent-0.8.8-runtime.jar"
    raninline_jar = java_raninline_dir / "target" / "raninline-1.0-SNAPSHOT.jar"
    jacoco_extension_jar = jar_dir / "jacoco-extension-1.0-SNAPSHOT.jar"
    major_script = jar_dir / "major" / "bin" / "major"

    target_stmt_types = ["regex", "string", "bit", "stream"]
    # inline test types
    r0 = "r0"  # all inline tests without reduction
    r1 = "r1"  # inline tests with first round reduction
    r2 = "r2"  # inline tests with second round reduction
    evosuite = "evosuite"
    randoop = "randoop"
    dev = "dev" # developer-written tests
    unit = "unit" # the combination of dev, randoop, and evosuite

    TARGET_STMT_BEFORE = "target-statement-before"
    TARGET_STMT_AFTER = "target-statement-after"
    TARGET_STMT_START = "target-statement-start"
    TARGET_METHOD_BEFORE = "target-method-before"
    TARGET_STMT_EXECUTED = "target-statement-executed"
    TARGET_STMT_IF_START = "target-statement-if-start"
    SKIPS_NO_JACOCO = "-Dcheckstyle.skip -Drat.skip -Denforcer.skip -Danimal.sniffer.skip -Dmaven.javadoc.skip -Dfindbugs.skip -Dwarbucks.skip -Dmodernizer.skip -Dimpsort.skip -Dpmd.skip -Dxjc.skip -Dair.check.skip-all -Dfmt.skip"
    SKIPS = "-Djacoco.skip " + SKIPS_NO_JACOCO
    INLINE_GEN_DIR_NAME = ".inlinegen"
    INLINE_TEST_PACKAGE = "inlinetests"
    DEVELOPER_TESTS = "DT"
    DEFAULT_SEED = 42

    projects_needs_to_be_excluded = [
        "dropwizard_dropwizard-elasticsearch"  # no test covered target statement
    ]

    project_with_timeout = [
        "apache_datasketches-java",  # test timeout
    ]

    projects_without_target_stmts = [
        "phax_ph-poi",
        "kbss-cvut_jb4jsonld-jackson",
        "lukas-krecan_json2xml",
        "mojohaus_tidy-maven-plugin",
        "cyclopsgroup_jcli",
        "cloudbees-oss_zendesk-java-client",
    ]

    projects_without_covered_stmts = ["dropwizard_dropwizard-elasticsearch"]

    projects_with_jacoco_exception = [
        "FasterXML_woodstox",  # jacoco throws exception
        "venkatramanm_common",
        "assertthat_selenium-shutterbug",
        "bvolpato_inutils4j",
        "networknt_json-schema-validator",
        "ralscha_extdirectspring",
        "sonyxperiadev_gerrit-events",
        "twilio_twilio-java",
    ]

    projects_with_no_inline_tests = [
        "onelogin_onelogin-java-sdk",
        "jenkinsci_email-ext-plugin", # evosuite generated tests removed the whole directory
    ]

    test_minimization_algorithms = ["ge", "gre", "greedy", "hgs"]

    ITEST_DECLARE = "itest"
