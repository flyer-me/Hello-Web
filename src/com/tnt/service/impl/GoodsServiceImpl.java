package com.tnt.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.tnt.mapper.GoodsMapper;
import com.tnt.pojo.Goods;
import com.tnt.pojo.GoodsType;
import com.tnt.service.GoodsService;
import com.tnt.util.MybatisUtil;
import com.tnt.util.PageUtil;

import com.tnt.pojo.*;
import com.tnt.mapper.*;

public class GoodsServiceImpl implements GoodsService {

	@Override
	public int getProductCount(Goods goods) {
		// 1.获取SqlSession
				SqlSession sqlSession = MybatisUtil.getSqlSession();
				//2.获取mapper的接口对象
				GoodsMapper productMapper = sqlSession.getMapper(GoodsMapper.class);
				//3.调用mapper中查询商品类型的方法
				int conut = productMapper.getGoodsCount(goods);
				//4.关闭SqlSession
				MybatisUtil.closeSqlSession(sqlSession);
				return conut;
	}

	@Override
	public List<Goods> getGoodsList(Goods goods) {
		// 1.获取SqlSession
				SqlSession sqlSession = MybatisUtil.getSqlSession();
				//2.获取mapper的接口对象
				GoodsMapper goodsMapper = sqlSession.getMapper(GoodsMapper.class);
				//3.调用mapper中查询商品的方法
				List<Goods> plist = goodsMapper.getGoodsList(goods);
				//4.关闭SqlSession
				MybatisUtil.closeSqlSession(sqlSession);
				return plist;
	}

	@Override
	public List<Goods> getGoodsList(Goods goods, PageUtil pageUtil) {
		// 1.获取SqlSession
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		//2.获取mapper的接口对象
		GoodsMapper goodsMapper = sqlSession.getMapper(GoodsMapper.class);
		//3.调用mapper中查询商品的方法
		List<Goods> plist = goodsMapper.getGoodsList(goods, pageUtil);
		//4.关闭SqlSession
		MybatisUtil.closeSqlSession(sqlSession);
		return plist;
	}

	@Override
	public List<GoodsType> getTypeList() {
		// 1.获取SqlSession
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		//2.获取mapper的接口对象
		GoodsMapper productMapper = sqlSession.getMapper(GoodsMapper.class);
		//3.调用mapper中查询商品类型的方法
		List<GoodsType> tlist = productMapper.getTypeList();
		//4.关闭SqlSession
		MybatisUtil.closeSqlSession(sqlSession);
		return tlist;
	}

	@Override
	public List<Goods> getAllGoodsList() {
		// 1.获取SqlSession
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		//2.获取mapper的接口对象
		GoodsMapper goodsMapper = sqlSession.getMapper(GoodsMapper.class);
		//3.调用mapper中查询商品的方法
		List<Goods> plist = goodsMapper.getAllGoodsList();
		//4.关闭SqlSession
		MybatisUtil.closeSqlSession(sqlSession);
		return plist;
	}

	//根据商品信息查询id
		@Override
		public Goods getProductInfoById(String goods_id) {
			// 1.获取SqlSession
			SqlSession sqlSession = MybatisUtil.getSqlSession();
			//2.获取mapper的接口对象
			GoodsMapper goodsMapper = sqlSession.getMapper(GoodsMapper.class);
			//3.调用mapper中查询商品类型的方法
			Goods goods = goodsMapper.getGoodsInfoById(goods_id);
			//4.关闭SqlSession
			MybatisUtil.closeSqlSession(sqlSession);
			return goods;
		}
}
