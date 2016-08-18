<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<h1 style="text-align: center;padding: 20px;">My basket</h1>
<c:forEach items="${goods}" var="a">
    <div class="allGoodsOut">
        <div class="allGoods">
            <div class="page">

                <p style="text-align: center; font-diameter: 14pt;">${a.name}</p>
                <p style="text-align: center; font-diameter: 14pt;">${a.brand}</p>
                <p style="text-align: center; font-diameter: 14pt;">${a.category}</p>
                <p style="text-align: center; font-diameter: 14pt;">${a.diameter}</p>
                <p style="text-align: center; font-diameter: 14pt;">${a.width}</p>
                <p style="text-align: center; font-diameter: 14pt;">${a.height}</p>
                <p style="text-align: center; font-diameter: 14pt;">${a.price} UAH</p>

                <img style="padding-bottom: 10px;" src="data:image/jpeg;base64,${a.image}"/>
            </div>


            <form  action="/remove/${a.id}?${_csrf.parameterName}=${_csrf.token}" method="post" >
                <input type="hidden" name="id" value="${a.id}">
                <sec:authorize access="isAuthenticated()">
                    <button type="submit">Remove</button>
                </sec:authorize>
            </form>
        </div>
    </div>
</c:forEach>

<div class="summa">
    <p>Total summa is: ${summ} UAH</p>
    <a href="/">Buy</a>
</div>
