package com.example.exhibitionwebapi.common.utils;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

/**
 * 时间工具类
 * @author xiaozhen
 * @date 2018-5-18
 */
public final class DateUtil {

    private static SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private static SimpleDateFormat sDateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    /**
     * localDateTime转换date
     * @param localDateTime 时间参数
     * @return date
     */
    public static Date toDate(LocalDateTime localDateTime){
        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime zdt = localDateTime.atZone(zoneId);
        Date date = Date.from(zdt.toInstant());
        return date;
    }

    public static LocalDateTime toLocalDateTime(Date date){
        Instant instant = date.toInstant();
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDateTime localDateTime = instant.atZone(zoneId).toLocalDateTime();
        return localDateTime;
    }

    public static Date toDate(String dateString,String pattern){
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        ParsePosition pos = new ParsePosition(0);
        Date date = formatter.parse(dateString, pos);
        return date;
    }

    public static String format(String pattern,Date date){
        SimpleDateFormat sDateTimeFormat = new SimpleDateFormat(pattern);
        String dateFormat = sDateTimeFormat.format(date);
        return dateFormat;
    }
    public static String formatDate(Date date){
        String dateFormat = sDateFormat.format(date);
        return dateFormat;
    }
    public static String formatDateTime(Date date){
        String dateFormat = sDateTimeFormat.format(date);
        return dateFormat;
    }
}
