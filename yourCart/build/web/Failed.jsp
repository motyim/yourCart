<%-- 
    Document   : LoginFailed
    Created on : Mar 2, 2017, 11:25:56 AM
    Author     : sara metwalli
--%>

    <%@include file="header.jsp" %>

    <section id="form"><!--form-->
        <div class="container">
            <div class="row">

                <div class="alert alert-danger">
                    <font size="5px">  <strong>${message}</strong> </font> 
                    <p style="cursor: pointer"><a onclick="window.history.back();">Back</a></p>
                </div>

            </div>
        </div>
    </section>
    <%@include file="footer.jsp" %>