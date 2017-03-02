package org.yourcart.controller;



import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.yourcart.model.CartModel;


/**
 *
 * @author OsamaPC
 */
public class NumberOFCartsForUser extends HttpServlet {

     CartModel cartModel;
   

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        cartModel = new CartModel();
        int id = Integer.parseInt(request.getParameter("id"));
       
         int addCart = cartModel.getNubmberOfCartsForUser(id);
        System.out.println(addCart);
    }
  
}
