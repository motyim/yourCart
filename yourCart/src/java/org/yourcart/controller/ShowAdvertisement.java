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
import org.yourcart.beans.Advertisement;
import static org.yourcart.controller.AddSlider.productForSlider;
import org.yourcart.model.AdvertisementModel;

/**
 *
 * @author OsamaPC
 */
@WebServlet("/admin/ShowAdvertisement")
@MultipartConfig
public class ShowAdvertisement extends HttpServlet {

    ArrayList<Advertisement> arr;
    AdvertisementModel model;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        model = new AdvertisementModel();
        arr = model.getAllAdvertisements();
        request.setAttribute("allAdsAdmin", arr);
        String nextJSP = "/admin/ads.jsp";

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
