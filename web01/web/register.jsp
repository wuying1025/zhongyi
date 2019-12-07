<%--
  Created by IntelliJ IDEA.
  User: Think
  Date: 2019/12/7
  Time: 13:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        .error{
            color: red;
        }
    </style>
</head>
<body>

<form action="/userServlet?method=register" method="post">
    用户名：<input type="text" name="username" id="name"><i class="error"></i><br/>
    密码： <input type="password" name="pwd"><br/>
    确认密码： <input type="password" name="pwd2"><br/>
    <input type="submit">
</form>
<script src="js/jquery-1.12.4.js"></script>
<script>

    $("#name").on("blur",function(){
        var val = $(this).val();
        //ajax
        $.get("/userServlet",{
            name:val,
            method:"isExit"
        },function(data){
            if(data == 1){
                $(".error").text("用户名存在");
            }else{
                $(".error").text("");
            }
        },"text");
    })


</script>
</body>
</html>
