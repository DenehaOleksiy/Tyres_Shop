<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Администратор
  Date: 09.08.2016
  Time: 17:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="size">
    <c:forEach items="${allHeight}" var="s">
        <div class="sizeView">
            <p>Id ${s.id}</p>
            <p>Height ${s.height}</p>

        </div>
    </c:forEach>
    <div class="sizeInp">
        <a  href="/add/height">Add height</a>
        <a  href="/edit/height/form">Edit height</a>
        <a  href="/delete/height/form">Delete height</a>
        <a  href="/">Home</a>
    </div>
</div>