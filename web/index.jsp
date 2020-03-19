<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <table border="1">
            <tr align="center">
                <td>账号</td>
                <td>用户名</td>
                <td>密码</td>
                <td>地址</td>
                <td>操作</td>
            </tr>
            <c:forEach items="${list}" var="user">
                <tr align="center">
                    <td>${user.userNo}</td>
                    <td>${user.userName}</td>
                    <td>${user.userPwd}</td>
                    <td>${user.userAddress}</td>
                    <td>
                        <input type="button" value="删除">
                        <input type="button" value="修改">
                    </td>
                </tr>
            </c:forEach>
        </table>
    </form>
</center>
</body>
</html>
