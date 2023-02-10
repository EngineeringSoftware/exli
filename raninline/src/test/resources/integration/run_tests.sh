# Usage: ./run_tests.sh <path to test directory> <name of test class>
# Example: bash run_tests.sh . instrument/A
raninline_jar_path=~/projects/inlinegen-research/java/raninline/target/raninline-1.0-SNAPSHOT.jar
jacoco_agent_path=~/projects/inlinegen-research/jars/org.jacoco.agent-0.8.8-runtime.jar=inclbootstrapclasses=true
(cd ${1}  # ${1} is the path to the test directory
javac -cp ${raninline_jar_path} ${2}.java # ${2} is the name of the test class
java -javaagent:${jacoco_agent_path} -cp ${raninline_jar_path}:. ${2})