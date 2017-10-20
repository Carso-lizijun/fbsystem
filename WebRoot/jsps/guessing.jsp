<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'guessing.jsp' starting page</title>
    
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
    <h2 align="center">这里是竞猜页面. </h2><br>
    <p align="left">说明：竞猜页面每周一开启，其余时间均关闭，用户初始积分为1000分，每场比赛的上限为1000分,下限为20分，最多选择4场比赛</p><br>
    
    <!-- 用户积分信息 -->
    <table align="center" border="1">
    	<tr>
 			<td align="left">
 				请理性投注<br>
 			</td>   		
 			<td>
    				<p>赛事1--:选择：主(赔率)，平(赔率)，客(赔率)</p>
    				<p>赛事2--:选择：主(赔率)，平(赔率)，客(赔率)</p>
    				<p>赛事3--:选择：主(赔率)，平(赔率)，客(赔率)</p>
    				<p>赛事4--:选择：主(赔率)，平(赔率)，客(赔率)</p>
    					
    		</td>
 			
    	</tr>
    	<tr>
    		<td align="left"><p>您的选择</p></td>
    		<td>
    			<form action="/fbsystem/UploadGussingInfo" method="post">
    			<input type="text" name="username" value="${sessionScope.session_user.username}"><br><br>
 				您当前的积分:<br>
   				&nbsp;&nbsp;赛事1：<input type="radio" name="dgame1" value="赛事1"><br>	
   				<input type="radio" name="chose1" value="主">主队胜
   				<input type="radio" name="chose1" value="平">两队平
   				<input type="radio" name="chose1" value="客">客队胜
   				<br><input type="text" name="dmask1" value="">
   				<br><br>
   				&nbsp;&nbsp;赛事2：<input type="radio" name="dgame2" value="赛事2"><br>
   				<input type="radio" name="chose2" value="主">主队胜
   				<input type="radio" name="chose2" value="平">两队平
   				<input type="radio" name="chose2" value="客">客队胜 
   				<br><input type="text" name="dmask2" value="">
   				<br><br>
   				
   				&nbsp;&nbsp;赛事3：<input type="radio" name="dgame3" value="赛事3"><br>
   				<input type="radio" name="chose3" value="主">主队胜
   				<input type="radio" name="chose3" value="平">两队平
   				<input type="radio" name="chose3" value="客">客队胜
   				<br><input type="text" name="dmask3" value="">
   				<br><br>
   				&nbsp;&nbsp;赛事4：<input type="radio" name="dgame4" value="赛事4"><br>
   				<input type="radio" name="chose4" value="主">主队胜
   				<input type="radio" name="chose4" value="平">两队平
   				<input type="radio" name="chose4" value="客">客队胜
   				<br><input type="text" name="dmask4" value="">
   				<br><br>
   				&nbsp;&nbsp;&nbsp;<input type="submit" value="提交">&nbsp;&nbsp;&nbsp;
   				<input type="reset" name="rest" id="rest" value="重置">
   				</form>
   			</td>
  			
    	</tr>
    </table>
  </body>
</html>
