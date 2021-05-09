<%--
  Created by IntelliJ IDEA.
  User: jsrdyfy
  Date: 2020/8/6
  Time: 21:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="hello" method="post">
    <input name="name" >
    <input type="submit" value="提交">
    ${sessionScope.session}
    regist
</form>
</body>
</html>
