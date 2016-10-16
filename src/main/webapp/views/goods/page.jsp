<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="pageGoods">
    <%--<p>${goods.id}</p>--%>
    <p><span>${goods.name}</span></p>
    <p>${goods.brand}</p>
    <p>${goods.category}</p>
    <p>${goods.diameter}</p>
    <p>${goods.width}</p>
    <p>${goods.height}</p>
    <p>${goods.price} UAH</p>

    <img src="data:image/jpeg;base64,${goods.image}"/>

    <form  action="/addToCart/${goods.id}?${_csrf.parameterName}=${_csrf.token}" method="post" >
        <input type="hidden" name="id" value="${goods.id}">
        <sec:authorize access="isAuthenticated()">
            <button type="submit">Add to Cart</button>
        </sec:authorize>
    </form>

    <a  href="/goods/all">All goods</a>
</div>



