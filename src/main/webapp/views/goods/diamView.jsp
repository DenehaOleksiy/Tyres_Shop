<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<s:forEach items="${diamList}" var="a">
    <div class="allGoodsOut">
        <div class="allGoods">
            <div class="page">

                <a  href="/goods/page/${a.id}">
                    <p style="text-align: center; font-diameter: 14pt;">${a.name}</p>
                    <p style="text-align: center; font-diameter: 14pt;">${a.brand}</p>
                    <p style="text-align: center; font-diameter: 14pt;">${a.category}</p>
                    <p style="text-align: center; font-diameter: 14pt;">${a.diameter}</p>
                    <p style="text-align: center; font-diameter: 14pt;">${a.width}</p>
                    <p style="text-align: center; font-diameter: 14pt;">${a.height}</p>
                    <p style="text-align: center; font-diameter: 14pt;">${a.price} UAH</p>

                    <img src="data:image/jpeg;base64,${a.image}"/>
                </a>

            </div>


            <form  action="/addToCart/${a.id}?${_csrf.parameterName}=${_csrf.token}" method="post" >
                <input type="hidden" name="id" value="${a.id}">
                <sec:authorize access="isAuthenticated()">
                    <button type="submit">Add to Cart</button>
                </sec:authorize>
            </form>
            <a  href="/goods/all">All goods</a>
        </div>
    </div>

</s:forEach>

