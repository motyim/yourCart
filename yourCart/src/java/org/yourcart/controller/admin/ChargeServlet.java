package org.yourcart.controller.admin;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.yourcart.model.changemodel;

/**
 *
 * @author Nesmaa
 */
@WebServlet(name = "ChargeServlet", urlPatterns = {"/admin/ChargeServlet"})
public class ChargeServlet extends HttpServlet {

     changemodel model = new changemodel();
   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
       PrintWriter out = response.getWriter();
      int SumCard50= model.getSumCardNumber(50);
       request.setAttribute("SumCard50",SumCard50 );
               
       
        int SumCard100= model.getSumCardNumber(100);
        request.setAttribute("SumCard100",SumCard100 );
        
        int SumCard200= model.getSumCardNumber(200);
        request.setAttribute("SumCard200",SumCard200 );
        
         int SumCard500= model.getSumCardNumber(500);
        request.setAttribute("SumCard500",SumCard500 );
       
            
        
        
        
    }


   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
