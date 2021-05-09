<%--
  Created by IntelliJ IDEA.
  User: jsrdyfy
  Date: 2020/8/8
  Time: 20:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

你好${sessionScope.user}

<form action="valLogin.do">
    <input type="text" name="username"/>
    <input type="submit" value="提交"/>
</form>
<form action="valRegist.do">
    <input type="text" name="regist"/>
    <input type="submit" value="提交"/>
</form>
<s:fielderror/>

</body>
</html>
