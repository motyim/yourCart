
package org.yourcart.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.yourcart.beans.Cart;
import org.yourcart.model.CartModel;


/**
 *
 * @author OsamaPC
 */
public class AddCart extends HttpServlet {

    CartModel cartModel;
    Cart car = null;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        cartModel = new CartModel();
        int usrID = Integer.parseInt(request.getParameter("usrID"));
        int pID = Integer.parseInt(request.getParameter("productID"));
        int qaunty = Integer.parseInt(request.getParameter("qaunty"));
        car = new Cart();
        car.setProductId(pID);
        car.setQuantity(qaunty);
        car.setUserId(usrID);
        boolean addCart = cartModel.addCart(car);
        System.out.println(addCart);
    }

    

}
