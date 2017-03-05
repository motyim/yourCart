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
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.yourcart.beans.History;
import org.yourcart.model.UserHistory;

@WebServlet("/admin/AdminHistoryServlet")
public class AdminHistoryServlet extends HttpServlet {

    ArrayList<History> allHistory = null;
    UserHistory h;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         h=new UserHistory();
        try {
            allHistory = h.getAllHistory();
             request.setAttribute("allHistoryAdmin",allHistory );

        String nextJSP = "/admin/history.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request, response);
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
    }
}
