package org.yourcart.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.yourcart.model.ProductModel;

/**
 *
 * @author OsamaPC Updated by MotYim
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
            request.getSession().setAttribute("message", "Product Deleted Successfully");
            response.sendRedirect("../Success.jsp");
        } else {
            //can't add product
           request.getSession().setAttribute("message", "can't Delete product ..An Error occure");
           response.sendRedirect("../Failed.jsp");
        }
        
    }

}
