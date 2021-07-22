package com.tnt.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tnt.pojo.Users;
import com.tnt.service.UpdateMimaService;

/**
 * 
 */
@WebServlet("/updateMima")
public class UpdateMimaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UpdateMimaServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		Integer user_id = Integer.parseInt(request.getParameter("user_id"));
		String user_phone = request.getParameter("user_phone");
		String user_name = request.getParameter("user_name");
		String user_address = request.getParameter("user_address");
		String user_pass = request.getParameter("user_pass");
		Users users = new Users(user_id, user_name, user_pass, user_address, user_phone);
		boolean flag = UpdateMimaService.updateMima(users);
		if(flag) {//跳转商品列表得到展示页面
			      //使用重定向跳转到商品列表的查询的servlet
			response.sendRedirect(request.getContextPath()+"/Member-xiumisuccess.jsp");
		}
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
