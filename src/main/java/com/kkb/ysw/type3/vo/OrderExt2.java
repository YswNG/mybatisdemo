package com.kkb.ysw.type3.vo;

import com.kkb.ysw.type3.pojo.Order;

public class OrderExt2 extends Order {
    public String username;
    public int age;
    public String address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "OrderExt2{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", orderId=" + orderId +
                ", productName='" + productName + '\'' +
                ", userId=" + userId +
                '}';
    }
}
