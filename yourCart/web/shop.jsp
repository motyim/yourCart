<%-- 
    Document   : shop
    Created on : Feb 28, 2017, 10:51:25 PM
    Author     : MotYim
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="org.yourcart.controller.Shop" %> 
<%-- include header file --%> 
<%@include file="header.jsp" %>


<%-- include slidebar file --%> 
<%@include file="slidebar.jsp" %>

<div class="col-sm-9 padding-right">
    <div class="features_items"><!--features_items-->
        <h2 class="title text-center">Features Items</h2>

        <!-- Sara features_items-->

        <c:if test="${!empty requestScope.allProducts}">

            <c:forEach items="${requestScope.allProducts}" var="product">

                <div class="col-sm-4">
                    <div class="product-image-wrapper">
                        <div class="single-products">
                            <div class="productinfo text-center">
                                <img src="${product.photo}" alt="" />
                                <h2>$${product.price}</h2>
                                <p>${product.name}</p>
                                <a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
                            </div>
                            <div class="product-overlay">
                                <div class="overlay-content">
                                    <h2>$${product.price}</h2>
                                    <p>${product.name}</p>
                                    <a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
                                </div>
                            </div>
                        </div>
                        <div class="choose">
                            <ul class="nav nav-pills nav-justified">
                                <li><a href="ProductDetailsServlet?id=${product.productId}"><i class="fa fa-plus-square"></i>View Details</a></li>
                            </ul>
                        </div>
                    </div>
                </div>


            </c:forEach>
        </c:if>

        <!-- End Sara features_items-->

       



        
    </div><!--features_items-->
    <ul class="pagination">
            <li class="active"><a href="">1</a></li>
            <li><a href="">2</a></li>
            <li><a href="">3</a></li>
            <li><a href="">&raquo;</a></li>
        </ul>
</div>
</div>
</div>
</section>

<%-- include footer file --%> 
<%@include file="footer.jsp" %>