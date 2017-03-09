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
import javax.servlet.annotation.WebServlet;
import org.yourcart.beans.User;
import org.yourcart.model.changemodel;
import org.yourcart.model.UserDbModel;

@WebServlet("/ConfirmScratchCardServlet")
public class ConfirmScratchCardServlet extends HttpServlet {

    RequestDispatcher dispatcher;
    String nextJSP;

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        User usr = (User) request.getSession().getAttribute("LoginUser");
        int usrId = usr.getUserId();
        double cash = usr.getCash();
        
        String CardStr = request.getParameter("CardStr");
        System.out.println("cardStr"+CardStr);
        changemodel chModel = new changemodel();
        boolean exist = chModel.checkCardExistForUser(CardStr);
       // boolean notused = chModel.checkCardValidation(CardStr);
        System.out.println("exx "+ exist );
        if (exist ) {
            int value = chModel.getValuefromNumber(CardStr);
            chModel.setCardUsed(CardStr);
            cash = cash + value;
            UserDbModel usrDbModel = new UserDbModel();
            boolean cashAdded = usrDbModel.updateUserCash(usrId, cash);
            if (cashAdded) {
                request.setAttribute("message", "The Cash added to your balance successfully");
                
                nextJSP = "/Success.jsp";
                dispatcher = getServletContext().getRequestDispatcher(nextJSP);
                dispatcher.forward(request, response);

            } else {
                request.setAttribute("message", "Error , cash is not added please check your balance and try again ");
                nextJSP = "/Failed.jsp";
                dispatcher = getServletContext().getRequestDispatcher(nextJSP);
                dispatcher.forward(request, response);

            }

        }
        else{
         request.setAttribute("message", "Error , This Card is invalid please try again later ");
                nextJSP = "/Failed.jsp";
                dispatcher = getServletContext().getRequestDispatcher(nextJSP);
                dispatcher.forward(request, response);
        }

    }
}
