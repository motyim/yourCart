<%-- 
    Document   : profile
    Created on : Feb 28, 2017, 11:16:26 PM
    Author     : MotYim
--%>


<%-- include header file --%> 
<%@include file="header.jsp" %>
<section>
    <div class="container">
        <div class="row">
            <div class="alert alert-warning" role="alert" id="error" style="display: none;"></div>
         
            <div class="col-sm-3">
                <div class="left-sidebar">
                    
                    


                </div>
            </div>

            <div class="col-sm-9 padding-right">
                <div class="product-details"><!--product-details-->
                    <div class="col-sm-4">
                        <div class="view-product">
                            <img src="${LoginUser.photo}" id="imageView" alt="" />
                        </div>


                    </div>
                    <div class="col-sm-8">
                        <div class="product-information"><!--/product-information-->
                            <form action="Profile" method="post" id="editProfileForm" enctype="multipart/form-data" onsubmit="return validateSignup();">	
                                <h2>${LoginUser.userName}</h2>
                                <p>Account Setting</p>
                                <label>Name</label>
                                <input type="text" placeholder="Name"  class="input-field"  id="editUserName" value="${LoginUser.userName}" disabled required/>
                                <input type="hidden" name="username" value="${LoginUser.userName}"/>
                                <label>E-mail</label>
                                <input type="email" placeholder="E-mail"  class="input-field" name="email" id="editEmail" value="${LoginUser.email}" required/>
                                <label>Password</label>
                                <input type="Password" placeholder="Password"  class="input-field" name="password" id="SignupPassword" required/>
                                <label>Confirm Password</label>
                                <input type="Password" placeholder="Confirm Password"  class="input-field" id="SignupConfirmPassword" required/>
                               
                                <label>Address</label>
                                <input type="text" placeholder="Address"  class="input-field" name="address" id="editAddress" value="${LoginUser.address}" />
                                <label>Job</label>
                                <input type="text" placeholder="Job"  class="input-field" name="job" id="editJob" value="${LoginUser.job}"/>
                                <label>Credit Card</label>
                                <input type="text" placeholder="Credit Card"  class="input-field" name="creditcard" id="SignupCreditCard" value="${LoginUser.creditCard}" required/>
                               

                                <label>Image</label>
                                <input type="file" name="image" id="image" accept="image/*" /><br/>
                                <button type="submit" class="btn btn-default" id="editSubmitBtn">Update</button>
                            </form>
                        </div><!--/product-information-->
                    </div>
                </div><!--/product-details-->





            </div>
        </div>
    </div>
</section>

<%-- include footer file --%> 
<%@include file="footer.jsp" %>
