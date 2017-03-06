/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourcart.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.yourcart.beans.Slider;
import static org.yourcart.controller.AddSlider.productIdForSlider;
import org.yourcart.model.ProductModel;
import org.yourcart.model.SliderOperation;

/**
 *
 * @author OsamaPC
 */
@WebServlet("/admin/SlidersShow")
public class SlidersShow extends HttpServlet {

    
    ProductModel pModel;
    ArrayList<Slider> sliderArr=new ArrayList<>();
    SliderOperation sliderOp;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        sliderOp=new SliderOperation();
        System.out.println("hi osos in show time");
        sliderArr=sliderOp.getAllSliders();
        request.setAttribute("allslidertsAdmin", sliderArr);
        String nextJSP = "/admin/offers.jsp";

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
