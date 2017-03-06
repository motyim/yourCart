package org.yourcart.customtag;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import org.yourcart.model.CategoryModel;

/**
 *
 * @author MY-PC
 */
public class CategoryName extends SimpleTagSupport {

    private int id;

    @Override
    public void doTag() throws JspException {
        JspWriter out = getJspContext().getOut();
        
        try {
            out.print(new CategoryModel().getCategorie(id).getName());
        } catch (java.io.IOException ex) {
            throw new JspException("Error in CategoryName tag", ex);
        }
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
