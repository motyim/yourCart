package org.yourcart.controller.admin;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.yourcart.beans.Advertisement;
import org.yourcart.model.AdvertisementModel;

/**
 * display all ads
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



}
