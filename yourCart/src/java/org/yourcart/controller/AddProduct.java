
package org.yourcart.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.yourcart.beans.Product;
import org.yourcart.model.ProductModel;


/**
 *
 * @author Nesmaa
 */
public class AddProduct extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        //get data from jsp
        String name= request.getParameter("name");
        double price=  Double.parseDouble(request.getParameter("price"));
        String model= request.getParameter("model");
        String date= request.getParameter("date");
        String photo= request.getParameter("photo");
        String description= request.getParameter("description");
        int  quantity=  Integer.parseInt(request.getParameter("quantity"));
        int  productid= Integer.parseInt(request.getParameter("productid"));
        String category= request.getParameter("category");
          
    
                
        //set data to product class
        Product productObj=new Product();
     
        productObj.setName(name);
        productObj.setPrice(price);
        productObj.setModel(model);
        productObj.setDate(date);
        productObj.setPhoto(photo);
        productObj.setDiscriptin(description);
        productObj.setQuantity(quantity);
        productObj.setProductId(productid);
        productObj.setCategory(category);
        
        
       
        // object product model 
        
        ProductModel obj = new ProductModel();
        boolean addProduct = obj.addProduct(productObj);
        out.print(addProduct);
        
         
        
    }

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
        processRequest(request, response);
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
        processRequest(request, response);
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
