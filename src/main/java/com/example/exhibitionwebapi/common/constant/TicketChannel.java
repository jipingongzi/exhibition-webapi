package com.example.exhibitionwebapi.common.constant;

/**
 * 门票渠道
 */
public enum  TicketChannel implements IEnumRoot{

    OFFICIAL(1,"官方");

    private Integer value;
    private String description;

    TicketChannel(Integer value,String description){
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
