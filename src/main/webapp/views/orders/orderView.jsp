<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Администратор
  Date: 19.08.2016
  Time: 20:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<div class="form">
    <h2>Your order!</h2>

<p>Your name:  <span>  ${userView.name}</span></p>
<p>Your secondname:  <span>  ${userView.secondname}</span></p>

<p>Your city:   <span> ${orderView.city}</span></p>
<p>Your street:  <span>  ${orderView.street}</span></p>
<p>Your house number:  <span>  ${orderView.house}</span></p>
<p>Your appartment number:   <span> ${orderView.appartment}</span></p>
<p>Total summa:   <span> ${orderView.summa}</span></p>

  <span>  <a  href="/">Home</a></div></span>
</div>