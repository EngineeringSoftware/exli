/*
 * Copyright (c) 2010-2022 Mark Allen, Norbert Bartels.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.restfb.util;

import static com.restfb.logging.RestFBLogger.UTILS_LOGGER;
import java.text.ParseException;
import java.util.Date;
import java.util.Optional;
import org.inlinetest.Here;
import static org.inlinetest.Here.group;

/**
 * A collection of date-handling utility methods.
 *
 * @author <a href="http://restfb.com">Mark Allen</a>
 * @since 1.6
 */
public final class DateUtils {

    /**
     * Facebook "long" date format (IETF RFC 3339). Example: {@code 2010-02-28T16:11:08+0000}
     */
    public static final String FACEBOOK_LONG_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ssZ";

    /**
     * Facebook "long" date format (IETF RFC 3339) without a timezone component. Example: {@code 2010-02-28T16:11:08}
     */
    public static final String FACEBOOK_LONG_DATE_FORMAT_WITHOUT_TIMEZONE = "yyyy-MM-dd'T'HH:mm:ss";

    /**
     * Facebook "long" date format (IETF RFC 3339) without a timezone or seconds component. Example:
     * {@code 2010-02-28T16:11}
     */
    public static final String FACEBOOK_LONG_DATE_FORMAT_WITHOUT_TIMEZONE_OR_SECONDS = "yyyy-MM-dd'T'HH:mm";

    /**
     * Facebook short date format. Example: {@code 04/15/1984}
     */
    public static final String FACEBOOK_SHORT_DATE_FORMAT = "MM/dd/yyyy";

    /**
     * Facebook alternate short date format. Example: {@code 2012-09-15}
     */
    public static final String FACEBOOK_ALTERNATE_SHORT_DATE_FORMAT = "yyyy-MM-dd";

    /**
     * Facebook month-year only date format. Example: {@code Example: 2007-03}
     */
    public static final String FACEBOOK_MONTH_YEAR_DATE_FORMAT = "yyyy-MM";

    /**
     * DateFormatStrategy (default: SimpleDateFormat).
     */
    private static DateFormatStrategy strategy = new SimpleDateFormatStrategy();

    /**
     * Prevents instantiation.
     */
    private DateUtils() {
        throw new IllegalStateException("DateUtils must not be instantiated");
    }

