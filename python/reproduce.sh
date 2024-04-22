# Find target statements.
python -m exli.main batch_find_target_stmts
# Generate unit tests with Randoop and EvoSuite. Execute unit tests to get inline tests.
python -m exli.main batch_run
# Execute inline tests.
python -m exli.main batch_run_inline_tests
# Analyze inline test reports.
python -m exli.main analyze_inline_tests_reports --inline_test_type=r0
python -m exli.main analyze_inline_tests_reports --inline_test_type=r1
# Remove failed inline tests.
python -m exli.main remove_failed_tests --inline_test_type=r0
python -m exli.main remove_failed_tests --inline_test_type=r1
# Re-execute inline tests and analyze reports.
python -m exli.main batch_run_inline_tests
python -m exli.main analyze_inline_tests_reports --inline_test_type=r0
python -m exli.main analyze_inline_tests_reports --inline_test_type=r1
# Generate mutants.
python -m exli.main batch_generate_mutants
# Apply mutants and execute inline tests.
python -m exli.eval batch_run_tests_with_mutants
# Collect the mapping between each test case and its killed mutants
python -m exli.eval batch_test_to_killed_mutants 
# Add back inline tests.
python -m exli.eval batch_add_back_tests
# TODO: minimize inline tests and get the final results (r2 tests).

