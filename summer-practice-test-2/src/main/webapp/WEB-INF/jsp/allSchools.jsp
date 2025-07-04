<%@ taglib prefix="c" uri="jakarta.tags.core" %>
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
    <title>All Schools</title>
</head>
<body>
<h1>All schools</h1>
<ul>
    <c:forEach items="${schools}" var="school">
        <h2>${school.name}</h2>
        <c:forEach items="${school.students}" var="students">
            <ul>${students.name}</ul>>
        </c:forEach>
    </c:forEach>
</ul>
<script type="text/javascript" src="<c:url value='/static/css/script/common.js' />"></script>
</body>
</html>
