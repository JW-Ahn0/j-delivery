package com.example.jdeliveryorder.Domain;

public class OrderMenu {
    private Long orderId;
    private int menuId;
    private int OrderMenuCount;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public int getOrderMenuCount() {
        return OrderMenuCount;
    }

    public void setOrderMenuCount(int orderMenuCount) {
        OrderMenuCount = orderMenuCount;
    }
}
