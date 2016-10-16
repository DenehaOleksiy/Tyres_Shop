<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Администратор
  Date: 05.08.2016
  Time: 13:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="header">
    <div class="h1Header"></div>
    <div class="logoHeader"></div>
    <div class="logoLine"></div>
    <div class="login">
        <div> <sec:authorize access="isAnonymous()"><a  href="/loginpage">Login!</a></sec:authorize></div>
        <sec:authorize access="isAuthenticated()">
            <p>  Hello  <sec:authentication property="principal.username" />!</p>

            <form:form action="/logout" method="post">
                <div> <button style="margin: 4px 0 0 70px; "  type="submit">Logout</button></div>
            </form:form>
        </sec:authorize>
        <div> <sec:authorize access="isAnonymous()"><a  href="/registration">Registration!</a> </sec:authorize></div>
    </div>
</div>
