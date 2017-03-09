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
public class UserHistory extends DbConnection{

    ResultSet rs = null;
   // DbConnection db = new DbConnection();
    Connection con;
  

    public History getUserHistory(int usrId) {
        History history = new History();
        try {

            con = openConnection();

            PreparedStatement pst = null;
            pst = con.prepareStatement("select * From history where user_id=?");
            pst.setInt(1, usrId);
            rs = pst.executeQuery();
            rs.next();
            history.setHistoryId(rs.getInt(1));
            history.setUserId(rs.getInt(2));
            history.setProductId(rs.getInt(3));
            history.setQuantity(rs.getInt(5));
            history.setData(rs.getString(4));
            closeConnection();
            return history;
        } catch (SQLException ex) {
            closeConnection();
            ex.printStackTrace();
            return null;
        } finally {
            closeConnection();
        }
    }

   public ArrayList<History> getAllHistory() throws SQLException {
        ArrayList<History> arrList = new ArrayList();

        try {
            con = openConnection();
            PreparedStatement pst = null;
            try {
                pst = con.prepareStatement("select * From history");
            } catch (SQLException ex) {
                Logger.getLogger(UserHistory.class.getName()).log(Level.SEVERE, null, ex);
            }
            rs = pst.executeQuery();

            while (rs.next()) {
                History history = new History();
                history.setHistoryId(rs.getInt(1));
                history.setUserId(rs.getInt(2));
                history.setProductId(rs.getInt(3));
                history.setQuantity(rs.getInt(5));
                history.setData(rs.getString(4));
                arrList.add(history);
            }

            closeConnection();
            return arrList;
        } catch (SQLException ex) {
            closeConnection();
            ex.printStackTrace();
            return null;
        } finally {
            closeConnection();
        }
    }

    public boolean addUserHistory(History s) throws SQLException {
        con = openConnection();
        PreparedStatement pst = null;
        
            System.out.println("my con" + con);
            pst = con.prepareStatement("insert into history (user_id,product_id,date,quantity)Values (?,?,?,?)");
            pst.setInt(1, s.getUserId());
            pst.setInt(2, s.getProductId());
            pst.setString(3, s.getData());
            pst.setInt(4, s.getQuantity());

            int executeUpdate = pst.executeUpdate();
            closeConnection();
            if (executeUpdate > 0) {
                return true;
            }
  
        return false;
    }

   

   
}
