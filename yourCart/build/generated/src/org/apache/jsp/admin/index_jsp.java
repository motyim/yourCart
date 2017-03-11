package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/admin/header.jsp");
    _jspx_dependants.add("/admin/slidebar.jsp");
    _jspx_dependants.add("/admin/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta name=\"description\" content=\"online shopping website using javaEE\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <title>Your Cart</title>\n");
      out.write("        <link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"../css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"../css/prettyPhoto.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"../css/animate.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"../css/main.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"../css/responsive.css\" rel=\"stylesheet\">\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("        <script src=\"../js/html5shiv.js\"></script>\n");
      out.write("        <script src=\"../js/respond.min.js\"></script>\n");
      out.write("        <![endif]-->       \n");
      out.write("        <link rel=\"shortcut icon\" href=\"../images/ico/favicon.ico\">\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"../images/ico/apple-touch-icon-144-precomposed.png\">\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"../images/ico/apple-touch-icon-114-precomposed.png\">\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"../images/ico/apple-touch-icon-72-precomposed.png\">\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" href=\"../images/ico/apple-touch-icon-57-precomposed.png\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </head><!--/head-->\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <header id=\"header\"><!--header-->\n");
      out.write("            <div class=\"header_top\"><!--header_top-->\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <div class=\"contactinfo\">\n");
      out.write("                                <ul class=\"nav nav-pills\">\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-phone\"></i> +2 0111 47 88 16</a></li>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-envelope\"></i> info@staticcart.com</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <div class=\"social-icons pull-right\">\n");
      out.write("                                <ul class=\"nav navbar-nav\">\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-linkedin\"></i></a></li>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-dribbble\"></i></a></li>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-google-plus\"></i></a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div><!--/header_top-->\n");
      out.write("\n");
      out.write("            <div class=\"header-middle\"><!--header-middle-->\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-4\">\n");
      out.write("                            <div class=\"logo pull-left\">\n");
      out.write("                                <a href=\"index.jsp\"><img src=\"../images/home/logo.png\" alt=\"\" /></a>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-8\">\n");
      out.write("                            <div class=\"shop-menu pull-right\">\n");
      out.write("                                <ul class=\"nav navbar-nav\">\n");
      out.write("                                    <li><a href=\"logout\"><i class=\"fa fa-lock\"></i> Logout</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div><!--/header-middle-->\n");
      out.write("\n");
      out.write("            <div class=\"header-bottom\"><!--header-bottom-->\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-12\">\n");
      out.write("                            <div class=\"navbar-header\">\n");
      out.write("                                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("                                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                                    <span class=\"icon-bar\"></span>\n");
      out.write("                                    <span class=\"icon-bar\"></span>\n");
      out.write("                                    <span class=\"icon-bar\"></span>\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mainmenu pull-left\">\n");
      out.write("                                <ul class=\"nav navbar-nav collapse navbar-collapse\">\n");
      out.write("                                    <li><a href=\"index.jsp\" class=\"active\">Panel</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div><!--/header-bottom-->\n");
      out.write("        </header><!--/header-->\n");
      out.write('\n');
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write(' ');
      out.write('\n');
      out.write("\r\n");
      out.write("<section id=\"cart_items\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"breadcrumbs\">\r\n");
      out.write("            <ol class=\"breadcrumb\">\r\n");
      out.write("                <li><a href=\"#\">Home</a></li>\r\n");
      out.write("                <li class=\"active\">Admin Panel</li>\r\n");
      out.write("            </ol>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-sm-3\">\r\n");
      out.write("                <div class=\"left-sidebar\">\r\n");
      out.write("                    <h2>Admin Panel</h2>\r\n");
      out.write("                    <div class=\"panel-group category-products\" id=\"accordian\"><!--category-productsr-->\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"panel panel-default\">\r\n");
      out.write("                            <div class=\"panel-heading\">\r\n");
      out.write("                                <h4 class=\"panel-title\"><a href=\"AdminProductServlet\">Products</a></h4>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"panel panel-default\">\r\n");
      out.write("                            <div class=\"panel-heading\">\r\n");
      out.write("                                <h4 class=\"panel-title\"><a href=\"AdminUserServlet\">Users</a></h4>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("                            <div class=\"panel-heading\">\r\n");
      out.write("                                <h4 class=\"panel-title\"><a href=\"AdminCategoryServlet\">Category</a></h4>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"panel panel-default\">\r\n");
      out.write("                            <div class=\"panel-heading\">\r\n");
      out.write("                                <h4 class=\"panel-title\"><a href=\"AdminHistoryServlet\">History</a></h4>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                         <div class=\"panel panel-default\">\r\n");
      out.write("                            <div class=\"panel-heading\">\r\n");
      out.write("                                <h4 class=\"panel-title\"><a href=\"SlidersShow\">Slider</a></h4>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                         <div class=\"panel panel-default\">\r\n");
      out.write("                            <div class=\"panel-heading\">\r\n");
      out.write("                                <h4 class=\"panel-title\"><a href=\"ShowAdvertisement\">Ads</a></h4>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div><!--/category-products-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"col-sm-9 padding-right\">\n");
      out.write("        <div class=\"features_items\">\n");
      out.write("           <div class=\"col-sm-4\">\n");
      out.write("                <div class=\"product-image-wrapper\">\n");
      out.write("                    <div class=\"single-products\">\n");
      out.write("                        <div class=\"productinfo text-center\">\n");
      out.write("                            <i class=\"fa fa-shopping-bag fa-5x\" aria-hidden=\"true\" ></i>\n");
      out.write("                            <h2>Product details</h2>\n");
      out.write("\n");
      out.write("                            <a href=\"AdminProductServlet\" class=\"btn btn-default my_btn\"><i class=\"fa fa-shopping-bag\"></i> products</a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"product-overlay\">\n");
      out.write("                            <div class=\"overlay-content\">\n");
      out.write("                                <h2>Here you can view Products , add or delete them</h2>\n");
      out.write("                                <a href=\"AdminProductServlet\" class=\"btn btn-default my_btn\"><i class=\"fa fa-shopping-bag\" ></i> products</a>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-4\">\n");
      out.write("                <div class=\"product-image-wrapper\">\n");
      out.write("                    <div class=\"single-products\">\n");
      out.write("                        <div class=\"productinfo text-center\">\n");
      out.write("                            <i class=\"fa fa-user-circle fa-5x\" aria-hidden=\"true\" ></i>\n");
      out.write("                            <h2>Users details</h2>\n");
      out.write("\n");
      out.write("                            <a href=\"AdminUserServlet\" class=\"btn btn-default my_btn\"><i class=\" fa fa-user-circle\"></i> Users</a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"product-overlay\">\n");
      out.write("                            <div class=\"overlay-content\">\n");
      out.write("                                <h2>Here you can view Users , add or delete them</h2>\n");
      out.write("                                <a href=\"AdminUserServlet\" class=\"btn btn-default my_btn\"><i class=\"fa fa-shopping-bag\" ></i> Users</a>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-4\">\n");
      out.write("                <div class=\"product-image-wrapper\">\n");
      out.write("                    <div class=\"single-products\">\n");
      out.write("                        <div class=\"productinfo text-center\">\n");
      out.write("                            <i class=\"fa fa-pie-chart fa-5x\" aria-hidden=\"true\" ></i>\n");
      out.write("                            <h2>Categories</h2>\n");
      out.write("\n");
      out.write("                            <a href=\"AdminCategoryServlet\" class=\"btn btn-default my_btn\"><i class=\" fa fa-pie-chart \"></i> Categories</a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"product-overlay\">\n");
      out.write("                            <div class=\"overlay-content\">\n");
      out.write("                                <h2>Here you can view Categories , add or delete them </h2>\n");
      out.write("                                <a href=\"AdminCategoryServlet\" class=\"btn btn-default my_btn\"><i class=\"fa fa-pie-chart\" ></i> Categories</a>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div> \n");
      out.write("\n");
      out.write("            <div class=\"col-sm-4\">\n");
      out.write("                <div class=\"product-image-wrapper\">\n");
      out.write("                    <div class=\"single-products\">\n");
      out.write("                        <div class=\"productinfo text-center\">\n");
      out.write("                            <i class=\"fa fa-file-text fa-5x\" aria-hidden=\"true\" ></i>\n");
      out.write("                            <h2>History</h2>\n");
      out.write("\n");
      out.write("                            <a href=\"AdminHistoryServlet\" class=\"btn btn-default my_btn\"><i class=\" fa fa-file-text \"></i> History</a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"product-overlay\">\n");
      out.write("                            <div class=\"overlay-content\">\n");
      out.write("                                <h2>Here you can view History </h2>\n");
      out.write("                                <a href=\"AdminHistoryServlet\" class=\"btn btn-default my_btn\"><i class=\"fa fa-file-text\" ></i> History</a>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div> \n");
      out.write("            \n");
      out.write("            <div class=\"col-sm-4\">\n");
      out.write("                <div class=\"product-image-wrapper\">\n");
      out.write("                    <div class=\"single-products\">\n");
      out.write("                        <div class=\"productinfo text-center\">\n");
      out.write("                            <i class=\"fa fa-sort fa-5x\" aria-hidden=\"true\" ></i>\n");
      out.write("                            <h2>Slider</h2>\n");
      out.write("\n");
      out.write("                            <a href=\"SlidersShow\" class=\"btn btn-default my_btn\"><i class=\" fa fa-sort \"></i> Slider</a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"product-overlay\">\n");
      out.write("                            <div class=\"overlay-content\">\n");
      out.write("                                <h2>Here you can choose which products will appear in the slider </h2>\n");
      out.write("                                <a href=\"SlidersShow\" class=\"btn btn-default my_btn\"><i class=\"fa fa-sort\" ></i> Slider</a>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"col-sm-4\">\n");
      out.write("                <div class=\"product-image-wrapper\">\n");
      out.write("                    <div class=\"single-products\">\n");
      out.write("                        <div class=\"productinfo text-center\">\n");
      out.write("                            <i class=\"fa fa-cc-visa fa-5x\" aria-hidden=\"true\" ></i>\n");
      out.write("                            <h2>Scratch Cards</h2>\n");
      out.write("\n");
      out.write("                            <a href=\"#\" class=\"btn btn-default my_btn\"><i class=\" fa fa-cc-visa \"></i> Scratch Cards</a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"product-overlay\">\n");
      out.write("                            <div class=\"overlay-content\">\n");
      out.write("                                <h2>Here you can add Scratch Cards that will charge your  web site users </h2>\n");
      out.write("                                <a href=\"#\" class=\"btn btn-default my_btn\"><i class=\"fa fa-cc-visa\" ></i> Scratch Cards</a>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write(" \n");
      out.write("            <div class=\"col-sm-4\">\n");
      out.write("                <div class=\"product-image-wrapper\">\n");
      out.write("                    <div class=\"single-products\">\n");
      out.write("                        <div class=\"productinfo text-center\">\n");
      out.write("                            <i class=\"fa fa-bullhorn fa-5x\" aria-hidden=\"true\" ></i>\n");
      out.write("                            <h2>Ads</h2>\n");
      out.write("\n");
      out.write("                            <a href=\"ShowAdvertisement\" class=\"btn btn-default my_btn\"><i class=\"fa fa-bullhorn \"></i> Ads</a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"product-overlay\">\n");
      out.write("                            <div class=\"overlay-content\">\n");
      out.write("                                <h2>Here you can Add Ads </h2>\n");
      out.write("                                <a href=\"ShowAdvertisement\" class=\"btn btn-default my_btn\"><i class=\"fa fa-bullhorn\" ></i> Ads</a>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("\n");
      out.write(' ');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<footer id=\"footer\"><!--Footer-->\n");
      out.write("    <div class=\"footer-top\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-2\">\n");
      out.write("                    <div class=\"companyinfo\">\n");
      out.write("                        <h2><span>Your</span>Cart</h2>\n");
      out.write("                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,sed do eiusmod tempor</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-7\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <div class=\"address\">\n");
      out.write("                        <img src=\"../images/home/map.png\" alt=\"\" />\n");
      out.write("                        <p>Egypt , Alexandria </p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"footer-bottom\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <p class=\"pull-left\">Copyright © 2017 YourCart Inc. All rights reserved.</p>\n");
      out.write("                <p class=\"pull-right\">Designed by <span><a target=\"_blank\" href=\"http://www.themeum.com\">Themeum</a></span> | Developed By YourCart Team </p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</footer><!--/Footer-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"../js/jquery.js\"></script>\n");
      out.write("<script src=\"../js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"../js/jquery.scrollUp.min.js\"></script>\n");
      out.write("<script src=\"../js/jquery.prettyPhoto.js\"></script>\n");
      out.write("<script src=\"../js/price-range.js\"></script>\n");
      out.write("<script src=\"../js/main.js\"></script>\n");
      out.write("<script src=\"../js/myLoginValidation.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
