package com.kkb.ysw.type3.mapper;

import com.kkb.ysw.type3.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User findUserById(int id);

    int insert(User user);
}
