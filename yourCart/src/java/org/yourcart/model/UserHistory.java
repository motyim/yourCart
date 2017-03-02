package org.yourcart.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.yourcart.beans.History;

/**
 *
 * @author OsamaPC
 */
public class UserHistory {

    ResultSet rs = null;
   // DbConnection db = new DbConnection();
    Connection con;
    History history = new History();
    DbConnection db = new DbConnection();

    History getUserHistory(int usrId) {

        try {

            con = db.openConnection();

            PreparedStatement pst = null;
            pst = con.prepareStatement("select * From history where user_id=?");
            pst.setInt(1, usrId);
            rs = pst.executeQuery();
            rs.next();
            history.setHistoryId(rs.getInt(1));
            history.setProductId(rs.getInt(3));
            history.setQuantity(rs.getInt(5));
            history.setData(rs.getString(4));
            db.closeConnection();
            return history;
        } catch (SQLException ex) {
            db.closeConnection();
            ex.printStackTrace();
            return null;
        } finally {
            db.closeConnection();
        }
    }

    ArrayList<History> getAllHistory() throws SQLException {
        ArrayList<History> arrList = new ArrayList();

        try {
            con = db.openConnection();
            PreparedStatement pst = null;
            try {
                pst = con.prepareStatement("select * From history");
            } catch (SQLException ex) {
                Logger.getLogger(UserHistory.class.getName()).log(Level.SEVERE, null, ex);
            }
            rs = pst.executeQuery();

            while (rs.next()) {
                history.setHistoryId(rs.getInt(1));
                history.setProductId(rs.getInt(3));
                history.setQuantity(rs.getInt(5));
                history.setData(rs.getString(4));
                arrList.add(history);
            }

            db.closeConnection();
            return arrList;
        } catch (SQLException ex) {
            db.closeConnection();
            ex.printStackTrace();
            return null;
        } finally {
            db.closeConnection();
        }
    }

    boolean addUserHistory(int usrId, History s) {
        con = db.openConnection();
        PreparedStatement pst = null;
        try {
            System.out.println("my con" + con);
            pst = con.prepareStatement("insert into history (id,user_id,product_id,date,quantity)Values (?,?,?,?,?)");
            pst.setInt(1, s.getHistoryId());
            pst.setInt(2, usrId);
            pst.setInt(3, s.getProductId());
            pst.setString(4, s.getData());
            pst.setInt(5, s.getQuantity());

            int executeUpdate = pst.executeUpdate();
            db.closeConnection();
            if (executeUpdate > 0) {
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    boolean deleteUserHistory(int usrId) {
        con = db.openConnection();
        PreparedStatement pst = null;
        try {
            //System.out.println("my con" + con);
            pst = con.prepareStatement("delete From history where user_id=?");
            pst.setInt(1, usrId);
            int executeUpdate = pst.executeUpdate();
            db.closeConnection();
            if (executeUpdate > 0) {
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;

    }

   
}
