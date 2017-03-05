/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourcart.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.yourcart.beans.Category;
import org.yourcart.model.CategoryModel;

/**
 *
 * @author Nesmaa
 */
@WebServlet("/admin/AdminCategory")
public class AdminCategory extends HttpServlet {

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
        
       // int id = Integer.parseInt(request.getParameter("CategoryId"));
        String name = request.getParameter("CategoryName");
        /// object from category 
        
        
        Category categoryobj = new Category();
        
        categoryobj.setName(name);
        /////  set data in database 
        System.out.println("---> " + categoryobj.getName());
        if ( new CategoryModel().addCategory(categoryobj))
        {
            request.getSession().setAttribute("message", "Category Added Successfully");
            response.sendRedirect("../Success.jsp");
        }
        else 
        {
             request.getSession().setAttribute("message", "can't add Category ..An Error occure");
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
