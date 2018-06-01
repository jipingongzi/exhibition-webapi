package com.example.exhibitionwebapi.common.constant;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 场次默认配置
 * @author xiaozhen
 * @date 2018-5-23
 */
public final class SeasonSetting {

    /**
     * 默认公益日(满员)：每周星期几
     */
    public static final int[] FULL_DAY_WEEK = {};
    /**
     * 默认公益日(满员)：每月几号
     */
    public static final int[] FULL_DAY_MOUTH = {};
    /**
     * 默认闭馆日：每周星期几
     */
    public static final int[] CLOSE_DAY_WEEK = {};
    /**
     * 默认闭馆日(满员)：每月几号
     */
    public static final int[] CLOSE_DAY_MOUTH = {};
    /**
     * 默认场次时间段
     */
    public static final List<Map<String,String>> TIME_LINES = Arrays.asList(
        new HashMap(){{
            put(START_TIME,"10:00:00");
            put(END_TIME,"11:30:00");
            put(VACANCY_NUMBER,"210");
        }},
        new HashMap(){{
            put(START_TIME,"14:00:00");
            put(END_TIME,"15:30:00");
            put(VACANCY_NUMBER,"210");
        }},
        new HashMap(){{
            put(START_TIME,"16:00:00");
            put(END_TIME,"17:30:00");
            put(VACANCY_NUMBER,"210");
        }}
    );
    public static final String START_TIME = "startTime";
    public static final String END_TIME = "endTime";
    public static final String VACANCY_NUMBER = "vacancyNumber";
    public static final String TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
}

