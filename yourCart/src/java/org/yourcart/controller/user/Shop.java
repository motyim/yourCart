package org.yourcart.controller.user;

/**
 * handle display product and category 
 * @author sara metwalli Edit by MotYim
 */
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import org.yourcart.beans.Product;
import org.yourcart.model.ProductModel;

@WebServlet("/Shop")
public class Shop extends HttpServlet {

    List<Product> allProducts = new ArrayList<Product>();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ProductModel productModel = new ProductModel();

        //-------------- handle paging ------------------
        int pageid = 1;
        int totalPerPage = 9;
        int start;

        if (request.getParameter("page") != null) {
            pageid = Integer.parseInt(request.getParameter("page"));
        }

        //end & start for paging
        start = (pageid - 1 )*totalPerPage;
        

        if (request.getParameter("cate") != null) {
            int cate = Integer.parseInt(request.getParameter("cate"));
            allProducts = productModel.getAllProductByCategoryId(cate,start,totalPerPage);
        } else {
            allProducts = productModel.getAllProduct(start, totalPerPage);
        }
        
        int noOfRecords = productModel.getNoOfRecords();
        int noOfPages = (int) Math.ceil(noOfRecords * 1.0 / totalPerPage);
       
        request.setAttribute("allProducts", allProducts);
        request.setAttribute("noOfPages", noOfPages);
        request.setAttribute("currentPage", pageid);
        request.setAttribute("query" , request.getParameter("cate"));
        
        String nextJSP = "/shop.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request, response);

    }
}
