/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourcart.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.yourcart.model.ProductModel;

/**
 *
 * @author OsamaPC
 */
public class DeleteProduct extends HttpServlet {

    ProductModel productModel;
   

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        productModel = new ProductModel();
        int id = Integer.parseInt(request.getParameter("id"));
        System.out.println("id==  "+id);
       
        boolean addCart = productModel.deleteProduct(id);
        System.out.println(addCart);
    }

    
}


