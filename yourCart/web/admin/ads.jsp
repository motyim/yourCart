<%-- 
    Document   : products
    Created on : Feb 28, 2017, 11:39:20 PM
    Author     : MotYim
--%>

<%-- include header file --%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="org.yourcart.controller.AdminProductServlet" %> 
<%@include file="header.jsp" %>

<%-- include slidebar file --%> 
<%@include file="slidebar.jsp" %>

<div class="col-sm-9 padding-right">

    <h2>Advertisement
     <a class="btn btn-default" style="float: right;" href="AddAdvert.jsp">New Advertisement</a>
    </h2>




    <div class="table-responsive cart_info">
        <table class="table table-condensed">
            <thead>

                <tr class="cart_menu">
                    <td class="image">Advertisement</td>
                    <td class="description"></td>
                  
                  
                    <td></td>
                </tr>
            </thead>
            <tbody>
                <c:if test="${!empty requestScope.allAdsAdmin}">

                    <c:forEach items="${requestScope.allAdsAdmin}" var="product">
                        <tr>
                            <td class="cart_product">
                                <a href=""><img src="../${product.image}" alt=""></a>
                                 <a class="cart_quantity_delete" href="DeleteAdvertisement?id=${product.id}"><i class="fa fa-times"></i></a>
                            </td>
                           
                          <!-- <td class="cart_delete">
                                <a class="cart_quantity_delete" href="DeleteAdvertisement?id=${product.id}"><i class="fa fa-times"></i></a>
                               
                            </td>
                        </tr>-->
                    </c:forEach>
                </c:if>


            </tbody>
        </table>
    </div>

</div>
</div>
</div>
</section> <!--/#cart_items-->

<%-- include footer file --%> 
<%@include file="footer.jsp" %>
