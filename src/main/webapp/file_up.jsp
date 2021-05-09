<%--
  Created by IntelliJ IDEA.
  User: jsrdyfy
  Date: 2020/8/8
  Time: 21:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="fileUp.do" method="post" enctype="multipart/form-data">
    <input type="file" name="fileUpLoad"/>
    <input type="submit" value="上传">
</form>

<a href="download.do?fileUpLoadFileName=wifi.txt">下载</a>
</body>
</html>
