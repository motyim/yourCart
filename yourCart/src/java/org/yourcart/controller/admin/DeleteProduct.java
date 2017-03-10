package org.yourcart.controller.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.yourcart.model.ProductModel;

/**
 * delete product
 * @author OsamaPC 
 */
@WebServlet(name = "DeleteProduct", urlPatterns = {"/admin/DeleteProduct"})
public class DeleteProduct extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        String path = request.getServletContext().getRealPath("");
        if (new ProductModel().deleteProduct(id,path)) {
            //redirect to Success
             //set alert message
            request.getSession().setAttribute("AlertMessage", "Product Deleted Successfully");
            //set alert type
            request.getSession().setAttribute("AlertType", "success");
            response.sendRedirect("AdminProductServlet");
            
        } else {
            //can't add product
            //set alert message
            request.getSession().setAttribute("AlertMessage", "canot Delete product ..An Error occure");
            //set alert type
            request.getSession().setAttribute("AlertType", "danger");
            response.sendRedirect("AdminProductServlet");
         
        }
        
    }

}
