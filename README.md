# ExLi
Automatically extracting inline tests from unit tests.

## Introduction
This repo contains the code and data for producing the experiments in [ExLi][paper-url].

### Inline test format
1. "Declare" part
`itest`

In our experiments, we use `itest(test_source, target_stmt_line_number)`, to represent the test source and the line number of the target statement in original file (note that after adding inline tests to the original file, the line numbers of target statements change).
For example, `itest("Randoop", 57)` means that the test source is Randoop generated tests, and the target statement starts at line 57 in the original file.

2. "Assign" part
`given(var, value)`

3. "Assert" part
`assert(var, value)`

### Repo structure

#### Code
raninline: This directory constains the source code of TargetStmtFinder, VariablesFinder,
Instrumenter, Collector, Round1Reducer, and InlineTestConstructor.

python: This directory contains the scripts of running ExLi end-to-end and generates figures.

#### Generated tests
R0-tests, R1-tests, R2-tests directories contain the inline tests that
are integrated with source code.

R0-tests: It contains the R0 tests.

R1-tests: It contains the R1 tests.

R2-tests: It contains the R2 tests.

## How to use ExLi

### Requirements
- Docker
- Disk space: 10GB

In the docker, the following tools/dependencies are installed:
- Conda latest version
- Python 3.9 (or later)
- Java 8, JUnit 4
- Maven 3.8.3 (or later)

### Install
Build a docker image

`docker build -t exli .`

`docker run -it exli /bin/bash`


In the docker, create a Python environment named `exli`

`cd exli/python && bash prepare-conda-env.sh`

`conda activate exli`


### Usage

- For each command, append `--help` to see the usage and options.
> For example, `python -m exli.main find_target_stmts --help`
>
```txt
usage: main.py [options] find_target_stmts [-h] [--config CONFIG] [--print_config[=flags]]
                                           --project_name PROJECT_NAME --sha SHA
                                           --target_stmts_path TARGET_STMTS_PATH

Find target statements for a project.

  ...
  --project_name PROJECT_NAME
                        org_repo, e.g., https://github.com/Bernardo-MG/velocity-config-tool, the project name is
                        Bernardo-MG_velocity-config-tool (required, type: str)
  --sha SHA             commit hash (required, type: str)
  --target_stmts_path TARGET_STMTS_PATH
                        path to store the target statements (required, type: str)
```

- For each command, the argument and value can be seperated by `=` or space. For example, `--project_name=Bernardo-MG_velocity-config-tool` or `--project_name Bernardo-MG_velocity-config-tool` are both valid.
- To run on a specific project, replace `Bernardo-MG_velocity-config-tool` with the project name and `26226f5` with the commit hash. Notice that only projects that are in evaluated projects can be run with the command that only require `test_project_name`.

#### (Optional) Find the target statements. 

It will help EvoSuite reduce the search scope. Otherwise, EvoSuite will generate tests on the whole project, which may take a long time (~2 min * number of classes). 

In `exli/python` directory

```bash
python -m exli.main find_target_stmts --project_name=Bernardo-MG_velocity-config-tool --sha=26226f5 --target_stmts_path=${HOME}/exli/results/target-stmt/Bernardo-MG_velocity-config-tool-26226f5.txt
```
> The generated target statements are in `${HOME}/exli/results/target-stmt/Bernardo-MG_velocity-config-tool-26226f5.txt`

> Alternatively, to use the default output file path
`python -m exli.main batch_find_target_stmts --test_project_name=Bernardo-MG_velocity-config-tool`

There are three target statements found in the project `Bernardo-MG_velocity-config-tool` at commit `26226f5`:

```txt
target stmt string;/home/itdocker/exli/_downloads/Bernardo-MG_velocity-config-tool/src/main/java/com/bernardomg/velocity/tool/ConfigTool.java;195;null;;null
target stmt string;/home/itdocker/exli/_downloads/Bernardo-MG_velocity-config-tool/src/main/java/com/bernardomg/velocity/tool/ConfigTool.java;200;null;;null
target stmt string;/home/itdocker/exli/_downloads/Bernardo-MG_velocity-config-tool/src/main/java/com/bernardomg/velocity/tool/ConfigTool.java;288;null;;null
```

#### Generate unit tests and inline tests

In `exli/python` directory

