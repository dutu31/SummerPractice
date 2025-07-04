<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dutu
  Date: 7/4/25
  Time: 1:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="<c:url value="/static/css/common.css"/>" rel="stylesheet" type="text/css">
    <title>All students</title>


</head>
<body>
    <h1>All students</h1>
    <ul>
        <c:forEach items="${students}" var="student">
            <li>${student.name} - ${student.age} years old</li>
        </c:forEach>
    </ul>

    <script type="text/javascript" src="<c:url value='/static/css/script/common.js' />"></script>
</body>
</html>
