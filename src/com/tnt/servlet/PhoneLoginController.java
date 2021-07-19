package com.tnt.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/phonelogin.do")
public class PhoneLoginController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String loginPhone = request.getParameter("userPhone");
		String code = request.getParameter("code");
		
		//验证验证码
		HttpSession session = request.getSession();
		String randomCode = (String) session.getAttribute("code");
		
		if(randomCode.equals(code)){
			response.sendRedirect(request.getContextPath()+"/ok.jsp");
		}else{
			response.sendRedirect(request.getContextPath()+"/login.jsp");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