```bash
python -m exli.main run --project_name=Bernardo-MG_velocity-config-tool --sha=26226f5 --randoop=True --randoop_tl=100 --unit=True --evosuite=True --evosuite_tl=120 --seed=42 --log_path=${HOME}/exli/log/raninline.log
```

> The generated inline tests are in `${HOME}/exli/all-tests/Bernardo-MG_velocity-config-tool-26226f5`

> Alternatively, to use the default setting for test generation and output dirs path
`python -m exli.main batch_run --test_project_name=Bernardo-MG_velocity-config-tool`

#### Execute the generated inline tests

In `exli/python` directory

```bash
python -m exli.main run_inline_tests --project_name=Bernardo-MG_velocity-config-tool --sha=26226f5 --generated_tests_dir=${HOME}/exli/reduced-tests/Bernardo-MG_velocity-config-tool-26226f5 --inline_tests_dir=${HOME}/exli/reduced-its/Bernardo-MG_velocity-config-tool-26226f5 --inlinetest_report_path=${HOME}/exli/results/reduced-its-report/Bernardo-MG_velocity-config-tool-26226f5.json --cached_objects_dir=${HOME}/exli/all-tests/Bernardo-MG_velocity-config-tool-26226f5/.inlinegen --deps_file=${HOME}/exli/generated-tests/Bernardo-MG_velocity-config-tool-26226f5/deps.txt --parse_inline_tests=True --log_path=${HOME}/exli/log/run-its.log
```

> This command runs the inline tests and generates the execution report at `${HOME}/exli/results/reduced-its-report/Bernardo-MG_velocity-config-tool-26226f5.json`
> 
> To generate the report for all inline tests, replace `reduced` with `all` in the generated tests dir, inline tests dir and execution report (`${HOME}/exli/reduced-its` -> `${HOME}/exli/all-its`, `${HOME}/exli/results/reduced-its-report` -> `${HOME}/exli/results/all-its-report` and `${HOME}/exli/results/all-its-report` to `${HOME}/exli/results/reduced-its-report`)
> 
> The difference between "all-its-report" and "reduced-its-report" is that the "all-its-report" contains all the inline tests, while the "reduced-its-report" contains the inline tests that are reduced by the Round 1 Reducer (based on coverage).

```bash
python -m exli.main run_inline_tests --project_name=Bernardo-MG_velocity-config-tool --sha=26226f5 --generated_tests_dir=${HOME}/exli/all-tests/Bernardo-MG_velocity-config-tool-26226f5 --inline_tests_dir=${HOME}/exli/all-its/Bernardo-MG_velocity-config-tool-26226f5 --inlinetest_report_path=${HOME}/exli/results/all-its-report/Bernardo-MG_velocity-config-tool-26226f5.json --cached_objects_dir=${HOME}/exli/all-tests/Bernardo-MG_velocity-config-tool-26226f5/.inlinegen --deps_file=${HOME}/exli/generated-tests/Bernardo-MG_velocity-config-tool-26226f5/deps.txt --parse_inline_tests=True --log_path=${HOME}/exli/log/run-its.log
```

> Alternatively, to use the default setting for output dirs `python -m exli.main batch_run_inline_tests --test_project_name=Bernardo-MG_velocity-config-tool`, this will run the inline tests for both reduced and all inline tests 

The report shows the number of tests, errors, failures, and time. For example,
```json
{
    "testsuite": {
        "@errors": "0",
        "@failures": "0",
        "@hostname": "bafe0a4bce5a",
        "@name": "JUnit Jupiter",
        "@skipped": "0",
        "@tests": "6",
        "@time": "0.042",
        ...
    }
}
```

---

It is possible to see the message "Some inline tests failed for {project_name} {sha} during execution" because not all generated inline tests can be compiled or executed successfully. For example, if the user-defined class does not override the `toString()` method, the serialized object will contain the class name and the hash code, and the new object will not be equal to the original object when we run the inline tests and compare the objects (the collected value does not equal to the runtime value).

If there are inline tests failed because of compilation, we directly remove these failed inline tests, the log file `${HOME}/exli/results/reduced-its-report/Bernardo-MG_velocity-config-tool-comp-failed-tests.txt` stores the failed inline tests and the reason why they failed (This project does not have compilation failed inline tests so this file does not exist).

If inline tests failed because of execution, run the following command to remove the failed inline tests:

`python -m exli.main analyze_inline_tests_reports --inline_test_type=reduced` (or `all`)

