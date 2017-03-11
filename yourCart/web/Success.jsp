<%-- 
    Document   : loginSuccess
    Created on : Mar 2, 2017, 11:19:50 AM
    Author     : sara metwalli
--%>


<%@include file="header.jsp" %>

<section id="form"><!--form-->
    <div class="container">
        <div class="row">

            <div class="alert alert-success">
                <strong>${message}</strong> 
                <p style="cursor: pointer"><a href="index.jsp">Home</a></p>
            </div>

        </div>
    </div>

    <c:if test="${!empty requestScope.showGoToCharge}">
        <center><div   id="goToCharge" >
                <font size="5px">  <a href="ConfirmScratchCard.jsp"><i class="fa fa-arrow-circle-right fa-3x"></i>Go For Charging</a></font>
            </div></center>
        </c:if>
</section>


<%@include file="footer.jsp" %>
