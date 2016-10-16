<%--
  Created by IntelliJ IDEA.
  User: Администратор
  Date: 07.08.2016
  Time: 20:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="form3" >
    <form:form action="/registration" method="post" modelAttribute="user">
        <ul style="color: #333">
            <li> <form:errors path="name"/>
                <form:label path="name">Name</form:label>
                <form:input id="a" path="name"/></li>

            <li><form:errors path="secondname"/>
                <form:label path="secondname">Secondname</form:label>
                <form:input id="b" path="secondname"/></li>

            <li><form:errors path="emailAdress"/>
                <form:label path="emailAdress">email</form:label>
                <form:input id="c" path="emailAdress"/></li>

            <li><form:errors path="phoneNumber"/>
                <form:label path="phoneNumber">Phone</form:label>
                <form:input id="d" path="phoneNumber"/></li>


            <li><form:errors path="password"/>
                <form:label path="password">password</form:label>
                <form:input id="e" path="password" /></li>

            <li><form:errors path="password"/>
                <form:label path="passwordConfirm">Confirm password</form:label>
                <form:input id="f" path="passwordConfirm"/></li>

            <li><form:button >Sign in!</form:button></li>
        </ul>
    </form:form>
</div>

