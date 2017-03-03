package org.yourcart.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.yourcart.beans.User;
import org.yourcart.model.UserDbModel;

/**
 *
 * @author MotYim
 */
@WebServlet(name = "AdminProfile", urlPatterns = {"/admin/AdminProfile"})
public class AdminProfile extends HttpServlet {

    
    
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
        
        int id = Integer.parseInt(request.getParameter("id"));
        User user = new UserDbModel().getUser(id);
        
        if(user==null){
            request.getSession().setAttribute("message", "user not found");
            response.sendRedirect("../Failed.jsp");
        }else{
            request.setAttribute("userInfo", user);
            request.getRequestDispatcher("/admin/profile.jsp").forward(request, response);
        }
        
       
    }

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
        
            
            User user =new User();
            
            //get request paramater & update object user
            user.setUserName(request.getParameter("username"));
            user.setEmail(request.getParameter("email"));
            user.setPassword(request.getParameter("password"));
            user.setAddress(request.getParameter("address"));
            user.setJob(request.getParameter("job"));
            user.setCreditCard(request.getParameter("creditcard"));
            user.setUserId(Integer.parseInt(request.getParameter("id")));
            user.setRole("user");
            user.setPhoto("");
            
            if(new UserDbModel().updateUser(user)){
                //update user successfully
                //redirect to profile
                request.setAttribute("messageInfo", "update user info Successfully");
                request.getRequestDispatcher("/admin/profile.jsp").forward(request, response);
            }else{
                //can't update user
                request.getSession().setAttribute("message", "can't update user now .. :( <br/> email or creditcard used before");
                response.sendRedirect("../Failed.jsp");
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
