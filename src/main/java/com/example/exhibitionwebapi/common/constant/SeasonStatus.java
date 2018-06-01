package com.example.exhibitionwebapi.common.constant;

public enum  SeasonStatus implements IEnumRoot{

    REGULAR(1,"正常营业"),FULL(2,"满员"),CLOSE(3,"闭馆"),DEPRECATED(4,"已过期"),REMOVE(5,"已删除");

    private Integer value;
    private String description;

    SeasonStatus(Integer value,String description){
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
