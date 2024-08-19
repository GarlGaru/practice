package com.ohgiraffers.chap00intr.section01.problem;

public class Menu {
    private int menuCode;
    private String MenuName;
    private int menuPrice;
    private int categoryCode;
    private String orderableStatus;

    public Menu() {
    }

    public Menu(String menuName, int menuCode, int menuPrice, int categoryCode, String orderableStatus) {
        MenuName = menuName;
        this.menuCode = menuCode;
        this.menuPrice = menuPrice;
        this.categoryCode = categoryCode;
        this.orderableStatus = orderableStatus;
    }

    public int getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(int menuCode) {
        this.menuCode = menuCode;
    }

    public String getMenuName() {
        return MenuName;
    }

    public void setMenuName(String menuName) {
        MenuName = menuName;
    }

    public int getMenuPrice() {
        return menuPrice;
    }

    public void setMenuPrice(int menuPrice) {
        this.menuPrice = menuPrice;
    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getOrderableStatus() {
        return orderableStatus;
    }

    public void setOrderableStatus(String orderableStatus) {
        this.orderableStatus = orderableStatus;
    }


    @Override
    public String toString() {
        return "Menu{" +
                "menuCode=" + menuCode +
                ", MenuName='" + MenuName + '\'' +
                ", menuPrice=" + menuPrice +
                ", categoryCode=" + categoryCode +
                ", orderableStatus='" + orderableStatus + '\'' +
                '}';
    }
}
