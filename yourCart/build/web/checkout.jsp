<%-- 
    Document   : checkout
    Created on : Feb 28, 2017, 10:43:47 PM
    Author     : MotYim
--%>

<%-- include header file --%> 
<%@include file="header.jsp" %>
<%@ page import="org.yourcart.controller.user.CartHandlerServlet" %> 




<section id="cart_items">
    <div class="container">

        <div class="breadcrumbs">
            <ol class="breadcrumb">
                <li><a href="#">Home</a></li>
                <li class="active">Check out</li>
            </ol>
        </div><!--/breadcrums-->



        <div class="review-payment">
            <h2>Review & Payment</h2>
        </div>

        <div class="table-responsive cart_info">
            <table class="table table-condensed">
                <thead>
                    <tr class="cart_menu">
                        <td class="image">Item</td>
                        <td class="description"></td>
                        <td class="price">Price</td>
                        <td class="quantity">Quantity</td>
                        <td class="total">Total</td>
                        <td></td>
                    </tr>
                </thead>
                <tbody>



                    <c:set var="total" value="${0}"/>

                    <c:if test="${!empty requestScope.carts}">
                       

                        <c:forEach items="${requestScope.carts}" var="cart">
                            <tr>



                                <td class="cart_product">
                                    <a href=""><img src="${cart.photo}" alt=""></a>
                                </td>
                                <td class="cart_description">
                                    <h4><a href="">${cart.discriptin}</a></h4>
                                    <p>Product ID: ${cart.productId}</p>
                                </td>
                                <td class="cart_price">

                                    <p>$${cart.price}</p>
                                </td>
                                <td class="cart_price">
                                    <p>${cart.quantity}</p>
                                </td>
                                <td class="cart_total">
                                    <p class="cart_total_price">
                                            $${cart.price*cart.quantity}
                                    </p>

                                </td>
                                <td class="cart_delete">
                                    <INPUT type="hidden" id="hiddenCart" value="${cart.cartId}"/>
                                  
                                    <a  href="DeleteCart?id=${cart.cartId}"><i class="fa fa-times"></i></a>
                         

                                </td>
                                <c:set var="total" value="${total+(cart.price*cart.quantity)}"/>
                            </tr>
                        </c:forEach>
                    </c:if>


                    <tr>
                        <td colspan="4">&nbsp;</td>
                        <td colspan="2">
                            <table class="table table-condensed total-result">
                                <tr>
                                    <td>Cart Sub Total</td>
                                    <td>$${total}</td>
                                </tr>
                                <tr class="shipping-cost">
                                    <td>Shipping Cost</td>
                                    <td>Free</td>										
                                </tr>
                                <tr>
                                    <td>Total</td>
                                    <td><span>$${total}
                                        </span></td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
        <div class="payment-options">
            <a class="btn btn-primary" href="Pay">Pay</a>
        </div>
    </div>
</section> <!--/#cart_items-->

<%-- include footer file --%> 
<%@include file="footer.jsp" %>
