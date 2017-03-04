/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourcart.controller;

/**
 *
 * @author sara metwalli
 */
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import org.yourcart.beans.Product;
import org.yourcart.beans.Product;
import org.yourcart.model.ProductModel;

@WebServlet("/ProductDetailsServlet")
public class ProductDetailsServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        ProductModel productModel = new ProductModel();
        //   out.print("in Product details"+request.getParameter("id"));
        String id = request.getParameter("id");
        int idParsed = Integer.parseInt(id);
        Product product = productModel.getProduct(idParsed);
         request.setAttribute("product", product);
         String nextJSP = "/product-details.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request, response);

    }
}
