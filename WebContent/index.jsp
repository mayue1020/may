<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body> 
<h1>hello world</h1>
<form action="login.do" method="post">
	<br><input type="text" name="userName" value="123"></br>
	<br><input type="text" name="passWord" value="123"></br>
	<br><input type="submit" name="login" value="登陆"></br>
</form>
<form action="register.do" method="post">
	<br><input type="text" name="userName" value="123"></br>
	<br><input type="text" name="passWord" value="123"></br>
	<br><input type="submit" name="register" value="注册"></br>
</form>

</body>
</html>