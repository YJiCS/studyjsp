<%--
  Created by IntelliJ IDEA.
  User: JCS
  Date: 2020/1/7
  Time: 11:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ajax</title>
    <script type="text/javascript">
        function ajaxutil(){
            //创建ajax引擎对象
            var ajax;
            if(window.XMLHttpRequest){//火狐
                ajax=new XMLHttpRequest();
            }else if(window.ActiveXObject){//ie
                ajax=new ActiveXObject("Msxml2.XMLHTTP");
            }
            //复写onreadystatement函数
            ajax.onreadystatechange=function(){
                //判断Ajax状态吗
                if(ajax.readyState==4&&ajax.status==200){

                        var result=ajax.responseText;
                        //获取元素对象
                        var showdiv=document.getElementById("showdiv");
                        showdiv.innerHTML=result;
                }
            }
            //发送请求
            //get请求
            // ajax.open("get","ajax?userNo=123",true);//true异步
            // ajax.send(null);
            //post请求
            ajax.open("post","ajax",true);
            ajax.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
            ajax.send("userNo=123");
        }
    </script>
    <style>
        #showdiv{
            border:solid 1px;
            width:200px;
            height:100px;
        }
    </style>
</head>
<body>
<h3>欢迎登录403峡谷</h3>
<hr>
<input type="button" value="测试 " onclick="ajaxutil()"/>
<div id="showdiv"></div>
</body>
</html>
