package com.tnt.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 功能描述：自定义的编码过滤器<br>
 * 作者：zz<br>
 * 时间：2021年7月14日 上午10:32:17
 */
@WebFilter("/*")
public class EncodeFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//设置编码格式
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resq = (HttpServletResponse) response;
		req.setCharacterEncoding("UTF-8");//设置请求对象的编码格式
		resq.setContentType("text/html; charset=UTF-8");//设置响应对象的编码格式
		//请求继续执行
		chain.doFilter(req, resq);
	}

	@Override
	public void destroy() {
	}

}