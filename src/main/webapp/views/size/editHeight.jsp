<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Администратор
  Date: 09.08.2016
  Time: 17:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="form">
    <form:form action="/edit/height" method="post" modelAttribute="edit">

        <form:label path="id">Id</form:label>
        <form:input path="id"/>
        <form:button value="submit">Submit</form:button>
    </form:form>
</div>
