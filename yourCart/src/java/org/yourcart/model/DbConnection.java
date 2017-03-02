package org.yourcart.model;


/**
 *
 * @author OsamaPC
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {


    Connection con = null;


    public Connection openConnection() {
        try {

            Class.forName("org.mariadb.jdbc.Driver");
            
            //connect to DB
            con = DriverManager.getConnection(
                    "jdbc:mariadb://localhost/yourCart",
                    "root",
                    "");

            System.out.println(con);
            return con;

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();

        }
        return null;
    }

    public boolean closeConnection() {
        try {

            con.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return false;
    }
}

