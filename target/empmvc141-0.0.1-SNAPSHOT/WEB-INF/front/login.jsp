<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>BOOK HOUSE</title>
<link type="text/css" rel="stylesheet" href="<%=basePath %>css/style.css" />
<script type="text/javascript" src="<%=basePath %>scripts/function.js"></script>
<script type="text/javascript" src="<%=basePath %>js/jquery.min.js"></script>
<script type="text/javascript" src="<%=basePath %>js/jquery.validate-1.13.1.js"></script>
</head>
<body>
<div id="header" class="wrap">
	<div id="logo"><img src="<%=basePath %>images/logo.gif" /></div>
	<div class="help">
		<a href="cartPage.do" class="shopping">查看购物车</a>
		<c:if test="${sessionScope.user!=null}"><a href="userOrder.do?uid=${sessionScope.user.uid}">我的订单</a>&nbsp;用户:${sessionScope.user.uname}&nbsp;&nbsp;<a href="updateUserPage.do">更新个人信息</a><a href="updatePwdPage.do">修改密码</a><a href="logout.do">注销</a></c:if>
		<c:if test="${sessionScope.user==null}"><a href="login.do">登录</a><a href="reg.do">注册</a></c:if>
	</div>
	<div class="navbar">
		<ul class="clearfix">
			<li class="current"><a href="index.do">首页</a></li>
			<div class="search">
				<form method="post" action="productList.do">
					 查找书籍：<input type="text" class="text" name="key" placeholder="请输入商品关键字"  /> <label class="ui-blue"><input type="submit" name="submit" value="搜索" /></label>
				</form>
			</div>
		</ul>
	</div>
</div>
<div id="childNav">
	<div class="wrap">
		<ul class="clearfix">
			<c:forEach items="${bts}" var="bt">
			<li><a href="productList.do?type=${bt}" >${bt}</a></li>
			</c:forEach>
		</ul>
	</div>
</div>
<div id="register" class="wrap">
	<div class="shadow">
		<em class="corner lb"></em>
		<em class="corner rt"></em>
		<div class="box">
			<h1>欢迎登陆BOOK HOUSE</h1>
			<form id="loginForm">
				<table>
					<tr>
						<td class="field">用户名：</td>
						<td><input class="text" type="text" name="userName" id="userName"/></td>
					</tr>
					<tr>
						<td class="field">登录密码：</td>
						<td><input class="text" type="password" name="passWord" id="passWord" /></td>
					</tr>
					<tr>
						<td></td>
						<td><label class="ui-green"><input type="submit" id="submit" value="立即登录" /></label></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	<div class="clear"></div>
</div>
<div id="footer">
	Copyright &copy; 2010  All Rights Reserved.
</div>
<script>
    var validator;
    $(document).ready(function () {
        $.validator.setDefaults({
            //debug: true
        });

        validator = $("#loginForm").validate({
            rules: {
                userName: {
                    required: true
                },
                passWord: {
                    required: true
                }
            },
            messages: {
                userName: {
                     required: "必须填写用户名"
                },
                passWord: {
                    required: "必须填写密码"
                    
                }
            }
        });
    });
	 $(document).ready(function(){
	$("#submit").click(function(){
		$.post("loginCheck.do",{
			userName:$("#userName").val(),
			passWord:$("#passWord").val()
		},
		function(data){
			if(data=='success'){
				window.location.href="index.do";
			}
			if(data=='false'){
				alert("账号或密码不正确");
			}
			if(data=='nameEmpty'){
				alert("账号不能为空");
			}
			if(data=='pwdEmpty'){
				alert("密码不能为空");
			}
		});
	});
}); 
</script>
</body>
</html>
