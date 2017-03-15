<%-- 
    Document   : slidebar
    Created on : Feb 28, 2017, 10:22:51 PM
    Author     : MotYim
--%>
<section>
    <jsp:include page="/Ads"/>
    <div class="container">
        <div class="row">
            <div class="col-sm-3">
                <div class="left-sidebar">
                    <h2>Category</h2>
                    <div class="panel-group category-products" id="accordian"><!--category-productsr-->

                        <myCate:CartCategory/>
                    </div><!--/category-products-->
                    <form action="SearchForProduct" method="get">
                    <div class="price-range"><!--price-range-->
                        <h2>Price Range</h2>
                        <div class="well text-center">
                            <input type="text" class="span2" value="" data-slider-min="0" data-slider-max="${maxPrice}" data-slider-step="5" data-slider-value="[0,${maxPrice}]" id="sl2" ><br />
                            <b class="pull-left">$ 0</b> <b class="pull-right">$${maxPrice}</b>
                            <br>
                             <input type="hidden" id="downValue" name="down" value="0"/>
                             <input type="hidden" id="upValue" name="up"value="${maxPrice}"/>
                             <input type="submit"  class="btn btn-default">
                        </div>
                    </div><!--/price-range-->
                    </form>

                    <div class="shipping text-center"><!--shipping-->
                        <c:if test="${not empty ads}">
                            <a href="${ads.url}" target="_blank">
                                <img class="ads" src="${ads.image}" alt="" />
                            </a>
                        </c:if>
                        
                    </div><!--/shipping-->

                </div>
            </div>