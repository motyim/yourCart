package org.yourcart.controller.user;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.yourcart.beans.User;
import org.yourcart.model.UserDbModel;

/**
 * handle signin
 * @author MotYim
 */
@WebServlet(name = "Signin", urlPatterns = {"/Signin"})
public class Signin extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Cookie[] cookies = request.getCookies();
        String username = "";
        String password = "";
        if (cookies != null) {
            for (int i = 0; i < cookies.length; i++) {
                Cookie cookie = cookies[i];
                if (cookie.getName().equals("userNameCookie")) {
                    username = cookie.getValue();
                }

                if (cookie.getName().equals("passwordCookie")) {
                    password = cookie.getValue();
                }
            }
        }
        request.setAttribute("username", username);
        request.setAttribute("password", password);
        request.getRequestDispatcher("/login.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        Cookie c3 = new Cookie("block", "block");
	response.addCookie(c3);
        String username = "";
        String password = "";
        String test="";
        Cookie[] cookies = request.getCookies();

        if(cookies!=null)
		{	
			for(int i=0; i<cookies.length; i++)
			{
				//Cookie cookie= cookies[i];
				if(cookies[i].getName().equals("block"))
					{
						test=cookies[i].getValue();
					}
			}
		}
        username = request.getParameter("SigninName");
        password = request.getParameter("SigninPassword");

        User user = new UserDbModel().signIn(username, password);
//        System.out.println("----->" + user.getUserName() + "  " + user.getPassword());
        System.out.println("--->" + username + " " + password);
        if (user == null) {
            //TODO : MAKE forget password
            request.setAttribute("message", "Cant't Login <br/> Wrong username or password .. ");
            getServletContext().getRequestDispatcher("/Failed.jsp").forward(request, response);
        } else {
            String ch = request.getParameter("SigninCheckbox");
            Cookie nameCookie = new Cookie("userNameCookie", username);
            Cookie passCookie = new Cookie("passwordCookie", password);
            if (user.getUserName().equalsIgnoreCase(username) && user.getPassword().equalsIgnoreCase(password)) {
                if (ch != null && test.equalsIgnoreCase("block")) {
                    System.out.println("------->  CookiesAdded");
                    response.addCookie(passCookie);
                    response.addCookie(nameCookie);
                } else if (ch != null) {
                    request.setAttribute("message", "please open Cookies ");
                    getServletContext().getRequestDispatcher("/Failed.jsp").forward(request, response);

                }
            } else {
                request.setAttribute("message", "User name or password is wrong ");
                getServletContext().getRequestDispatcher("/Failed.jsp").forward(request, response);
            }
            //set session for login user
            HttpSession session = request.getSession(true);
            session.setAttribute("LoginUser", user);
<<<<<<< HEAD:yourCart/src/java/org/yourcart/controller/Signin.java
            session.setMaxInactiveInterval(60 * 15);
=======
            session.setMaxInactiveInterval(60*15);
            
               if(user.getRole().equalsIgnoreCase("admin")){
                   System.out.println("ADMIN");
                   response.sendRedirect("admin/index.jsp");   //admin
               }
                   
               else {
                   System.out.println("NOT");
                   response.sendRedirect("index.jsp");
               }                  //user
           }
        
        
    }
>>>>>>> e0454714ccfc8acc2c0a99e4e7b55a232946658b:yourCart/src/java/org/yourcart/controller/user/Signin.java

            if (user.getRole().equalsIgnoreCase("admin")) {
                response.sendRedirect("admin/AdminProductServlet");   //admin
            } else {
                response.sendRedirect("index.jsp");                  //user
            }

        }

    }

}
