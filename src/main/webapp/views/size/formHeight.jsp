<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Администратор
  Date: 09.08.2016
  Time: 17:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="form">
    <form:form action="/new/height" method="post" modelAttribute="newHeight">
        <form:label path="height">Enter Height</form:label>
        <form:input path="height"/>
        <form:button  value="submit">Submit</form:button>
    </form:form>
</div>