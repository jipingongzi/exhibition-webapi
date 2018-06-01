package com.example.exhibitionwebapi.common.constant;

/**
 * 门票资格类型
 * @author xiaozhen
 * @date 2018-5-30
 */
public enum  TicketQualityChannel implements IEnumRoot{

    ORDER(1,"订单"),ON_SHELF(2,"赠送");

    private Integer value;
    private String description;

    TicketQualityChannel(Integer value,String description){
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
