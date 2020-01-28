package utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtils {
	
	private static SqlSessionFactory sqlSessionFactory;
	
	public static SqlSession getSqlSession() {
		String resource = "resources/mybatis-config.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			
			if (sqlSessionFactory==null) {
				sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
			}
			return sqlSessionFactory.openSession();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return null;
		
	}

}
