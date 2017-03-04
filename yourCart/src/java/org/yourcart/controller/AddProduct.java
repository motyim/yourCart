package org.yourcart.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import org.yourcart.beans.Product;
import org.yourcart.model.ProductModel;
import org.yourcart.utilize.FileUpload;

/**
 *
 * @author MotYim
 */
@WebServlet(name = "AddProduct", urlPatterns = {"/admin/AdminProduct"})
@MultipartConfig
public class AddProduct extends HttpServlet {

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

        //get data from jsp
        String name = request.getParameter("ProductName");
        double price = Double.parseDouble(request.getParameter("ProductPrice"));
        String model = request.getParameter("ProductModel");
        String date = LocalDate.now().toString();
        String description = request.getParameter("ProductDescription");
        int quantity = Integer.parseInt(request.getParameter("ProductQuantity"));
        int category = Integer.parseInt(request.getParameter("category"));
        String update=request.getParameter("update");
        //-------------- Set Product Object  ------------------
        Product productObj = new Product();
        productObj.setName(name);
        productObj.setPrice(price);
        productObj.setModel(model);
        productObj.setDate(date);
        productObj.setDiscriptin(description);
        productObj.setQuantity(quantity);
        productObj.setCategory(category);

        //-------------- upload photo ------------------
        Part filePart = request.getPart("image");
        if (filePart.getSize() != 0) {      //if photo uploaded
            String path = request.getServletContext().getRealPath("");

            try {
                String uploadedpath = FileUpload.uploadImage(filePart, path);
                productObj.setPhoto(uploadedpath);
            } catch (Exception ex) {
                ex.printStackTrace();
                request.setAttribute("message", "please choose image only");
                request.getRequestDispatcher("/Failed.jsp").forward(request, response);
                return;
            }

        }
        if (update.equalsIgnoreCase("true"))
                {
                    new ProductModel().editProduct(productObj);
                }
        else {
        if (new ProductModel().addProduct(productObj)) {
            //redirect to Success
            request.getSession().setAttribute("message", "Product Added Successfully");
            response.sendRedirect("../Success.jsp");
        } else {
            //can't add product
           request.getSession().setAttribute("message", "can't add product ..An Error occure");
           response.sendRedirect("../Failed.jsp");
        }

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
