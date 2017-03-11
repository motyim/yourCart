package org.yourcart.controller.user;

/**
 * handle get card number and send via mail
 * @author sara metwalli
 */
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import org.yourcart.beans.User;
import org.yourcart.model.changemodel;
import org.yourcart.utilize.MailModel;

@WebServlet("/ScratchCardServlet")
public class ScratchCardServlet extends HttpServlet {

    RequestDispatcher dispatcher;
    String nextJSP;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int charge = Integer.parseInt(request.getParameter("charge"));
        changemodel chModel = new changemodel();

        int count;
        switch (charge) {
            case 50:
            case 100:
            case 200:
            case 500:
                count = chModel.getSumCardNumber(charge);

                if (count > 0) {
                    request.setAttribute("message", " Please check your Email to get the code");
                    request.setAttribute("showGoToCharge", true);
                    String card_number = chModel.getCard(charge);
                    chModel.setCardTaken(card_number);
                    //-------------- Send mail ------------------
                    String message = "Thanks for Charging from YourCart ^_^ <br/>"
                    + "your cardNumber is : "+card_number + "<br/> with value of : "+charge +"$"
                    +"<br/> to chare your cart <a href='http://localhost:8084/yourCart/ConfirmScratchCard.jsp'> click here </a>";
                    User user =(User) request.getSession().getAttribute("LoginUser");
                    new MailModel(user.getEmail(), "Successfull Payment", message).sendMail();
                    
                    nextJSP = "/Success.jsp";
                    dispatcher = getServletContext().getRequestDispatcher(nextJSP);
                    dispatcher.forward(request, response);
                    break;
                }

            default:
                request.setAttribute("message", "Sorry this Scratch Card is not available right now, Please try again later ");
                nextJSP = "/Failed.jsp";
                dispatcher = getServletContext().getRequestDispatcher(nextJSP);
                dispatcher.forward(request, response);

        }

    }
}
