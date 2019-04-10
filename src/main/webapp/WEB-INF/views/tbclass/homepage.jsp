<%--
  Created by IntelliJ IDEA.
  User: 凉皮
  Date: 2018/9/30
  Time: 14:22
  To change this template use File | Settings | File Templates.
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<table>
    <tr>
        <td>班级</td><td>班主任</td>
    </tr>
<c:forEach items="${classes}" var="c">
    <tr>
        <td>${c.name}</td><td>${c.teacher}</td>
    </tr>
</c:forEach>

</table>
