package com.kkb.ysw.type3.pojo;

public class Order {
    public int orderId;
    public String productName;
    public int userId;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", productName='" + productName + '\'' +
                ", userId=" + userId +
                '}';
    }
}
