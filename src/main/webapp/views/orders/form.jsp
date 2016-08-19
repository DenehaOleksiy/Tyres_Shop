<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Администратор
  Date: 19.08.2016
  Time: 19:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="form">
<form  action="/order?${_csrf.parameterName}=${_csrf.token}" method="post">
    <input name="city">Enter your city</input>
    <input name="street">Enter your street</input>
    <input name="house">Enter house number </input>
    <input name="appartment">Enter appartment number</input>
    <button type="submit">Submit</button>
</form>
</div>