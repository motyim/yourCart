package org.yourcart.model;

import org.yourcart.beans.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Nesmaa
 */
public class ProductModel {

    ResultSet rs;
    PreparedStatement pst = null;
    DbConnection db = new DbConnection();
    ArrayList<Product> list = new ArrayList();
    ArrayList<Product> selectLastProduct = new ArrayList();
    ArrayList<Product> ListProductByName = new ArrayList();
    ArrayList<Product> getItem = new ArrayList();

    Connection con;

    public boolean addProduct(Product product) {
        System.out.println("addp");
        int i = 0;

        try {
            con = db.openConnection();
            System.out.println(con);
            pst = con.prepareStatement("insert into product(name,price,quantity,model,descriptin,date,category_id,photo) values (?,?,?,?,?,?,?,?)");

            pst.setString(1, product.getName());
            pst.setDouble(2, product.getPrice());
            pst.setInt(3, product.getQuantity());
            pst.setString(4, product.getModel());
            pst.setString(5, product.getDiscriptin());
            pst.setString(6, product.getDate());
            pst.setInt(7, product.getCategory());
            pst.setString(8, product.getPhoto());

            i = pst.executeUpdate();

            // pst.close();
            //  con.commit();
            db.closeConnection();

            if (i > 0) {
                System.out.println("true");
                return true;
            }

        } catch (SQLException ex) {
            db.closeConnection();
            ex.printStackTrace();

        }
        return false;

    }

    public boolean editProduct(Product product) {
        try {
            con = db.openConnection();
            int i = 0;
            pst = con.prepareStatement("update product set name=?,price=?,quantity=?,model=?,descriptin=?,photo=?,category_id=? where id=?");

            pst.setString(1, product.getName());
            pst.setDouble(2, product.getPrice());
            pst.setInt(3, product.getQuantity());
            pst.setString(4, product.getModel());
            pst.setString(5, product.getDiscriptin());
            pst.setString(6, product.getPhoto());
            pst.setInt(7, product.getCategory());
            pst.setInt(8, product.getProductId());
            System.out.println("--->" + product.getPhoto());
            i = pst.executeUpdate();

            db.closeConnection();
            if (i > 0) {
                return true;
            }

        } catch (SQLException ex) {
            db.closeConnection();
            ex.printStackTrace();
        }
        return false;

    }

    public boolean deleteProduct(int id) {

        try {
            con = db.openConnection();
            int i = 0;
            pst = con.prepareStatement("delete from product where id=?");
            pst.setInt(1, id);
            i = pst.executeUpdate();

            db.closeConnection();
            if (i > 0) {
                return true;
            }

        } catch (SQLException ex) {
            db.closeConnection();
            ex.printStackTrace();
        }
        return false;
    }

    public ArrayList<Product> getAllProduct() {
        try {
            con = db.openConnection();
            pst = con.prepareStatement("select * from product ");
            Product p;
            rs = pst.executeQuery();
            while (rs.next()) {
                p = new Product(rs.getString("name"), rs.getDouble("price"),
                        rs.getString("model"), rs.getString("date"), rs.getString("photo"),
                        rs.getString("descriptin"), rs.getInt("quantity"), rs.getInt("id"),
                        rs.getInt("category_id"));
                list.add(p);

            }

        } catch (SQLException ex) {
            db.closeConnection();
            ex.printStackTrace();
        }
        System.out.println(list.size());
        return list;
    }

    public Product getProduct(int productId) {
        Product productObject = new Product();// to return value of select

        try {
            con = db.openConnection();

            pst = con.prepareStatement("select * from product  where id=?");

            pst.setInt(1, productId);
            rs = pst.executeQuery();
            if (rs.next()) {
                productObject.setName(rs.getString("name"));
                productObject.setProductId(rs.getInt("id"));
                productObject.setPrice(rs.getDouble("price"));
                productObject.setQuantity(rs.getInt("quantity"));
                productObject.setModel(rs.getString("model"));
                productObject.setDiscriptin(rs.getString("descriptin"));
                productObject.setDate(rs.getString("date"));
                productObject.setPhoto(rs.getString("photo"));
                productObject.setCategory(rs.getInt("category_id"));
                db.closeConnection();
                return productObject;
            }

        } catch (SQLException ex) {
            db.closeConnection();
            ex.printStackTrace();
        }

        return null;

    }

    public ArrayList<Product> getLastProduct() {
        System.out.println("getLastproduct");
        try {
            con = db.openConnection();
            pst = con.prepareStatement("select * from product ORDER BY id DESC LIMIT 6 ");
            Product obj;
            rs = pst.executeQuery();
            while (rs.next()) {
                obj = new Product(rs.getString("name"), rs.getDouble("price"), rs.getString("model"), rs.getString("date"), rs.getString("photo"), rs.getString("descriptin"), rs.getInt("quantity"), rs.getInt("id"), rs.getInt("category_id"));
                selectLastProduct.add(obj);

            }

        } catch (SQLException ex) {
            db.closeConnection();
            ex.printStackTrace();
        }
        System.out.println(selectLastProduct.size());
        return selectLastProduct;
    }

    public ArrayList<Product> getProductByName(String productName) {
        try {
            con = db.openConnection();
            pst = con.prepareStatement("select * from product where name like ? ");
            pst.setString(1, productName);
            Product obj;
            rs = pst.executeQuery();
            while (rs.next()) {
                obj = new Product(rs.getString("name"), rs.getDouble("price"), rs.getString("model"), rs.getString("date"), rs.getString("photo"), rs.getString("descriptin"), rs.getInt("quantity"), rs.getInt("id"), rs.getInt("category_id"));
                ListProductByName.add(obj);

            }

        } catch (SQLException ex) {
            db.closeConnection();
            ex.printStackTrace();
        }
        System.out.println(ListProductByName.size());
        return ListProductByName;
    }

    public ArrayList<Product> getAllProductByCategoryId(int categoryId) {
        try {
            con = db.openConnection();
            pst = con.prepareStatement("select * from product where category_id=? ");
            pst.setInt(1, categoryId);
            Product p;
            rs = pst.executeQuery();
            while (rs.next()) {
                p = new Product(rs.getString("name"), rs.getDouble("price"),
                        rs.getString("model"), rs.getString("date"), rs.getString("photo"),
                        rs.getString("descriptin"), rs.getInt("quantity"), rs.getInt("id"),
                        rs.getInt("category_id"));
                list.add(p);

            }

        } catch (SQLException ex) {
            db.closeConnection();
            ex.printStackTrace();
        }
        System.out.println(list.size());
        return list;
    }

    public ArrayList<Product> getRecommeendedItem(int categoryId, int productid) {
        try {
            con = db.openConnection();
            pst = con.prepareStatement("SELECT * from product where id <> ? and category_id= ? ORDER BY id ASC limit 6");
            pst.setInt(1, productid);
            pst.setInt(2, categoryId);
            Product p;
            rs = pst.executeQuery();
            while (rs.next()) {
                p = new Product(rs.getString("name"), rs.getDouble("price"),
                        rs.getString("model"), rs.getString("date"), rs.getString("photo"),
                        rs.getString("descriptin"), rs.getInt("quantity"), rs.getInt("id"),
                        rs.getInt("category_id"));
                getItem.add(p);

            }

        } catch (SQLException ex) {
            db.closeConnection();
            ex.printStackTrace();
        }
        System.out.println(getItem.size());
        return getItem;
    }

}
