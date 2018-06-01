package com.example.exhibitionwebapi.web.vo;

import lombok.Data;

@Data
public class ResponseVo<T>{

    /*
    * 请求是否成功
    */
    private boolean success;
    /**
     * 返回的业务对象
     */
    private T data;
    /**
     * 当success等于false的时候error用于描述错误信息
     */
    private String error;

    public ResponseVo(boolean success, T data) {
        this.success = success;
        this.data = data;
    }

    public ResponseVo(boolean success, String error) {
        this.success = success;
        this.error = error;
    }
}
