package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ScratchCards_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/WEB-INF/tlds/myTags_library.tld");
    _jspx_dependants.add("/slidebar.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <meta name=\"description\" content=\"online shopping website using javaEE\">\r\n");
      out.write("        <meta name=\"author\" content=\"\">\r\n");
      out.write("        <title>Your Cart</title>\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/prettyPhoto.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/animate.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/main.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/responsive.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/price-range.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <!--[if lt IE 9]>\r\n");
      out.write("        <script src=\"js/html5shiv.js\"></script>\r\n");
      out.write("        <script src=\"js/respond.min.js\"></script>\r\n");
      out.write("        <![endif]-->       \r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/ico/favicon.ico\">\r\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"images/ico/apple-touch-icon-144-precomposed.png\">\r\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"images/ico/apple-touch-icon-114-precomposed.png\">\r\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"images/ico/apple-touch-icon-72-precomposed.png\">\r\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" href=\"images/ico/apple-touch-icon-57-precomposed.png\">\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    </head><!--/head-->\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <header id=\"header\"><!--header-->\r\n");
      out.write("            <div class=\"header_top\"><!--header_top-->\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-sm-6\">\r\n");
      out.write("                            <div class=\"contactinfo\">\r\n");
      out.write("                                <ul class=\"nav nav-pills\">\r\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-phone\"></i> +2 0111 47 88 16</a></li>\r\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-envelope\"></i> info@staticcart.com</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-6\">\r\n");
      out.write("                            <div class=\"social-icons pull-right\">\r\n");
      out.write("                                <ul class=\"nav navbar-nav\">\r\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\r\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\r\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-linkedin\"></i></a></li>\r\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-dribbble\"></i></a></li>\r\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-google-plus\"></i></a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div><!--/header_top-->\r\n");
      out.write("\r\n");
      out.write("            <div class=\"header-middle\"><!--header-middle-->\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-sm-4\">\r\n");
      out.write("                            <div class=\"logo pull-left\">\r\n");
      out.write("                                <a href=\"index.jsp\"><img src=\"images/home/logo.png\" alt=\"\" /></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-8\">\r\n");
      out.write("                            <div class=\"shop-menu pull-right\">\r\n");
      out.write("                                <ul class=\"nav navbar-nav\">\r\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div><!--/header-middle-->\r\n");
      out.write("\r\n");
      out.write("            <div class=\"header-bottom\"><!--header-bottom-->\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-sm-9\">\r\n");
      out.write("                            <div class=\"navbar-header\">\r\n");
      out.write("                                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\r\n");
      out.write("                                    <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                                </button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"mainmenu pull-left\">\r\n");
      out.write("                                <ul class=\"nav navbar-nav collapse navbar-collapse\">\r\n");
      out.write("                                    <li><a href=\"index.jsp\" class=\"active\">Home</a></li>\r\n");
      out.write("                                    <li><a href=\"Shop\" >Shop</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-sm-3\">\r\n");
      out.write("                            <div class=\"search_box pull-right\">\r\n");
      out.write("                                <form action=\"SearchForProduct\">\r\n");
      out.write("                                <input type=\"text\" placeholder=\"Search\" name=\"search\"/>\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div><!--/header-bottom-->\r\n");
      out.write("        </header><!--/header-->\r\n");
      out.write('\n');
      out.write("\n");
      out.write("<section>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/Ads", out, false);
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("                <div class=\"left-sidebar\">\n");
      out.write("                    <h2>Category</h2>\n");
      out.write("                    <div class=\"panel-group category-products\" id=\"accordian\"><!--category-productsr-->\n");
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_myCate_CartCategory_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </div><!--/category-products-->\n");
      out.write("                    <form action=\"SearchForProduct\" method=\"get\">\n");
      out.write("                    <div class=\"price-range\"><!--price-range-->\n");
      out.write("                        <h2>Price Range</h2>\n");
      out.write("                        <div class=\"well text-center\">\n");
      out.write("                            <input type=\"text\" class=\"span2\" value=\"\" data-slider-min=\"0\" data-slider-max=\"3000\" data-slider-step=\"5\" data-slider-value=\"[250,2000]\" id=\"sl2\" ><br />\n");
      out.write("                            <b class=\"pull-left\">$ 0</b> <b class=\"pull-right\">$ 3000</b>\n");
      out.write("                            <br>\n");
      out.write("                             <input type=\"hidden\" id=\"downValue\" name=\"down\" value=\"\"/>\n");
      out.write("                             <input type=\"hidden\" id=\"upValue\" name=\"up\"value=\"\"/>\n");
      out.write("                             <input type=\"submit\"  class=\"btn btn-default\">\n");
      out.write("                        </div>\n");
      out.write("                    </div><!--/price-range-->\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                    <div class=\"shipping text-center\"><!--shipping-->\n");
      out.write("                        ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        \n");
      out.write("                    </div><!--/shipping-->\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>");
      out.write("\n");
      out.write("<div class=\"col-sm-9 padding-right\">\n");
      out.write("    <div class=\"features_items\"><!--features_items-->\n");
      out.write("        <h2 class=\"title text-center\">Scratch Cards</h2>\n");
      out.write("\n");
      out.write("        <div class=\"col-sm-4\">\n");
      out.write("            <div class=\"product-image-wrapper\">\n");
      out.write("                <div class=\"single-products\">\n");
      out.write("                    <div class=\"productinfo text-center\">\n");
      out.write("                        <i class=\"fa fa-cc-visa fa-4x\" aria-hidden=\"true\" style=\"color:lightskyblue\"></i>\n");
      out.write("                        <h2>$50</h2>\n");
      out.write("                        <p>Charge with 50 dollars</p>\n");
      out.write("                        <a href=\"ScratchCardServlet?charge=50\" class=\"btn btn-default my_btn\"><i class=\"fa fa-cc-visa\"></i>Charge</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"product-overlay\">\n");
      out.write("                        <div class=\"overlay-content\">\n");
      out.write("                            <h2>$50</h2>\n");
      out.write("                            <p>Charge with 50 dollars</p>\n");
      out.write("                            <a href=\"ScratchCardServlet?charge=50\" class=\"btn btn-default my_btn\"><i class=\"fa fa-cc-visa\"></i>Charge</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-4\">\n");
      out.write("            <div class=\"product-image-wrapper\">         \n");
      out.write("                <div class=\"single-products\">\n");
      out.write("                    <div class=\"productinfo text-center\">\n");
      out.write("                        <i class=\"fa fa-cc-visa fa-4x\" aria-hidden=\"true\" style=\"color:lightskyblue\"></i>\n");
      out.write("                        <h2>$100</h2>\n");
      out.write("                        <p>Charge with 100 dollars</p>\n");
      out.write("                        <a href=\"ScratchCardServlet?charge=100\" class=\"btn btn-default my_btn\"><i class=\"fa fa-cc-visa\"></i>Charge</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"product-overlay\">\n");
      out.write("                        <div class=\"overlay-content\">\n");
      out.write("                            <h2>$100</h2>\n");
      out.write("                            <p>Charge with 100 dollars</p>\n");
      out.write("                            <a href=\"ScratchCardServlet?charge=100\" class=\"btn btn-default my_btn\"><i class=\"fa fa-cc-visa\"></i>Charge</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"col-sm-4\">\n");
      out.write("            <div class=\"product-image-wrapper\"> \n");
      out.write("                <div class=\"single-products\">\n");
      out.write("                    <div class=\"productinfo text-center\">\n");
      out.write("                        <i class=\"fa fa-cc-visa fa-4x\" aria-hidden=\"true\" style=\"color:lightskyblue\"></i>\n");
      out.write("                        <h2>$200</h2>\n");
      out.write("                        <p>Charge with 200 dollars</p>\n");
      out.write("                        <a href=\"ScratchCardServlet?charge=200\" class=\"btn btn-default my_btn\"><i class=\"fa fa-cc-visa\"></i>Charge</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"product-overlay\">\n");
      out.write("                        <div class=\"overlay-content\">\n");
      out.write("                            <h2>$200</h2>\n");
      out.write("                            <p>Charge with 200 dollars</p>\n");
      out.write("                            <a href=\"ScratchCardServlet?charge=200\" class=\"btn btn-default my_btn\"><i class=\"fa fa-cc-visa\"></i>Charge</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-4\">\n");
      out.write("            <div class=\"product-image-wrapper\"> \n");
      out.write("\n");
      out.write("                <div class=\"single-products\">\n");
      out.write("                    <div class=\"productinfo text-center\">\n");
      out.write("                        <i class=\"fa fa-cc-visa fa-4x\" aria-hidden=\"true\" style=\"color:lightskyblue\"></i>\n");
      out.write("                        <h2>$500</h2>\n");
      out.write("                        <p>Charge with 500 dollars</p>\n");
      out.write("                        <a href=\"ScratchCardServlet?charge=500\" class=\"btn btn-default my_btn\"><i class=\"fa fa-cc-visa\"></i>Charge</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"product-overlay\">\n");
      out.write("                        <div class=\"overlay-content\">\n");
      out.write("                            <h2>$500</h2>\n");
      out.write("                            <p>Charge with 500 dollars</p>\n");
      out.write("                            <a href=\"ScratchCardServlet?charge=500\" class=\"btn btn-default my_btn\"><i class=\"fa fa-cc-visa\"></i>Charge</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</section>\n");
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
      out.write("                        <img src=\"images/home/map.png\" alt=\"\" />\n");
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
      out.write("<script src=\"js/jquery.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"js/jquery.scrollUp.min.js\"></script>\n");
      out.write("<script src=\"js/jquery.prettyPhoto.js\"></script>\n");
      out.write("<script src=\"js/price-range.js\"></script>\n");
      out.write("<script src=\"js/main.js\"></script>\n");
      out.write("<script src=\"js/myLoginValidation.js\"></script>\n");
      out.write("<script src=\"js/addtocart.js\"></script>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!empty LoginUser }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                        <li><a href=\"Profile\"><i class=\"fa fa-user\"></i> Account</a></li>\r\n");
        out.write("                                        <li><a href=\"CartHandlerServlet\"><i class=\"fa fa-shopping-cart\"></i> Cart (<span id=\"number\">2</span> )</a></li>\r\n");
        out.write("                                        <li><a href=\"#\"><i class=\"fa fa-usd\"></i> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${LoginUser.cash}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a></li>\r\n");
        out.write("                                         <li><a href=\"ScratchCards.jsp\"><i class=\"fa fa-cc-visa\"></i> Charge </a></li>\r\n");
        out.write("                                        <li><a href=\"logout\"><i class=\"fa fa-sign-out\"></i> Logout</a></li>\r\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty LoginUser}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                        <li><a href=\"login.jsp\"><i class=\"fa fa-sign-in\"></i> Signup</a></li>\r\n");
        out.write("                                        <li><a href=\"login.jsp\"><i class=\"fa fa-lock\"></i> Login</a></li>\r\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_myCate_CartCategory_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  myCate:CartCategory
    org.yourcart.customtag.CartCategoryTagHandler _jspx_th_myCate_CartCategory_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.yourcart.customtag.CartCategoryTagHandler.class) : new org.yourcart.customtag.CartCategoryTagHandler();
    _jspx_th_myCate_CartCategory_0.setJspContext(_jspx_page_context);
    _jspx_th_myCate_CartCategory_0.doTag();
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty ads}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ads.url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" target=\"_blank\">\n");
        out.write("                                <img class=\"ads\" src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ads.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" alt=\"\" />\n");
        out.write("                            </a>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }
}
