<%-- 
    Document   : product-details
    Created on : Feb 28, 2017, 11:05:58 PM
    Author     : MotYim
--%>
<%-- include header file --%> 
<%@include file="header.jsp" %>


<%-- include slidebar file --%> 
<%@include file="slidebar.jsp" %>

<div class="col-sm-9 padding-right">
    <div class="product-details"><!--product-details-->
        <div class="col-sm-5">
            <div class="view-product">
                <img src="${product.photo}" alt="" />

            </div>


        </div>
        <div class="col-sm-7">
            <div class="product-information"><!--/product-information-->
                <h2>${product.name}</h2>
                <p>Product ID: ${product.productId}</p>
                <span>
                    <span>US $${product.price}</span>
                    <label>Quantity:</label>
                    <input type="number" id="quan" value="1" min="1" />
                    <button type="button" id="${product.productId}" class="btn btn-fefault cart add-to-my">
                        <i class="fa fa-shopping-cart"></i>
                        Add to cart
                    </button>
                </span>
                <p> Avaliable Quantity: ${product.quantity} </p><br/>
                <p><b>Description</b> ${product.discriptin}</p>
                <span>Add on : ${product.date} | Model : ${product.model} </span>

            </div><!--/product-information-->
        </div>
    </div><!--/product-details-->



    <div class="recommended_items"><!--recommended_items-->
        <h2 class="title text-center">recommended items</h2>

        <div id="recommended-item-carousel" class="carousel slide" data-ride="carousel">
            <div class="carousel-inner">
                ${loop.index}
                
                <c:forEach items="${recomed}" var="item"  varStatus="loop">
                    
                    <c:if test="${loop.index == 0}">
                        <div class="item active">
                    </c:if>
                    <c:if test="${loop.index == 3}">
                        <div class="item">
                    </c:if>
                    
                    <div class="col-sm-4">
                        <div class="product-image-wrapper">
                            <div class="single-products">
                                <div class="productinfo text-center">
                                    <a href="Product?id=${item.productId}"><img src="${item.photo}" /></a>
                                    <h2>$${item.price}</h2>
                                    <p>${item.name}</p>
                                    <button type="button" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</button>
                                </div>
                            </div>
                        </div>
                    </div>
                    
                    <c:if test="${loop.index ==2  || loop.index == 5 || loop.index == fn:length(recomed)-1}">
                        </div>
                    </c:if>
                
                </c:forEach>
   
            </div>
            <a class="left recommended-item-control" href="#recommended-item-carousel" data-slide="prev">
                <i class="fa fa-angle-left"></i>
            </a>
            <a class="right recommended-item-control" href="#recommended-item-carousel" data-slide="next">
                <i class="fa fa-angle-right"></i>
            </a>			
        </div>
    </div><!--/recommended_items-->

</div>
</div>
</div>
</section>

<%-- include footer file --%> 
<%@include file="footer.jsp" %>
