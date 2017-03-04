
<%-- include header file --%> 
<%@include file="header.jsp" %>

<%-- include slidebar file --%> 
<%@include file="slidebar.jsp" %>

<%-- include myTags library --%> 
<%@taglib prefix="lib" uri="/WEB-INF/tlds/myTags_library.tld" %>

<c:if test="${empty requestScope.type}">
    <c:set var="type" value="Add"/>
</c:if>

<c:choose>
    <c:when test="${empty product.photo}">
        <c:set var="photo" value="../upload/yourCart.png"/>
        <c:set var="photoscr" value="upload/yourCart.png"/>
    </c:when>
    <c:otherwise>
        <c:set var="photo" value="../${product.photo}"/>
        <c:set var="photoscr" value="${product.photo}"/>
    </c:otherwise>
</c:choose>

<div class="col-sm-9 padding-right">
    <div class="product-details"><!--product-details-->
        <div class="col-sm-4">
            <div class="view-product">
                <img src="${photo}"  id="imageView" alt="" />
            </div>




        </div>
        <div class="col-sm-8">
            <div class="product-information"><!--/product-information-->
                <form action="AdminProduct" method="post" enctype="multipart/form-data">
                    <h2>${type} Product</h2>
                    <label>Product Name</label>
                    <input type="text" placeholder="Product Name" name="ProductName" value="${product.name}" class="input-field" id="ProductName" required/>
                    <label>Product Price</label>
                    <input type="number" placeholder="Product Price" name="ProductPrice" value="${product.price}" step="0.01" class="input-field" id="ProductPrice" required/>
                    <label>Product Quantity</label>
                    <input type="number" placeholder="Product Quantity" name="ProductQuantity" value="${product.quantity}" class="input-field" id="ProductQuantity" required/>
                    <label>Product Model</label>
                    <input type="text" placeholder="Product Model" name="ProductModel" value="${product.model}" class="input-field" id="ProductModel" />
                    <label>Product Description</label>
                    <textarea  placeholder="Product Description" name="ProductDescription" class="input-field">${product.discriptin}</textarea>
                    <label>Category</label>
                    <lib:SelectCategory selectID="${product.category}"/>
                    <label>Photo</label>
                    <input type="file"  name="image" id="image" accept="image/*"/><br/>
                    <input type="hidden" name="id" value="${product.productId}"/>
                    <input type="hidden" name="photo" value="${photoscr}"/>
                    <button type="submit" class="btn btn-default">${type} Product</button>
                </form>


            </div><!--/product-information-->
        </div>
    </div><!--/product-details-->





</div>
</div>
</div>
</section>


<%@include file="footer.jsp" %>