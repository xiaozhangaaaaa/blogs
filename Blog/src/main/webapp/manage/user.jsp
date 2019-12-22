<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>后台管理 - 博客网</title>
<link type="text/css" rel="stylesheet" href="../css/style.css" />
<script type="text/javascript" src="../scripts/function-manage.js"></script>
<script type="text/javascript">
	function del(bu_user_id){
		
		if(confirm("确认删除吗")){
			
		window.location="<%=request.getContextPath()%>/delete.abcd?bu_user_id="+bu_user_id;
		
		}
	}
</script>
</head>
<body>
<div id="header" class="wrap">
	<div id="logo"><img src="../images/logo.gif" /></div>
	<div class="help"><a href="../index.jsp">返回前台页面</a></div>
	<div class="navbar">
		<ul class="clearfix">
			<li class="current"><a href="index.jsp">首页</a></li>
			<li><a href="user.jsp">用户</a></li>
			<li><a href="blog.jsp">文章</a></li>
			<li><a href="guestbook.jsp">留言</a></li>
		</ul>
	</div>
</div>
<div id="childNav">
	<div class="welcome wrap">
		管理员pillys您好，今天是2012-12-21，欢迎回到管理后台。
	</div>
</div>
<div id="position" class="wrap">
	您现在的位置：<a href="index.jsp">博客网</a> &gt; 管理后台
</div>
<div id="main" class="wrap">
	<div id="menu-mng" class="lefter">
		<div class="box">
			<dl>
				<dt>用户管理</dt>
				<dd><em><a href="user-add.jsp">新增</a></em><a href="queiry.abcd">用户管理</a></dd>
				<dt>博文管理</dt>
				<dd><em><a href="blogClass-add.jsp">新增</a></em><a href="blogClass.jsp">分类管理</a></dd>
				<dd><em><a href="blog-add.jsp">新增</a></em><a href="blog.jsp">文章管理</a></dd>
				<dt>留言管理</dt>
				<dd><a href="guestbook.jsp">留言管理</a></dd>
			</dl>
		</div>
	</div>
	<div class="main">
		<h2>用户管理</h2>
		<div class="manage">
			<table class="list">
				<tr>
					<th>ID</th>
					<th>姓名</th>
					<th>性别</th>
					<th>Email</th>
					<th>手机</th>
					<th>操作</th>
				</tr>
			 <c:forEach var="li"  items="${list}">
				<tr>
					<td >${li.bu_user_id}</td>
					<td >${li.BU_USER_NAME}</td>
					<td >${li.BU_SEX}</td>
					<td >${li.BU_EMAIL}</td>
					<td >${li.BU_MOBILE}</td>
					<td class="w1 c"><a href="findById.abcd?idddd=${li.bu_user_id } ">修改</a>
				 <a href="javascript:del('${li.bu_user_id }');">删除</a></td>
				</tr>
			</c:forEach>
			
			</table>
			
			<a href="fenye.abcd">点击进行分页 </a>
		    <b>${info.totalCount }</b> 
		    <c:forEach begin="1" step="1" end="${info.totalPageCount }">
		    	<c:set var="i" value="${i+1 }"></c:set>
		    	<a href="fenye.abcd?currPageNo=${i }">${i }</a>
		    </c:forEach>
		    <c:if test="${info.currPageNo<info.totalPageCount }" var="flag">
			    <a href="fenye.abcd?currPageNo=${info.currPageNo+1 }">下一页</a>
			    <a href="fenye.abcd?currPageNo=${info.totalPageCount }">尾页</a></div>
		    </c:if>
		    <c:if test="${!flag }">
		    	<a >下一页</a>
			    <a >尾页</a></div>
		    </c:if>
		    
		
		</div>
		
	</div>
	<div class="clear"></div>
</div>
<div id="footer">
	Copyright &copy; 2010  All Rights Reserved. 京ICP证1000001号</div>
</body>
</html>
