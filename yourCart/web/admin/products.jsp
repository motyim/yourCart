<%-- 
    Document   : products
    Created on : Feb 28, 2017, 11:39:20 PM
    Author     : MotYim
--%>

<%-- include header file --%>

<%@ page import="org.yourcart.controller.admin.AdminProductServlet" %> 
<%@include file="header.jsp" %>

<%-- include slidebar file --%> 
<%@include file="slidebar.jsp" %>

<div class="col-sm-9 padding-right">

    <h2>Products
        <a class="btn btn-default" style="float: right;" href="addproduct.jsp">New Product</a>
    </h2>




    <div class="table-responsive cart_info">
        <table class="table table-condensed">
            <thead>

                <tr class="cart_menu">
                    <td class="image">Item</td>
                    <td class="description"></td>
                    <td class="price">Price</td>
                    <td class="quantity">Quantity</td>
                    <td></td>
                </tr>
            </thead>
            <tbody>
                <c:if test="${!empty requestScope.allProductsAdmin}">

                    <c:forEach items="${requestScope.allProductsAdmin}" var="product">
                        <tr>
                            <td class="cart_product">
                                <a href=""><img src="../${product.photo}" alt=""></a>
                            </td>
                            <td class="cart_description">
                                <p>${product.name}</p>
                                
                            </td>
                            <td class="cart_price">
                                <h4>$${product.price}</h4>
                            </td>
                            <td class="cart_price">
                                <p>${product.quantity}</p>
                            </td>
                            <td class="cart_delete">
                                <a class="cart_quantity_delete" href="DeleteProduct?id=${product.productId}"><i class="fa fa-times"></i></a>
                                <a class="cart_quantity_delete" href="AdminProduct?id=${product.productId}"><i class="fa fa-pencil"></i></a>
                                <a class="cart_quantity_delete" href="AddSlider?id=${product.productId}"><i class="fa fa-star"></i></a>
                            </td>
                        </tr>
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
<%-- include notify file --%> 
<%@include file="notify.jsp" %>