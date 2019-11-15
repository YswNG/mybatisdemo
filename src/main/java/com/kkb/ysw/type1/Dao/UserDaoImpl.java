package com.kkb.ysw.type1.Dao;

import com.kkb.ysw.type1.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class UserDaoImpl implements UserDao{

    private SqlSessionFactory sqlSessionFactory;

    public UserDaoImpl(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory=sqlSessionFactory;
    }

    public User findUserById(int id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("test.findUserById",1);
        return user;
    }
}
