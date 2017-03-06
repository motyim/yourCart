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

                    <div class="price-range"><!--price-range-->
                        <h2>Price Range</h2>
                        <div class="well text-center">
                            <input type="text" class="span2" value="" data-slider-min="0" data-slider-max="600" data-slider-step="5" data-slider-value="[250,450]" id="sl2" ><br />
                            <b class="pull-left">$ 0</b> <b class="pull-right">$ 600</b>
                        </div>
                    </div><!--/price-range-->

                    <div class="shipping text-center"><!--shipping-->
                        <c:if test="${not empty ads}">
                            <a href="${ads.url}" target="_blank">
                                <img class="ads" src="${ads.image}" alt="" />
                            </a>
                        </c:if>
                        
                    </div><!--/shipping-->

                </div>
            </div>