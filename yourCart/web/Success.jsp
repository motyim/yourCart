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
                <p style="cursor: pointer"><a onclick="window.history.back();">Back</a></p>
            </div>

        </div>
    </div>
</section>


<%@include file="footer.jsp" %>
