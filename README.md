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
