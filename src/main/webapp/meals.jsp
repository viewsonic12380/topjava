<%@ page import="ru.javawebinar.topjava.model.MealTo" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Meals</title>
</head>
<body>
<h3><a href="index.html">Home</a></h3>
<hr>
<h2>Meals</h2>
<ul>
    <%
        List<MealTo> mealToList = (List<MealTo>) request.getAttribute("Meals");
    %>

    <c:forEach items="${Meals}" var="meal">
        <c:set var="text" value="${meal}"/>
        <c:set var="text" value="${fn:replace(text,'T', ' ')}"/>
        <p>${text}</p><br/>
    </c:forEach>

</ul>

</body>
</html>