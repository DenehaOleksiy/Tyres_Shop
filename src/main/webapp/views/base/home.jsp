<%--
  Created by IntelliJ IDEA.
  User: Администратор
  Date: 18.08.2016
  Time: 12:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
  Created by IntelliJ IDEA.
  User: Администратор
  Date: 16.07.2016
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<div class="home">

    <div class="brands" >
        <table>
            <tr> <td><a href="#"><img src="/resources/images/pirelli-lrg.jpg"></a></td> <td><a href="#"><img src="/resources/images/toyo-300.jpg"></a></td> <td><a href="#"><img src="/resources/images/westlake-300.jpg"></a></td></tr>
            <tr> <td><a href="#"><img src="/resources/images/avon-lrg.jpg"></a></td> <td><a href="#"><img src="/resources/images/barum-300.jpg"></a></td> <td><a href="#"><img src="/resources/images/continental-300.jpg"></a></td></tr>
            <tr> <td><a href="#"><img src="/resources/images/bridgestone-300.jpg"></a></td> <td><a href="#"><img src="/resources/images/yokohama-lrg.jpg"></a></td> <td><a href="#"><img src="/resources/images/goodyear-lrg.jpg"></a></td></tr>
            <tr> <td><a href="#"><img src="/resources/images/michelin-300.jpg"></a></td> <td><a href="#"><img src="/resources/images/dunlop-lrg.jpg"></a></td> <td><a href="#"><img src="/resources/images/hancook-lrg.jpg"></a></td></tr>
        </table>
    </div>
<p style="font-size: larger;padding-top: 20px;"><span >No.1 Online Retailer in the Ukraine for Cheap Tyres</span></p>
  <p>  Established in 1994, Tyre Shopper has consistently maintained distinction as the Ukraina`s #1 tyre retailer for the past 8 years. With over 20 years of industry experience via a value-centric focus, we provide fully fitted tyres at 230 tyre centre locations across the country.

    Through an elite roster of over 1000 skilled tyre technicians servicing satisfied customers, we guarantee the best prices on the market without compromising quality, service and value-proposition.

    <p style="font-size: larger;padding-top: 20px;"><span >Brand Loyalty</span></p>

    As part of our brand-loyalty mandate, we ensure that all our customers are facilitated in smooth purchasing decisions through our database of over 6,000 verified ratings and reviews for a wide range of tyre-patterns, as penned by thousands of our existing satisfied customers.

    Moreover, Tyre Shopper prides itself in stocking and selling only internationally recognised major brands with world-class quality such as: Barum, Avon, Bridgestone, Continental, Dunlop, Goodyear, Michelin and Pirelli etc. – and more!

    <p style="font-size: larger;padding-top: 20px;"><span > Accolades</span></p>

    Tyre Shopper has the honor of having the highest number of tyre reviews on the online business reviewer website Trustpilot, whilst being a 12-time Hitwise ‘Top 10 Award’ winner.

    <p style="font-size: larger;padding-top: 20px;"><span > Customer-Satisfaction</span></p>

    Tyre Shopper’s UK based customer service call-centre is fully accessible through a designated Freephone number around the clock throughout the year, 24 hours a day and 7 days a week! Our customer service agents strive to exceed your expectations.

    <p style="font-size: larger;padding-top: 20px;"><span > Price Promise Guarantee!</span></p>

    Our unique Price Promise Guarantee ensures that we provide you with the lowest most value-oriented prices on the market.

    Our rich database enlists a wide array of van tyres, caravan tyres, 4x4 tyres, summer and winter tyres in premium, mid or budget ranges – easily searchable to give you instant access to tens of thousands of tyre brands in stock.</p>

    <div class="homeInn">
        <sec:authorize access="hasRole('ROLE_ADMIN')">
            <a  href="/all/diameter">All diameter</a>
            <a  href="/all/width">All width</a>
            <a  href="/all/height">All height</a>
        </sec:authorize>
    </div>


</div>




