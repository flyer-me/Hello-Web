package com.tnt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.alibaba.fastjson.JSON;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.alipay.config.AlipayConfig;
import com.tnt.service.OrderService;
import com.tnt.service.impl.OrderServiceImpl;



/**
 * Servlet implementation class PayServlet
 */
@WebServlet("/PayServlet")
public class PayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private OrderService orderService = new OrderServiceImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		session.setAttribute("payOK", "true");
		/*
		String orderid = (String) session.getAttribute("order_id");
		Integer totalMoney =  (Integer)session.getAttribute("order_price");
		String orderName = (String) session.getAttribute("order_name");
		*/
		
		String out_trade_no = "20020002";
		String total_amount = "10040";
		String subject = "t苹sjj果";
		String body  = "";    
	 
		//获得初始化的AlipayClient
	   AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);

	   //设置请求参数
	   AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
	   alipayRequest.setReturnUrl(AlipayConfig.return_url);
	   alipayRequest.setNotifyUrl(AlipayConfig.notify_url);
/*
	   //商户订单号，商户网站订单系统中唯一订单号，必填
	   String out_trade_no = orderid;
	   //付款金额，必填
	   String total_amount = String.valueOf(totalMoney);
	   //订单名称，必填
	   String subject = orderName;
	   //商品描述，可空
	   String body = "";
*/
	   // 该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m。
	   String timeout_express = "1c";

	   alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\","
	           + "\"total_amount\":\""+ total_amount +"\","
	           + "\"subject\":\""+ subject +"\","
	           + "\"body\":\""+ body +"\","
	           + "\"timeout_express\":\""+ timeout_express +"\","
	           + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");

	  
	  PrintWriter out = response.getWriter();
	  
	  String result = null;
	  try {
		  result = alipayClient.pageExecute(alipayRequest).getBody();
	  } catch (AlipayApiException e) {
		  e.printStackTrace();
	  }
	
	  out.print(result);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
