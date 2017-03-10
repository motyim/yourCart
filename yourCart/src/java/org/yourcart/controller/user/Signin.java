package org.yourcart.controller.user;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.yourcart.beans.User;
import org.yourcart.model.UserDbModel;

/**
 * handle signin
 * @author MotYim
 */
@WebServlet(name = "Signin", urlPatterns = {"/Signin"})
public class Signin extends HttpServlet {

    


    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        
        String username = request.getParameter("SigninName");
        String password = request.getParameter("SigninPassword");
        
        User user = new UserDbModel().signIn(username, password);
           if(user == null ){
               //TODO : MAKE forget password
               request.setAttribute("message", "Cant't Login <br/> Wrong username or password .. ");
               getServletContext().getRequestDispatcher("/Failed.jsp").forward(request, response);
           } else {
            
            //set session for login user
            HttpSession session = request.getSession(true);
            session.setAttribute("LoginUser", user);
            session.setMaxInactiveInterval(60*15);
            
               if(user.getRole().equalsIgnoreCase("admin")){
                   System.out.println("ADMIN");
                   response.sendRedirect("admin/index.jsp");   //admin
               }
                   
               else {
                   System.out.println("NOT");
                   response.sendRedirect("index.jsp");
               }                  //user
           }
        
        
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
