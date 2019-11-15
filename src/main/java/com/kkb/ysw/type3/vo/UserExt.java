package com.kkb.ysw.type3.vo;

import com.kkb.ysw.type3.pojo.Order;
import com.kkb.ysw.type3.pojo.User;

import java.util.List;

public class UserExt extends User {
    public List<Order> orderList;

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    @Override
    public String toString() {
        return "UserExt{" +
                "orderList=" + orderList +
                ", userId=" + userId +
                ", username='" + username + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
