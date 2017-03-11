<%-- 
    Document   : ConfirmScratchCard
    Created on : Mar 9, 2017, 7:55:31 AM
    Author     : sara metwalli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="header.jsp" %>
<%@include file="slidebar.jsp" %>


<Form action="ConfirmScratchCardServlet" id="ConfirmCardForm" method="POST"><!--form-->
    <div class="container">
        <div class="row">
            <div class="col-xs-9">
                <center><h2 class="title text-center">Please Write the code you got on mail here </h2>
            <p>your cash $${LoginUser.cash}</p>
               <Input type="Text" class="input-field" name="CardStr" placeholder="write card code" required="true">
                
                <BR>
                <BR>
                <button type="submit" class="btn btn-default">Submit</button> 
                </center>
            </div>
            
        </div>
    </div>
</Form>

<%@include file="footer.jsp" %>

