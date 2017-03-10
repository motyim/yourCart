package org.yourcart.controller.user;



import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.yourcart.model.CartModel;


/**
 * get number of product in user cart
 * @author OsamaPC
 */
@WebServlet("/getCartCount")
public class NumberOFCartsForUser extends HttpServlet {

     CartModel cartModel;
   

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        cartModel = new CartModel();
        int id = Integer.parseInt(request.getParameter("id"));
   
         int addCart = cartModel.getNubmberOfCartsForUser(id);
         response.getWriter().print(addCart);

    }
  
}
