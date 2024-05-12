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

Notes: The inline tests failed mainly for three reasons: (1)~the
object does not override the `toString()` method, leading the
assertion to compare memory references instead of object properties;
(2)~the object cannot be deserialized due to dynamic dispatch,
resulting in a type mismatch and `ConversionException` thrown by
XStream; (3)~the parsed test fails to compile because there are
methods in the target statements that are not static and have states.
