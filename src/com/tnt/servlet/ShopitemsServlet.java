package com.tnt.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.tnt.pojo.Shopitems;
import com.tnt.service.ShopitemsService;
import com.tnt.service.impl.ShopitemsServiceImpl;

/**
 * 添加商品入购物车
 */
//请求映射的路径
@WebServlet("/getShopitemsList")
public class ShopitemsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ShopitemsService shopitemsService = new ShopitemsServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//调用Service层对象的查询商品的方法
		List<Shopitems> plist = shopitemsService.getShopitemsList();
		//商品的列表放到jsp页面展示
		//把需要在jsp页面展示的数据放置到request作用域中，一次请求
		//session作用域，一次会话
		request.setAttribute("plist", plist);
		//跳转
		request.getRequestDispatcher("/Cart.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}


}
