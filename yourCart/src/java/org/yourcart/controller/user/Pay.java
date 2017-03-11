package org.yourcart.controller.user;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.yourcart.beans.CartProduct;
import org.yourcart.beans.User;
import org.yourcart.model.CartModel;
import org.yourcart.model.Payment;
import org.yourcart.utilize.MailModel;

/**
 * to proccess pay operation 
 * @author MotYim
 */
@WebServlet(name = "Pay", urlPatterns = {"/Pay"})
public class Pay extends HttpServlet {

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

        CartModel cartModel = new CartModel();
        double total = 0;
        String message = "";
        
        //get user form session
        User user = (User) request.getSession().getAttribute("LoginUser");

        //get product of user
        ArrayList<CartProduct> productCart = cartModel.getProductFromCart(user.getUserId());

        //-------------- Checkes ------------------
        //check  quantity
        for (CartProduct cart : productCart) {

            total = cart.getPrice() * cart.getQuantity();
            
            //number of order greater than avalialbe
            if (cart.getQuantity() > cart.getQuantity_product()) {
                message += "* you order " + cart.getQuantity() + " of product " + cart.getProductId()
                        + " which we have only " + cart.getQuantity_product() + " pice <br/>";
            }
            
        }

        //check money 
        if (total > user.getCash()) {
            message += " * Your cash less than total require please charge your cash<br>";
        }

        //an error occure
        if (!message.trim().equals("")) {
            request.getSession().setAttribute("message", message);
            response.sendRedirect("Failed.jsp");
            return;
        }
        
        //-------------- Payment proccess ------------------
        
        //reduce balace in user
        user.setCash(user.getCash() - total);
     
        //call transaction 
        if(new Payment().startPayment(user, productCart)){
            //send mail of success
            message = "Thanks for buying from YourCart ^_^ <br/>"
                    + "your product will delivered in two days ..";
            
            new MailModel(user.getEmail(), "Successfull Payment", message).sendMail();
            
            request.getSession().setAttribute("message",message);
            response.sendRedirect("Success.jsp");
        }else{
            request.getSession().setAttribute("message", "Error in proccess please try agine later :( ");
            response.sendRedirect("Failed.jsp");
        }
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "pay money for product of user";
    }// </editor-fold>

}
