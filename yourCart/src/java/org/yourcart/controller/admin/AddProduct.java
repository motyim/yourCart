package org.yourcart.controller.admin;

import java.io.IOException;
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
 * to add and view products
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

        int id = Integer.parseInt(request.getParameter("id"));
        Product productobject = new ProductModel().getProduct(id);
        if (productobject == null) {
            request.getSession().setAttribute("message", "Product not found");
            response.sendRedirect("../Failed.jsp");
        } else {
            request.setAttribute("product", productobject);
            request.setAttribute("type", "Edit");
            request.getRequestDispatcher("/admin/addproduct.jsp").forward(request, response);
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

        //get data from jsp
        String name = request.getParameter("ProductName");
        double price = Double.parseDouble(request.getParameter("ProductPrice"));
        String model = request.getParameter("ProductModel");
        String date = LocalDate.now().toString();
        String description = request.getParameter("ProductDescription");
        int quantity = Integer.parseInt(request.getParameter("ProductQuantity"));
        int category = Integer.parseInt(request.getParameter("category"));

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
                //set alert message
                request.getSession().setAttribute("AlertMessage", "please choose image only");
                //set alert type
                request.getSession().setAttribute("AlertType", "danger");
                response.sendRedirect("AdminProductServlet");

                return;
            }

        } else {                          //no photo uploaded
            productObj.setPhoto(request.getParameter("photo"));
        }

        //-------------- Update Product ------------------
        if (request.getParameter("id") != null && !request.getParameter("id").trim().equals("")) {

            int id = Integer.parseInt(request.getParameter("id"));
            productObj.setProductId(id);

            if (new ProductModel().editProduct(productObj)) {
                //redirect to Success
                //set alert message
                request.getSession().setAttribute("AlertMessage", "Product Updated Successfully");
                //set alert type
                request.getSession().setAttribute("AlertType", "success");
                response.sendRedirect("AdminProductServlet");
                return;
            } else {
                //can't add product
                //set alert message
                request.getSession().setAttribute("AlertMessage", "canot Update product ..An Error occure");
                //set alert type
                request.getSession().setAttribute("AlertType", "danger");
                response.sendRedirect("AdminProductServlet");
                return;
            }

            //-------------- Add  new product ------------------
        } else {
            if (new ProductModel().addProduct(productObj)) {
                //redirect to Success
                //set alert message
                request.getSession().setAttribute("AlertMessage", "Product Added Successfully");
                //set alert type
                request.getSession().setAttribute("AlertType", "success");
                response.sendRedirect("AdminProductServlet");
                return;
            } else {
                //can't add product
                //set alert message
                request.getSession().setAttribute("AlertMessage", "canot add product ..An Error occure");
                //set alert type
                request.getSession().setAttribute("AlertType", "danger");
                response.sendRedirect("AdminProductServlet");
                return;
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
