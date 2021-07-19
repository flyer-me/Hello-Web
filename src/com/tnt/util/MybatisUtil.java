package com.tnt.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 功能描述：Mybatis的工具类：提供获取Sqlsession的方法，关闭sqlsession的方法
 * @author tym
 *
 */
public class MybatisUtil {
	private static SqlSessionFactory sqlSessionFactory;
	static{
		//获取sqlSectionfactory，只需要加载一次
		try {
			Reader reader = Resources.getResourceAsReader("mybatis_config.xml");
			SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
			sqlSessionFactory = sqlSessionFactoryBuilder.build(reader);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 功能描述：获取sqlSession对象的方法
	 * 
	 */
	public static SqlSession getSqlSesion(){
		return sqlSessionFactory.openSession();
	}
	/**
	 * 功能描述：关闭sqlSession的方法
	 * @param sqlSession
	 */
	public static void closesqlSqlSession(SqlSession sqlSession){
		if(sqlSession!=null){
			sqlSession.close();
		}
	}
}










