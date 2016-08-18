<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Администратор
  Date: 09.08.2016
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="size">
    <c:forEach items="${allWidth}" var="s">
        <div class="sizeView">
            <p>Id ${s.id}</p>
            <p>Width ${s.width}</p>

        </div>
    </c:forEach>
    <div class="sizeInp">
        <a  href="/add/width">Add width</a>
        <a  href="/edit/width/form">Edit width</a>
        <a  href="/delete/width/form">Delete width</a>
        <a  href="/">Home</a>
    </div>
</div>