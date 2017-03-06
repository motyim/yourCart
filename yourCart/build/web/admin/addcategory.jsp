
<%-- include header file --%> 
<%@include file="header.jsp" %>

<%-- include slidebar file --%> 
<%@include file="slidebar.jsp" %>

        <div class="col-sm-8">
            <div class="product-information"><!--/product-information-->
                <form action="AdminCategory" method="post" >
                    <h2>${type} Category</h2>
                    <label>Category Name</label>
                    <input type="text" placeholder="Category Name" name="CategoryName"  class="input-field" id="ProductName" required/>
                    <button type="submit" class="btn btn-default">Add Category </button>
                </form>


            </div><!--/product-information-->
        </div>
    </div><!--/product-details-->





</div>
</div>
</div>
</section>


<%@include file="footer.jsp" %>
