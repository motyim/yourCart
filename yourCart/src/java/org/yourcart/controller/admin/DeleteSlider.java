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
            request.getSession().setAttribute("message", "Slide Deleted Successfully");
            response.sendRedirect("../Success.jsp");
        } else {
            //can't add product
           request.getSession().setAttribute("message", "can't Delete slide..An Error occure");
           response.sendRedirect("../Failed.jsp");
        }

    }
}
