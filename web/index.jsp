<%--
  Created by IntelliJ IDEA.
  User: JCS
  Date: 2019/12/8
  Time: 13:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>主页</title>
  </head>
  <body>
  <center>
    <h4>欢迎登陆</h4>
    <form action="findusers" method="get">
      姓名：<input type="text" name="userName">
      性别：<input type="text " name="userSex">
      <button type="submit">查询</button>
    </form>
  </center>
  </body>
</html>
