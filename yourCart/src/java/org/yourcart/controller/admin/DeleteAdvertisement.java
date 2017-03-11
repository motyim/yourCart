package org.yourcart.controller.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.yourcart.model.AdvertisementModel;

/**
 * delete ads
 * @author OsamaPC
 */
@WebServlet("/admin/DeleteAdvertisement")
@MultipartConfig
public class DeleteAdvertisement extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        AdvertisementModel model = new AdvertisementModel();
        boolean x = model.deleteAdvertisment(id);
        
        if (x) {
            //set alert message
            request.getSession().setAttribute("AlertMessage", "ADS Deleted Successfully");
            //set alert type
            request.getSession().setAttribute("AlertType", "success");
            response.sendRedirect("ShowAdvertisement");
            
            
        } else {
            
            //can't add product
            
            //set alert message
            request.getSession().setAttribute("AlertMessage", "canot Delete ADS ..An Error occure");
            //set alert type
            request.getSession().setAttribute("AlertType", "danger");
            response.sendRedirect("ShowAdvertisement");
            
      
        }

    }


}
