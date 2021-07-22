package com.tnt.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tnt.pojo.Goods;
import com.tnt.service.GoodsService;
import com.tnt.service.impl.GoodsServiceImpl;

/**
 * 首页展示所有商品列表
 * lh
 */
@WebServlet("/getAllGoodsList")
public class GetAllGoodsListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private GoodsService goodsService = new GoodsServiceImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置请求中的编码格式为UTF-8
		request.setCharacterEncoding("UTF-8");
		//调用Service层对象的查询方法把查询条件的对象传给Service层
		List<Goods> plist = goodsService.getAllGoodsList();
		//商品的列表jsp页面展示
		//把需要再jsp页面展示的数据放置到request作用域中，一次请求
		//session作用域，一次会话
		request.setAttribute("plist", plist);
		//跳转到商品展示页面
		//跳转到商品展示页面
		request.getRequestDispatcher("/list.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
