<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2020/4/8
  Time: 18:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--    请求参数绑定--%>
<%--    <a href="/param/testParam">请求参数绑定</a>--%>

<%--<form action="/param/saveAccount" method="post">
    姓名：<input type="text" name="username"> <br>
    密码：<input type="password" name="password"> <br>
    金额：<input type="text" name="money"> <br>
    用户姓名：<input type="text" name="user.name"> <br>
    用户年龄：<input type="text" name="user.age"> <br>
    <input type="submit" value="提交">
</form>--%>
    <%--<form action="/param/saveAccount" method="post">
        姓名：<input type="text" name="username"> <br>
        密码：<input type="password" name="password"> <br>
        金额：<input type="text" name="money"> <br>
        用户姓名：<input type="text" name="users[0].name"> <br>
        用户年龄：<input type="text" name="users[0].age"> <br>
        用户姓名：<input type="text" name="userMap['one'].name"> <br>
        用户年龄：<input type="text" name="userMap['one'].age"> <br>
        <input type="submit" value="提交">
    </form>--%>
    <%--<form action="/param/saveUser" method="post">
        姓名：<input type="text" name="name"> <br>
        年龄：<input type="text" name="age"> <br>
        生日：<input type="text" name="date"> <br>
        <input type="submit" value="提交">
    </form>--%>
    <a href="/param/testServlet?id=1">Servlet原生的api</a>
</body>
</html>
