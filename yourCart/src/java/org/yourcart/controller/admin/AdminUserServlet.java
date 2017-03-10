/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourcart.controller.admin;

/**
 * display all users
 * @author sara metwalli
 */
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import org.yourcart.beans.User;
import org.yourcart.model.UserDbModel;

@WebServlet("/admin/AdminUserServlet")
public class AdminUserServlet extends HttpServlet {

    List<User> allUsers = new ArrayList<User>();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDbModel userDbModel = new UserDbModel();
        allUsers = userDbModel.getAllUsers();
        request.setAttribute("allUsersAdmin", allUsers);
        String nextJSP = "/admin/users.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request, response);
    }
}
