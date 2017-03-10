package org.yourcart.controller.admin;


import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.yourcart.beans.History;
import org.yourcart.model.UserHistory;


/**
 * display all history
 * @author OsamaPC
 */
public class GetAllHistory extends HttpServlet {

    
    UserHistory h;
   
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                h=new UserHistory();
                ArrayList<History> allHistory=null;
                try {
                    allHistory = h.getAllHistory();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
               
    }

  

}
