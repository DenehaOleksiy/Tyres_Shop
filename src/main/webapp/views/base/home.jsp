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
    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce vulputate augue ac pretium convallis. Donec orci ex, laoreet convallis massa at, luctus tincidunt ante. Morbi faucibus sodales velit et viverra. Praesent orci elit, volutpat quis metus nec, mattis ornare risus. Pellentesque mollis et sapien vitae pretium. Nulla facilisi. In quis gravida ipsum, at dapibus elit. Etiam sit amet mauris et libero auctor fringilla ac ac quam. Interdum et malesuada fames ac ante ipsum primis in faucibus.<br>

        Pellentesque varius commodo leo et imperdiet. Quisque a purus quis metus consequat pretium at id lorem. Etiam auctor dui vel erat rhoncus, ac viverra lectus varius. Duis lectus lorem, tincidunt a fringilla nec, pretium vestibulum mauris. Phasellus consequat porttitor orci, volutpat pulvinar diam placerat maximus. Morbi eget efficitur dui, pharetra ornare massa. Aliquam erat volutpat. Maecenas metus nisi, facilisis ut orci quis, interdum aliquam arcu. Ut non libero eros. Proin elementum viverra efficitur. Proin non venenatis est. Interdum et malesuada fames ac ante ipsum primis in faucibus. Nam venenatis eu quam eu interdum.<br>

        Aliquam lacinia eros et metus egestas volutpat. Sed tempor nulla ac mauris tincidunt, non feugiat mauris sollicitudin. Nullam cursus maximus nulla, ut pellentesque mauris fringilla id. Sed congue sed nunc ac vulputate. Ut vitae aliquet nibh, non varius nulla. Sed dictum pellentesque nisi, id sodales magna accumsan at. Proin pellentesque, lectus ac auctor euismod, massa urna ullamcorper turpis, efficitur aliquam augue erat sit amet lacus. Donec congue dolor enim, eu tristique nunc vestibulum eget. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Vivamus efficitur accumsan nunc, eget tincidunt libero vestibulum nec. Nunc nec auctor nibh. Sed ultrices nisl vitae metus commodo, et pharetra felis sagittis. Etiam volutpat sodales semper. Mauris malesuada velit ac libero vehicula, quis ultricies erat suscipit. Vivamus eget pellentesque nibh, quis ullamcorper metus. Maecenas id libero molestie, tempor enim non, cursus magna.<br>


    <div class="homeInn">
        <sec:authorize access="hasRole('ROLE_ADMIN')">
            <a  href="/all/diameter">All diameter</a>
            <a  href="/all/width">All width</a>
            <a  href="/all/height">All height</a>
        </sec:authorize>
    </div>


</div>




