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
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import org.yourcart.beans.Cart;
import org.yourcart.beans.Product;
import org.yourcart.model.CartModel;
import org.yourcart.model.ProductModel;
import org.yourcart.beans.User;
import org.yourcart.beans.CartProduct;

@WebServlet("/CartHandlerServletTest")
public class CartHandlerServletTest extends HttpServlet {

    ArrayList<CartProduct> carts=new ArrayList<CartProduct>();
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   
    User usr = (User) request.getSession().getAttribute("LoginUser");
        int usrId = usr.getUserId();
        CartModel cartModel = new CartModel();
        carts=cartModel.getProductFromCart(usrId);
       
         request.setAttribute("carts", carts);
         
          String nextJSP = "/checkout.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request, response);
    }
}
