<%--
  Created by IntelliJ IDEA.
  User: 曲冠豪
  Date: 2025/4/22
  Time: 8:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<form action="login" method="post">
    用户名<input type="text" name="username"></br>
    密码<input type="password" name="password"></br>
    <input type="submit" value="登录">
    <div style="color: red">${message}</div></br>
</form>
</body>
</html>
