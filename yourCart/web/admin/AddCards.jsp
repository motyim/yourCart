<%-- 
    Document   : AddCards
    Created on : Mar 9, 2017, 1:07:53 AM
    Author     : Nesmaa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="org.yourcart.controller.AdminProductServlet" %> 
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
                 
                        <input type="text" name="numberofcard" value="enter number" required="" class="input-field"  />
     
                  
                 
                        <input type="submit" value="Add"  class="btn btn-default" >
        
        </form>
         </div>
        
        

</div>
</div>
</div>
</section> <!--/#cart_items-->

<%-- include footer file --%> 
<%@include file="footer.jsp" %>


