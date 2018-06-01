package com.example.exhibitionwebapi.common.constant;

/**
 * 支付类型
 */
public enum  PayType implements IEnumRoot{

    WE_CHAT_H5(1,"微信公众号h5支付");

    private Integer value;
    private String description;

    PayType(Integer value,String description){
        this.value = value;
        this.description = description;
    }
    public Integer value(){
        return value;
    }
    public String description(){
        return description;
    }
}
