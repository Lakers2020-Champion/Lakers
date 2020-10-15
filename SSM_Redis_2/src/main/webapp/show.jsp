<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="bootstrap/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	type="text/css" />
<style type="text/css">
	#lastdiv {
		position: absolute;
		top: 138px;
		right: 1150px;
	}
</style>
</head>
<body>
	<a href="add.jsp">添加用戶</a>
	<table id="tab" border="1px">
		<tr>
			<td>ID</td>
			<td>账号</td>
			<td>密码</td>
			<td>存款</td>
			<td>更新时间</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list }" var="user">
			<tr>
				<td>${user.id }</td>
				<td>${user.name }</td>
				<td>${user.password }</td>
				<td>${user.money }</td>
				<td>${user.date }</td>
				<td><a href="selectById?id=${user.id }">修改</a> <a
					href="delete?id=${user.id }">删除</a></td>
			</tr>
		</c:forEach>
	</table>
	<div>共有${pageInfo.total }条记录，第${pageInfo.pageNum }/${pageInfo.pages }页</div>
	<div id="lastdiv">
			<nav aria-label="Page navigation">
			<ul class="pagination">
			<li><a href="show?pagenum=${pageInfo.firstPage}">首页</a></li>
				<c:if test="${!pageInfo.isFirstPage}">					
					<li><a href="show?pagenum=${pageInfo.prePage}"
						aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
					</a></li>
					<li><a href="show?pagenum=${pageInfo.pageNum-1}">${pageInfo.pageNum-1 }</a></li>
				</c:if>				
				
				<li><a href="show?pagenum=${pageInfo.pageNum}">${pageInfo.pageNum }</a></li>
				
				<c:if test="${!pageInfo.isLastPage}">
				<li><a href="show?pagenum=${pageInfo.pageNum+1}">${pageInfo.pageNum+1 }</a></li>
					<li><a href="show?pagenum=${pageInfo.nextPage}"
						aria-label="Next"> <span aria-hidden="true">&raquo;</span>
					</a></li>					
				</c:if>
				<li><a href="show?pagenum=${pageInfo.lastPage}">尾页</a></li>
			</ul>
			</nav>
		</div>	
</body>
</html>