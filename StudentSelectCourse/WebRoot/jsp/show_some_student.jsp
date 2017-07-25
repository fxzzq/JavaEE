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
	
	margin-top: 70px;
	margin-right: 20px;
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





	<table border="1" width="800" class="t1">

		<tr>
			<th>序号</th>
			<th>姓名</th>
			<th>专业</th>
			<th>年级</th>
			<th>性别</th>
			<th>家庭住址</th>
			<th>电话号码</th>
			<th>管理</th>
		</tr>
		<s:iterator value="stuList" status="a">
			<tr>
				<td class="td"><s:property value="#a.index+1" />
				</td>
				<td class="td"><s:property value="sname" />
				</td>
				<td class="td"><s:property value="pfsName" />
				</td>
				<td class="td"><s:property value="grdName" />
				</td>
				<td class="td"><s:property value="sxtp" />
				</td>
				<td class="td"><s:property value="saddress" />
				</td>
				<td class="td"><s:property value="tel" />
				</td>


				<td class="td"><a
					href="mngTest/delete_stu!deletStu?sidTp=<s:property value="sid"/>">删除</a>
				</td>
				<%--    		<td></td>--%>
			</tr>

		</s:iterator>

	</table>



	<%--   <s:debug></s:debug>--%>

</body>
</html>
