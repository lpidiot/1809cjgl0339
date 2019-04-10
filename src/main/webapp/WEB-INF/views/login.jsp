<%--
  Created by IntelliJ IDEA.
  User: 凉皮
  Date: 2018/9/29
  Time: 19:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<html>

<link href="${pageContext.request.contextPath}/css/login.css" type="text/css" rel="stylesheet">
</head>

<body>
<div class="main">
    <div class="head">
        <h1>Please log in</h1>
    </div>
    <div class="login">
        <form action="login" method="post">
            <li><input type="text" name="xuehao"><a href="#" class="icon user"></a></li>
            <li><input type="password" name="password"><a href="#" class="icon lock"></a></li>

            <div class="submit">
                <input type="submit" value="Sign in" >
                <a href="#" class="wj">Forget the password?</a>
                <div class="clear">  </div>
            </div>

        </form>
    </div>
</div>


</body>
</html>