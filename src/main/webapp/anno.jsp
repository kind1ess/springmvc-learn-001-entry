<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2020/4/8
  Time: 21:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--    常用注解--%>
    <a href="/anno/testRequestParam?username=哈哈">@RequestParam</a>
    <br>

    <h3>@RequestBody</h3>   <br>
    <form action="/anno/testRequestBody" method="post">
        姓名：<input type="text" name="name"> <br>
        年龄：<input type="text" name="age"> <br>
        生日：<input type="text" name="date"> <br>
        <input type="submit" value="@RequestBody">
    </form>
    <br>

    <a href="/anno/testPathVariable/10">@PathVariable</a>   <br>
    <a href="/anno/testRequestHeader">@RequestHeader</a>    <br>
    <a href="/anno/testCookieValue">@CookieValue</a>    <br>
    <form action="/anno/testModelAttribute" method="post">
        姓名：<input type="text" name="name"> <br>
        年龄：<input type="text" name="age"> <br>
<%--        生日：<input type="text" name="date"> <br>--%>
        <input type="submit" value="@ModelAttribute">
    </form>
    <br>
    <a href="/anno/testSessionAttributes">@SessionAttributes</a>
    <br>
    <a href="/anno/getSessionAttributes">getSessionAttributes</a>
    <br>
    <a href="/anno/delSessionAttributes">delSessionAttributes</a>
</body>
</html>
