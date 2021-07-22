package com.tnt.service;

import com.github.pagehelper.PageInfo;
import com.tnt.pojo.Orders;

public interface OrderService {
	//分页查询
	 public PageInfo<Orders> getPageOrdersByPageNum(int pageNum);
	 //根据商品的id查询该商品的信息
	  //public Orders getOrdersByOrdersId(String orderId);
}
