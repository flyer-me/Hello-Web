package com.tnt.service;

import com.tnt.pojo.Users;

public interface UserService {
	//用户登录
	public Users doLogin(String user_phone, String user_pass);
	//注册用户
	//public Users addUser(String user_phone, String user_pass);

}
