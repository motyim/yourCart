<%-- 
    Document   : ConfirmScratchCard
    Created on : Mar 9, 2017, 7:55:31 AM
    Author     : sara metwalli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="header.jsp" %>
<%@include file="slider.jsp" %>


<Form action="ConfirmScratchCardServlet" id="ConfirmCardForm" method="POST"><!--form-->
    <div class="container">
        <div class="row">
            <h2 class="title text-center">Please Write the code you got on mail here </h2>
            <center>   <Input type="Text"  name="CardStr" required="true">
                
                <BR>
                <BR>
                <button type="submit" class="btn btn-default">Submit</button> </CENTER>
        </div>
    </div>
</Form>

<%@include file="footer.jsp" %>

