#! /usr/bin/python3

# Acknowledgements to August Shi (august@utexas.edu)

import random
import sys
from collections import defaultdict

import seutil as su
from exli.macros import Macros

logger = su.log.get_logger(__name__)

"""
tiebreak_file should be a CSV file where the 0th index is the name of the test, and the 1st index is some kind of numerical value.
if tiebreak_file is NONE, then the return value will be an empty map.
Ties will be broken by choosing the test that has the *smallest* value.
ex) test,num-non-unique-traces-in-test
"""


def read_tiebreak_file(tiebreak_file):
    tiebreak_map = {}
    if tiebreak_file != "NONE":
        with open(tiebreak_file, "r") as f:
            next(f)
            for line in f:
                splits = line.strip().split(",")
                tiebreak_map[splits[0]] = float(splits[1])
    return tiebreak_map


"""
Helper function for resolving ties between tests during selection

Args:
  arbitrarily_chosen - the value that would have been chosen if tiebreaking did not occur
  tests - set of tests that are tied
  tiebreak_map - a mapping of tests to numerical values. The test with the *smallest* value will break the tie
"""


def break_ties(
    arbitrarily_chosen, tests, tiebreak_map
):  # breaks ties between tests based on tiebreak_map
    if len(tiebreak_map) == 0:
        # logger.debug("[break_ties] No tiebreak_map")
        return arbitrarily_chosen
    smallest_value = sys.float_info.max
    chosen_test = ""
    for test in tests:
        if tiebreak_map[test] < smallest_value:
            smallest_value = tiebreak_map[test]
            chosen_test = test
    # logger.debug(
    #     "[break_ties] Chosen test: " + chosen_test + " value: " + str(smallest_value)
    # )
    return chosen_test


# Remove element from all sets in dictionary
# returns modified mapping
"""
Helper function for removing entities from all mappings in a dictionary

Args:
    mapping - dictionary from test to set of entities it covers
    entities - entities to delete from all sets of covered entities in mapping

Returns:
    new dictionary from test to set of entities it covers, without a certain entity
"""


def remove_entities(mapping, entities):
    modified_mapping = {}
    for key in mapping.keys():
        modified_mapping[key] = mapping[key] - set(entities)

    return modified_mapping


"""
Helper function for removing mappings from a dictionary that contains a certain entity

Args:
    mapping - dictionary from test to set of entities it covers
    entity - entity to check and delete from

Returns:
    new dictionary from test to set of entities it covers, where tests do not cover a certain entity
"""


def remove_keys(mapping, entity):
    modified_mapping = {}
    for key in mapping.keys():
        if not entity in mapping[key]:
            modified_mapping[key] = mapping[key]

    return modified_mapping


"""
Helper function for finding test that covers the most entities,
and in case of ties chooses the last one

Args:
    mapping - dictionary from test to set of entities it covers, or vice versa

Returns:
    test that covers the most entities
"""


def get_best_test(mapping, tiebreak_map):
    max_coverage = 1
    coverage_mapping = {}
    for test in sorted(mapping.keys()):
        num_covered = len(mapping[test])
        if not num_covered in coverage_mapping:
            coverage_mapping[num_covered] = []
        coverage_mapping[num_covered].append(test)
        if num_covered >= max_coverage:
            current = test
            max_coverage = len(mapping[test])

    if len(coverage_mapping[max_coverage]) > 1:
        current = break_ties(current, coverage_mapping[max_coverage], tiebreak_map)
        # logger.debug(
        #     "[get_best_test] Max coverage: "
        #     + str(max_coverage)
        #     + " Tie between the tests: "
        #     + str(coverage_mapping[max_coverage])
        #     + " Chose test: "
        #     + current
        # )
    return current


"""
Helper function for making an inverted map
(from test to entities covered to entity to tests that cover it, or vice versa)

Args:
    mapping - dictionary from test to set of entities it covers, or vice versa

Returns:
    new dictionary that is inverted from what is passed in
"""


def inverse_dict(mapping):
    inv = defaultdict(set)
    for key in mapping.keys():
        for val in mapping[key]:
            inv[val].add(key)
    return inv


"""
Make a reduced test suite using Greedy algorithm

Args:
    mapping - dictionary from test to set of entities it covers
    percentage - percent of all entities that should be covered by reduced test suite, default being 100% of them

Returns:
    set of tests, representing the Greedy reduced test suite
"""


