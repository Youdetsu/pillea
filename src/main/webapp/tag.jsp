<%--
  Created by IntelliJ IDEA.
  User: jsrdyfy
  Date: 2020/8/8
  Time: 19:33
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
    <s:form action="/tag.do" method="POST">
        <s:textfield name="username" label="用户名"/>
        <s:password name="password" label="密码"/>
        <s:submit value="提交"/>
    </s:form>
    <s:if test="username=='admin'">管理员</s:if>
    <s:elseif test="username=='user'">用户</s:elseif>
    <s:else>哈哈</s:else>
    <s:iterator value="list" var="s">
        ${s}
        <s:text name="s"/>
    </s:iterator>
    <s:iterator value="user" var="s">
       <s:property value="userName"/>
    </s:iterator>
</body>
</html>
