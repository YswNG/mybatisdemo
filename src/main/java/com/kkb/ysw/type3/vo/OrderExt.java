package com.kkb.ysw.type3.vo;

import com.kkb.ysw.type3.pojo.Order;
import com.kkb.ysw.type3.pojo.User;

import java.util.List;

public class OrderExt extends Order {
    public List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }


}
