<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Администратор
  Date: 10.08.2016
  Time: 10:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="form">
    <form:form action="/edit/Goods" method="post" >

        <input name="id" type="hidden" value="${edit.id}">
        <input name="name" type="text" placeholder="name">
        <input name="price" type="text" placeholder="price" >

        <select name="brand">
            <c:forEach items="${brand}" var="a">
                <option value="${a.id}"/>Brand: ${a.brandType}
            </c:forEach>
        </select>

        <select name="diameter">
            <c:forEach items="${diameter}" var="a">
                <option  value="${a.id}"/>Diameter: ${a.sizeDiameter}
            </c:forEach>

        </select> <select name="width">
        <c:forEach items="${width}" var="a">
            <option  value="${a.id}"/>Width: ${a.width}
        </c:forEach>

    </select> <select name="height">
        <c:forEach items="${height}" var="a">
            <option  value="${a.id}"/>Height: ${a.height}
        </c:forEach>
    </select>

        <select name="category">
            <c:forEach items="${category}" var="a">
                <option value="${a.id}"/> Category: ${a.categoryType}
            </c:forEach>
        </select>

        <button type="submit">Edit</button>

    </form:form>
</div>