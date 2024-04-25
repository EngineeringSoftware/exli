package org.buildobjects.process;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.lang.Integer.MAX_VALUE;
import static java.util.concurrent.TimeUnit.HOURS;
import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static org.buildobjects.process.ExecutionEvent.EXCEPTION_IN_STREAM_HANDLING;
import static org.buildobjects.process.ExecutionEvent.PROCESS_EXITED;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

/**
 * Internal implementation of the process mechanics
 */
class Proc implements EventSink {

    private final Process process;

    private int exitValue;

    private long executionTime;

    private final OutputConsumptionThread err;

    private final String command;

    private final List<String> args;

    private final Long timeout;

    private final BlockingQueue<ExecutionEvent> eventQueue = new LinkedBlockingQueue<ExecutionEvent>();

    private final IoHandler ioHandler;

    public Proc(String command, List<String> args, Map<String, String> env, boolean clearEnvironment, InputStream stdin, Object stdout, File directory, Long timeout, Object stderr) throws StartupException, TimeoutException, ExternalProcessFailureException {
        this.command = command;
        this.args = args;
        this.timeout = timeout;
        String[] cmdArray = concatenateCmdArgs();
        long t1 = System.currentTimeMillis();
        OutputConsumptionThread stdoutConsumer;
        try {
            ProcessBuilder builder = new ProcessBuilder(cmdArray).directory(directory);
            if (clearEnvironment) {
                builder.environment().clear();
            }
            builder.environment().putAll(env);
            process = builder.start();
            stdoutConsumer = createStreamConsumer(stdout);
            if (stderr == null) {
                err = new ByteArrayConsumptionThread(this);
            } else {
                err = createStreamConsumer(stderr);
            }
            ioHandler = new IoHandler(stdin, stdoutConsumer, err, process);
        } catch (IOException e) {
            throw new StartupException("Could not startup process '" + toString() + "'.", e);
        }
        try {
            startControlThread();
            do {
                ExecutionEvent nextEvent = timeout == null ? eventQueue.poll(MAX_VALUE, HOURS) : eventQueue.poll(timeout, MILLISECONDS);
                if (nextEvent == null) {
                    killCleanUpAndThrowTimeoutException();
                }
                if (nextEvent == PROCESS_EXITED) {
                    break;
                }
                if (nextEvent == EXCEPTION_IN_STREAM_HANDLING) {
                    killProcessCleanup();
                    break;
                }
                throw new RuntimeException("Felix reckons we should never reach this point");
            } while (true);
            List<Throwable> exceptions = ioHandler.joinConsumption();
            if (!exceptions.isEmpty()) {
                throw new IllegalStateException("Exception in stream consumption", exceptions.get(0));
            }
            executionTime = System.currentTimeMillis() - t1;
        } catch (InterruptedException e) {
            killProcessCleanup();
            throw new RuntimeException("Control Thread was interrupted killed process.", e);
        }
    }

    private OutputConsumptionThread createStreamConsumer(Object stream) {
        if (stream instanceof OutputStream) {
            return new StreamCopyConsumptionThread((OutputStream) stream, this);
        } else if (stream instanceof StreamConsumer) {
            return new StreamConsumerConsumptionThread(Proc.this, (StreamConsumer) stream);
        } else {
            throw new RuntimeException("Badness, badness");
        }
    }

    byte[] getErrorBytes() {
        if (err instanceof ByteArrayConsumptionThread) {
            return ((ByteArrayConsumptionThread) err).getBytes();
        }
        // Output stream/stream consumer was provided by user, we don't own it.
        return null;
    }

    public String getErrorString() {
        byte[] bytes = getErrorBytes();
        return bytes != null ? new String(bytes, StandardCharsets.UTF_8) : null;
    }

    private void startControlThread() {
        new Thread(new Runnable() {

            public void run() {
                try {
                    exitValue = process.waitFor();
                    dispatch(PROCESS_EXITED);
                } catch (InterruptedException e) {
                    throw new RuntimeException("", e);
                }
            }
        }).start();
    }

    private void killCleanUpAndThrowTimeoutException() {
        process.destroy();
        ioHandler.cancelConsumption();
        throw new TimeoutException(toString(), timeout);
    }

    private void killProcessCleanup() {
        process.destroy();
        ioHandler.cancelConsumption();
    }

    public void dispatch(ExecutionEvent event) {
        try {
            eventQueue.put(event);
        } catch (InterruptedException e) {
            throw new RuntimeException("${END}", e);
        }
    }

    private String[] concatenateCmdArgs() {
        List<String> cmd = new ArrayList<String>();
        cmd.add(command);
        cmd.addAll(args);
        return cmd.toArray(new String[cmd.size()]);
    }

    @Override
    public String toString() {
        return formatCommandLine(command, args);
    }

    static String formatCommandLine(String command, List<String> args) {
        return command + " " + argsString(args);
    }

