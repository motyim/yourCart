/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourcart.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.yourcart.beans.Slider;
import org.yourcart.model.SliderOperation;

/**
 *
 * @author OsamaPC
 */
@WebServlet("/admin/DeleteSlider")
public class DeleteSlider extends HttpServlet {

    int id;
    Slider slider;
    SliderOperation sliderOp;
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        sliderOp=new SliderOperation();
       id = Integer.parseInt(request.getParameter("id"));
        System.out.println(id);
        
        boolean deleteSlider = sliderOp.deleteSlider(id);
        System.out.println("Osama delete Slider ===   "+deleteSlider);
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

   

}
