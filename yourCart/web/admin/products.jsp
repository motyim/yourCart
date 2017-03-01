<%-- 
    Document   : products
    Created on : Feb 28, 2017, 11:39:20 PM
    Author     : MotYim
--%>

<%-- include header file --%> 
<%@include file="header.jsp" %>

<%-- include slidebar file --%> 
<%@include file="slidebar.jsp" %>

<div class="col-sm-9 padding-right">

    <h2>Products
        <a class="btn btn-default" style="float: right;">New Product</a>
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
                <tr>
                    <td class="cart_product">
                        <a href=""><img src="../images/cart/one.png" alt=""></a>
                    </td>
                    <td class="cart_description">
                        <h4><a href="">Colorblock Scuba</a></h4>
                        <p>Web ID: 1089772</p>
                    </td>
                    <td class="cart_price">
                        <p>$59</p>
                    </td>
                    <td class="cart_price">
                        <p>2</p>
                    </td>
                    <td class="cart_delete">
                        <a class="cart_quantity_delete" href=""><i class="fa fa-times"></i></a>
                        <a class="cart_quantity_delete" href=""><i class="fa fa-pencil"></i></a>
                    </td>
                </tr>


            </tbody>
        </table>
    </div>

</div>
</div>
</div>
</section> <!--/#cart_items-->

<%-- include footer file --%> 
<%@include file="footer.jsp" %>
