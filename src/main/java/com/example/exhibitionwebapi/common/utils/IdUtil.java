package com.example.exhibitionwebapi.common.utils;

import java.util.UUID;

/**
 * id工具类
 * @author xiaozhen
 * @date 2018-5-17
 */
public final class IdUtil {

    /**
     * 生成32位id字符串
     * @return 32位id字符串
     */
    public static String generate32(){
        UUID uuid = UUID.randomUUID();
        String str = uuid.toString().replace("-", "");
        return str;
    }

    /**
     * 生成8位编码字符串，其中英文字母均为大写
     * @return 8位编码字符串
     */
    public static String generate8Upper(){
        UUID uuid = UUID.randomUUID();
        String str = uuid.toString().replace("-", "").substring(0,8).toUpperCase();
        return str;
    }

    /**
     * 生产4位验证码
     */
    public static String generate4Upper(){
        UUID uuid = UUID.randomUUID();
        String str = uuid.toString().replace("-", "").substring(0,4).toUpperCase();
        return str;
    }
}
