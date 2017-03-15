package org.yourcart.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;
import org.yourcart.beans.Advertisement;

/**
 *
 * @author OsamaPC
 */
public class AdvertisementModel extends DbConnection {

    Connection con;
    ResultSet rs;



    public boolean addAdvertisment(String img ,String url) {

        try {
            con = openConnection();
            PreparedStatement pst = null;
            System.out.println("my con" + con);
            pst = con.prepareStatement("insert into ads (image ,url)Values (?,?)");

            pst.setString(1, img);
            pst.setString(2, url);

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

    public Advertisement getRandomAds(){
        ArrayList<Advertisement> allAds = getAllAdvertisements();
        if(allAds.size() == 0 )
            return null ; 
        else return  allAds.get(new Random().nextInt(allAds.size()));
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
                ad.setUrl(rs.getString(3));
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
                ad.setUrl(rs.getString(3));
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
