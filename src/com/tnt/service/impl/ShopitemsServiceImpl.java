package com.tnt.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.tnt.mapper.ShopitemsMapper;
import com.tnt.pojo.Shopitems;
import com.tnt.service.ShopitemsService;
import com.tnt.util.MybatisUtil;

public class ShopitemsServiceImpl implements ShopitemsService {

	@Override
	public int insertCart(Shopitems shopitems) {
		// TODO Auto-generated method stub
		return 0;
	}

	//查询购物车内所有商品信息
	@Override
	public List<Shopitems> getShopitems() {
		//1.获取sqlsession
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		//2.获取mapper的接口对象
		ShopitemsMapper shopitemsMapper = sqlSession.getMapper(ShopitemsMapper.class);
		//3.调用mapper中查询商品的方法
		List<Shopitems> plist = shopitemsMapper.getShopitemsList();
		//4.关闭sqlsession
		MybatisUtil.closeSqlSession(sqlSession);
		return plist;
	}

	
	//多余 
	@Override
	public List<Shopitems> getShopitemsList() {
		//1.获取sqlsession
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		//2.获取mapper的接口对象
		ShopitemsMapper productMapper = sqlSession.getMapper(ShopitemsMapper.class);
		//3.调用mapper中查询商品的方法
		List<Shopitems> plist = productMapper.getShopitemsList();
		//4.关闭sqlsession
		MybatisUtil.closeSqlSession(sqlSession);
		return plist;
	}

}
