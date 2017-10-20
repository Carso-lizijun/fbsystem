<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'main.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    		你已成功登陆！！在下方选择操作 <br>
    
    		<a href="http://localhost:8080/fbsystem/PlayerServletFindAll"><p align="center">查看现役球员基本信息信息</p></a>
    		<br><br>
    		<a href="http://localhost:8080/fbsystem/ShowAllGameNews"><p align="center">焦点赛事新闻</p></a>
    		<a href="http://localhost:8080/fbsystem/jsps/guessing.jsp"><p align="center">焦点赛事竞猜</p></a>
  </body>
</html>
