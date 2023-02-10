## Appendix
appendix.pdf: This is the appendix of the paper. It contains some additional experiment results.

## Generated tests
R0-tests, R1-tests, R2-tests directories contain the inline tests that
are integrated with source code.

R0-tests: It contains the R0 tests.

R1-tests: It contains the R1 tests.

R2-tests: It contains the R2 tests.

### Inline test format
1. "Declare" part
`new Here()`

In our experiments, we use `new Here(test_source, target_stmt_line_number)`, to represent the test source and the line number of the target statement in original file (note that the original file is different from the Java file with inline tests).
For example, `new Here("Randoop", 57)` means that the test source is Randoop generated tests, and the target statement starts at line 57 in the original file.

2. "Assign part" part
`given(var, value)`

3. "Assert" part
`assert(var, value)`

## Source code
raninline: This directory constains the source code of TargetStmtFinder, VariablesFinder,
Instrumenter, Collector, Round1Reducer, and InlineTestConstructor.