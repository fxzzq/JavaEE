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
    
    <title>My JSP 'add_course.jsp' starting page</title>
    
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
<%--    
		
	private String cname;
	private String address;
	private int point;
	private String teacher;
	private PrefessionName pfsName;
	private int count;
	private GradeName grdName;
	private Week wk;
	private ClassPoint clspnt;
	
--%>
<center>
<form name="formc" method="post" action="mngTest/addcourse!oneCorse">
		<br />
		 课程名：    <input name="cr.cname" type="text" value="" /><br />
		 代课老师：<input name="cr.teacher" type="text" value="" /><br /> 
		 学分：        <input name="cr.point" type="text" value="" /><br />
		限制人数： <input name="cr.count" type="text" value="" /><br />
		上课地址： <input name="cr.address" type="text" value="" /><br />
		 星期：
		 <select name="cr.wk" size=1>

			<option value="0">= 请选择 =</option>
			<option value="星期一">星期一</option>
			<option value="星期二">星期二</option>
			<option value="星期三">星期三</option>
			<option value="星期四">星期四</option>
			<option value="星期五">星期五</option>
			<option value="星期六">星期六</option>
			<option value="星期日">星期日</option>
		
		</select><br />
	        第几节：     <select name="cr.clspnt" size=1>

			<option value="0">= 请选择 =</option>
			<option value="上午第一二节">上午第一二节</option>
			<option value="上午第三四节">上午第三四节</option>
			<option value="下午第五六节">下午第五六节</option>
			<option value="下午第七八节">下午第七八节</option>
			<option value="晚上第九十节">晚上第九十节</option>
			<option value="晚上第十一节">晚上第十一节</option>
		
		</select><br />
		 
		  专业： <select name="cr.pfsName" size=1>

			<option value="0">= 请选择 =</option>
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

			<option value="0">= 请选择 =</option>

			<option value="大一">大一</option>

			<option value="大二">大二</option>

			<option value="大三">大三</option>

			<option value="大四">大四</option>

		</select><br />

		<input name="name" type="submit" value="添加课程" /><br />
		
	</form>
	</center>
  </body>
</html>
