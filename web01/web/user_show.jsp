<%@ page import="com.weichuang.pojo.User" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Think
  Date: 2019/12/7
  Time: 9:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<% List<User> users = (ArrayList)request.getSession().getAttribute("users");%>--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/login.jsp">登录</a> | <a href="">注册</a>
这是我的首页 el表达式  jstl

    <c:forEach items="${users}" var="user">
        <h1>${user.getName()}</h1>
    </c:forEach>





<%--<%--%>
    <%--for (int i = 0; i < users.size(); i++) {--%>
        <%--%>--%>
        <%--<h1><%=users.get(i)%></h1>--%>
<%--<%--%>
    <%--}--%>
<%--%>--%>
</body>
</html>
