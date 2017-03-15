<%-- 
    Document   : header
    Created on : Feb 28, 2017, 10:13:51 PM
    Author     : MotYim
--%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="online shopping website using javaEE">
        <meta name="author" content="">
        <title>Your Cart</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/font-awesome.min.css" rel="stylesheet">
        <link href="css/prettyPhoto.css" rel="stylesheet">
        <link href="css/animate.css" rel="stylesheet">
        <link href="css/main.css" rel="stylesheet">
        <link href="css/responsive.css" rel="stylesheet">
        <link href="css/price-range.css" rel="stylesheet" />
        <!--[if lt IE 9]>
        <script src="js/html5shiv.js"></script>
        <script src="js/respond.min.js"></script>
        <![endif]-->       
        <link rel="shortcut icon" href="images/ico/favicon.ico">
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="images/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="images/ico/apple-touch-icon-57-precomposed.png">
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
        <%@taglib prefix="myCate" uri="/WEB-INF/tlds/myTags_library.tld" %>
    </head><!--/head-->

    <body>
        <header id="header"><!--header-->
            <div class="header_top"><!--header_top-->
                <div class="container">
                    <div class="row">
                        <div class="col-sm-6">
                            <div class="contactinfo">
                                <ul class="nav nav-pills">
                                    <li><a href="#"><i class="fa fa-phone"></i> +2 0111 47 88 16</a></li>
                                    <li><a href="#"><i class="fa fa-envelope"></i> info@staticcart.com</a></li>
                                </ul>
                            </div>
                        </div>
                        <div class="col-sm-6">
                            <div class="social-icons pull-right">
                                <ul class="nav navbar-nav">
                                    <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                                    <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                                    <li><a href="#"><i class="fa fa-linkedin"></i></a></li>
                                    <li><a href="#"><i class="fa fa-dribbble"></i></a></li>
                                    <li><a href="#"><i class="fa fa-google-plus"></i></a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div><!--/header_top-->

            <div class="header-middle"><!--header-middle-->
                <div class="container">
                    <div class="row">
                        <div class="col-sm-4">
                            <div class="logo pull-left">
                                <a href="index.jsp"><img src="images/home/logo.png" alt="" /></a>
                            </div>

                        </div>
                        <div class="col-sm-8">
                            <div class="shop-menu pull-right">
                                <ul class="nav navbar-nav">
                                    <c:if test="${!empty LoginUser && LoginUser.role =='user' }">
                                        <li><a href="Profile"><i class="fa fa-user"></i> ${LoginUser.userName}</a></li>
                                        <li><a href="CartHandlerServlet"><i class="fa fa-shopping-cart"></i> Cart (<span id="number"></span> )</a></li>
                                        <li><a href="#"><i class="fa fa-usd"></i> ${LoginUser.cash}</a></li>
                                         <li><a href="ScratchCards.jsp"><i class="fa fa-cc-visa"></i> Charge </a></li>
                                        <li><a href="logout"><i class="fa fa-sign-out"></i> Logout</a></li>
                                        <script type="text/javascript">var userID = '${LoginUser.userId}';</script>
                                    </c:if>
                                        
                                    <c:if test="${!empty LoginUser && LoginUser.role =='admin' }">
                                        <li><a href="admin"><i class="fa fa-cog"></i> Admin Panel</a></li>
                                        <li><a href="admin/logout"><i class="fa fa-sign-out"></i> Logout</a></li>
                                    </c:if>

                                    <c:if test="${empty LoginUser}">
                                        <li><a href="login.jsp"><i class="fa fa-sign-in"></i> Signup</a></li>
                                        <li><a href="login.jsp"><i class="fa fa-lock"></i> Login</a></li>
                                    </c:if> 

                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div><!--/header-middle-->

            <div class="header-bottom"><!--header-bottom-->
                <div class="container">
                    <div class="row">
                        <div class="col-sm-9">
                            <div class="navbar-header">
                                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                                    <span class="sr-only">Toggle navigation</span>
                                    <span class="icon-bar"></span>
                                    <span class="icon-bar"></span>
                                    <span class="icon-bar"></span>
                                </button>
                            </div>
                            <div class="mainmenu pull-left">
                                <ul class="nav navbar-nav collapse navbar-collapse">
                                    <li><a href="index.jsp" class="headerBar" id="homeBtn">Home</a></li>
                                    <li><a href="Shop?page=1" class="headerBar" id="shopBtn" >Shop</a></li>
                                </ul>
                            </div>
                        </div>

                        <div class="col-sm-3">
                            <div class="search_box pull-right">
                                <form action="SearchForProduct">
                                <input type="text" placeholder="Search" name="search"/>
                                </form>
                            </div>
                        </div>

                    </div>
                </div>
            </div><!--/header-bottom-->
        </header><!--/header-->
