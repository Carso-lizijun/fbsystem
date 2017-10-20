<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>添加球员</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
	body {background: rgb(254,238,189);}
</style>
  </head>
  
  <body>
    <h1>添加球员</h1>
    <p style="font-weight: 900; color: red">${msg }</p>
    <form action="<c:url value='/AdminAddPlayerServlet'/>" method="post" enctype="multipart/form-data">
    	球员ID：<input style="width: 150px; height: 20px;" type="text" name="pid"/><br/>
    	球员名称：<input style="width: 150px; height: 20px;" type="text" name="pname"/><br/>
    	球员年龄：<input style="width: 150px; height: 20px;" type="text" name="page"/><br/>
    	球员国籍：<input style="width: 150px; height: 20px;" type="text" name="pcountry"/><br/>
    	球员俱乐部：<input style="width: 150px; height: 20px;" type="text" name="pclub"/><br/>
    	球员图片：<input style="width: 200px; height: 20px;" type="file" name="pimage"/><br/>
    	球员位置：<input style="width: 150px; height: 20px;" type="text" name="pposi"/><br/>
    	<c:forEach items="${categoryList }" var="c">
    		<option value="${c.cid }">${c.cname }</option>
    	</c:forEach>
    	</select>
    	<br/>
    	<input type="submit" value="添加球员"/>
    </form>
  </body>
</html>
