package org.yourcart.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
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
@WebServlet(name = "Signup", urlPatterns = {"/Signup"})
public class Signup extends HttpServlet {


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
        
        //-------------- get request paramater ------------------
        String username = request.getParameter("SignupName");
        String email = request.getParameter("SignupEmail");
        String password = request.getParameter("SignupPassword");
        String job = request.getParameter("SignupJob");
        String address = request.getParameter("SignupAddress");
        String creditCrd = request.getParameter("SignupCreditCard");
        
        //-------------- create user object ------------------
        User user = new User();
        user.setUserName(username);
        user.setEmail(email);
        user.setPassword(password);
        user.setJob(job);
        user.setRole("user");
        user.setAddress(address);
        user.setCreditCard(creditCrd);
        user.setCash(new Random().nextInt(1000)); // set cash as randome number
   
        if(new UserDbModel().signUp(user)){
            out.print("DOne");
        }else out.print("NNOOOT");
       
        
        
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
