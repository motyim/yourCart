
package org.yourcart.customtag;

import java.util.ArrayList;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import org.yourcart.model.CategoryModel;

/**
 *
 * @author MotYim
 */
public class Category extends SimpleTagSupport {

  
    @Override
    public void doTag() throws JspException {
        JspWriter out = getJspContext().getOut();
        
        try {
            out.print("<select name='category'>");
            
            //get all category
            ArrayList<org.yourcart.beans.Category> categoriess = new CategoryModel().AllCategoriess();
            for (org.yourcart.beans.Category categories : categoriess) {
                out.print("<option value='"+categories.getId()+"'>"+categories.getName()+"</option>");
            }
            out.print("</select>");
        } catch (java.io.IOException ex) {
            throw new JspException("Error in Category tag", ex);
        }
    }
    
}
