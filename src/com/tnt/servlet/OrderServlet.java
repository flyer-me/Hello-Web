package com.tnt.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.github.pagehelper.PageInfo;
import com.tnt.pojo.Orders;
import com.tnt.service.OrderService;
import com.tnt.service.impl.OrderServiceImpl;


@WebServlet("/OrderServlet.do")
public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	           //获取当前的页数
			  int newPageNum = 1;//默认第一页
			  String pageNum = request.getParameter("pageNum");
			  //如果获取的pageNum不为空，证明用户传递过来了页数，如果为空则第一次请求，默认为第一页即可
			  if(pageNum != null){
				 //https://gitee.com/xinyikong_666/jsp-servlet-online-mall
				 //使用用户传递过来的页数
				  newPageNum = Integer.parseInt(pageNum);
			  }
			  OrderService service = new OrderServiceImpl();
		      PageInfo<Orders> pageInfo = service.getPageOrdersByPageNum(newPageNum);
		      //如果使用jstl形式进行展示 把数据放入到request中，然后转发到show.jsp页面中
		      request.setAttribute("pageInfo", pageInfo);
		      request.getRequestDispatcher("/allOrder.jsp").forward(request, response);
		      	      	     
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}