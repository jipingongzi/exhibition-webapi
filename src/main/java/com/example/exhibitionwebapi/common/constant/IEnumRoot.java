package com.example.exhibitionwebapi.common.constant;

public interface IEnumRoot<T> {
    /**
     * 获取值
     *
     * @return
     */
    T value();
    /**
     * 获取描述信息
     *
     * @return
     */
    String description();
}
