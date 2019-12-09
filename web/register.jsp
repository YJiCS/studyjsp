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
    <title>注册</title>
</head>
<body>
    <center>
        <form action="register" method="post">
            <h3>注册</h3>
            <table>
                <tr>
                    <td>账号：</td>
                    <td><input type="text" name="userNo"></td>
                </tr>
                <tr>
                    <td>姓名：</td>
                    <td><input type="text" name="userName"></td>
                </tr>
                <tr>
                    <td>密码：</td>
                    <td><input type="password" name="userPwd"></td>
                </tr>
                <tr>
                    <td>性别：</td>
                    <td>
                        男<input type="radio" value="1" name="userSex">
                        女<input type="radio" value="0" name="userSex">
                    </td>
                </tr>
                <tr>
                    <td>地址：</td>
                    <td><input type="text" name="userAddress"></td>
                </tr>
            </table>
            <button type="submit">注册</button>
            <button type="reset">取消</button>
        </form>
    </center>
</body>
</html>
