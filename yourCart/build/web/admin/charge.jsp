<%-- 
    Document   : charge
    Created on : Mar 9, 2017, 12:17:42 AM
    Author     : Nesmaa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>



<%@ page import="org.yourcart.controller.admin.AdminProductServlet" %> 
<%@include file="header.jsp" %>

<%-- include slidebar file --%> 
<%@include file="slidebar.jsp" %>
<jsp:include page="ChargeServlet"/>


<div class="col-sm-9 padding-right">

    <h2>Scratch Card
        <a class="btn btn-default" style="float: right;" href="AddCards.jsp">New Card</a>
    </h2>




    <div class="table-responsive cart_info">
        <table class="table table-condensed">
            <thead>

                <tr class="cart_menu">
                    <td class="image">Cards</td>
                   
                    <td class="cart_description"> Number Of Cards Available</td>
                </tr>
            </thead>
            <tbody>
                        <tr>
                            <td class="cart_product">
                                 <p>50$</p>
                            </td>
                            
                               
                            
                            <td class="cart_description">
                                <p>${requestScope.SumCard50}</p>
                            </td>
                        </tr>
                        <tr>
                            <td class="cart_product">
                                 <p>100$</p>
                            </td>
                            <td class="cart_description">
                                <p>${requestScope.SumCard100}</p>
                                
                            </td>
                        </tr>
                          <tr>
                            <td class="cart_product">
                                 <p>200$</p>
                            </td>
                            <td class="cart_description">
                                <p>${requestScope.SumCard200}</p>
                                
                            </td>
                        </tr>
                          <tr>
                            <td class="cart_product">
                                 <p>500$</p>
                            </td>
                            <td class="cart_description">
                                <p>${requestScope.SumCard500}</p>
                                
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
<%-- include notify file --%> 
<%@include file="notify.jsp" %>