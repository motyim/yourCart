/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourcart.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.yourcart.beans.Advertisement;
import org.yourcart.beans.Slider;

/**
 *
 * @author OsamaPC
 */
public class AdvertisementModel extends DbConnection {

    Connection con;
    ResultSet rs;

//    public static void main(String[] args) {
//        AdvertisementModel m = new AdvertisementModel();
//        // m.addAdvertisment("osama");
//         boolean advertisement = m.deleteAdvertisment(1);
//         System.out.println(advertisement);
//    }

    public boolean addAdvertisment(String img) {

        try {
            con = openConnection();
            PreparedStatement pst = null;
            System.out.println("my con" + con);
            pst = con.prepareStatement("insert into ads (image)Values (?)");

            pst.setString(1, img);

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

    public boolean deleteAdvertisment(int id) {

        try {
            con = openConnection();
            PreparedStatement pst = null;
            //System.out.println("my con" + con);
            pst = con.prepareStatement("delete From ads where id=?");
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

    public int getAdvertisementCount(int id) {
        try {
            con = openConnection();
            PreparedStatement pst = null;
            //System.out.println("my con" + con);
            pst = con.prepareStatement("SELECT COUNT(*) FROM ads;");
            pst.setInt(1, id);
            int x = pst.executeUpdate();
            System.out.println("count  ==   " + x);
            closeConnection();
            if (x > 0) {
                return x;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    public ArrayList<Advertisement> getAllAdvertisements() {
        try {

            con = openConnection();
            ArrayList<Advertisement> arr = new ArrayList<>();
            PreparedStatement pst = null;
            pst = con.prepareStatement("select * From ads");

            rs = pst.executeQuery();
            while (rs.next()) {
                Advertisement ad = new Advertisement();
                ad.setId(rs.getInt("id"));
                ad.setImage(rs.getString(2));
                arr.add(ad);
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

    public Advertisement getAddVert(int id) {
        Advertisement ad = new Advertisement();
        try {

            con = openConnection();

            PreparedStatement pst = null;
            pst = con.prepareStatement("select * From ads where id=?");
            pst.setInt(1, id);
            rs = pst.executeQuery();
            if (rs.next()) {
                
                ad.setId(rs.getInt("id"));
                ad.setImage(rs.getString(2));

            }
            closeConnection();
            return ad;
        } catch (SQLException ex) {
            closeConnection();
            ex.printStackTrace();
            return null;
        } finally {
            closeConnection();
        }
    }
}
