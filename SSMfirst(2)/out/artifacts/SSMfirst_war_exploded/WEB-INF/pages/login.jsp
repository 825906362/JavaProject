<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2025/4/23
  Time: 23:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<form action="login" method="post">
    用户登录<br>
    用户编号<input type="text" name="userCode"><br>
    用户密码<input type="password" name="userPassword"><br>
    <input type="submit" value="登录"><br>
    <div style="color: red">${message}</div>
</form>
</body>
</html>
