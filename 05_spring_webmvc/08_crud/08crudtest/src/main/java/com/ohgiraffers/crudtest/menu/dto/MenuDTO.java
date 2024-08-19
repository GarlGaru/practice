package com.ohgiraffers.crudtest.menu.dto;

public class MenuDTO {
    private int code;
    private String name;
    private int price;
    private int categoryCode;
    private String orderableStaus;

    public MenuDTO() {
    }

    public MenuDTO(int code, String name, int price, int categoryCode, String orderableStaus) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.categoryCode = categoryCode;
        this.orderableStaus = orderableStaus;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getOrderableStaus() {
        return orderableStaus;
    }

    public void setOrderableStaus(String orderableStaus) {
        this.orderableStaus = orderableStaus;
    }
}
