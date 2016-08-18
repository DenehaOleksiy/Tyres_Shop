<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Администратор
  Date: 15.08.2016
  Time: 0:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="form">
    <form:form  action="/find/diameterView" method="post" modelAttribute="diam" >
        <select name="diameter">
            <c:forEach items="${diam}" var="a">
                <option value="${a.sizeDiameter}"/>Diameter: ${a.sizeDiameter}
            </c:forEach>
        </select>
        <button  type="submit">Search</button>
    </form:form>
</div>