package org.yourcart.controller.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import org.yourcart.beans.Product;
import org.yourcart.beans.Slider;
import org.yourcart.model.ProductModel;
import org.yourcart.model.SliderOperation;
import org.yourcart.utilize.FileUpload;

/**
 * to add slider
 *
 * @author OsamaPC
 */
@WebServlet("/admin/AddSlider")
@MultipartConfig
public class AddSlider extends HttpServlet {

    static int productIdForSlider;
    static Product productForSlider;
    ProductModel pModel;
    Slider slider;
    SliderOperation sliderOp;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("addslider");
        productIdForSlider = Integer.parseInt(request.getParameter("id"));
        pModel = new ProductModel();
        productForSlider = pModel.getProduct(productIdForSlider);

        if (productForSlider == null) {
            request.getSession().setAttribute("message", "Product not found");
            response.sendRedirect("../Failed.jsp");
        } else {
            request.setAttribute("product", productForSlider);
            request.getRequestDispatcher("/admin/addSlider.jsp").forward(request, response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        sliderOp = new SliderOperation();
//        String name = request.getParameter("ProductName");
//        String price = request.getParameter("ProductPrice");
        String tittle = request.getParameter("tittle");
        String subtittle = request.getParameter("subTittle");
        String desc = request.getParameter("ProductDescription");

        slider = new Slider();
        slider.setDescription(desc);
        slider.setTitle(tittle);
        slider.setSubTitle(subtittle);
        slider.setProductId(productIdForSlider);

        Part filePart = request.getPart("image");
        if (filePart.getSize() != 0) {      //if photo uploaded
            String path = request.getServletContext().getRealPath("");

            try {
                String uploadedpath = FileUpload.uploadImage(filePart, path);
                slider.setImage(uploadedpath);
            } catch (Exception ex) {
                ex.printStackTrace();

                //set alert message
                request.getSession().setAttribute("AlertMessage", "please choose image only");
                //set alert type
                request.getSession().setAttribute("AlertType", "danger");
                response.sendRedirect("SlidersShow");
                return;
            }

        } else {                          //no photo uploaded
            slider.setImage(request.getParameter("photo"));
        }

        System.out.println(slider);
        boolean addSlider = sliderOp.addSlider(slider);
        if (addSlider) {
            //set alert message
            request.getSession().setAttribute("AlertMessage", "Slide Added Successfully");
            //set alert type
            request.getSession().setAttribute("AlertType", "success");
            response.sendRedirect("SlidersShow");
        } else {
            //set alert message
            request.getSession().setAttribute("AlertMessage", "canot add slide ..An Error occure");
            //set alert type
            request.getSession().setAttribute("AlertType", "danger");
            response.sendRedirect("SlidersShow");

        }

    }

}
