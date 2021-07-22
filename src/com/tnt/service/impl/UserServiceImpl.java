package com.tnt.service.impl;

import com.tnt.mapper.UsersMapper;
import com.tnt.pojo.Users;
import com.tnt.service.UserService;
import com.tnt.util.MybatisUtil;

import org.apache.ibatis.session.SqlSession;



public class UserServiceImpl implements UserService {



	@Override
	public Users doLogin(String user_phone, String user_pass) {
		//sqlSession
				SqlSession sqlSession = MybatisUtil.getSqlSession();
				 //mapper
				UsersMapper usermapper = (UsersMapper) sqlSession.getMapper(UsersMapper.class);
				//mapper
				Users user = usermapper.doLogin(user_phone, user_pass);
				//sqlSession
				MybatisUtil.closeSqlSession(sqlSession);
				//
				return user;
	}

	/*
	@Override
	public Users addUser(String user_phone, String user_pass) {
		//sqlSession
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		 //mapper
		UsersMapper usermapper = (UsersMapper) sqlSession.getMapper(UsersMapper.class);
		//mapper
		Users user = usermapper.addUser(user_phone, user_pass);
		//sqlSession
		MybatisUtil.closesqlSqlSession(sqlSession);
		//
		return user;
		*/
	}







	


	


