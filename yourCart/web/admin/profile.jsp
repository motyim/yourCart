<%-- 
    Document   : profile-admin
    Created on : Feb 28, 2017, 11:32:02 PM
    Author     : MotYim
--%>

<%-- include header file --%> 
<%@include file="header.jsp" %>

<%-- include slidebar file --%> 
<%@include file="slidebar.jsp" %>

<div class="col-sm-9 padding-right">
    <div class="product-details"><!--product-details-->
        <div class="col-sm-4">
            <div class="view-product">
                <img src="../images/product-details/1.jpg" id="imageView" alt="" />
            </div>


        </div>
        <div class="col-sm-8">
            <div class="alert alert-warning" role="alert" id="error" style="display: none;"></div>
            
            <c:if test="${not empty messageInfo}">
                <div class="alert alert-success" role="alert" >${messageInfo}</div>
            </c:if>
            
            <div class="product-information"><!--/product-information-->
                <form action="AdminProfile" method="post" id="editProfileForm" onsubmit="return validateSignup();">	
                    <h2>${userInfo.userName}</h2>
                    <p>Account Setting</p>
                    <label>Name</label>
                    <input type="text" placeholder="Name"  class="input-field" name="username" id="editUserName" value="${userInfo.userName}" required/>
                    <label>E-mail</label>
                    <input type="email" placeholder="E-mail"  class="input-field" name="email" id="editEmail" value="${userInfo.email}" required/>
                    <label>Password</label>
                    <input type="Password" placeholder="Password"  class="input-field" name="password" id="SignupPassword" required/>
                    <label>Confirm Password</label>
                    <input type="Password" placeholder="Confirm Password"  class="input-field" id="SignupConfirmPassword" required/>

                    <label>Address</label>
                    <input type="text" placeholder="Address"  class="input-field" name="address" id="editAddress" value="${userInfo.address}" />
                    <label>Job</label>
                    <input type="text" placeholder="Job"  class="input-field" name="job" id="editJob" value="${userInfo.job}"/>
                    <label>Credit Card</label>
                    <input type="text" placeholder="Credit Card"  class="input-field" name="creditcard" id="SignupCreditCard" value="${userInfo.creditCard}" required/>
                    <input type="hidden" name="id" value="${userInfo.userId}" />

                    <label>Image</label>
                    <input type="file" name="image" id="image" accept="image/*"><br/>
                    <button type="submit" class="btn btn-default" id="editSubmitBtn">Update</button>
                </form>
            </div>
        </div><!--/product-details-->





    </div>
</div>
</div>
</section>


<%-- include footer file --%> 
<%@include file="footer.jsp" %>