package com.tnt.mapper;

import com.tnt.pojo.Users;
import com.tnt.pojo.UsersExample;


import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UsersMapper {
	
	
    //登录
    @Select("select * from users where user_phone=#{user_phone} and user_pass=#{user_pass}")
	Users doLogin(@Param("user_phone") String utel, @Param("user_pass") String upwd);

	//int addUser(Users user);

}