<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="menu">
    <ul>
        <li> <sec:authorize access="isAuthenticated()"><a id="basket" href="/basket">My basket</a></sec:authorize></li>
        <li> <a href="/goods/all">All goods</a></li>
        <li><a href="/find/name">Find Goods by name</a></li>
        <li><a href="/find/diameter">Find Goods by diameter</a></li>
        <li><a href="/orderByPrice">Order Goods by price</a></li>
        <li><a href="/between">Find Goods between prices</a></li>

    </ul>
</div>
