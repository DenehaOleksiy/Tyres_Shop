<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Администратор
  Date: 10.08.2016
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="form">
    <form:form action="/find/name/name" method="post" modelAttribute="names">
        <form:label path="name">Enter Name</form:label>
        <form:input path="name"/>
        <form:button value="submit">Search</form:button>
    </form:form>
</div>