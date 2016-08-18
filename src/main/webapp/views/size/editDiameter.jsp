<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Администратор
  Date: 08.08.2016
  Time: 0:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div class="form">
    <form:form action="/edit/diameter" method="post" modelAttribute="edit">

        <form:label path="id">Id</form:label>
        <form:input path="id"/>
        <form:button value="submit">Submit</form:button>

    </form:form>
</div>

</body>
</html>
