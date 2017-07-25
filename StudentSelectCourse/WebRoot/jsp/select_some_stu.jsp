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
    
    <title>My JSP 'select_some_student.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link href="../style/style.css" rel="stylesheet" type="text/css" />
  </head>
  
  <body id="page">
  <center>
  <form name="formsome" method="post" action="mngTest/show_some_student!selectStu">
     		  专业： <select name="cr.pfsName" size=1>

			<!-- 			 -->
			<option value="请选择">= 请选择 =</option>
			<option value="物联网工程">物联网工程</option>
			<option value="信息安全">信息安全</option>
			<option value="信息对抗">信息对抗</option>
			<option value="网络工程">网络工程</option>
			<option value="电子工程">电子工程</option>
			<option value="软件工程">软件工程</option>
			<option value="大气科学">大气科学</option>
			<option value="通信工程">通信工程</option>
			<option value="应用数学">应用数学</option>
			<option value="环境科学">环境科学</option>
			<option value="电子商务">电子商务</option>
			<option value="对外汉语">对外汉语</option>


		</select><br />
		 年级： <select name="cr.grdName" size=1>

			<option value="请选择">= 请选择 =</option>

			<option value="大一">大一</option>

			<option value="大二">大二</option>

			<option value="大三">大三</option>

			<option value="大四">大四</option>

		</select><br />

		<input name="name" type="submit" value="查询学生" /><br />
		</form>
		</center>
  </body>
</html>
