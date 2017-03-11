<%-- 
    Document   : ScratchCards
    Created on : Mar 8, 2017, 10:53:08 PM
    Author     : sara metwalli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<%@include file="slidebar.jsp" %>
<div class="col-sm-9 padding-right">
    <div class="features_items"><!--features_items-->
        <h2 class="title text-center">Scratch Cards</h2>

        <div class="col-sm-4">
            <div class="product-image-wrapper">
                <div class="single-products">
                    <div class="productinfo text-center">
                        <i class="fa fa-cc-visa fa-4x" aria-hidden="true" style="color:lightskyblue"></i>
                        <h2>$50</h2>
                        <p>Charge with 50 dollars</p>
                        <a href="ScratchCardServlet?charge=50" class="btn btn-default my_btn"><i class="fa fa-cc-visa"></i> Charge</a>
                    </div>
                    <div class="product-overlay">
                        <div class="overlay-content">
                            <h2>$50</h2>
                            <p>Charge with 50 dollars</p>
                            <a href="ScratchCardServlet?charge=50" class="btn btn-default my_btn"><i class="fa fa-cc-visa"></i> Charge</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-sm-4">
            <div class="product-image-wrapper">         
                <div class="single-products">
                    <div class="productinfo text-center">
                        <i class="fa fa-cc-visa fa-4x" aria-hidden="true" style="color:lightskyblue"></i>
                        <h2>$100</h2>
                        <p>Charge with 100 dollars</p>
                        <a href="ScratchCardServlet?charge=100" class="btn btn-default my_btn"><i class="fa fa-cc-visa"></i> Charge</a>
                    </div>
                    <div class="product-overlay">
                        <div class="overlay-content">
                            <h2>$100</h2>
                            <p>Charge with 100 dollars</p>
                            <a href="ScratchCardServlet?charge=100" class="btn btn-default my_btn"><i class="fa fa-cc-visa"></i> Charge</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>


        <div class="col-sm-4">
            <div class="product-image-wrapper"> 
                <div class="single-products">
                    <div class="productinfo text-center">
                        <i class="fa fa-cc-visa fa-4x" aria-hidden="true" style="color:lightskyblue"></i>
                        <h2>$200</h2>
                        <p>Charge with 200 dollars</p>
                        <a href="ScratchCardServlet?charge=200" class="btn btn-default my_btn"><i class="fa fa-cc-visa"></i> Charge</a>
                    </div>
                    <div class="product-overlay">
                        <div class="overlay-content">
                            <h2>$200</h2>
                            <p>Charge with 200 dollars</p>
                            <a href="ScratchCardServlet?charge=200" class="btn btn-default my_btn"><i class="fa fa-cc-visa"></i> Charge</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-sm-4">
            <div class="product-image-wrapper"> 

                <div class="single-products">
                    <div class="productinfo text-center">
                        <i class="fa fa-cc-visa fa-4x" aria-hidden="true" style="color:lightskyblue"></i>
                        <h2>$500</h2>
                        <p>Charge with 500 dollars</p>
                        <a href="ScratchCardServlet?charge=500" class="btn btn-default my_btn"><i class="fa fa-cc-visa"></i> Charge</a>
                    </div>
                    <div class="product-overlay">
                        <div class="overlay-content">
                            <h2>$500</h2>
                            <p>Charge with 500 dollars</p>
                            <a href="ScratchCardServlet?charge=500" class="btn btn-default my_btn"><i class="fa fa-cc-visa"></i> Charge</a>
                        </div>
                    </div>
                </div>


            </div>
        </div>
    </div>
</div>
</div>
</div>
</section>
<%@include file="footer.jsp" %>