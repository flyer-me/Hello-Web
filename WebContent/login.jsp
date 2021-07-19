<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.11.1.min.js"></script>
<script type="text/javascript">
$(function(){ 
	$("#btnCode").click(function(){
		$.ajax({
			type:"post",
			url:"${pageContext.request.contextPath }/send.do",
			data:{ "userPhone" : $("#userPhone").val() },
			dataType:"json",
			success:function(msg){
				if(msg.isSend){
					alert("发送成功！");
				}else{
					alert("发送失败！");
				}
			}
		});
	});
})
</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/phonelogin.do" method="post">
输入手机号：<input type="text" id="userPhone" name="userPhone" value=""><br>
输入验证码：<input type="text" name="code" value="" size="5">
					<input type="button" id="btnCode" value="获取验证码">
<br>
<input type="submit" value="登录">
</form>
</body>
</html>