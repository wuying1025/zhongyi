<%--
  Created by IntelliJ IDEA.
  User: Think
  Date: 2019/12/5
  Time: 14:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String name = (String)request.getSession().getAttribute("username");%>
<html>
<head>
    <title>首页</title>
</head>
<body>
    <h1>欢迎，<%=name%></h1>
</body>
</html>
