<%@ page language="java" import="java.util.*" pageEncoding="utf-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
    
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>后台管理 - BOOK HOUSE</title>
<link type="text/css" rel="stylesheet" href="../css/style.css" />
<script type="text/javascript" src="../scripts/function-manage.js"></script>
</head>
<body onload="getNowFormatDate()">
<div id="header" class="wrap">
	<div id="logo"><img src="../images/logo.gif" /></div>
	<div class="help"><a href="index.do">返回前台页面</a></div>
	<div class="navbar">
		<ul class="clearfix">
			<li ><a href="mana.do">首页</a></li>
			<li class="current"><a href="manaUser.do">用户</a></li>
			<li><a href="manaBook.do">商品</a></li>
			<li><a href="allBookOrder.do">订单</a></li>

		</ul>
	</div>
</div>
<div id="childNav">
	<div class="welcome wrap">
		管理员您好，今天是<a id="time"></a>，欢迎回到管理后台。
	</div>
</div>
<div id="main" class="wrap">
	<div id="menu-mng" class="lefter">
		<div class="box">
			<dl>
				<dt>用户管理</dt>
				<dd><em><a href="addUserPage.do">新增</a></em><a href="manaUser.do">用户管理</a></dd>
				<dt>商品管理</dt>
				<dd><em><a href="addproductPage.do">新增</a></em><a href="manaBook.do">商品管理</a></dd>
				<dt>订单管理</dt>
				<dd><a href="allBookOrder.do">订单管理</a></dd>
			</dd>
			</dl>
		</div>
	</div>
	<div class="main">
		<h2>用户管理</h2>
		<div class="manage">
				<table class="list">
					<tr>
						<th>ID</th>
						<th>姓名</th>
						<th>性别</th>
						<th>Email</th>
						<th>手机</th>
						<th>操作</th>
					</tr>
					<c:forEach var="user" items="${users}">
						<tr>
							<td class="first w4 c">${user.uid}</td>
							<td class="w1 c">${user.uname}</td>
							<td class="w2 c">${user.gender}</td>
							<td>${user.email}</td>
							<td class="w4 c">${user.phone}</td>
							<td class="w1 c"><a href="modifyUserPage.do?uid=${user.uid}">修改</a> <a
								href="delUser.do?uid=${user.uid}">删除</a></td>
						</tr>
					</c:forEach>
					

				</table>
				<div class="pager">
					<ul class="clearfix">
						<c:choose>
							<c:when test="${pageInfo.hasPreviousPage}">
								<li><a href="manaUser.do?pageNum=1">首页</a></li>
								<li><a href="manaUser.do?pageNum=${pageInfo.prePage }">上一页</a></li>
							</c:when>
							<c:otherwise>
								<li>首页</li>
								<li>上一页</li>
							</c:otherwise>
						</c:choose>

						<c:forEach var="index" begin="1" end="${pageInfo.pages }">

							<li
								<c:if test="${index==pageInfo.pageNum}">class="current"</c:if>><a
								href="manaUser.do?pageNum=${index }">${index }</a></li>
						</c:forEach>

						<c:choose>
							<c:when test="${pageInfo.hasNextPage}">
								<li><a href="manaUser.do?pageNum=${pageInfo.nextPage }">下一页</a></li>
								<li><a href="manaUser.do?pageNum=${pageInfo.pages }">尾页</a></li>
							</c:when>
							<c:otherwise>
								<li>下一页</li>
								<li>尾页</li>
							</c:otherwise>
						</c:choose>
					</ul>
				</div>
			</div>
	</div>
	<div class="clear"></div>
</div>
<div id="footer">
	Copyright &copy; 2010 All Rights Reserved.
</div>
</body>
</html>