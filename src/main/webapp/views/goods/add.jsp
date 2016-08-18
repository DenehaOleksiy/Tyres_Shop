<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Администратор
  Date: 17.07.2016
  Time: 13:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="form">
    <form  action="/addNewTyres?${_csrf.parameterName}=${_csrf.token}" method="post" enctype="multipart/form-data">

        <input name="name" type="text" placeholder="name">
        <input name="price" type="number" placeholder="price" >

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

        <div class="inpImage"> <input type="file" name="image" ></div>

        <button  type="submit">Add</button>
    </form>
</div>



