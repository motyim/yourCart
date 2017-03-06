
<%-- include header file --%> 
<%@include file="header.jsp" %>

<%-- include slidebar file --%> 
<%@include file="slidebar.jsp" %>




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
                <form action="AddAdvertisement" method="post" enctype="multipart/form-data">
                    <h2>Add Advertisement</h2>
                   
                    <label>Photo</label>
                    <input type="file"  name="image" id="image" accept="image/*"/><br/>
                    <input type="hidden" name="id" value="${product.id}"/>
                    <input type="hidden" name="photo" value="${photoscr}"/>
               
                    <label>URL</label>
                    <input type="text" placeholder="URL" name="url"  class="input-field"  />
                    <button type="submit" class="btn btn-default">Add Advertisement</button>
                </form>


            </div><!--/product-information-->
        </div>
    </div><!--/product-details-->





</div>
</div>
</div>
</section>


<%@include file="footer.jsp" %>