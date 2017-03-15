package org.yourcart.controller.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.yourcart.beans.Advertisement;
import org.yourcart.model.AdvertisementModel;
import org.yourcart.model.ProductModel;

/**
 * get new random ads to display in sliderbar
 * @author MotYim
 */
@WebServlet(name = "Ads", urlPatterns = {"/Ads"})
public class Ads extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        request.setAttribute("maxPrice", (int)(new ProductModel().getMaxProductByPrice()));
        Advertisement randomAds = new AdvertisementModel().getRandomAds();
        if(randomAds != null )
            request.setAttribute("ads", randomAds);
    }

   
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
