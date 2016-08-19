<%--
  Created by IntelliJ IDEA.
  User: Администратор
  Date: 20.08.2016
  Time: 0:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="form4">
<form  action="/betweenView?${_csrf.parameterName}=${_csrf.token}" method="post" >
  Enter price from  <input name="from" placeholder="price from">
  Enter price to  <input name="to" placeholder="price to">
    <button type="submit">Search</button>
</form>
</div>