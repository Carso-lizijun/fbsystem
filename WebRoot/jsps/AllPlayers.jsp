<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title> 下面是所有球员的信息.</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
 <!--body里面的数据没有显示，说明有问题，可能是循环的条件不成立导致没有输出  --> 
  
  <body>
  <a href="http://localhost:8080/fbsystem/PlayerServletFindByName"><p align="left">按条件查询</p></a><br>
  <br><br>
   		<c:forEach items="${playerlist }" var="player" >
   			姓名：${player.pname }  国籍：${player.pcountry }  俱乐部：${player.pclub } 年龄：${player.page} 场上位置：${player.pposi }<br>
   			<img src="<c:url value='/${player.pimage }'/>" border="0"/><br>
   		</c:forEach>
    
  </body>
</html>
