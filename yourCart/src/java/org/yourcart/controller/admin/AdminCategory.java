
package org.yourcart.controller.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.yourcart.beans.Category;
import org.yourcart.model.CategoryModel;

/**
 * add category
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
           
            //set alert message
            request.getSession().setAttribute("AlertMessage", "Category Added Successfully");
            //set alert type
            request.getSession().setAttribute("AlertType", "success");
            response.sendRedirect("AdminCategoryServlet");
        }
        else 
        {
            //set alert message
            request.getSession().setAttribute("AlertMessage", "canot add Category ..An Error occure");
            //set alert type
            request.getSession().setAttribute("AlertType", "danger");
            response.sendRedirect("AdminCategoryServlet");
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
