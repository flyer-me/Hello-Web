 package com.tnt.mapper;

import org.apache.ibatis.annotations.Param;

import com.tnt.pojo.Users;

public interface UpdateMimaMapper {
	int updatemima(String user_phone,String user_pass);
}
