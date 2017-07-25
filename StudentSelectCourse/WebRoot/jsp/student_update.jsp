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

<title>My JSP 'student_update.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
</head>

<body>

	<center>

		<form name="form1" method="post" action="userManagement/update_stu!updateInfor">
			<br />
			 姓名：<input name="stu.sname" type="text" value="<s:property value="stu.sname"/>" /><s:property value="mytest"/><br />
			密码：<input name="stu.spassword" type="password" value="" /><br />
			性别：  <select name="stu.sxtp" size=1   >

				<option value="男">男</option>
				<option value="女">女</option>
				</select>
			地址：<input name="stu.saddress" type="text" value="<s:property value="stu.saddress"/>" /><br /> 
			电话：<input name="stu.tel" type="text" value="<s:property value="stu.tel"/>" /><br /> 
			专业： <select name="stu.pfsName" size=1   >


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
			年级： <select name="stu.grdName" size=1>

				<option value="0">= 请选择 =</option>

				<option value="大一">大一</option>

				<option value="大二">大二</option>

				<option value="大三">大三</option>

				<option value="大四">大四</option>

			</select><br /> 
			<input name="name" type="submit" value="确定修改" /><br />

		</form>
	</center>
</body>
</html>
