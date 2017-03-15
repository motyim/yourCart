package org.yourcart.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.yourcart.beans.Cart;
import org.yourcart.beans.CartProduct;

/**
 *
 * @author OsamaPC
 */
public class CartModel extends DbConnection {

    ResultSet rs = null;

    Connection con;

    public ArrayList<Cart> getUserCart(int usrId) {

        try {

            con = openConnection();
            ArrayList<Cart> arr = new ArrayList<>();
            PreparedStatement pst = null;
            pst = con.prepareStatement("select * From cart where user_id=?");
            pst.setInt(1, usrId);
            rs = pst.executeQuery();
            while (rs.next()) {
                Cart cart = new Cart();
                cart.setCartId(rs.getInt("id"));
                cart.setUserId(rs.getInt(2));
                cart.setProductId(rs.getInt(3));
                cart.setQuantity(rs.getInt(4));
                arr.add(cart);
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

    public boolean addCart(Cart cart) {

        try {
            int search = search(cart.getProductId(), cart.getUserId());
            System.out.println("Serach -- " + search);
            if (search != 0) {
                System.out.println("In edit");
                return editQantity(search + cart.getQuantity(), cart.getUserId(), cart.getProductId());
            }
            System.out.println("Not Edit");
            con = openConnection();
            PreparedStatement pst = null;
            System.out.println("my con" + con);
            pst = con.prepareStatement("insert into cart (id,user_id,product_id,quantity)Values (?,?,?,?)");
            pst.setInt(1, cart.getCartId());
            pst.setInt(2, cart.getUserId());
            pst.setInt(3, cart.getProductId());
            pst.setInt(4, cart.getQuantity());
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

    public boolean deleteCart(int cartID) {
        con = openConnection();
        PreparedStatement pst = null;
        try {
            //System.out.println("my con" + con);
            pst = con.prepareStatement("delete From cart where id=?");
            pst.setInt(1, cartID);
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
    
     public boolean deleteUserCart(int userID) {
        con = openConnection();
        PreparedStatement pst = null;
        try {
            //System.out.println("my con" + con);
            pst = con.prepareStatement("delete From cart where user_id=?");
            pst.setInt(1, userID);
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

    private int search(int pID, int usrID) {
        int qu = 0;
        try {

            con = openConnection();
            PreparedStatement pst = con.prepareStatement("SELECT * from cart where (product_id=?) and (user_id=?)");
            pst.setInt(1, pID);
            pst.setInt(2, usrID);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                qu = rs.getInt("quantity");
            }
            closeConnection();
        } catch (SQLException ex) {
            closeConnection();
            ex.printStackTrace();
        }

        return qu;

    }

    private boolean editQantity(int quantity, int usrID, int productID) {
        try {

            con = openConnection();
            PreparedStatement pst = con.prepareStatement("update cart set quantity=? where user_id=? and product_id=? ");
            pst.setInt(1, quantity);
            pst.setInt(2, usrID);
            pst.setInt(3, productID);

            int x = pst.executeUpdate();
            closeConnection();
            if (x > 0) {
                return true;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            closeConnection();
        }
        return false;
    }

    public int getNubmberOfCartsForUser(int usrID) {

        int count = 0;
        ArrayList<Cart> userCart = getUserCart(usrID);
        for (int i = 0; i < userCart.size(); i++) {
            count += userCart.get(i).getQuantity();
            System.out.println("size ==" + userCart.size());
        }
        System.out.println("Quantity ==  " + count);
        return count;
    }

    public ArrayList<CartProduct> getProductFromCart(int userId) {
        ArrayList<CartProduct> carts = new ArrayList<CartProduct>();
        try {
            con = openConnection();
            PreparedStatement pst = con.prepareStatement("select c.id,c.quantity,p.name,p.price,p.photo,p.descriptin,p.id ,p.quantity from cart as c, product as p where c.product_id=p.id AND c.user_id=? ");
            pst.setInt(1, userId);
            rs = pst.executeQuery();
            while (rs.next()) {
                CartProduct cartProduct = new CartProduct();
                cartProduct.setCartId(rs.getInt("c.id"));
                cartProduct.setQuantity(rs.getInt("c.quantity"));
                cartProduct.setName(rs.getString("p.name"));
                cartProduct.setPrice(rs.getInt("p.price"));
                cartProduct.setPhoto(rs.getString("p.photo"));
                cartProduct.setDiscriptin(rs.getString("p.descriptin"));
                cartProduct.setProductId(rs.getInt("p.id"));
                cartProduct.setQuantity_product(rs.getInt("p.quantity"));

                carts.add(cartProduct);
            }
            closeConnection();
            return carts;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    private Cart getCart(int cartID) {
        Cart qu = null;
        try {

            con = openConnection();
            PreparedStatement pst = con.prepareStatement("SELECT * from cart where id=?");
            pst.setInt(1, cartID);

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                qu = new Cart();
                qu.setQuantity(rs.getInt("quantity"));
                qu.setCartId(rs.getInt("id"));
                qu.setProductId(rs.getInt("product_id"));
                qu.setUserId(rs.getInt("user_id"));
            }
            closeConnection();
        } catch (SQLException ex) {
            closeConnection();
            ex.printStackTrace();
        }

        return qu;

    }

    public boolean reduceQuantity(int cartID) {
        Cart cart = getCart(cartID);
        if (cart != null) {
            int quantity = cart.getQuantity();
            if (quantity < 2) {
               return deleteCart(cartID);
            } else {

                con = openConnection();
                PreparedStatement pst = null;
                try {
                    //System.out.println("my con" + con);
                    pst = con.prepareStatement("update cart set quantity=? where id=? ");
                   pst.setInt(1,cart.getQuantity()-1);
                    pst.setInt(2, cartID);
                    int executeUpdate = pst.executeUpdate();
                    closeConnection();
                    if (executeUpdate > 0) {
                        return true;
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }

        return false;

    }
    
    public boolean increaseQuantity(int cartID) {
        Cart cart = getCart(cartID);
        if (cart != null) {
            int quantity = cart.getQuantity();

                con = openConnection();
                PreparedStatement pst = null;
                try {
                    //System.out.println("my con" + con);
                    pst = con.prepareStatement("update cart set quantity=? where id=? ");
                   pst.setInt(1,cart.getQuantity()+1);
                    pst.setInt(2, cartID);
                    int executeUpdate = pst.executeUpdate();
                    closeConnection();
                    if (executeUpdate > 0) {
                        return true;
                    }
                } catch (SQLException ex) {
                     closeConnection();
                    ex.printStackTrace();
                }
            }
        

        return false;

    }

}



