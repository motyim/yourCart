<%-- 
    Document   : history
    Created on : Mar 5, 2017, 11:40:37 PM
    Author     : sara metwalli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="org.yourcart.controller.admin.AdminHistoryServlet" %> 
<%@include file="header.jsp" %>

<%-- include slidebar file --%> 
<%@include file="slidebar.jsp" %>
<div class="col-sm-9 padding-right">

    <h2>History</h2>




    <div class="table-responsive cart_info">
        <table class="table table-condensed">
            <thead>

                <tr class="cart_menu">
                    <td class="quantity">historyId</td>
                    <td class="description">data</td>
                    <td class="quantity">quantity</td>
                    <td class="quantity">productId</td>
                    <td class="quantity">userId</td>

                    <td></td>
                </tr>
            </thead>
            <tbody>

                <c:if test="${!empty requestScope.allHistoryAdmin}">

                    <c:forEach items="${requestScope.allHistoryAdmin}" var="history">
                        <tr>
                           <td class="cart_quantity">
                                <p>${history.historyId}</p>
                            </td>
                            <td class="cart_description">
                                <p>${history.data}</p>

                            </td>
                            <td class="cart_quantity">
                                <p>${history.quantity}</p>
                            </td>
                            <td class="cart_quantity">
                                <p>${history.productId}</p>
                            </td>
                              <td class="cart_quantity">
                                <p>${history.userId}</p>
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

