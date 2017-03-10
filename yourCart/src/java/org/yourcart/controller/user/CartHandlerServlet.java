package org.yourcart.controller.user;

/**
 * get object in cart db of user to display in checkout page
 * @author sara metwalli
 */
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import org.yourcart.model.CartModel;
import org.yourcart.beans.User;
import org.yourcart.beans.CartProduct;

@WebServlet("/CartHandlerServlet")
public class CartHandlerServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ArrayList<CartProduct> carts = new ArrayList<CartProduct>();
        User usr = (User) request.getSession().getAttribute("LoginUser");
        int usrId = usr.getUserId();
        CartModel cartModel = new CartModel();
        carts = cartModel.getProductFromCart(usrId);

        request.setAttribute("carts", carts);

        String nextJSP = "/checkout.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request, response);
    }
}
