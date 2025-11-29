package com.atzsh.mybatis.util;



import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author 张 书航
 */
public class SqlSessionTool {
    public static SqlSession getSqlSession() throws IOException {
        SqlSession sqlSession = null;
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory builder = new SqlSessionFactoryBuilder().build(is);
        sqlSession = builder.openSession();
        return sqlSession;
    }
}
