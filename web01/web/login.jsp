<%--
  Created by IntelliJ IDEA.
  User: Think
  Date: 2019/12/1
  Time: 14:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>登录</title>
  </head>
  <body>
  <form action="/userServlet?method=login" method="post">
    用户名：<input type="text" name="username">
    密码： <input type="password" name="pwd">
    <input type="submit">
  </form>

  </body>
</html>

