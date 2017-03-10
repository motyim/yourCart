<%-- 
    Document   : AddCards
    Created on : Mar 9, 2017, 1:07:53 AM
    Author     : Nesmaa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%@ page import="org.yourcart.controller.admin.AdminProductServlet" %> 
<%@include file="header.jsp" %>

<%-- include slidebar file --%> 
<%@include file="slidebar.jsp" %>

<div class="col-sm-6 padding-right">

    <h3 color="#fe980f">New Card</h3>

    <div class="table-responsive cart_info">

        <form action="ChangeCards" method="get"> 
            <div class="product-information"
                 <br>

                <label>Cards</label>
                <select name="cards">
                    <option> 50 </option>
                    <option>100</option>
                    <option> 200</option>
                    <option>500</option>
                </select>



                <label>Number Of Cards</label>

                <input type="number" name="numberofcard" placeholder="enter number" required min="1" class="input-field"  />



                <input type="submit" value="Add"  class="btn btn-default" >

                </form>
            </div>



    </div>
</div>
</div>
</section> <!--/#cart_items-->

<%-- include footer file --%> 
<%@include file="footer.jsp" %>


