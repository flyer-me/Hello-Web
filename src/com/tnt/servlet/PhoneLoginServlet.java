package com.tnt.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.tnt.service.impl.UserServiceImpl;
import com.tnt.service.UserService;
import com.tnt.pojo.Users;




@WebServlet("/phonelogin")
public class PhoneLoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		         //获取请求中的参数
				String user_phone = request.getParameter("user_phone");
				String user_pass = request.getParameter("user_pass");
				
				//调用业务层代码，创建业务层对象
				UserServiceImpl userService = new UserServiceImpl();				
				//调用业务层的登录方法
				Users user = userService.doLogin(user_phone, user_pass);
				
				//判断user对象是否登录成功
				if(user!=null){
				//把用户信息设置到session的作用域中
					HttpSession session = request.getSession();
					session.setAttribute("user", user);
				 request.getRequestDispatcher("/list.jsp").forward(request, response);//登录成功，跳转系统页面
				 	return;
				}else{
					response.sendRedirect(request.getContextPath()+"/login.jsp");
					return;
					}	
		
		/*
		//是否登录验证
		if(request.getSession().getAttribute("user")==null){
			response.sendRedirect("login.jsp");
			return;
		}
		*/
		
/*
		//获取参数
		String username = request.getParameter("userName");
		String pwd = request.getParameter("passWord");
		String code = request.getParameter("clearfix yzm");
			
		//验证验证码
		HttpSession session = request.getSession();
		String randomCode = (String) session.getAttribute("clearfix yzm");
		
		if(randomCode.equals(code)){
			response.sendRedirect(request.getContextPath()+"/index.jsp");
		}else{
			response.sendRedirect(request.getContextPath()+"/login.jsp");
		}
*/
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}

