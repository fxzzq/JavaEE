<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'show_exist.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

<style type="text/css">
.t1 {
	margin-left: 40px;
	margin-top: 80px;
	margin-right: 30px;
	font-family: 楷体;
	font-size: 18px
}

.td {
	width: 100;
	height: 40;
}
</style>
  </head>
  
  <body>
  
  	<center>
 

    <table border="1" width="700"  class="t1">

			<tr>
				<th>序号</th>
				<th>课程名</th>
				<th>周几</th>
				<th>第几节</th>
				<th>学分</th>
				<th>授课教师</th>
				<th>管理</th>
			</tr>

			<s:iterator value="crList" status="a"> 
    	<tr>
    		<td class="td"><s:property value="#a.index+1"/></td>
    		<td class="td"><s:property value="cname"/> </td>
 
    		<td class="td"><s:property value="wk"/></td>
    		<td class="td"><s:property value="clspnt"/></td>
    		<td class="td"><s:property value="point"/> </td>
    		<td class="td"><s:property value="teacher"/> </td>
		<td class="td">
		<a href="mngTest/delete_course!deleteCourse?cidTp=
		<s:property value="cid"/>">删除</a>
		</td>

   		 </tr>
    	</s:iterator>
    </table>
   </center>
  </body>
</html>
