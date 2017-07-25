<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <%@taglib prefix="s" uri="/struts-tags"%>
    <title>My JSP 'test.jsp' starting page</title>
    
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
  	 <a href="userManagement/inquiry_stu!pesnalInfor">查询个人信息(带修改)</a><br>
  	 <a href="CourseManagement/query_exist!inquiryExist">查询已选课程</a><br>
  	 
  	 
  	  <a href="CourseManagement/query_optional!inquiryOptional">查询可选课程</a><br>
  	   <a href="CourseManagement/select_course!selectCousre">选课</a><br>
  	
  	     <a href="managerFun/quiry_allStu!quiryAllStu">条件查询学生（可填写专业或年级或一起）</a><br>
  	      <a href="managerFun/">条件查询课程（专业或年级）</a><br>
  	      <a href="managerFun/">增加课程</a><br>
  	      <a href="managerFun/addStu!oneStudent">增加学生</a><br>
  	       <a href="">查询已选课程</a>
  </body>
</html>
