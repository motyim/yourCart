package org.yourcart.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.yourcart.beans.User;

/**
 *
 * @author MotYim
 */
@WebServlet(name = "logout", urlPatterns = {"/logout"})
public class logout extends HttpServlet {

    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //destory session
         String username = "";
        String password = "";
        Cookie[] cookies = request.getCookies();
         if (cookies != null) {
            for (int i = 0; i < cookies.length; i++) {
                Cookie cookie = cookies[i];
                if (cookie.getName().equals("userNameCookie")) {
                    username = cookie.getValue();
                }

                if (cookie.getName().equals("passwordCookie")) {
                    password = cookie.getValue();
                }
            }
            if (username!=null&&password!=null)
            {
                User u=new User();
                u.setPassword(password);
                u.setUserName(username);
                request.setAttribute("user", u);
                 request.getRequestDispatcher("/login.jsp").forward(request, response);
            }
        }
        request.getSession(false).invalidate();
        
        response.sendRedirect("login.jsp");
    }

    

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
