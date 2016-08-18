<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Администратор
  Date: 07.08.2016
  Time: 23:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="size">
    <c:forEach items="${allDiameter}" var="s">
        <div class="sizeView">
            <p>Id ${s.id}</p>
            <p>Diameter ${s.sizeDiameter}</p>

        </div>
    </c:forEach>
    <div class="sizeInp">
        <a  href="/add/diameter">Add diameter</a>
        <a  href="/edit/diameter/form">Edit diameter</a>
        <a  href="/delete/diameter/form">Delete diameter</a>
        <a  href="/">Home</a>
    </div>
</div>