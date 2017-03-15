<%-- 
    Document   : indexAdmin
    Created on : Mar 5, 2017, 4:31:46 PM
    Author     : sara metwalli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<%-- include slider file --%> 


<%-- include slidebar file --%> 
<%@include file="slidebar.jsp" %>

<jsp:include page="AdminIndex"/>


    <div class="col-sm-9 padding-right">
        <p>Online Users : ${onlineUser} | profit : ${profit}</p>
        <div class="features_items">
           <div class="col-sm-4">
                <div class="product-image-wrapper">
                    <div class="single-products">
                        <div class="productinfo text-center">
                            <i class="fa fa-shopping-bag fa-5x" aria-hidden="true" ></i>
                            <h2>Product details</h2>

                            <a href="AdminProductServlet" class="btn btn-default my_btn"><i class="fa fa-shopping-bag"></i> products</a>
                        </div>
                        <div class="product-overlay">
                            <div class="overlay-content">
                                <h2>Here you can view Products , add or delete them</h2>
                                <a href="AdminProductServlet" class="btn btn-default my_btn"><i class="fa fa-shopping-bag" ></i> products</a>

                            </div>
                        </div>

                    </div>
                </div>
            </div>
            <div class="col-sm-4">
                <div class="product-image-wrapper">
                    <div class="single-products">
                        <div class="productinfo text-center">
                            <i class="fa fa-user-circle fa-5x" aria-hidden="true" ></i>
                            <h2>Users details</h2>

                            <a href="AdminUserServlet" class="btn btn-default my_btn"><i class=" fa fa-user-circle"></i> Users</a>
                        </div>
                        <div class="product-overlay">
                            <div class="overlay-content">
                                <h2>Here you can view Users , add or delete them</h2>
                                <a href="AdminUserServlet" class="btn btn-default my_btn"><i class="fa fa-user-circle" ></i> Users</a>

                            </div>
                        </div>

                    </div>
                </div>
            </div>
            <div class="col-sm-4">
                <div class="product-image-wrapper">
                    <div class="single-products">
                        <div class="productinfo text-center">
                            <i class="fa fa-pie-chart fa-5x" aria-hidden="true" ></i>
                            <h2>Categories</h2>

                            <a href="AdminCategoryServlet" class="btn btn-default my_btn"><i class=" fa fa-pie-chart "></i> Categories</a>
                        </div>
                        <div class="product-overlay">
                            <div class="overlay-content">
                                <h2>Here you can view Categories , add or delete them </h2>
                                <a href="AdminCategoryServlet" class="btn btn-default my_btn"><i class="fa fa-pie-chart" ></i> Categories</a>

                            </div>
                        </div>

                    </div>
                </div>
            </div> 

            <div class="col-sm-4">
                <div class="product-image-wrapper">
                    <div class="single-products">
                        <div class="productinfo text-center">
                            <i class="fa fa-file-text fa-5x" aria-hidden="true" ></i>
                            <h2>History</h2>

                            <a href="AdminHistoryServlet" class="btn btn-default my_btn"><i class=" fa fa-file-text "></i> History</a>
                        </div>
                        <div class="product-overlay">
                            <div class="overlay-content">
                                <h2>Here you can view History </h2>
                                <a href="AdminHistoryServlet" class="btn btn-default my_btn"><i class="fa fa-file-text" ></i> History</a>

                            </div>
                        </div>

                    </div>
                </div>
            </div> 
            
            <div class="col-sm-4">
                <div class="product-image-wrapper">
                    <div class="single-products">
                        <div class="productinfo text-center">
                            <i class="fa fa-sort fa-5x" aria-hidden="true" ></i>
                            <h2>Slider</h2>

                            <a href="SlidersShow" class="btn btn-default my_btn"><i class=" fa fa-sort "></i> Slider</a>
                        </div>
                        <div class="product-overlay">
                            <div class="overlay-content">
                                <h2>Here you can choose which products will appear in the slider </h2>
                                <a href="SlidersShow" class="btn btn-default my_btn"><i class="fa fa-sort" ></i> Slider</a>

                            </div>
                        </div>

                    </div>
                </div>
            </div>
            
            <div class="col-sm-4">
                <div class="product-image-wrapper">
                    <div class="single-products">
                        <div class="productinfo text-center">
                            <i class="fa fa-cc-visa fa-5x" aria-hidden="true" ></i>
                            <h2>Scratch Cards</h2>

                            <a href="charge.jsp" class="btn btn-default my_btn"><i class=" fa fa-cc-visa "></i> Scratch Cards</a>
                        </div>
                        <div class="product-overlay">
                            <div class="overlay-content">
                                <h2>Here you can add Scratch Cards that will charge your  web site users </h2>
                                <a href="charge.jsp" class="btn btn-default my_btn"><i class="fa fa-cc-visa" ></i> Scratch Cards</a>

                            </div>
                        </div>

                    </div>
                </div>
            </div>
 
            <div class="col-sm-4">
                <div class="product-image-wrapper">
                    <div class="single-products">
                        <div class="productinfo text-center">
                            <i class="fa fa-bullhorn fa-5x" aria-hidden="true" ></i>
                            <h2>Ads</h2>

                            <a href="ShowAdvertisement" class="btn btn-default my_btn"><i class="fa fa-bullhorn "></i> Ads</a>
                        </div>
                        <div class="product-overlay">
                            <div class="overlay-content">
                                <h2>Here you can Add Ads </h2>
                                <a href="ShowAdvertisement" class="btn btn-default my_btn"><i class="fa fa-bullhorn" ></i> Ads</a>

                            </div>
                        </div>
                    </div>
                    </div>
                </div>
            </div>
            </div>

      
    </div>
</section>


<%-- include footer file --%> 
<%@include file="footer.jsp" %>