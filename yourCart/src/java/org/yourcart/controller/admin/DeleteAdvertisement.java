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
 *
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
            //redirect to Success
            request.getSession().setAttribute("message", "ADS Deleted Successfully");
            response.sendRedirect("../Success.jsp");
        } else {
            //can't add product
           request.getSession().setAttribute("message", "can't Delete ADS ..An Error occure");
           response.sendRedirect("../Failed.jsp");
        }

    }


}
