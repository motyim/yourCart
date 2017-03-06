package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
      out.write(' ');
      out.write('\n');
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<section id=\"cart_items\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("        <div class=\"breadcrumbs\">\n");
      out.write("            <ol class=\"breadcrumb\">\n");
      out.write("                <li><a href=\"#\">Home</a></li>\n");
      out.write("                <li class=\"active\">Check out</li>\n");
      out.write("            </ol>\n");
      out.write("        </div><!--/breadcrums-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"review-payment\">\n");
      out.write("            <h2>Review & Payment</h2>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"table-responsive cart_info\">\n");
      out.write("            <table class=\"table table-condensed\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr class=\"cart_menu\">\n");
      out.write("                        <td class=\"image\">Item</td>\n");
      out.write("                        <td class=\"description\"></td>\n");
      out.write("                        <td class=\"price\">Price</td>\n");
      out.write("                        <td class=\"quantity\">Quantity</td>\n");
      out.write("                        <td class=\"total\">Total</td>\n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"cart_product\">\n");
      out.write("                            <a href=\"\"><img src=\"images/cart/three.png\" alt=\"\"></a>\n");
      out.write("                        </td>\n");
      out.write("                        <td class=\"cart_description\">\n");
      out.write("                            <h4><a href=\"\">Colorblock Scuba</a></h4>\n");
      out.write("                            <p>Web ID: 1089772</p>\n");
      out.write("                        </td>\n");
      out.write("                        <td class=\"cart_price\">\n");
      out.write("                            <p>$59</p>\n");
      out.write("                        </td>\n");
      out.write("                        <td class=\"cart_price\">\n");
      out.write("                            <p>20</p>\n");
      out.write("                        </td>\n");
      out.write("                        <td class=\"cart_total\">\n");
      out.write("                            <p class=\"cart_total_price\">$59</p>\n");
      out.write("                        </td>\n");
      out.write("                        <td class=\"cart_delete\">\n");
      out.write("                            <a class=\"cart_quantity_delete\" href=\"\"><i class=\"fa fa-times\"></i></a>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"cart_product\">\n");
      out.write("                            <a href=\"\"><img src=\"images/cart/three.png\" alt=\"\"></a>\n");
      out.write("                        </td>\n");
      out.write("                        <td class=\"cart_description\">\n");
      out.write("                            <h4><a href=\"\">Colorblock Scuba</a></h4>\n");
      out.write("                            <p>Web ID: 1089772</p>\n");
      out.write("                        </td>\n");
      out.write("                        <td class=\"cart_price\">\n");
      out.write("                            <p>$59</p>\n");
      out.write("                        </td>\n");
      out.write("                        <td class=\"cart_price\">\n");
      out.write("                            <p>20</p>\n");
      out.write("                        </td>\n");
      out.write("                        <td class=\"cart_total\">\n");
      out.write("                            <p class=\"cart_total_price\">$59</p>\n");
      out.write("                        </td>\n");
      out.write("                        <td class=\"cart_delete\">\n");
      out.write("                            <a class=\"cart_quantity_delete\" href=\"\"><i class=\"fa fa-times\"></i></a>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"cart_product\">\n");
      out.write("                            <a href=\"\"><img src=\"images/cart/three.png\" alt=\"\"></a>\n");
      out.write("                        </td>\n");
      out.write("                        <td class=\"cart_description\">\n");
      out.write("                            <h4><a href=\"\">Colorblock Scuba</a></h4>\n");
      out.write("                            <p>Web ID: 1089772</p>\n");
      out.write("                        </td>\n");
      out.write("                        <td class=\"cart_price\">\n");
      out.write("                            <p>$59</p>\n");
      out.write("                        </td>\n");
      out.write("                        <td class=\"cart_price\">\n");
      out.write("                            <p>20</p>\n");
      out.write("                        </td>\n");
      out.write("                        <td class=\"cart_total\">\n");
      out.write("                            <p class=\"cart_total_price\">$59</p>\n");
      out.write("                        </td>\n");
      out.write("                        <td class=\"cart_delete\">\n");
      out.write("                            <a class=\"cart_quantity_delete\" href=\"\"><i class=\"fa fa-times\"></i></a>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"4\">&nbsp;</td>\n");
      out.write("                        <td colspan=\"2\">\n");
      out.write("                            <table class=\"table table-condensed total-result\">\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Cart Sub Total</td>\n");
      out.write("                                    <td>$59</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Exo Tax</td>\n");
      out.write("                                    <td>$2</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr class=\"shipping-cost\">\n");
      out.write("                                    <td>Shipping Cost</td>\n");
      out.write("                                    <td>Free</td>\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Total</td>\n");
      out.write("                                    <td><span>$61</span></td>\n");
      out.write("                                </tr>\n");
      out.write("                            </table>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"payment-options\">\n");
      out.write("            <a class=\"btn btn-primary\" href=\"\">Pay</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section> <!--/#cart_items-->\n");
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
      out.write("<script src=\"js/main.js\"></script>\n");
      out.write("<script src=\"js/myLoginValidation.js\"></script>\n");
      out.write("<script src=\"js/addtocart.js\"></script>\n");
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
        out.write("                                        <li><a href=\"cart.jsp\"><i class=\"fa fa-shopping-cart\"></i> Cart (<span id=\"number\">2</span> )</a></li>\r\n");
        out.write("                                        <li><a href=\"#\"><i class=\"fa fa-usd\"></i> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${LoginUser.cash}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a></li>\r\n");
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
}