`python -m exli.main remove_failed_tests --inline_test_type reduced` (or `all`)

Re-generate test reports:

`python -m exli.main batch_run_inline_tests --test_project_name=Bernardo-MG_velocity-config-tool`

---

The generated execution result can be found at

`${HOME}/exli/results/reduced-its-report/Bernardo-MG_velocity-config-tool-26226f5.json`

`${HOME}/exli/results/all-its-report/Bernardo-MG_velocity-config-tool-26226f5.json`

#### Generate mutants and run mutation analysis

In `exli/python` directory

Generate mutants:
```bash

```
> Alternatively, to use the default settings `python -m exli.eval batch_run_generate_mutants --test_project_name=Bernardo-MG_velocity-config-tool`

Run mutation analysis:
```bash

```
> Alternatively, to use the default settings `python -m exli.eval batch_run_tests_with_mutants --test_project_name=Bernardo-MG_velocity-config-tool`

### Reproduce the results in the paper

#### Run experiments
```bash

```

#### Make figures
```bash

```

#### Background
Projects for evaluation
| project | SHA | LOC |
|---------|-----|-----|
| AquaticInformatics/aquarius-sdk-java | 8f4ed9b | 21,634 |
| Asana/java-asana | 52fe9fb | 5,572 |
| aws/aws-sdk-java | 5f8fed25 | 1,288 |
| Bernard-MG/maven-site-fixer | 60244c0 | 1,689 |
| Bernard-MG/velocity-config-tool | 2622cf5 | 358 |
| craftercms/core | 4d394a9 | 10,233 |
| CycloneDX/cyclonedx-core-java | d933705 | 6,011 |
| finos/messageml-utils | b4c75c6 | 21,765 |
| fleipold/jproc | b872abf | 1,189 |
| hyperledger/fabric-sdk-java | da35400 | 33,677 |
| jkuhnert/ognl | 5c30e1e | 18,190 |
| jscep/jscep | b20e944 | 6,310 |
| lamarois/sherdog-parser | aa6806a | 1,546 |
| liquibase/liquibase-oracle | 6ab7dea | 7,170 |
| maxmind/geoip-api-java | 1030316 | 11,526 |
| medcl/elasticsearch-analysis-pinyin | 01dda56 | 2,169 |
| mojohaus/build-helper-maven-plugin | f1fac8c | 2,424 |
| mojohaus/properties-maven-plugin | 6cf7c2b | 831 |
| mojo/versions-maven-plugin | 6cf7c2b | 891 |
| mp911de/logstash-gelf | 66dedb8 | 13,130 |
| mpatric/mp3agic | 407f7a9 | 9,907 |
| netceteragroup/trema-core | fa9f76d | 3,285 |
| phax/ph-pdf-layout | f2d7b98 | 14,408 |
| ralscha/extclassgenerator | 40ad147 | 6,271 |
| red6/pdfcompare | 1259ef2 | 4,213 |
| restfb/restfb | 35a34dd | 42,022 |
| stevesh/jopenfst | 14c4a1d | 5,180 |
| TNG/property-loader | 928f414 | 1,860 |
| wuolfer/gerrit-rest-java-client | a0bf7cc | 14,594 |
| visenze/visearch-sdk-java | 0efcda3 | 7,643 |
| wmixvideo/nfe | 1ccdba7 | 133,698 |



## Citation
If you have used ExLi in a research project, please cite the research paper in any related publication:

Title: [Extracting Inline Tests from Unit Tests](https://dl.acm.org/doi/abs/10.1145/3597926.3598149)

Authors: [Yu Liu](https://sweetstreet.github.io/), [Pengyu Nie](https://pengyunie.github.io/), [Anna Guo](https://www.linkedin.com/in/anna-y-guo/), [Milos Gligoric](http://users.ece.utexas.edu/~gligoric/), [Owolabi Legunsen](https://mir.cs.illinois.edu/legunsen/)

```bibtex
@inproceedings{LiuISSTA23EXLI,
  title =        {Extracting Inline Tests from Unit Tests},
  author =       {Yu Liu and Pengyu Nie and Anna Guo and Milos Gligoric and Owolabi Legunsen},
  pages =        {1--13},
  booktitle =    {Proceedings of the 32nd ACM SIGSOFT International Symposium on Software Testing and Analysis},
  year =         {2023},
}
```

[paper-url]: https://dl.acm.org/doi/10.1145/3597926.3598149