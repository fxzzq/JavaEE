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

<title>My JSP 'show_optional.jsp' starting page</title>

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
	margin-left: 80px;
	margin-top: 120px;
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




	<table border="1" width="600" class="t1">

		<tr>
			<th>序号</th>
			<th>课程名</th>
			<th>周几</th>
			<th>第几节</th>
			<th>学分</th>
			<th>管理</th>
		</tr>
		<s:iterator value="csList" status="a">

			<tr>
				<td class="td"><s:property value="#a.index+1" />
				</td>
				<td class="td"><s:property value="cname" /></td>

				<td class="td"><s:property value="wk" />
				</td>
				<td class="td"><s:property value="clspnt" /></td>
				<td class="td"><s:property value="point" /></td>
				<td class="td"><a
					href="CourseManagement/select_course!selectCousre?cname=<s:property value="cname"/>">选课</a>
					<!--     		<form action="CourseManagement/select_course!selectCousre" method="post"> -->
					<!--     				<input type="hidden" name="id" value="<s:property value="cname"/>">  -->
					<!--     		</form> --></td>
			</tr>
		</s:iterator>
	</table>




	<%--   <s:debug></s:debug>--%>


</body>
</html>
