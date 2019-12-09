<%--
  Created by IntelliJ IDEA.
  User: JCS
  Date: 2019/12/8
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
    <center>
        <form action="login" method="post">
            <h3>登录</h3>
            账号：<input type="text" name="userNo"><br>
            密码：<input type="password" name="userPwd"><br>
            <button type="submit">登录</button>
            <button type="reset">取消</button><br>
            <a href="register.jsp">注册</a>
        </form>
    </center>
</body>
</html>
