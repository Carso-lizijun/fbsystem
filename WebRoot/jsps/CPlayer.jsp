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
    
    <title>My JSP 'CPlayer.jsp' starting page</title>
    
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
    <h2 style="text-align:center">满足条件的球员信息如下.</h2> <br>
    <br>
    <br>
    <c:forEach items="${playerlist }" var="player">
    	姓名：${player.pname }  国籍：${player.pcountry }  俱乐部：${player.pclub } 年龄：${player.page} 场上位置：${player.pposi }<br>
   			<img src="<c:url value='/${player.pimage }'/>" border="0"/><br><br>
    </c:forEach>
    
  </body>
</html>
