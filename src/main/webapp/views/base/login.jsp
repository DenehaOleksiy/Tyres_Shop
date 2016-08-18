<%--
  Created by IntelliJ IDEA.
  User: Администратор
  Date: 07.08.2016
  Time: 20:38
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<form:form  action="/loginprocessing" method="post">


    <h1 style="text-align: center; font-size: 30px;color: azure;padding: 20px 0;">Увійдіть у систему!</h1>
    <div class="form2">
        <label for="login">Логін: </label>
        <input id="login" type="text" name="username" placeholder="Email or phoneNumber">
        <label for="password">Пароль: </label>
        <input id="password" type="password" name="password" placeholder="Password">

        <button  type="submit">Login</button>
    </div>

</form:form>

