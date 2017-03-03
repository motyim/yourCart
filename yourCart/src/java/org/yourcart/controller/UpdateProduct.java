package org.yourcart.controller;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import org.yourcart.beans.Product;
import org.yourcart.model.ProductModel;

public class UpdateProduct extends HttpServlet {

    Product productobject = null;
    ProductModel db;
    PrintWriter out;
    int id;



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
          response.setContentType("text/html;charset=UTF-8");
        db = new ProductModel();

        out = response.getWriter();
         id = Integer.parseInt(request.getParameter("id"));
        System.out.println("id=  " + id);
        productobject = db.getProduct(id);
        System.out.println(productobject);

        System.out.println(productobject.getName());
        if (productobject != null) {
            System.out.println("if");
            request.setAttribute("productobject", productobject);
            RequestDispatcher dd = request.getRequestDispatcher("updateProduct.jsp");
            dd.forward(request, response);

        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // processRequest(request, response);
        Product u=new Product();
        String name = request.getParameter("name");
        int price=Integer.parseInt(request.getParameter("price"));
       // price = Double.parsedouble();
     //  String id = request.getParameter("id");
        int cat = Integer.parseInt(request.getParameter("cat"));
        int quan = Integer.parseInt(request.getParameter("quan"));
        String date = request.getParameter("date");
        String disc = request.getParameter("disc");
        String photo = request.getParameter("photo");
        String model = request.getParameter("model");
        u.setName(name);
        u.setDate(date);
        u.setCategory(cat);
        u.setDiscriptin(disc);
        u.setQuantity(quan);
        u.setModel(model);
        u.setPhoto(photo);
        u.setPrice(price);
        u.setProductId(id);
        System.out.println("osama aaa"+u.getName()+u.getPrice()+"   "+id);
        db=new ProductModel();
        boolean editProduct = db.editProduct(u);
        System.out.println(editProduct);

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
