/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourcart.customtag;

import java.util.ArrayList;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import org.yourcart.beans.Category;
import org.yourcart.model.CategoryModel;

/**
 *
 * @author MotYim
 */
public class CartCategoryTagHandler extends SimpleTagSupport {


    @Override
    public void doTag() throws JspException {
        JspWriter out = getJspContext().getOut();
        
        try {
            
            ArrayList<Category> AllCategoriess = new CategoryModel().AllCategoriess();
            for (Category category : AllCategoriess) {
                out.print("<div class='panel panel-default'>\n" +
"                            <div class='panel-heading'>\n" +
"                                <h4 class='panel-title'><a href='Shop?page=1&cate="+category.getId()+"'>"+category.getName()+"</a></h4>\n" +
"                            </div>\n" +
"                        </div>");
            }
           
           
           
        } catch (java.io.IOException ex) {
            throw new JspException("Error in CartCategoryTagHandler tag", ex);
        }
    }
    
}
