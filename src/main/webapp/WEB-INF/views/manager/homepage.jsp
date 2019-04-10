<%--
  Created by IntelliJ IDEA.
  User: 凉皮
  Date: 2018/9/30
  Time: 10:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <script src=${pageContext.request.contextPath}/js/jquery-3.3.1.js" type="text/javascript">
    </script>
    <title>Title</title>
    <style type="text/css">

        ul{
            width: 100%;
        }
        li{list-style-type: none;
            float: left;
            margin-right: 20px;
        }

        .clean{
            clear: both;
        }
    </style>
    <script type="javascript">
        function classmanager() {
            $.post("classmanager",function (data) {
                $('#main').html(data)
            })
        }

    </script>
</head>
<body>
<div>
    <ul>
        <li><a href="#">首页</a></li>
        <li><a href="#">管理</a></li>
        <li><a href="#" onclick="classmanager()">班级管理</a></li>
        <li><a href="#">班级管理</a></li>
        <li><a href="#">学生管理</a></li>
        <li><a href="#">课程管理</a></li>
        <li><a href="#">按班级录入成绩</a></li>
        <li><a href="#">学生成绩修改</a></li>
    </ul>
    <div class="clean"></div>
</div>
<div id="main"></div>

</body>
</html>
