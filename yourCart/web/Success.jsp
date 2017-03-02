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
                <strong>${requestScope.message}</strong> 
                <p><a href="index.jsp">Home</a></p>
            </div>

        </div>
    </div>
</section>


<%@include file="footer.jsp" %>
