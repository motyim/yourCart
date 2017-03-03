package org.yourcart.controller;

import java.io.IOException;
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
@WebServlet(name = "Profile", urlPatterns = {"/Profile"})
public class Profile extends HttpServlet {



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
        request.getRequestDispatcher("/profile.jsp").forward(request, response);
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
        
        try {
            //get id from session
            User user =(User) request.getSession().getAttribute("LoginUser");
            
            User newUser =(User) user.clone();
            
            
            //get request paramater & update object user
            newUser.setUserName(request.getParameter("username"));
            newUser.setEmail(request.getParameter("email"));
            newUser.setPassword(request.getParameter("password"));
            newUser.setAddress(request.getParameter("address"));
            newUser.setJob(request.getParameter("job"));
            newUser.setCreditCard(request.getParameter("creditcard"));
            
            if(new UserDbModel().updateUser(newUser)){
                //update user successfully
                newUser.setPassword("");    //remove password from object
                request.getSession().setAttribute("LoginUser", newUser); //update session user
                //redirect to profile
                request.setAttribute("messageInfo", "update user info Successfully");
                request.getRequestDispatcher("/profile.jsp").forward(request, response);
            }else{
                //can't update user
                request.setAttribute("message", "can't update user now .. :(");
                request.getRequestDispatcher("/Failed.jsp").forward(request, response);
            }} catch (CloneNotSupportedException ex) {
            Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
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
