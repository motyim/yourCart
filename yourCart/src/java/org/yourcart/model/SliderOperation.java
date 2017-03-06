package org.yourcart.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.yourcart.beans.Cart;
import org.yourcart.beans.Slider;

/**
 *
 * @author Mostafa
 */
public class SliderOperation extends DbConnection {

    Connection con;
    ResultSet rs;
//    DbConnection db = new DbConnection();

    public boolean addSlider(Slider slider) {

        try {
            con = openConnection();
            PreparedStatement pst = null;
            System.out.println("my con" + con);
            pst = con.prepareStatement("insert into slides (image,title,subTitle,description,product_Id)Values (?,?,?,?,?)");
            // pst.setInt(1, slider.getId());
            pst.setString(1, slider.getImage());
            pst.setString(2, slider.getTitle());
            pst.setString(3, slider.getSubTitle());
            pst.setString(4, slider.getDescription());
            pst.setInt(5, slider.getProductId());
            int executeUpdate = pst.executeUpdate();
            closeConnection();
            if (executeUpdate > 0) {
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public boolean deleteSlider(int id) {

        try {
            con = openConnection();
            PreparedStatement pst = null;
            //System.out.println("my con" + con);
            pst = con.prepareStatement("delete From slides where id=?");
            pst.setInt(1, id);
            int executeUpdate = pst.executeUpdate();
            closeConnection();
            if (executeUpdate > 0) {
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public ArrayList<Slider> getAllSliders() {
        try {

            con = openConnection();
            ArrayList<Slider> arr = new ArrayList<>();
            PreparedStatement pst = null;
            pst = con.prepareStatement("select * From slides");
           
             rs = pst.executeQuery();
            while (rs.next()) {
                Slider slide = new Slider(rs.getInt("id") ,rs.getString(5), rs.getString(2), rs.getString(3), rs.getString(4),rs.getInt(6));
               
                arr.add(slide);
            }
            closeConnection();
            return arr;
        } catch (SQLException ex) {
            closeConnection();
            ex.printStackTrace();
            return null;
        } finally {
            closeConnection();
        }
    }
//    public static void main(String[] args) {
//        SliderOperation s=new SliderOperation();
//        
//        Slider ss=new Slider();
////        ss.setId(5);
////        ss.setDescription("kljhgg");
////        ss.setImage("jkhjgh");
////        ss.setProductId(1);
////        ss.setSubTitle("lkhg");
////        ss.setTitle("jjjjj");
////        s.addSlider(ss);
//        s.deleteSlider(1);
//        
//    }

}
