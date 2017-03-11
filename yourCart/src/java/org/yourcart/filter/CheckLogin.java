package org.yourcart.filter;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.yourcart.beans.User;

/**
 *
 * @author MotYim
 */
@WebFilter(filterName = "Login",
        urlPatterns = {"/Profile", "/Profile.jsp", "/addCart", "/CartHandlerServlet",
            "/ConfirmScratchCardServlet", "/DeleteCart", "/getCartCount", "/Pay",
            "/ScratchCardServlet", "/logout", "/checkout.jsp", "/ConfirmScratchCard.jsp",
            "/ScratchCards.jsp"})
public class CheckLogin implements Filter {

    public CheckLogin() {
    }

    /**
     *
     * @param request The servlet request we are processing
     * @param response The servlet response we are creating
     * @param chain The filter chain we are processing
     *
     * @exception IOException if an input/output error occurs
     * @exception ServletException if a servlet error occurs
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        
        HttpServletRequest hreq = (HttpServletRequest) request;


        User user = (User) hreq.getSession().getAttribute("LoginUser");
        if (user != null && user.getRole().equalsIgnoreCase("user")) //there is a login user
        {
            chain.doFilter(request, response);
        } else {
            //handle ajax request 
            String redirectUrl = "login.jsp";
            //check if request from ajax
            if (hreq.getHeader("x-requested-with") != null
                    && hreq.getHeader("x-requested-with").equalsIgnoreCase("XMLHttpRequest")) {

                // Set up response 
                HttpServletResponse hres = (HttpServletResponse) response;
                hres.setContentType("text/json; charset=UTF-8");

                PrintWriter out = hres.getWriter();
                //write response as json
                String json = "{\"redirect\":\"" + redirectUrl + "\"}";

                out.write(json);
                out.flush();
                out.close();

            } else {

                //redirect to login if not logged 
                ((HttpServletResponse) response).sendRedirect(redirectUrl);
            }
        }

    }

    /**
     * Destroy method for this filter
     */
    @Override
    public void destroy() {
    }

    /**
     * Init method for this filter
     *
     * @param filterConfig
     */
    @Override
    public void init(FilterConfig filterConfig) {

    }

}
