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
               <font size="5px"> <strong>${message}</strong> </font>
                <p style="cursor: pointer"><a onclick="window.history.back();">Back</a></p>
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
