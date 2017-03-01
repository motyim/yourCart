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
                <img src="../images/product-details/1.jpg" alt="" />
            </div>


        </div>
        <div class="col-sm-8">
            <div class="product-information"><!--/product-information-->
                <form action="#" id="editProfileForm" onsubmit="validate();">	
                    <h2>Mariah Carayban</h2>
                    <p>Account Setting</p>
                    <label>Name</label>
                    <input type="text" placeholder="Name"  class="input-field" id="editUserName"required/>
                    <label>E-mail</label>
                    <input type="email" placeholder="E-mail"  class="input-field" id="editEmail"required/>
                    <label>Password</label>
                    <input type="Password" placeholder="Password"  class="input-field" id="editPassword"required/>
                    <label>Confirm Password</label>
                    <input type="Password" placeholder="Confirm Password"  class="input-field" id="editConfirmPassword"required/>
                    <div class="alert alert-warning" role="alert" id="errorPassword" style="display: none;">passwords donot match</div>
                    <label>Address</label>
                    <input type="text" placeholder="Address"  class="input-field" id="editAddress" />
                    <label>Job</label>
                    <input type="text" placeholder="Job"  class="input-field" id="editJob"/>
                    <label>Credit Card</label>
                    <input type="text" placeholder="Credit Card"  class="input-field" id="editCreditCard"required/>
                    <div class="alert alert-warning" role="alert" id="errorCredit" style="display: none;">invalid creditCardNumber</div>

                    <label>Image</label>
                    <input type="file" name="image" id="editImage"><br/>
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



