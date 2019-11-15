package com.kkb.ysw.type3;

import com.kkb.ysw.type3.mapper.OrderMapper;
import com.kkb.ysw.type3.mapper.UserMapper;
import com.kkb.ysw.type3.pojo.User;
import com.kkb.ysw.type3.vo.OrderExt;
import com.kkb.ysw.type3.vo.OrderExt2;
import com.kkb.ysw.type3.vo.OrderExt3;
import com.kkb.ysw.type3.vo.UserExt;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class Test3 {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init()throws Exception{
        String resource = "type3/SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void testFindUserById(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.findUserById(1);
        System.out.println(user);
    }

    @Test
    public void testInsertUser(){
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("zhou qi");
        user.setAge(25);
        user.setAddress("bei jing");
        mapper.insert(user);
//        int id = mapper.insertUser(user);
//        System.out.println(id);
    }

    @Test
    public void testOneToOneByResultMap(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
        OrderExt2 orderExt2= mapper.findOrderExtByOrderId(3);
        System.out.println(orderExt2);
        sqlSession.close();
    }

    @Test
    public void testOneToMoreByResultMap(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
        List<UserExt> userExtList = mapper.findUserOrderByOneToMore();
        for(UserExt userExt:userExtList ){
            System.out.println(userExt);
        }
        sqlSession.close();
    }

}
