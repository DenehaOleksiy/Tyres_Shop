<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="menu">
    <ul>
        <li> <sec:authorize access="isAuthenticated()"><a id="basket" href="/basket">My basket</a></sec:authorize></li>
        <li> <a href="/goods/all">All tyres</a></li>
        <li><a href="/find/name">Find tyres by items</a></li>
        <li><a href="/find/diameter">Find tyres by diameter</a></li>
        <li><a href="/orderByPrice">Order tyres by price</a></li>
        <li><a href="/between">Find tyres between prices</a></li>

    </ul>
</div>