def greedy(mapping, tiebreak_map, percentage=1.0):
    if not mapping:
        return set()
    reduced_testsuite = set()
    covered_entities = set()
    total_entities = set.union(*mapping.values())

    # While coverage of reduced test suite is less than that of the original one,
    # keep addding more tests
    while len(covered_entities) < percentage * len(total_entities):
        # First get the test with the most uncovered entities and select that test
        test = get_best_test(mapping, tiebreak_map)

        # Add covered entities to the set and remove them from mapping
        for x in mapping[test]:
            covered_entities.add(x)
        removeable = list(mapping[test])
        del mapping[test]
        mapping = remove_entities(mapping, removeable)
        reduced_testsuite.add(test)
    return reduced_testsuite


"""
Helper function for finding tests that cover a unique entity

Args:
    entity_to_tests - dictionary from entity to set of tests that cover that entity
    mapping - dictionary from test to set of entities it covers

Returns:
    tuple where first element is set of tests that cover a unique entity and
    the second element is the set of entities covered by those tests
"""


def find_essential(entity_to_tests, mapping):
    covered_entities = set()
    selected_tests = set()
    essential_tests = set()
    for entity in entity_to_tests.keys():
        # Find an entity where only one test covers it
        if len(entity_to_tests[entity]) == 1:
            test = entity_to_tests[entity].pop()
            essential_tests.add(
                test
                + " is essential for "
                + entity
                + ", also covers "
                + str(mapping[test])
            )
            selected_tests.add(test)
            covered_entities |= mapping[test]

    return selected_tests, covered_entities


"""
Make a reduced test suite using GE algorithm

Args:
    mapping - dictionary from test to set of entities it covers
    percentage - percent of all entities that should be covered by reduced test suite, default being 100% of them

Returns:
    set of tests, representing the GE reduced test suite 
"""


def ge(mapping, tiebreak_map, percentage=1.0):
    entity_to_tests = inverse_dict(mapping)
    reduced_testsuite, covered_entities = find_essential(entity_to_tests, mapping)

    # Remove tests and entities covered by selected tests
    for entity in covered_entities:
        del entity_to_tests[entity]
    mapping = inverse_dict(entity_to_tests)

    # Run greedy algorithm on the remaining tests
    g_reduced_testsuite = greedy(mapping, tiebreak_map, percentage)

    return reduced_testsuite.union(g_reduced_testsuite)


"""
Helper function for removing any redundant tests from the mapping from tests to entities they cover

Args:
    mapping - dictionary from test to set of entities it covers

Returns:
    new dictionary from test to set of entities it covers, without any redundant tests
"""


def remove_redundant(mapping):
    # First make a copy of the mapping into this modified one
    modified_mapping = {}
    for test in mapping:
        modified_mapping[test] = mapping[test]

    # Find and remove redundant tests (that are proper subsets)
    for t1 in sorted(list(modified_mapping.keys())):
        for t2 in sorted(list(modified_mapping.keys())):
            if t1 != t2 and modified_mapping[t1] < modified_mapping[t2]:
                del modified_mapping[t1]
                break

    # Removing tests that cover exactly the same statements
    redundant = set()
    for t1 in sorted(list(modified_mapping.keys())):
        if t1 not in redundant:
            for t2 in modified_mapping.keys():
                if t1 != t2 and modified_mapping[t1] == modified_mapping[t2]:
                    redundant.add(t2)
                    del modified_mapping[t2]
                    break

    return modified_mapping


"""
Make a reduced test suite using GRE algorithm

Args:
    mapping - dictionary from test to set of entities it covers
    percentage - percent of all entities that should be covered by reduced test suite, default being 100% of them

Returns:
    set of tests, representing the GRE reduced test suite 
"""


def gre(mapping, tiebreak_map, percentage=1.0):
    total_entities = set.union(*mapping.values())
    entity_to_test = inverse_dict(mapping)
    reduced_testsuite, covered_entities = find_essential(entity_to_test, mapping)
    for entity in covered_entities:
        del entity_to_test[entity]
    mapping = inverse_dict(entity_to_test)

    if not mapping:
        return reduced_testsuite

    while len(covered_entities) < percentage * len(total_entities):
        mapping = remove_redundant(mapping)
        entity_to_test = inverse_dict(mapping)
        new_selected, new_covered = find_essential(entity_to_test, mapping)
        if not new_selected:
            test = get_best_test(mapping, tiebreak_map)
            new_selected.add(test)
            new_covered = mapping[test]

        for entity in new_covered:
            del entity_to_test[entity]
        mapping = inverse_dict(entity_to_test)
        covered_entities |= new_covered
        reduced_testsuite |= new_selected

    return reduced_testsuite


