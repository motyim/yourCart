package org.yourcart.filter;

import java.io.IOException;
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
@WebFilter(filterName = "Login", urlPatterns = {"/Profile","/Profile.jsp"})
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
         

            User user = (User)  ((HttpServletRequest) request).getSession().getAttribute("LoginUser");
            if (user != null) //there is a login user
            {
               chain.doFilter(request, response);
            }
            else 
            {
                   //redirect to login if not logged 
                   ((HttpServletResponse) response).sendRedirect("login.jsp");
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
     * @param filterConfig
     */
    @Override
    public void init(FilterConfig filterConfig) {        
       
    }

    
    
    
}
