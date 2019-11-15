package com.kkb.ysw.type2;

import com.kkb.ysw.type2.mapper.UserMapper;
import com.kkb.ysw.type2.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

public class Test2 {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws Exception{
        String resource = "type2/SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void test(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //通过反射创建 mapper 对象 调用mapper的api
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.findUserById(1);
        System.out.println(user);
    }
}