"""
Helper function for selecting test to be included at each step of HGS algorithm

Args:
    size - current cardinality
    cardinality - dictionary mapping current cardinality to tests of that cardinality
    max_size - maximal cardinality

Returns:
    test to be included into reduced test suite at HGS step
"""


def hgs_select_test(size, cardinality, max_size, tiebreak_map):
    # Constructing initial list of tests to choose from
    tests = list()
    for st in cardinality[size]:
        tests.extend(list(st))
    tests = list(set(tests))

    # Going through cardinalities until there is only one choice
    while size <= max_size:
        count = defaultdict(int)
        max_count = 0
        for test in tests:
            for st in cardinality[size]:
                if test in st:
                    count[test] += 1
            max_count = max(max_count, count[test])
        # Get list of maxima
        mlist = list()
        for test in count.keys():
            if count[test] == max_count:
                mlist.append(test)
        # If the choice can be already made, return
        if len(mlist) == 1:
            return mlist[0]

        tests = mlist
        size += 1
        # Some cardinalities may not exist
        while size <= max_size and (size not in cardinality.keys()):
            size += 1

    # If it not possible to get only one choice, return the first one
    if len(tests) > 1:
        chosen = break_ties(tests[0], tests, tiebreak_map)
        # logger.debug(
        #     "[hgs_select_test] Cardinality: "
        #     + str(size)
        #     + " Tie between the tests: "
        #     + str(tests)
        #     + " Chose: "
        #     + str(tests[0])
        # )
    return tests[0]


"""
Helper function for removing any mappings that have empty values

Args:
    cardinality - dictionary from number of tests that cover an entity to the set of tests that cover it

Returns:
    new dictionary that has removed entries where there are no tests in each cardinality
"""


def remove_empty(cardinality):
    modified_cardinality = {}
    for key in cardinality.keys():
        if len(cardinality[key]) > 0:
            modified_cardinality[key] = cardinality[key]
    return modified_cardinality


"""
Make a reduced test suite using HGS algorithm

Args:
    st_to_test - dictionary from entity to set of tests that cover that entity
    percentage - percent of all entities that should be covered by reduced test suite, default being 100% of them

Returns:
    set of tests, representing the HGS reduced test suite 
"""


def hgs(st_to_test, tiebreak_map, percentage=1.0):
    reduced_testsuite = set()
    test_to_st = inverse_dict(st_to_test)

    covered_entities = set()
    total_entities = set.union(*test_to_st.values())

    # Select all tests that are the only ones covering some entities
    for st in st_to_test.keys():
        if len(st_to_test[st]) == 1:
            reduced_testsuite.add(st_to_test[st].pop())
            covered_entities.add(st)
            # Check if currently covered entities is percentage of total; return if true
            if len(covered_entities) >= percentage * len(total_entities):
                return reduced_testsuite

    # Remove all covered entities
    for test in reduced_testsuite:
        st_to_test = remove_keys(st_to_test, test)

    # Dictionary {number of tests that cover entity -> list of sets of tests}
    cardinality = defaultdict(list)
    max_size = 0
    for entity in st_to_test.keys():
        cardinality[len(st_to_test[entity])].append(st_to_test[entity])
        max_size = max(max_size, len(st_to_test[entity]))
    cardinality = remove_empty(cardinality)

    # While there are some uncovered entities, select the test that covers the most
    cur_size = 2
    while cur_size <= max_size:
        # Get next cardinality
        while (cur_size <= max_size) and (cur_size not in cardinality.keys()):
            cur_size += 1

        if cur_size > max_size:
            return reduced_testsuite

        selected = hgs_select_test(cur_size, cardinality, max_size, tiebreak_map)

        # Select the test and update cardinality dict
        reduced_testsuite.add(selected)
        covered_entities |= test_to_st[selected]
        # Check if currently covered entities is percentage of total; return if true
        if len(covered_entities) >= percentage * len(total_entities):
            return reduced_testsuite

        for size in sorted(list(cardinality.keys())):
            # List of sets we should not delete
            # using this because values in cardinality are lists and
            # deleting from a list is too slow
            keep = list()
            for st in cardinality[size]:
                if selected not in st:
                    keep.append(st)
            if keep:
                cardinality[size] = keep
            else:
                del cardinality[size]
    return reduced_testsuite


"""
Randomly make a reduced test suite

Args:
    mapping - dictionary from test to set of entities it covers
    rand_num_tests - number of tests to put in reduced test suite

Returns:
    set of tests, representing the randomly reduced test suite
"""