    /**
     * Returns a Java representation of a Facebook "long" {@code date} string, or the number of seconds since the epoch.
     * <p>
     * Supports dates with or without timezone information.
     *
     * @param date
     *          Facebook {@code date} string.
     * @return Java date representation of the given Facebook "long" {@code date} string or {@code null} if {@code date}
     *         is {@code null} or invalid.
     */
    public static Date toDateFromLongFormat(String date) {
        if (isNull(date)) {
            return null;
        }
        // Is this an all-digit date? Then assume it's the "seconds since epoch"
        // variant
        if (date.trim().matches("\\d+")) {
            new Here("Unit", 97).given(date, "1649504517").checkTrue(group());
            new Here("Unit", 97).given(date, "2014-09-20T06:44:09+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T08:43:40+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2015-12-21T12:06:00+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-08-26T20:55:07+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2012-04-10T17:41:10+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T08:48:29+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2013-06-05T07:15:51+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T06:08:56+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2017-09-18T15:59:46+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T08:11:42+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T07:02:11+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T05:59:30+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2016-03-11T23:14:30+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T09:54:19+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T12:30:00+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T08:11:17+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T08:00:24+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2017-09-18T17:19:53+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T06:43:28+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T10:10:59+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "junk").checkFalse(group());
            new Here("Unit", 97).given(date, "2013-02-17T17:51:20+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T05:12:24+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T10:24:48+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2015-12-09T08:23:33+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T07:47:04+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T10:35:54+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T10:23:31+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T03:43:42+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "1347235328").checkTrue(group());
            new Here("Unit", 97).given(date, "2014-09-20T05:45:31+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "1563217616").checkTrue(group());
            new Here("Unit", 97).given(date, "2014-09-20T09:20:47+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T12:07:51+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T05:15:44+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2012-04-10T17:38:58+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T10:56:29+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T06:35:53+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2015-11-29T11:03:21+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T05:43:32+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2015-11-29T11:09:46+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T11:27:07+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2011-12-22T21:00:00").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T06:09:24+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T09:59:59+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T06:44:06+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T05:14:53+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "1331784257").checkTrue(group());
            new Here("Unit", 97).given(date, "2014-09-20T11:43:40+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T07:29:32+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-08-28T19:35:39+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "1641733200").checkTrue(group());
            new Here("Unit", 97).given(date, "2014-09-20T00:40:02+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T00:24:17+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T05:41:13+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T06:07:06+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2011-12-22T21:00:00+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T05:19:18+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2010-10-29T22:44:35+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T06:12:10+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T06:06:12+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T04:32:05+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T06:52:58+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2010-09-14T22:41:25+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T06:19:18+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T09:09:56+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T10:16:41+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T07:53:25+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "1352419328").checkTrue(group());
            new Here("Unit", 97).given(date, "2014-09-20T06:26:52+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T12:59:48+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T02:30:00+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T11:00:32+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T01:49:07+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T09:55:51+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T09:13:29+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-08-26T20:55:38+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T06:50:00+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T02:13:00+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T05:10:33+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T10:40:12+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T06:16:43+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T01:48:26+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2010-09-15T16:09:21+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T11:52:15+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T09:46:42+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T10:36:43+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T12:35:58+0000").checkFalse(group());
            new Here("Randoop", 97).given(date, "message").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T07:00:25+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T09:50:11+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "1561330800").checkTrue(group());
            new Here("Unit", 97).given(date, "2014-09-20T07:25:16+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T10:52:56+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T07:50:05+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T00:36:44+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T11:53:22+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T08:35:00+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T04:01:30+0000").checkFalse(group());
            new Here("Unit", 97).given(date, "2014-09-20T05:09:23+0000").checkFalse(group());
            return new Date(Long.parseLong(date) * 1000L);
        }
        Date parsedDate = toDateWithFormatString(date, FACEBOOK_LONG_DATE_FORMAT);
        // Fall back to variant without timezone if the initial parse fails
        if (isNull(parsedDate)) {
            parsedDate = toDateWithFormatString(date, FACEBOOK_LONG_DATE_FORMAT_WITHOUT_TIMEZONE);
        }
        // Fall back to variant without seconds if secondary parse fails
        if (isNull(parsedDate)) {
            parsedDate = toDateWithFormatString(date, FACEBOOK_LONG_DATE_FORMAT_WITHOUT_TIMEZONE_OR_SECONDS);
        }
        return parsedDate;
    }

    private static boolean isNull(Object date) {
        return date == null;
    }

    /**
     * Returns a Java representation of a Facebook "short" {@code date} string.
     *
     * @param date
     *          Facebook {@code date} string.
     * @return Java date representation of the given Facebook "short" {@code date} string or {@code null} if {@code date}
     *         is {@code null} or invalid.
     */
    public static Date toDateFromShortFormat(String date) {
        if (isNull(date)) {
            return null;
        }
        Date parsedDate = toDateWithFormatString(date, FACEBOOK_SHORT_DATE_FORMAT);
        // Fall back to variant if initial parse fails
        if (isNull(parsedDate)) {
            parsedDate = toDateWithFormatString(date, FACEBOOK_ALTERNATE_SHORT_DATE_FORMAT);
        }
        return parsedDate;
    }

    /**
     * Returns a Java representation of a Facebook "month-year" {@code date} string.
     *
     * @param date
     *          Facebook {@code date} string.
     * @return Java date representation of the given Facebook "month-year" {@code date} string or {@code null} if
     *         {@code date} is {@code null} or invalid.
     */
    public static Date toDateFromMonthYearFormat(String date) {
        if (isNull(date)) {
            return null;
        }
        if ("0000-00".equals(date)) {
            return null;
        }
        return toDateWithFormatString(date, FACEBOOK_MONTH_YEAR_DATE_FORMAT);
    }

    /**
     * Returns a String representation of a {@code date} object
     *
     * @param date
     *          as Date
     * @return String representation of a {@code date} object. The String is in the form {@code 2010-02-28T16:11:08}
     */
    public static String toLongFormatFromDate(Date date) {
        return Optional.ofNullable(date).map(strategy.formatFor(FACEBOOK_LONG_DATE_FORMAT_WITHOUT_TIMEZONE)::format).orElse(null);
    }

    /**
     * Returns a <strong>short</strong> String representation of a {@code date} object
     *
     * @param date
     *          as Date
     * @return String representation of a {@code date} object. The String is in the form {@code 2019-06-14}
     */
    public static String toShortFormatFromDate(Date date) {
        return Optional.ofNullable(date).map(strategy.formatFor(FACEBOOK_ALTERNATE_SHORT_DATE_FORMAT)::format).orElse(null);
    }

    /**
     * Returns a Java representation of a {@code date} string.
     *
     * @param date
     *          Date in string format.
     * @return Java date representation of the given {@code date} string or {@code null} if {@code date} is {@code null}
     *         or invalid.
     */
    private static Date toDateWithFormatString(String date, String format) {
        if (isNull(date)) {
            return null;
        }
        try {
            return strategy.formatFor(format).parse(date);
        } catch (ParseException e) {
            UTILS_LOGGER.trace("Unable to parse date '{}' using format string '{}': {}", date, format, e);
            return null;
        }
    }

    /**
     * get the current DateFormatStrategy.
     *
     * @return the current DateFormatStrategy
     */
    public static DateFormatStrategy getDateFormatStrategy() {
        return strategy;
    }

    /**
     * set the {@link DateFormatStrategy}.
     *
     * default value: {@link SimpleDateFormatStrategy}
     *
     * @param dateFormatStrategy
     *          the used {@link DateFormatStrategy}
     */
    public static void setDateFormatStrategy(DateFormatStrategy dateFormatStrategy) {
        strategy = dateFormatStrategy;
    }
}
