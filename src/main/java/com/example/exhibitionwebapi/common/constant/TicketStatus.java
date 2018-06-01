package com.example.exhibitionwebapi.common.constant;

/**
 * 门票状态
 * @author xiaozhen
 * @date 2018-5-21
 */
public enum TicketStatus implements IEnumRoot{

    OFF_SHELF(0,"下架"),ON_SHELF(1,"上架");

    private Integer value;
    private String description;

    TicketStatus(Integer value,String description){
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
