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
    
    <title>My JSP 'footballnews.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
<!-- 要做有后台管理员操作的页面必须是jsp页面 -->
  <body>
    <h2 align="center">一周焦点</h2><br><br>

<h3 align="left">本周焦点赛事</h3>
<!-- 这里给一张图片      赛事模块 -->	

		<table border="1" align="center">
			<tr>
		
			<td>
    	<p align="center">${gamenewslist.time1}</p>
		<p align="center">${gamenewslist.gameproperty1}</p>    
		<!-- 后台要做俱乐部图片对应下拉链表 -->
		<p align="center">${gamenewslist.teamname1} VS ${gamenewslist.teamname2}</p>
		</td>
			
			<td>
    	<p align="center">${gamenewslist.time2}</p>
		<p align="center">${gamenewslist.gameproperty2}</p>    
		<!-- 后台要做俱乐部图片对应下拉链表 -->
		<p align="center">${gamenewslist.teamname3} VS ${gamenewslist.teamname4}</p>
		</td>
			</tr>
		<tr>	
		
			<td>
    	<p align="center">${gamenewslist.time3}</p>
		<p align="center">${gamenewslist.gameproperty3}</p>    
		<!-- 后台要做俱乐部图片对应下拉链表 -->
		<p align="center">${gamenewslist.teamname5} VS ${gamenewslist.teamname6}</p>
		</td>
			
			<td>
    	<p align="center">${gamenewslist.time4}</p>
		<p align="center">${gamenewslist.gameproperty4}</p>    
		<!-- 后台要做俱乐部图片对应下拉链表 -->
		<p align="center">${gamenewslist.teamname7} VS ${gamenewslist.teamname8}</p>
		</td>
			</tr>
		
			
		</table>
		<br><br><br>
		<h3 align="left">焦点新闻</h3>
<!-- 这里给一张图片      新闻模块 -->
    <!-- 这里给一张图片      新闻模块 -->	
    	
    	<!-- 新闻就做成HTML静态的，只是显示信息而已 -->
    	<p align="center"><a href="">news1</a></p>
    	<p align="center"><a href="">news2</a></p>
    	<p align="center"><a href="">news3</a></p>
    	<p align="center"><a href="">news4</a></p>
    	<p align="center"><a href="">news5</a></p>
    	<p align="center"><a href="">news6</a></p>
    	<p align="center"><a href="">news7</a></p>
    	
  </body>

</html>
