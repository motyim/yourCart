
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
                <form action="AddSlider" method="post" enctype="multipart/form-data">
                    <h2>${type} to Slidebar</h2>
                    
                    <label>Tittle</label>
                    <input type="text" placeholder="Tittle" name="tittle" value="" class="input-field" id="ProductQuantity" required/>
                    <label>Sub tittle</label>
                    <input type="text" placeholder="Sub tittle " name="subTittle" value="" class="input-field" id="ProductModel" />
                    <label>Product Description</label>
                    <textarea  placeholder="Product Description" name="ProductDescription" class="input-field">${product.discriptin}</textarea>
                    
                    <label>Photo</label>
                    <input type="file"  name="image" id="image" accept="image/*"/><br/>
                    <input type="hidden" name="id" value="${product.productId}"/>
                    <input type="hidden" name="photo" value="${photoscr}"/>
                    <button type="submit" class="btn btn-default">${type} Slide</button>
                </form>


            </div><!--/product-information-->
        </div>
    </div><!--/product-details-->





</div>
</div>
</div>
</section>


<%@include file="footer.jsp" %>