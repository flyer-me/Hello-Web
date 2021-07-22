package com.tnt.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tnt.pojo.Goods;
import com.tnt.pojo.GoodsType;
import com.tnt.service.GoodsService;
import com.tnt.service.impl.GoodsServiceImpl;

import com.tnt.pojo.*;
import com.tnt.util.*;

/**
 * 查询商品信息
 * lh
 */
@WebServlet("/getGoodsList")
public class GetGoodsListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private GoodsService goodsService = new GoodsServiceImpl();
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置请求中的编码格式为UTF-8
		request.setCharacterEncoding("UTF-8");	
	
		//获取请求中的参数
		String goods_name = request.getParameter("goods_name");
		System.out.println(goods_name);
		//String tid = request.getParameter("tid");
		//System.out.println(goodsName+"\t"+tid);
		//调用service层对象的查询商品的方法
		//创建商品对象封装查询条件
		Goods goods = new Goods();
		//判断查询的条件是否为空,不为空设置给参数对象
		if(goods_name != null && !"".equals(goods_name)){
			goods.setGoods_name(goods_name);
		}
		/*if(tid != null && !"-1".equals(tid)){
			GoodsType goodsType = new GoodsType();
			goodsType.setTypeId(Integer.valueOf(tid));
			goods.setGoodstype(goodsType);
		}*/
		
		
		
		//获取请求中的当前页
		String page = request.getParameter("page");
		//获取总记录数（查询条件）	
		int totalRows = goodsService.getProductCount(goods);
		//创建分页对象
		PageUtil pageUtil = new PageUtil(page, totalRows, 5);	
		//调用Service层对象的查询方法把查询条件的对象传给Service层
		List<Goods> plist = goodsService.getGoodsList(goods,pageUtil);
		for (Goods goods2 : plist) {
			System.out.println(goods);
		}
		 //查询所有的商品类型
		 List<GoodsType> tlist = goodsService.getTypeList();
		//商品的列表jsp页面展示
		//把需要再jsp页面展示的数据放置到request作用域中，一次请求
		//session作用域，一次会话
		request.setAttribute("plist", plist);
		//把查询条件的对象设置到request的作用域中
		request.setAttribute("goods", goods);
		//把商品类型的集合添加到作用域中
		request.setAttribute("tlist", tlist);		
		//把分页对象设置到作用域中
		request.setAttribute("page", pageUtil);
		
		//跳转到商品展示页面
		request.getRequestDispatcher("/list.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
