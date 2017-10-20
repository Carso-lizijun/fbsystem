<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
		*{
			font-size:10pt;
		}
		p{
			color:blue;
		}
		.underline{
			text-decoration:underline;
		}
	</style>
	
  </head>
  <!--以后要增加的：在用户没有登录之前，无法访问三大模块，自动跳转到首页（Session来做，验证user是否为空，参照UserLonginServlet）  -->
  <body>
    		<h1 align="center">欢迎来到球迷之家</h1> <br>
    		<h5>请先<a href="http://localhost:8080/fbsystem/jsps/login.jsp">登录</a>或<a href="http://localhost:8080/fbsystem/jsps/regist.jsp">注册</a></h5> <br>
    		<br>

    		<h3 align="center"><a href="">足球新闻 </a></h3><br>
    				
    		<p style="text-align:center">
    		<a href=""><img alt="新闻" src="${pageContext.request.contextPath }/webimages/fbnews.jpg" width="300px" height="100px"/></a>
    		</p>
    		<br>
    		
    		<h3 align="center"><a href="">互动中心</a></h3><br>
    		
    		<p style="text-align:center">
    		<a href=""><img alt="互动" src="${pageContext.request.contextPath }/webimages/hudong.jpg" width="300px" height="100px"/></a>
    		</p>
    		<br>
    		
    		
    		<h3 class="underline" align="center"><a href="http://localhost:8080/fbsystem/PlayerServletFindAll">球员信息</a></h3><br>
    		
    		<p style="text-align:center">
    		<a href=""><img alt="球员基本信息" src="${pageContext.request.contextPath }/webimages/fbdb.jpg" width="300px" height="100px"/></a>
    		</p>
    		<br>
    		
  </body>
</html>
