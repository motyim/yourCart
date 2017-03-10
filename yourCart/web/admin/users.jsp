<%-- 
    Document   : users
    Created on : Feb 28, 2017, 11:39:20 PM
    Author     : MotYim
--%>

<%-- include header file --%> 
<%@ page import="org.yourcart.controller.admin.AdminUserServlet" %> 

<%@include file="header.jsp" %>

<%-- include slidebar file --%> 
<%@include file="slidebar.jsp" %>

<div class="col-sm-9 padding-right">

    <h2>Users</h2>


    <div class="table-responsive cart_info">
        <table class="table table-condensed">
            <thead>
                <tr class="cart_menu">
                    <td class="image">User</td>
                    <td class="description"></td>
                    <td></td>
                </tr>
            </thead>
            <tbody>
                 <c:if test="${!empty requestScope.allUsersAdmin}">

                     <c:forEach items="${requestScope.allUsersAdmin}" var="user">
                <tr>
                    <td class="cart_product">
                        <img src="../${user.photo}" alt="">
                    </td>
                    <td class="cart_description">
                        <h4>${user.userName}</h4>
                        <p>${user.email}</p>
                    </td>

                    <td class="cart_delete">
                        <a class="cart_quantity_delete" href="AdminProfile?id=${user.userId}"><i class="fa fa-pencil"></i></a>
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

