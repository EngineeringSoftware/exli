# Introduction

This document describes how to reproduce the results of the paper.

# Requirements

Install [docker](./README.md#install)

# Reproduce

in `python` directory, run the following command:

```bash
bash reproduce.sh
```

## Data

It takes serveral days to run Randoop and EvoSuite to generate unit tests for all projects in eval, to skip this step, you can download the generated tests from [exlidata](https://bitbucket.org/sedata/exlidata/src/main/) and extract it in `exli` root directory.

```bash
git clone https://pipiyu@bitbucket.org/sedata/exlidata.git
```
