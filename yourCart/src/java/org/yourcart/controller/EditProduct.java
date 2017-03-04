/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourcart.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.yourcart.beans.Product;
import org.yourcart.model.ProductModel;

/**
 *
 * @author OsamaPC
 */
public class EditProduct extends HttpServlet {

    Product product = null;
    ProductModel db;
    PrintWriter out;
    int id;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // productModel = new ProductModel();
        response.setContentType("text/html;charset=UTF-8");
        db = new ProductModel();

        out = response.getWriter();
        id = Integer.parseInt(request.getParameter("id"));
        System.out.println("id=  " + id);
        product = db.getProduct(id);
        System.out.println(product);

        System.out.println(product.getName());
        if (product != null) {
            System.out.println("if");
            request.setAttribute("productobject", product);
            RequestDispatcher dd = request.getRequestDispatcher("addproduct.jsp");
            dd.forward(request, response);

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
