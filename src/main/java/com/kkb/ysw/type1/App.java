package com.kkb.ysw.type1;

import com.kkb.ysw.type1.Dao.UserDao;
import com.kkb.ysw.type1.Dao.UserDaoImpl;
import com.kkb.ysw.type1.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

/**
 * Hello world!
 *
 */
public class App 
{
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws Exception{
        // 加载全局配置文件（同时把映射文件也加载了）
        String resource = "type1/SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        // sqlsessionFactory需要通过sqlsessionFactoryBuilder读取全局配置文件信息之后
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void testFindUserById() {
        UserDao dao = new UserDaoImpl(sqlSessionFactory);
        User user = dao.findUserById(1);
        System.out.println(user);
    }
}
