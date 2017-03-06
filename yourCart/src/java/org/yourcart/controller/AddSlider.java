/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourcart.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
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
 *
 * @author OsamaPC
 */
//@WebServlet(name = "AddSlider", urlPatterns = {"/admin/AddSlider"})
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
         request.setAttribute("product", productForSlider);
       String nextJSP = "/admin/addSlider.jsp";
       
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request, response);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        sliderOp =new SliderOperation();
//        String name = request.getParameter("ProductName");
//        String price = request.getParameter("ProductPrice");
        String tittle = request.getParameter("tittle");
        String subtittle = request.getParameter("subTittle");
        String desc = request.getParameter("ProductDescription");
       
        
        
        slider =new Slider( );
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
                request.setAttribute("message", "please choose image only");
                request.getRequestDispatcher("/Failed.jsp").forward(request, response);
                return;
            }

        }else{                          //no photo uploaded
            slider.setImage(request.getParameter("photo"));
        }
        
        System.out.println(slider);
        boolean addSlider = sliderOp.addSlider(slider);
        if (addSlider){
            response.sendRedirect("../Success.jsp");
        }
        else 
        {
           response.sendRedirect("../Failed.jsp");
        }
        System.out.println("product  "+productForSlider);
        System.out.println("Slider  "+slider);
        
        
    }

}
