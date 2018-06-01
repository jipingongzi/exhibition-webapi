package com.example.exhibitionwebapi.common.utils;

import com.example.exhibition.common.constant.IEnumRoot;

/**
 * 枚举工具类
 * @author xiaozhen
 * @date 2018-5-17
 */
public final class EnumUtil {

    public static <T extends IEnumRoot> T getEnum(Class<T> clazz, Object value){
        if (value == null){
            return null;
        }
        T[] enumConstants = clazz.getEnumConstants();
        for (T t : enumConstants) {
            if (t.value().toString().equals(value.toString())) {
                return t;
            }
        }
        return null;
    }
}
