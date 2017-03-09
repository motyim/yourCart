package org.yourcart.controller.user;

/**
 *
 * @author sara metwalli
 */
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import org.yourcart.model.changemodel;

@WebServlet("/ScratchCardServlet")
public class ScratchCardServlet extends HttpServlet {

     RequestDispatcher dispatcher;
     String nextJSP ;
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int charge = Integer.parseInt(request.getParameter("charge"));
        changemodel chModel = new changemodel();
        int count;
        switch (charge) {
            case 50:
                count = chModel.getSumCardNumber(50);
              //  System.out.println("in scratch 50" + count);
                if (count > 0) {
                    //TODO fn Motyim
                    request.setAttribute("message", " Please check your Email to get the code");
                    request.setAttribute("showGoToCharge",true);
                    String card_number=chModel.getCard(50);
                    System.out.println("taken "+chModel.setCardTaken(card_number));   
                    System.out.println("card from db is"+card_number);
                    nextJSP = "/Success.jsp";
                    dispatcher = getServletContext().getRequestDispatcher(nextJSP);
                    dispatcher.forward(request, response);

                }
                else{
                     request.setAttribute("message", "Sorry this Scratch Card is not available right now, Please try again later ");
                    nextJSP = "/Failed.jsp";
                    dispatcher = getServletContext().getRequestDispatcher(nextJSP);
                    dispatcher.forward(request, response);
                
                }
                
                break;
            case 100:
                count = chModel.getSumCardNumber(100);
              
                if (count > 0) {
                    //TODO fn Motyim
                    request.setAttribute("message", " Please check your Email to get the code");
                    request.setAttribute("showGoToCharge",true);
                     String card_number=chModel.getCard(100);
                     chModel.setCardTaken(card_number);
                    System.out.println("card from db is"+card_number);
                    nextJSP = "/Success.jsp";
                    dispatcher = getServletContext().getRequestDispatcher(nextJSP);
                    dispatcher.forward(request, response);
                }
                 else{
                     request.setAttribute("message", "Sorry this Scratch Card is not available right now, Please try again later ");
                    nextJSP = "/Failed.jsp";
                    dispatcher = getServletContext().getRequestDispatcher(nextJSP);
                    dispatcher.forward(request, response);
                
                }
                break;
            case 200:
                count = chModel.getSumCardNumber(200);
              
                if (count > 0) {
                    //TODO fn Motyim
                    request.setAttribute("message", "Thank you for charging, Please check your Email to get the code");
                    request.setAttribute("showGoToCharge",true);
                    
                     String card_number=chModel.getCard(200);
                      System.out.println("card from db is"+card_number);
                      chModel.setCardTaken(card_number);
                    nextJSP = "/Success.jsp";
                    dispatcher = getServletContext().getRequestDispatcher(nextJSP);
                    dispatcher.forward(request, response);

                }
                 else{
                     request.setAttribute("message", "Sorry this Scratch Card is not available right now, Please try again later ");
                    nextJSP = "/Failed.jsp";
                    dispatcher = getServletContext().getRequestDispatcher(nextJSP);
                    dispatcher.forward(request, response);
                
                }
                break;
            case 500:
                count = chModel.getSumCardNumber(500);
               
                if (count > 0) {
                    //TODO fn Motyim
                    request.setAttribute("message", " Please check your Email to get the code");
                    request.setAttribute("showGoToCharge",true);
                    String card_number=chModel.getCard(500);
                      System.out.println("card from db is"+card_number);
                      chModel.setCardTaken(card_number);
                    nextJSP = "/Success.jsp";
                    dispatcher = getServletContext().getRequestDispatcher(nextJSP);
                    dispatcher.forward(request, response);

                }
                 else{
                     request.setAttribute("message", "Sorry this Scratch Card is not available right now, Please try again later ");
                    nextJSP = "/Failed.jsp";
                    dispatcher = getServletContext().getRequestDispatcher(nextJSP);
                    dispatcher.forward(request, response);
                
                }
                break;
            default:

        }

    }
}
