/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-06-11 09:46:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.manage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class user_002dadd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>后台管理 - BOOK HOUSE</title>\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"../css/style.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"../scripts/function-manage.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"getNowFormatDate()\">\r\n");
      out.write("<div id=\"header\" class=\"wrap\">\r\n");
      out.write("\t<div id=\"logo\"><img src=\"../images/logo.gif\" /></div>\r\n");
      out.write("\t<div class=\"help\"><a href=\"index.do\">返回前台页面</a></div>\r\n");
      out.write("\t<div class=\"navbar\">\r\n");
      out.write("\t\t<ul class=\"clearfix\">\r\n");
      out.write("\t\t\t<li ><a href=\"mana.do\">首页</a></li>\r\n");
      out.write("\t\t\t<li class=\"current\"><a href=\"manaUser.do\">用户</a></li>\r\n");
      out.write("\t\t\t<li><a href=\"manaBook.do\">商品</a></li>\r\n");
      out.write("\t\t\t<li ><a href=\"allBookOrder.do\">订单</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"childNav\">\r\n");
      out.write("\t<div class=\"welcome wrap\">\r\n");
      out.write("\t\t管理员您好，今天是<a id=\"time\"></a>，欢迎回到管理后台。\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"main\" class=\"wrap\">\r\n");
      out.write("\t<div id=\"menu-mng\" class=\"lefter\">\r\n");
      out.write("\t\t<div class=\"box\">\r\n");
      out.write("\t\t\t<dl>\r\n");
      out.write("\t\t\t\t<dt>用户管理</dt>\r\n");
      out.write("\t\t\t\t<dd><em><a href=\"addUserPage.do\">新增</a></em><a href=\"manaUser.do\">用户管理</a></dd>\r\n");
      out.write("\t\t\t\t<dt>商品管理</dt>\r\n");
      out.write("\t\t\t\t<dd><em><a href=\"addproductPage.do\">新增</a></em><a href=\"manaBook.do\">商品管理</a></dd>\r\n");
      out.write("\t\t\t\t<dt>订单管理</dt>\r\n");
      out.write("\t\t\t\t<dd><a href=\"allBookOrder.do\">订单管理</a></dd>\r\n");
      out.write("\t\t\t\t</dd>\r\n");
      out.write("\t\t\t</dl>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"main\">\r\n");
      out.write("\t\t<h2>新增用户</h2>\r\n");
      out.write("\t\t<div class=\"manage\">\r\n");
      out.write("\t\t\t<form action=\"addUser.do\" method=\"post\">\r\n");
      out.write("\t\t\t\t<table class=\"form\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"field\">用户名：</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" class=\"text\" name=\"userName\" value=\"\" /></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"field\">密码：</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" class=\"text\" name=\"passWord\" value=\"\" /></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"field\">性别：</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"radio\" name=\"gender\" value=\"男\" checked=\"checked\" />男 <input type=\"radio\" name=\"gender\" value=\"女\" />女</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"field\">邮箱：</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" class=\"text\" name=\"email\" value=\"\" /></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"field\">手机号码：</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" class=\"text\" name=\"phone\" value=\"\" /></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"field\">送货地址：</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" class=\"text\" name=\"address\" value=\"\" /></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t\t<td><label class=\"ui-blue\"><input type=\"submit\" name=\"submit\" value=\"添加\" /></label></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"clear\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("\tCopyright &copy; 2010 All Rights Reserved.\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}