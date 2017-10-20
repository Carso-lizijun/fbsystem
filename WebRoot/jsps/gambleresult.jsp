<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'gambleresult.jsp' starting page</title>
    
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
    <h2 align="center"><p>赛事结果和投注结果</p></h2><br>
    <p align="center">（这个部分由管理员来完成）输出当前用户名</p>
    <table align="center" border="1">
    <tr>
    	<td><p>赛事1：赛果</p></td>
    	<td><p>中奖情况：</p></td>
    </tr>
    <tr>
	    <td><p>赛事2：赛果</p></td>
	    <td><p>中奖情况：</p></td>
    </tr>
    <tr>
    	<td><p>赛事3：赛果</p></td>
    	<td><p>中奖情况：</p></td>
    </tr>
    <tr>
    	<td><p>赛事4：赛果</p></td>
    	<td><p>中奖情况：</p></td>
    </tr>
    <tr>
	    <td><p>总积分：</p></td>
	   <td><p>输出总积分</p></td>
    </tr>
    </table>
  </body>
</html>
