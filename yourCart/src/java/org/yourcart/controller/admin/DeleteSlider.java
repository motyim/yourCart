package org.yourcart.controller.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.yourcart.model.SliderOperation;

/**
 * delete slide
 * @author OsamaPC 
 */
@WebServlet("/admin/DeleteSlider")
public class DeleteSlider extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        SliderOperation sliderOp = new SliderOperation();
        int id = Integer.parseInt(request.getParameter("id"));
        System.out.println(id);

        boolean deleteSlider = sliderOp.deleteSlider(id);
        if (deleteSlider) {
            //redirect to Success
             //set alert message
            request.getSession().setAttribute("AlertMessage", "Slide Deleted Successfully");
            //set alert type
            request.getSession().setAttribute("AlertType", "success");
            response.sendRedirect("SlidersShow");
            
        } else {
            //can't add product
            //set alert message
            request.getSession().setAttribute("AlertMessage", "canot Delete slide ..An Error occure");
            //set alert type
            request.getSession().setAttribute("AlertType", "danger");
            response.sendRedirect("SlidersShow");
           
        }

    }
}
