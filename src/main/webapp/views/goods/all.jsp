<%--
  Created by IntelliJ IDEA.
  User: Администратор
  Date: 18.07.2016
  Time: 20:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<div class="allGoodsOut">

    <s:forEach items="${showAll}" var="a">
        <div class="allGoods">
            <div class="page">
                <a  href="/goods/page/${a.id}">

                    <p style="text-align: center; font-diameter: 14pt;"><span>${a.name}</span></p>
                    <p style="text-align: center; font-diameter: 14pt;">${a.brand}</p>
                    <p style="text-align: center; font-diameter: 14pt;">${a.category}</p>
                    <p style="text-align: center; font-diameter: 14pt;">${a.diameter}</p>
                    <p style="text-align: center; font-diameter: 14pt;">${a.width}</p>
                    <p style="text-align: center; font-diameter: 14pt;">${a.height}</p>
                    <p style="text-align: center; font-diameter: 14pt;">${a.price} UAH</p>

                    <img style="margin-bottom: 10px;" src="data:image/jpeg;base64,${a.image}"/>


                </a>
                <div class="allGoods2"> <sec:authorize access="hasRole('ROLE_ADMIN')">
                    <p><a  href="/goods/edit/${a.id}">Edit goods</a></p>
                    <p><a  href="/goods/delete/${a.id}">Delete goods</a></p>
                </sec:authorize>
                </div>
            </div>
        </div>
    </s:forEach>


    <div class="all3">
        <sec:authorize access="hasRole('ROLE_ADMIN')"><a  href="/goods/add">Add new Goods</a> </sec:authorize>
        <a  href="/">Home</a></div>
</div>