    private static String argsString(List<String> args) {
        StringBuffer temp = new StringBuffer();
        for (Iterator<String> stringIterator = args.iterator(); stringIterator.hasNext(); ) {
            String arg = stringIterator.next();
            String escapedArg = naiveShellEscape(arg);
            temp.append(escapedArg);
            if (stringIterator.hasNext()) {
                temp.append(" ");
            }
        }
        return temp.toString();
    }

    private static String naiveShellEscape(String arg) {
        Pattern p = Pattern.compile("\\s");
        Matcher m = p.matcher(arg);
        String escapedArg;
        if (m.find()) {
            itest("randoop", 205).given(m, "35.xml").checkTrue(group());
            itest("randoop", 205).given(m, "107.xml").checkTrue(group());
            itest("randoop", 205).given(m, "93.xml").checkTrue(group());
            itest("randoop", 205).given(m, "86.xml").checkTrue(group());
            itest("randoop", 205).given(m, "115.xml").checkTrue(group());
            itest("randoop", 205).given(m, "50.xml").checkTrue(group());
            itest("dev", 205).given(m, "10.xml").checkTrue(group());
            itest("dev", 205).given(m, "4.xml").checkFalse(group());
            itest("randoop", 205).given(m, "43.xml").checkTrue(group());
            itest("randoop", 205).given(m, "108.xml").checkTrue(group());
            itest("dev", 205).given(m, "3.xml").checkTrue(group());
            itest("randoop", 205).given(m, "94.xml").checkTrue(group());
            itest("randoop", 205).given(m, "87.xml").checkTrue(group());
            itest("dev", 205).given(m, "14.xml").checkFalse(group());
            itest("randoop", 205).given(m, "51.xml").checkTrue(group());
            itest("randoop", 205).given(m, "44.xml").checkTrue(group());
            itest("dev", 205).given(m, "2.xml").checkTrue(group());
            itest("randoop", 205).given(m, "77.xml").checkTrue(group());
            itest("dev", 205).given(m, "15.xml").checkFalse(group());
            itest("randoop", 205).given(m, "88.xml").checkTrue(group());
            itest("dev", 205).given(m, "9.xml").checkFalse(group());
            itest("randoop", 205).given(m, "69.xml").checkTrue(group());
            itest("randoop", 205).given(m, "91.xml").checkTrue(group());
            itest("randoop", 205).given(m, "113.xml").checkTrue(group());
            itest("evosuite", 205).given(m, "25.xml").checkFalse(group());
            itest("randoop", 205).given(m, "34.xml").checkTrue(group());
            itest("randoop", 205).given(m, "36.xml").checkTrue(group());
            itest("randoop", 205).given(m, "45.xml").checkTrue(group());
            itest("dev", 205).given(m, "1.xml").checkTrue(group());
            itest("randoop", 205).given(m, "78.xml").checkTrue(group());
            itest("randoop", 205).given(m, "89.xml").checkTrue(group());
            itest("randoop", 205).given(m, "79.xml").checkTrue(group());
            itest("randoop", 205).given(m, "92.xml").checkTrue(group());
            itest("evosuite", 205).given(m, "24.xml").checkFalse(group());
            itest("randoop", 205).given(m, "68.xml").checkTrue(group());
            itest("randoop", 205).given(m, "114.xml").checkTrue(group());
            itest("randoop", 205).given(m, "60.xml").checkTrue(group());
            itest("dev", 205).given(m, "20.xml").checkTrue(group());
            itest("randoop", 205).given(m, "28.xml").checkFalse(group());
            itest("dev", 205).given(m, "13.xml").checkFalse(group());
            itest("randoop", 205).given(m, "104.xml").checkTrue(group());
            itest("randoop", 205).given(m, "32.xml").checkTrue(group());
            itest("dev", 205).given(m, "7.xml").checkTrue(group());
            itest("randoop", 205).given(m, "61.xml").checkTrue(group());
            itest("randoop", 205).given(m, "54.xml").checkTrue(group());
            itest("dev", 205).given(m, "21.xml").checkFalse(group());
            itest("randoop", 205).given(m, "83.xml").checkTrue(group());
            itest("randoop", 205).given(m, "76.xml").checkTrue(group());
            itest("randoop", 205).given(m, "59.xml").checkTrue(group());
            itest("randoop", 205).given(m, "98.xml").checkTrue(group());
            itest("randoop", 205).given(m, "112.xml").checkTrue(group());
            itest("randoop", 205).given(m, "37.xml").checkTrue(group());
            itest("randoop", 205).given(m, "52.xml").checkTrue(group());
            itest("dev", 205).given(m, "12.xml").checkTrue(group());
            itest("randoop", 205).given(m, "63.xml").checkTrue(group());
            itest("randoop", 205).given(m, "106.xml").checkTrue(group());
            itest("randoop", 205).given(m, "41.xml").checkTrue(group());
            itest("randoop", 205).given(m, "85.xml").checkTrue(group());
            itest("randoop", 205).given(m, "96.xml").checkTrue(group());
            itest("randoop", 205).given(m, "110.xml").checkTrue(group());
            itest("dev", 205).given(m, "5.xml").checkTrue(group());
            itest("randoop", 205).given(m, "74.xml").checkTrue(group());
            itest("randoop", 205).given(m, "39.xml").checkTrue(group());
            itest("evosuite", 205).given(m, "28.xml").checkFalse(group());
            itest("dev", 205).given(m, "11.xml").checkFalse(group());
            itest("randoop", 205).given(m, "100.xml").checkTrue(group());
            itest("randoop", 205).given(m, "64.xml").checkTrue(group());
            itest("randoop", 205).given(m, "49.xml").checkTrue(group());
            itest("randoop", 205).given(m, "72.xml").checkTrue(group());
            itest("dev", 205).given(m, "18.xml").checkTrue(group());
            itest("evosuite", 205).given(m, "27.xml").checkFalse(group());
            itest("randoop", 205).given(m, "65.xml").checkTrue(group());
            itest("randoop", 205).given(m, "80.xml").checkTrue(group());
            itest("randoop", 205).given(m, "101.xml").checkTrue(group());
            itest("randoop", 205).given(m, "48.xml").checkTrue(group());
            itest("randoop", 205).given(m, "55.xml").checkTrue(group());
            itest("dev", 205).given(m, "16.xml").checkTrue(group());
            itest("randoop", 205).given(m, "66.xml").checkTrue(group());
            itest("randoop", 205).given(m, "70.xml").checkTrue(group());
            itest("randoop", 205).given(m, "81.xml").checkTrue(group());
            itest("randoop", 205).given(m, "99.xml").checkTrue(group());
            itest("randoop", 205).given(m, "58.xml").checkTrue(group());
            itest("randoop", 205).given(m, "47.xml").checkTrue(group());
            itest("randoop", 205).given(m, "102.xml").checkTrue(group());
            itest("evosuite", 205).given(m, "26.xml").checkTrue(group());
            itest("randoop", 205).given(m, "56.xml").checkTrue(group());
            itest("randoop", 205).given(m, "67.xml").checkTrue(group());
            itest("dev", 205).given(m, "8.xml").checkFalse(group());
            itest("randoop", 205).given(m, "103.xml").checkTrue(group());
            itest("randoop", 205).given(m, "71.xml").checkTrue(group());
            itest("randoop", 205).given(m, "57.xml").checkTrue(group());
            itest("dev", 205).given(m, "22.xml").checkFalse(group());
            itest("dev", 205).given(m, "17.xml").checkTrue(group());
            itest("randoop", 205).given(m, "46.xml").checkTrue(group());
            itest("randoop", 205).given(m, "75.xml").checkTrue(group());
            itest("randoop", 205).given(m, "111.xml").checkTrue(group());
            itest("randoop", 205).given(m, "97.xml").checkTrue(group());
            itest("randoop", 205).given(m, "90.xml").checkTrue(group());
            itest("randoop", 205).given(m, "82.xml").checkTrue(group());
            itest("randoop", 205).given(m, "38.xml").checkTrue(group());
            itest("dev", 205).given(m, "0.xml").checkFalse(group());
            itest("dev", 205).given(m, "6.xml").checkTrue(group());
            itest("randoop", 205).given(m, "62.xml").checkTrue(group());
            itest("randoop", 205).given(m, "109.xml").checkTrue(group());
            itest("randoop", 205).given(m, "105.xml").checkTrue(group());
            itest("randoop", 205).given(m, "33.xml").checkTrue(group());
            itest("randoop", 205).given(m, "40.xml").checkTrue(group());
            itest("randoop", 205).given(m, "95.xml").checkTrue(group());
            itest("randoop", 205).given(m, "73.xml").checkTrue(group());
            itest("randoop", 205).given(m, "84.xml").checkTrue(group());
            itest("evosuite", 205).given(m, "29.xml").checkFalse(group());
            itest("evosuite", 205).given(m, "23.xml").checkTrue(group());
            itest("dev", 205).given(m, "19.xml").checkFalse(group());
            itest("randoop", 205).given(m, "30.xml").checkFalse(group());
            itest("randoop", 205).given(m, "31.xml").checkTrue(group());
            itest("randoop", 205).given(m, "53.xml").checkTrue(group());
            itest("randoop", 205).given(m, "42.xml").checkTrue(group());
            escapedArg = "'" + arg.replaceAll("'", "'\"'\"'") + "'";
        } else {
            escapedArg = arg;
        }
        return escapedArg;
    }

    public int getExitValue() {
        return exitValue;
    }

    public long getExecutionTime() {
        return executionTime;
    }
}
