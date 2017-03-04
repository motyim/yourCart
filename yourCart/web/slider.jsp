<%-- 
    Document   : slider
    Created on : Feb 28, 2017, 10:21:18 PM
    Author     : MotYim
--%>
<section id="slider"><!--slider-->
    <div class="container">
        <div class="row">
            <div class="col-sm-12">
                <div id="slider-carousel" class="carousel slide" data-ride="carousel">
                    <ol class="carousel-indicators">
                        <li data-target="#slider-carousel" data-slide-to="0" class="active"></li>
                        <li data-target="#slider-carousel" data-slide-to="1"></li>
                        <li data-target="#slider-carousel" data-slide-to="2"></li>
                    </ol>
                    <jsp:include page="/IndexProductServlet"/>   

                    <div class="carousel-inner">
                        <div class="item active">
                            <div class="col-sm-6">
                                <h1><span>YOUR</span>-CART</h1>
                                <h2>Online Shopping</h2>
                                <p>${product.discriptin} </p>
                                <button type="button" class="btn btn-default get">Get it now</button>
                            </div>
                            <div class="col-sm-6">
                                <img src=../${product.photo} class="girl img-responsive" alt="" />
                                     <img src="images/home/pricing.png"  class="pricing" alt="" />
                            </div>
                        </div>

                        <c:if test="${!empty requestScope.limitedProducts}">
                            <c:forEach items="${requestScope.limitedProducts}" var="product">
                                <div class="item">
                                    <div class="col-sm-6">
                                        <h1><span>YOUR </span>-CART</h1>
                                        <h2>Online Shopping</h2>
                                        <p>${product.discriptin} </p>
                                        <button type="button" class="btn btn-default get">Get it now</button>
                                    </div>
                                    <div class="col-sm-6">
                                        <img src=../${product.photo} class="girl img-responsive" alt="" />
                                             <img src="images/home/pricing.png"  class="pricing" alt="" />
                                    </div>
                                </div>
                            </c:forEach>
                        </c:if>


                        <!--							<div class="item">
                                                                                        <div class="col-sm-6">
                                                                                                <h1><span>E</span>-SHOPPER</h1>
                                                                                                <h2>100% Responsive Design</h2>
                                                                                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>
                                                                                                <button type="button" class="btn btn-default get">Get it now</button>
                                                                                        </div>
                                                                                        <div class="col-sm-6">
                                                                                                <img src="images/home/girl2.jpg" class="girl img-responsive" alt="" />
                                                                                                <img src="images/home/pricing.png"  class="pricing" alt="" />
                                                                                        </div>
                                                                                </div>
                                                                                
                                                                                <div class="item">
                                                                                        <div class="col-sm-6">
                                                                                                <h1><span>E</span>-SHOPPER</h1>
                                                                                                <h2>Free Ecommerce Template</h2>
                                                                                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>
                                                                                                <button type="button" class="btn btn-default get">Get it now</button>
                                                                                        </div>
                                                                                        <div class="col-sm-6">
                                                                                                <img src="images/home/girl3.jpg" class="girl img-responsive" alt="" />
                                                                                                <img src="images/home/pricing.png" class="pricing" alt="" />
                                                                                        </div>
                                                                                </div>
                                                                                
                                                                        </div>
                        -->
                        <a href="#slider-carousel" class="left control-carousel hidden-xs" data-slide="prev">
                            <i class="fa fa-angle-left"></i>
                        </a>
                        <a href="#slider-carousel" class="right control-carousel hidden-xs" data-slide="next">
                            <i class="fa fa-angle-right"></i>
                        </a>
                    </div>

                </div>
            </div>
        </div>
</section><!--/slider-->
