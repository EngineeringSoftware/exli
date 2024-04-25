package org.buildobjects.process;

import java.io.ByteArrayOutputStream;
import static java.nio.charset.StandardCharsets.UTF_8;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

/**
 * Signals the failure of an external process that returned a non zero exit code. It captures additional information
 * such as the output on stderr.
 */
public class ExternalProcessFailureException extends RuntimeException {

    private final String command;

    final private String commandLine;

    final private int exitValue;

    final private String stderr;

    private final ByteArrayOutputStream stdout;

    final private long time;

    ExternalProcessFailureException(String command, String commandLine, int exitValue, String stderr, ByteArrayOutputStream stdOut, long time) {
        this.command = command;
        this.commandLine = commandLine;
        this.exitValue = exitValue;
        this.stderr = stderr;
        this.stdout = stdOut;
        this.time = time;
    }

    private String formatOutput(String string, String prefix) {
        if (string == null) {
            return prefix + "<Has already been consumed.>\n";
        }
        if (string.isEmpty()) {
            return "";
        }
        return prefixLines(string, prefix);
    }

    private String prefixLines(String string, String prefix) {
        StringBuilder builder = new StringBuilder();
        String[] lines = string.split("\n");
        itest("evosuite", 39).given(string, "com.thoughtworks.xstream.persistence.AbstractFilePersistenceStrategy").checkEq(lines, new String[] { "com.thoughtworks.xstream.persistence.AbstractFilePersistenceStrategy" });
        itest("evosuite", 39).given(string, "UT}c4&HRf").checkEq(lines, new String[] { "UT}c4&HRf" });
        itest("dev", 39).given(string, "Standard Out Line 1\nStandard Out Line 2\n").checkEq(lines, new String[] { "Standard Out Line 1", "Standard Out Line 2" });
        itest("evosuite", 39).given(string, "\uFFFD").checkEq(lines, new String[] { "\uFFFD" });
        itest("evosuite", 39).given(string, "\u0000").checkEq(lines, new String[] { "\u0000" });
        itest("dev", 39).given(string, "Standard Out\n").checkEq(lines, new String[] { "Standard Out" });
        itest("dev", 39).given(string, "Standard Error\n").checkEq(lines, new String[] { "Standard Error" });
        itest("evosuite", 39).given(string, "D").checkEq(lines, new String[] { "D" });
        itest("evosuite", 39).given(string, "%3lf}C_^^zM|").checkEq(lines, new String[] { "%3lf}C_^^zM|" });
        itest("evosuite", 39).given(string, "\uFFFD\u0000\uFFFD").checkEq(lines, new String[] { "\uFFFD\u0000\uFFFD" });
        itest("evosuite", 39).given(string, "&~").checkEq(lines, new String[] { "&~" });
        for (String line : lines) {
            builder.append(prefix + line + "\n");
        }
        return builder.toString();
    }

    @Override
    public String getMessage() {
        String formattedStdErr = formatOutput(stderr, "  STDERR: ");
        final String outString = stdout != null ? new String(stdout.toByteArray(), UTF_8) : null;
        String formattedStdOut = formatOutput(outString, "  STDOUT: ");
        return "External process `" + command + "` terminated with unexpected exit status " + exitValue + " after " + time + "ms:\n" + "  $ " + commandLine + "\n" + formattedStdErr + formattedStdOut;
    }

    /**
     * @return the command that was executed
     * @deprecated Use getCommandLine
     */
    @Deprecated
    public String getCommand() {
        return commandLine;
    }

    /**
     * @return a command line to invoke this process including args and using basic shell escaping.
     */
    public String getCommandLine() {
        return commandLine;
    }

    /**
     * @return the actual exit value
     */
    public int getExitValue() {
        return exitValue;
    }

    /**
     * @return the output on stderr
     */
    public String getStderr() {
        return stderr;
    }

    /**
     * @return the execution time until the process failed
     */
    public long getTime() {
        return time;
    }
}
