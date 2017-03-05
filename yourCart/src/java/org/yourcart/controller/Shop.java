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
import java.util.ArrayList;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import org.yourcart.beans.Product;
import org.yourcart.model.ProductModel;

@WebServlet("/Shop")
public class Shop extends HttpServlet {

    List<Product> allProducts = new ArrayList<Product>();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ProductModel productModel = new ProductModel();
        if(request.getParameter("cate") !=null)
        {
            int cate=   Integer.parseInt(request.getParameter("cate"));
            allProducts = productModel.getAllProductByCategoryId(cate);
        }
        else
        {
            allProducts = productModel.getAllProduct();
        }
        
        request.setAttribute("allProducts", allProducts);
        String nextJSP = "/shop.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request, response);
    }
}
