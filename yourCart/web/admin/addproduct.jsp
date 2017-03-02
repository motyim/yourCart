
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

                <h2>product one</h2>
                <p>Account Setting</p>
                <label>Product Name</label>
                <input type="text" placeholder="ProductName"  class="input-field" id="ProductName" required/>
                <label>Product Price</label>
                <input type="text" placeholder="ProductPrice"  class="input-field" id="ProductPrice" required/>
                <label>Product Quantity</label>
                <input type="text" placeholder="ProductQuantity"  class="input-field" id="ProductQuantity" required/>
                <label>Product Description</label>
                <input type="text" placeholder="ProductDescription"  class="input-field" id="ProductDescription"/>
                <label>Date</label>
                <input type="text" placeholder="Date"  class="input-field" id="Date" />
                <label>Photo</label>
                <input type="file" placeholder="Job"  class="input-field" name="image" id="imageFile"/>
                <label>Category</label>
                <input type="text" placeholder="ProductCategory"  class="input-field" id="ProductCategory"/>


                <button type="submit" class="btn btn-default">Update</button>

            </div><!--/product-information-->
        </div>
    </div><!--/product-details-->





</div>
</div>
</div>
</section>


<%@include file="footer.jsp" %>