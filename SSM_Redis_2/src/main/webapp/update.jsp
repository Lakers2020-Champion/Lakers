<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="update">
		<input type="hidden" name="id" value="${user.id }"><br>
		账号:<input type="text" name="name" value="${user.name }"><br>
		密码:<input type="password" name="password" value="${user.password }"><br>
		存款:<input type="text" name="money" value="${user.money }"><br>
		<input type="submit" value="保存"">
	</form>
</body>
</html>