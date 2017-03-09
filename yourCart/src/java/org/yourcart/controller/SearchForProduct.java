/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourcart.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.yourcart.model.ProductModel;

/**
 *
 * @author Nesmaa
 */
public class SearchForProduct extends HttpServlet {
    ArrayList<org.yourcart.beans.Product> product = new ArrayList<>();
    ProductModel model = new ProductModel();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
         
        
      if( request.getParameter("search")=="search")
      {
          String productName = request.getParameter("search");
           
          System.out.println(productName);
        
          product = model.getProductByName(productName);
        
        System.out.println(product.size());
       
        }
        else
        {
            System.out.println("else");
          int min = Integer.parseInt(request.getParameter("down"));
            System.out.println(min);
          int max= Integer.parseInt(request.getParameter("up"));
            System.out.println(max);
       
          product=model.getAllProductByPrice(min, max);
            System.out.println("sizeof product"+product.size());
          
        }
      
        request.setAttribute("allProducts", product);
        String nextJSP = "/shop.jsp";
       
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

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