def randomize(mapping, rand_num_tests):
    if not mapping:
        return set()
    reduced_testsuite = set()
    total_tests = list(mapping.keys())  # Copy in case of removal

    # While # of tests of reduced test suite is less than percentage of that of the original one,
    # keep adding more tests randomly
    while len(reduced_testsuite) < rand_num_tests:
        # Randomly index into total tests, remove and add test there to selected
        index = random.randint(0, len(total_tests) - 1)
        test = total_tests.pop(index)
        reduced_testsuite.add(test)

    return reduced_testsuite


"""
Read a file representing test to entities it covers

Args:
    data_file - file with mapping from test to entities each one covers,
                each line is space-delimited, first element is test name, remaining elements are what it covers

Return
    dictionary from test to set of entities it covers
"""


def read(data_file):
    mapping = {}
    with open(data_file) as f:
        for line in f:
            parts = line.strip().split(",")
            test = parts[0]
            if not test in mapping:
                mapping[test] = set()
            if parts[1] == "":
                mapping[test] = set()
                continue
            entities = set(parts[1:])
            mapping[test] |= entities

    return mapping


"""
Remove any tests from the mapping of test to dependencies that are not from a set of original tests

Args:
    mapping - dictionary from test to set of entities it covers
    orig_file - file with tests in test suite, one test per line

Returns:
    new dictionary from test to set of entities it covers, with only tests in the test suite passed in
"""


def remove_extra_tests(mapping, orig_file):
    with open(orig_file) as f:
        orig_tests = set(line.strip() for line in f)

    modified_mapping = {}
    for test in mapping.keys():
        if test in orig_tests:
            modified_mapping[test] = mapping[test]
    return modified_mapping


"""
Reduce a test suite, writing out reduced test suite one test per line to passed in output stream

Args:
    data_file - file representing test to what entities each covers,
                each line is space delimited, first element is test, subsequent elements are entities covered
    orig_file - file representing test suite to reduce, one test per line
    out - stream to write out results to (like standard out)
    percentage - percent of all entities that should be covered by reduced test suite, default being 100% of them
"""


def reduce_suite(data_file, orig_file, algorithm, out, tiebreak_map, percentage=1.0):
    mapping = read(data_file)
    mapping = remove_extra_tests(mapping, orig_file)

    if algorithm == "greedy":
        selected_tests = greedy(mapping, tiebreak_map, percentage)
    elif algorithm == "ge":
        selected_tests = ge(mapping, tiebreak_map, percentage)
    elif algorithm == "gre":
        selected_tests = gre(mapping, tiebreak_map, percentage)
    elif algorithm == "hgs":
        st_to_test = inverse_dict(mapping)
        selected_tests = hgs(st_to_test, tiebreak_map, percentage)
    elif algorithm == "random":
        selected_tests = randomize(
            mapping, percentage
        )  # In this case, percentage is actually number of tests to select randomly
    else:
        logger.warning("No algorithm with this name found")
        return

    if out == "STDOUT":
        for test in selected_tests:
            sys.stdout.write(test + "\n")
    elif out != "NONE":
        with open(out, "w") as out:
            for test in selected_tests:
                out.write(test + "\n")
    logger.info("[reduce_suite] Number of selected tests: " + str(len(selected_tests)))

    return selected_tests


"""
Performs test-suite reduction based on tests and dependencies for a project,
outputting the reduced test suite to the console

args:
"""


def main(args):
    if len(args) != 6 and len(args) != 7:
        print(
            "Please provide 5 arguments: coverage file, original tests file, algorithm, output_file, tiebreak_file"
        )
        print(
            "If output_file is STDOUT then the output will be written to standard output"
        )
        print("If tiebreak_file is NONE then tiebreaks will not be done")
        print(
            "An optional 6th argument specifies the percentage of coverage desired. Default is 100"
        )
        return

    data_file = args[1]
    orig_file = args[2]
    algorithm = args[3]
    output_file = args[4]
    tiebreak_file = args[5]
    tiebreak_map = read_tiebreak_file(tiebreak_file)

    if len(args) == 7:
        percentage = float(args[6]) / 100
    else:
        percentage = 1.0

    if not algorithm in ["greedy", "ge", "gre", "hgs", "random"]:
        print("Not valid algorithm, please use greedy, ge, gre, hgs, or random")
        return

    reduce_suite(data_file, orig_file, algorithm, output_file, tiebreak_map, percentage)


if __name__ == "__main__":
    su.log.setup(Macros.log_file)
    main(sys.argv)
