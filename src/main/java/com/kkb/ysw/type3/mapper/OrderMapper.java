package com.kkb.ysw.type3.mapper;

import com.kkb.ysw.type3.pojo.User;
import com.kkb.ysw.type3.vo.OrderExt;
import com.kkb.ysw.type3.vo.OrderExt2;
import com.kkb.ysw.type3.vo.OrderExt3;
import com.kkb.ysw.type3.vo.UserExt;

import java.util.List;

public interface OrderMapper {
    OrderExt2 findOrderExtByOrderId(int orderId);

    OrderExt findOrderExtList();

    List<UserExt> findUserOrderByOneToMore();
}
