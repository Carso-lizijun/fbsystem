<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'adminnews.jsp' starting page</title>
    
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
    <h1 align="center">管理新闻信息.</h1><br>
    <br>
    <form action="/fbsystem/AdminNews" method="post">
    	请输入第一场比赛的时间<input type="text" name="time1"/><br>
    	请输入第一场比赛的性质<input type="text" name="gameproperty1"/><br>
    	请输入第一场比赛的主队<input type="text" name="teamname1"/><br>
    	请输入第一场比赛的客队<input type="text" name="teamname2"/><br><br>
    	请输入第二场比赛的时间<input type="text" name="time2"/><br>
    	请输入第二场比赛的性质<input type="text" name="gameproperty2"/><br>
    	请输入第二场比赛的主队<input type="text" name="teamname3"/><br>
    	请输入第二场比赛的客队<input type="text" name="teamname4"/><br><br>
    	请输入第三场比赛的时间<input type="text" name="time3"/><br>
    	请输入第三场比赛的性质<input type="text" name="gameproperty3"/><br>
    	请输入第三场比赛的主队<input type="text" name="teamname5"/><br>
    	请输入第三场比赛的客队<input type="text" name="teamname6"/><br><br>
    	请输入第四场比赛的时间<input type="text" name="time4"/><br>
    	请输入第四场比赛的性质<input type="text" name="gameproperty4"/><br>
    	请输入第四场比赛的主队<input type="text" name="teamname7"/><br>
    	请输入第四场比赛的客队<input type="text" name="teamname8"/><br><br>.
    	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="提交">
    </form>
    
  </body>
</html>
