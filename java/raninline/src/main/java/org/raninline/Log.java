package org.raninline;

/**
 * Utility class for logging.
 */
public class Log {

    public enum Level {
        DEBUG("DEBUG", 2),
        INFO("INFO", 1),
        ERROR("ERROR", 0);

        private final String name;
        private final int order;

        Level(String name, int order) {
            this.name = name;
            this.order = order;
        }
    }

    private static Level level = Level.DEBUG;

    public static void setLevel(String level) {
        switch (level) {
        case "debug":
            setLevel(Level.DEBUG);
            break;
        case "info":
            setLevel(Level.INFO);
            break;
        case "error":
            setLevel(Level.ERROR);
            break;
        default:
            throw new RuntimeException("Unrecognized logging level: " + level + "!");
        }
    }

    public static void setLevel(Level newLevel) {
        level = newLevel;
    }

    public static Level getLevel() {
        return level;
    }

    public static void debug(Object msg) {
        log(msg, Level.DEBUG);
    }

    public static void info(Object msg) {
        log(msg, Level.INFO);
    }

    public static void error(Object msg) {
        log(msg, Level.ERROR);
    }

    private static void log(Object msg, Level logLevel) {
        if (level.order < logLevel.order) {
            return;
        }
        System.out.println(msg);
    }
}