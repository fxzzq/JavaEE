<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'student_login.jsp' starting page</title>

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
	<form name="f1" action="userManagement/login!userValidate" method="post">
		身份: <select name="userStatus" size="1">
	 

				<option value="student">学生</option>
				<option value="manager">管理员</option>
				</select>
	
				帐号:	<input type="text" name="userId" value="" />
				密码:<input type="password" name="userPassword" value="" />
    			<input type="submit" name="loginning" value="action" /> 
    	
    	
			</form>
  </body>
</html>
