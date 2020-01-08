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
    <script type="text/javascript">
        function ajaxutil() {
            var userNo=document.getElementById("userNo").value;
            alert(userNo);
            //创建ajax引擎对象
            var ajax;
            if (window.XMLHttpRequest){//火狐
                ajax=new XMLHttpRequest();
            }else if (window.ActiveXObject){//ie
                ajax=new ActiveXObject();
            }
            //复写onreadystatechange函数
            ajax.onreadystatechange=function () {
                //判断ajax状态码和响应状态码
                if (ajax.readyState==4&&ajax.status==200){
                    //获取响应内容
                    var result=ajax.responseText;
                    //处理响应内容
                    var showUserNo=document.getElementById("showUserNo");
                    showUserNo.innerHTML=result;
                }
            }
            //发送请求
            //get的请求实体拼接在URL后面，？隔开，键值对
            ajax.open("get","findUserNo?userNo=123",true);//true异步
            ajax.send(null);
            //post请求有单独的请求实体
            // ajax.open("post", "url",true);
            // ajax.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
            // ajax.send("name=张三&pwd=123");
        }
    </script>
    <style type="text/css">
        #td1{
            text-align: right;
        }
        #td2{
            text-align: left;
        }
    </style>
</head>
<body>
    <center>
        <form action="register" method="post">
            <h3>注册</h3>
            <table>
                <tr>
                    <td id="td1">账号：</td>
                    <td id="td2"><input type="text" name="userNo" id="userNo" onblur="ajaxutil()"></td>
                    <td id="showUserNo" style="color: crimson"></td>
                </tr>
                <tr>
                    <td id="td1">姓名：</td>
                    <td id="td2"><input type="text" name="userName"></td>
                </tr>
                <tr>
                    <td id="td1">密码：</td>
                    <td id="td2"><input type="password" name="userPwd" id="userPwd"></td>
                </tr>
                <tr>
                    <td id="td1">确认密码：</td>
                    <td id="td2"><input type="password" name="userPwd2" id="userPwd2"></td>
                </tr>
                <tr>
                    <td id="td1">性别：</td>
                    <td id="td2">
                        男<input type="radio" value="1" name="userSex">
                        女<input type="radio" value="0" name="userSex">
                    </td>
                </tr>
                <tr>
                    <td id="td1">地址：</td>
                    <td id="td2"><input type="text" name="userAddress"></td>
                </tr>
                <tr>
                    <td id="td1"><button type="submit">注册</button></td>
                    <td id="td2"><button type="reset">取消</button></td>
                </tr>
            </table>
        </form>
    </center>
</body>
</html>
