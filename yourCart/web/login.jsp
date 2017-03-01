<%-- 
    Document   : login
    Created on : Mar 1, 2017, 10:35:30 PM
    Author     : MotYim
--%>

<%-- include header file --%> 
<%@include file="header.jsp" %>

<section id="form"><!--form-->
    <div class="container">
        <div class="row">
            <div class="col-sm-4 col-sm-offset-1">
                <div class="login-form"><!--login form-->
                    <h2>Login to your account</h2>
                    <form action="#" id="SigninForm">
                        <input type="text" placeholder="username" id="SigninName" required/>
                        <input type="password" placeholder="password" id="SigninPassword" required/>
                        <span>
                            <input type="checkbox" class="checkbox" id="SigninCheckbox"> 
                            Keep me signed in
                        </span>
                        <button type="submit" class="btn btn-default">Login</button>
                    </form>
                </div><!--/login form-->
            </div>
            <div class="col-sm-1">
                <h2 class="or">OR</h2>
            </div>
            <div class="col-sm-4">
                <div class="signup-form"><!--sign up form-->
                    <h2>New User Signup!</h2>
                    <form action="#" id="SignupForm" onsubmit="validateSignup();">
                        <input type="text" placeholder="Name" id="SignupName" required/>
                        <input type="email" placeholder="Email Address" id="SignupEmail" required/>
                        <input type="password" placeholder="Password" id="SignupPassword" required/>
                        <input type="password" placeholder="ConfirmPassword" id="SignupConfirmPassword" required/>
                        <div class="alert alert-warning" role="alert" id="errorPassword" style="display: none;">passwords donot match</div>

                        <input type="text" placeholder="Address" id="SignupAddress" required/>
                        <input type="text" placeholder="Job" id="SignupJob" required/>
                        <input type="text" placeholder="CreditCard" id="SignupCreditCard" required/>
                        <div class="alert alert-warning" role="alert" id="errorCredit" style="display: none;">invalid creditCardNumber</div>

                        <!--validate password-->
                        <button type="submit" class="btn btn-default">Signup</button>
                    </form>
                </div><!--/sign up form-->
            </div>
        </div>
    </div>
</section><!--/form-->

<%-- include footer file --%> 
<%@include file="footer.jsp" %>
