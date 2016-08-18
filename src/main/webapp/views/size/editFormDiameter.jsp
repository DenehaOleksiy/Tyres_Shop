<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Администратор
  Date: 08.08.2016
  Time: 0:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="form">
    <form:form action="/edit/result" method="post" modelAttribute="ed">
        <form:hidden path="id"/>
        <form:input path="sizeDiameter"/>
        <form:button value="submit">Submit</form:button>
    </form:form>
</div>
</body>
</html>
