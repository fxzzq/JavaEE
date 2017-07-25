<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" import="java.sql.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'doregedit.jsp' starting page</title>
    
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
  <%
String driverClass="com.mysql.jdbc.Driver";
    String url="jdbc:mysql://localhost:3306/student_select_course";
    String username="root";
    String password="123456";
	Class.forName("com.mysql.jdbc.Driver") ;      
	Connection conn=DriverManager.getConnection(url,username,password);
        Statement stmt=conn.createStatement();
	String   inquiryID="select max(sid) from student";
        request.getSession().setAttribute("sessionID",inquiryID);
        stmt.executeUpdate(inquiryID);
	stmt.close();
	conn.close();
%>
  </body>
</html>
