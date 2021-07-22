package com.tnt.mapper;

import java.util.ArrayList;
import com.tnt.pojo.Orders;

public interface OrdersMapper {
	
	//查询全部的订单信息和订单细节
	
	public ArrayList<Orders> getAllOrders();

}