# Exli
Automatically extracting inline tests from unit tests.

## Introduction
This repo contains the code and data for producing the experiments in [Exli][paper-url].

### Inline test format
1. "Declare" part
`itest`

In our experiments, we use `itest(test_source, target_stmt_line_number)`, to represent the test source and the line number of the target statement in original file (note that the original file is different from the Java file with inline tests).
For example, `itest("Randoop", 57)` means that the test source is Randoop generated tests, and the target statement starts at line 57 in the original file.

2. "Assign part" part
`given(var, value)`

3. "Assert" part
`assert(var, value)`


## How to use Exli
### Install
Build a docker image

`docker build -t exli .`

`docker run -it exli /bin/bash`


In the docker, create a Python environment named `exli`

`cd exli/python && bash prepare-conda-env.sh`

`conda activate exli`


### Usage

#### Generate unit tests and inline tests

In `exli/python` directory

(Optional) command to find the target statements. It will help EvoSuite reduce the search scope. Otherwise, EvoSuite will generate tests on the whole project. The generated target statements are in `results/target-stmt/AquaticInformatics_aquarius-sdk-java-8f4edb9.txt`

`python -m exli.main batch_find_target_stmts --test_project_name=AquaticInformatics_aquarius-sdk-java`

`python -m exli.main run --project_name=AquaticInformatics_aquarius-sdk-java --sha=8f4edb9 --randoop=True --randoop_tl=10 --unit=True --evosuite=True --evosuite_tl=20 --seed=42 --log_file_path=${HOME}/projects/exli-internal/log/raninline.log`

To use the default setting for directories

`pythton -m exli.main batch_run --test_project_name=AquaticInformatics_aquarius-sdk-java`

The generated inline tests are in 

`all-tests/AquaticInformatics_aquarius-sdk-java`

#### Execute the generated inline tests

In `exli/python` directory

`python -m exli.main run_inline_tests --project_name=AquaticInformatics_aquarius-sdk-java --sha=8f4edb9 --generated_tests_dir=/home/liuyu/projects/exli-internal/reduced-tests/AquaticInformatics_aquarius-sdk-java-8f4edb9 --inline_tests_dir=/home/liuyu/projects/exli-internal/reduced-its/AquaticInformatics_aquarius-sdk-java-8f4edb9 --inlinetest_report_path=/home/liuyu/projects/exli-internal/results/reduced-its-report/AquaticInformatics_aquarius-sdk-java-8f4edb9.json --cached_objects_dir=/home/liuyu/projects/exli-internal/all-tests/AquaticInformatics_aquarius-sdk-java-8f4edb9/.inlinegen --deps_file=/home/liuyu/projects/exli-internal/generated-tests/AquaticInformatics_aquarius-sdk-java-8f4edb9/deps.txt --parse_inline_tests=True --log_file_path=/home/liuyu/projects/exli-internal/log/run-its.log`

To use the default setting for directories

`python -m exli.main batch_run_inline_tests --test_project_name=AquaticInformatics_aquarius-sdk-java`

The generated execution result can be found at

`results/all-its-report/AquaticInformatics_aquarius-sdk-java-8f4edb9.json`

#### Generate mutants and run mutation analysis

In `exli/python` directory

`python -m exli.eval batch_run_generate_mutants --test_project_name AquaticInformatics_aquarius-sdk-java`

`python -m exli.eval batch_run_tests_with_mutants --test_project_name AquaticInformatics_aquarius-sdk-java`

## Repo structure
raninline: This directory constains the source code of TargetStmtFinder, VariablesFinder,
Instrumenter, Collector, Round1Reducer, and InlineTestConstructor.

### Generated tests
R0-tests, R1-tests, R2-tests directories contain the inline tests that
are integrated with source code.

R0-tests: It contains the R0 tests.

R1-tests: It contains the R1 tests.

R2-tests: It contains the R2 tests.


## Citation
If you have used EXLI in a research project, please cite the research paper in any related publication:

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