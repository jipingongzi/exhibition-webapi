package com.example.exhibitionwebapi.common.constant;

/**
 * 订单状态
 * @author xiaozhen
 * @date 2018-5-17
 */
public enum TicketOrderStatus implements IEnumRoot{

    UN_PAY(1,"待支付"),
    PAYED(2,"已支付"),
    CLOSED(3,"已关闭"),
    COMPLETED(4,"已完成");

    private Integer value;
    private String description;

    TicketOrderStatus(Integer value,String description){
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
