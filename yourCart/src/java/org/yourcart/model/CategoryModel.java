package org.yourcart.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.yourcart.beans.Category;

/**
 *
 * @author Mostafa
 */
public class CategoryModel {

    Category bean = new Category();
    Connection con;
    DbConnection db = new DbConnection();

    public boolean addCategory(Category cat) {
        boolean b = false;


        try {
            con = db.openConnection();

            PreparedStatement pst1 = con.prepareStatement("INSERT into category (name)"
                    + "values (?)");

            pst1.setString(1, cat.getName());
            System.out.println("before pst1");
            pst1.executeUpdate();
            pst1.close();
            b = true;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return b;
    }

    public void updateCategory(Category updateCat) {

        try {
            con = db.openConnection();

            PreparedStatement pst = con.prepareStatement("update category set name=? where id=? ");
            pst.setString(1, updateCat.getName());
            pst.setInt(2, updateCat.getId());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CategoryModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Category> AllCategoriess() {

        ArrayList<Category> AllCategory = new ArrayList<>();
        try {
            con = db.openConnection();

            PreparedStatement pst = con.prepareStatement("SELECT * from category ");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Category category = new Category();
                category.setId(rs.getInt("id"));
                category.setName(rs.getString("name"));

                AllCategory.add(category);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return AllCategory;
    }
    
    public Category getCategorie(int id) {

        Category category = new Category();
        try {
            con = db.openConnection();

            PreparedStatement pst = con.prepareStatement("SELECT * from category where id=?");
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                category.setId(rs.getInt("id"));
                category.setName(rs.getString("name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return category;
    }

}
