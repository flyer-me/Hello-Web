package com.tnt.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tnt.pojo.Goods;
import com.tnt.service.GoodsService;
import com.tnt.service.impl.GoodsServiceImpl;


/**
 * 根据商品id查询商品（查询商品详情）
 * lh
 */
@WebServlet("/getGoodsInfoById")
public class GetGoodsInfoByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private GoodsService goodsService = new GoodsServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置请求中的编码格式为UTF-8
		request.setCharacterEncoding("UTF-8");
		//获取请求中的商品id
		String goods_id = request.getParameter("goods_id");  
		System.out.println(goods_id);
		//调用业务层的查询
		Goods goods = goodsService.getProductInfoById(goods_id);
		request.setAttribute("goods", goods);  
		//转发
		request.getRequestDispatcher("/details.jsp").forward(request, response);
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
