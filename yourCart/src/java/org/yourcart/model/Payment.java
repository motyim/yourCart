
package org.yourcart.model;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import org.yourcart.beans.CartProduct;
import org.yourcart.beans.History;
import org.yourcart.beans.Product;
import org.yourcart.beans.User;

/**
 * make payment transaction proccess
 * @author MotYim
 */
public class Payment extends DbConnection{

    public Payment() {
        
        try {
            openConnection(); //open conncetion on DB
            
            //disable auto commit
            con.setAutoCommit(false);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    
    public boolean startPayment(User user, ArrayList<CartProduct> sold){
        
        try {

            //update user balance
            new UserDbModel().updateUserBalance(user);
            
            //update amount of product on stock & insert into history 
            ProductModel productModel = new ProductModel();
            for (CartProduct itemSold : sold) {

                Product product = new Product();
                product.setProductId(itemSold.getProductId());
                product.setQuantity(itemSold.getQuantity_product() - itemSold.getQuantity());
                productModel.updateProductQauntity(product);
                
                //save proccess in history 
                History history = new History(); 
                history.setData(LocalDateTime.of(LocalDate.now(), LocalTime.now())+"");
                history.setProductId(itemSold.getProductId());
                history.setUserId(user.getUserId());
                history.setQuantity(itemSold.getQuantity());

                new UserHistory().addUserHistory(history);
            }

            //empty user cart 
            new CartModel().deleteUserCart(user.getUserId());
         
            //commit 
            con.commit();
            //return defualt value of Database

            return true ;
        } catch (SQLException ex) {
            System.out.println("----Error in Transaction ----");
            try {
                //rollback
                con.rollback();
                con.setAutoCommit(true);
            } catch (SQLException ex1) {
                ex1.printStackTrace();
            }
            ex.printStackTrace();
            return false;
        }
    }
    
    
    
    
}
