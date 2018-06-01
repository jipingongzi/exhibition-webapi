package com.example.exhibitionwebapi.common.constant;

/**
 * 资格状态
 * @author xiaozhen
 * @date 2018-5-30
 */
public enum TicketQualityStatus implements IEnumRoot{

    TO_BE_USED(1,"待使用"),
    RESERVED(2,"已预约"),
    USED(2,"已使用"),
    DEPRECATED(3,"已过期"),
    APPLY_REFUND(4,"退票审核中"),
    REFUNDED(5,"已退票");

    private Integer value;
    private String description;

    TicketQualityStatus(Integer value,String description){
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
