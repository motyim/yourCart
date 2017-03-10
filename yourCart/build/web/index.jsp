<%--
    Document   : index
    Created on : Feb 28, 2017, 10:25:09 PM
    Author     : MotYim
--%>
<%@ page import="org.yourcart.controller.user.IndexProductServlet" %> 
<%--<jsp:include page="/IndexProductServlet"/> --%> 
<%-- include header file --%> 
<%@include file="header.jsp" %>


<%-- include slider file --%> 
<%@include file="slider.jsp" %>


<%-- include slidebar file --%> 
<%@include file="slidebar.jsp" %>
<jsp:include page="/IndexProductServlet"/>
<div class="col-sm-9 padding-right">
    <div class="features_items"><!--features_items-->
        <h2 class="title text-center">New Items</h2>

        <c:if test="${!empty requestScope.limitedProducts}">

            <c:forEach items="${requestScope.limitedProducts}" var="product">

                <div class="col-sm-4">
                    <div class="product-image-wrapper">
                        <div class="single-products">
                            <div class="productinfo text-center">
                                <img src=${product.photo} alt="" />
                                <h2>$${product.price}</h2>
                                <p>${product.name}</p>
                                <a class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
                            </div>
                            <div class="product-overlay">
                                <div class="overlay-content">
                                    <h2>$${product.price}</h2>
                                    <p>${product.name}</p>
                                    <a  id="${product.productId}" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
                                </div>
                            </div>
                            <img src="images/home/new.png" class="new" alt="" />
                        </div>
                        <div class="choose">
                            <ul class="nav nav-pills nav-justified">
                                <li><a href="Product?id=${product.productId}"><i class="fa fa-plus-square"></i>View Details</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </c:if>

    </div><!--features_items-->
</div>
</div>
</div>
</section>


<%-- include footer file --%> 
<%@include file="footer.jsp" %>
