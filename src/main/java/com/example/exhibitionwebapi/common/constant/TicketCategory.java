package com.example.exhibitionwebapi.common.constant;

/**
 * 门票订单类型：1.普通门票订单（可以退款）2.赠送门票订单（不可以退款）
 * @author xiaozhen
 * @dat 2018-5-18
 */
public enum  TicketCategory implements IEnumRoot{

    NORMAL(1,"普通门票订单（可以退款）"),GIFT(2,"赠送门票订单（不可以退款）");

    private Integer value;
    private String description;

    TicketCategory(Integer value,String description){
        this.value = value;
        this.description = description;
    }

    @Override
    public Integer value() {
        return value;
    }

    @Override
    public String description() {
        return description;
    }
}
