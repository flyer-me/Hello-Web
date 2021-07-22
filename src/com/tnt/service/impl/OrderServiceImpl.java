package com.tnt.service.impl;

import java.util.ArrayList;
import org.apache.ibatis.session.SqlSession;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tnt.mapper.OrdersMapper;
import com.tnt.pojo.Orders;
import com.tnt.service.OrderService;
import com.tnt.util.MybatisUtil;

public class OrderServiceImpl implements OrderService {
	@Override
	public PageInfo<Orders> getPageOrdersByPageNum(int pageNum) {
		  SqlSession sqlSession = MybatisUtil.getSqlSession();
		  OrdersMapper ordersMapper = sqlSession.getMapper(OrdersMapper.class);
		  //要在查询前，先设置分页的配置（拦截器： 拦截你的sql语句在sql语句的后面拼接limit）
		  PageHelper.startPage(pageNum, 9);
		  //执行查询功能
		  ArrayList<Orders> list= ordersMapper.getAllOrders();
		  System.out.println(list);
		  //把他交个pageInfo对象
		  PageInfo<Orders> pageInfo = new PageInfo<>(list);
		  return pageInfo;
		 }
		 
	
}
