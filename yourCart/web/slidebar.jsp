<%-- 
    Document   : slidebar
    Created on : Feb 28, 2017, 10:22:51 PM
    Author     : MotYim
--%>
<section>
    <%@taglib prefix="myCate" uri="/WEB-INF/tlds/myTags_library.tld" %>
    <div class="container">
        <div class="row">
            <div class="col-sm-3">
                <div class="left-sidebar">
                    <h2>Category</h2>
                    <div class="panel-group category-products" id="accordian"><!--category-productsr-->
                       
                        <myCate:CartCategory/>
                    </div><!--/category-products-->
                    <div class="shipping text-center"><!--shipping-->
                        <img src="images/home/shipping.jpg" alt="" />
                    </div><!--/shipping-->

                </div>
            </div>