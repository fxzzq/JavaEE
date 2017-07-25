<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'pson_inquiry_success.jsp' starting page</title>

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
	姓名:
	<s:property value="stu.sname" />
	<br>
	<!-- 	<s:property value="stu.spassword" /> -->
	<br> 年级:
	<s:property value="stu.grade" /><br>
	专业名称:
	<s:property value="stu.prefessionName" />
	<br> 性别:
	<s:property value="stu.sex" />

	<br> 家庭住址:
	<s:property value="stu.saddress" />
	<br> 联系方式:
	<s:property value="stu.tel" />
	<br>

 <a href="userManagement/update_stu!update">修改个人信息</a>


	<s:debug></s:debug>
</body>
</html>
