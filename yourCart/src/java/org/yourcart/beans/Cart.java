/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourcart.beans;

/**
 *
 * @author OsamaPC
 */
public class Cart {

    private int cartId;
    private int userId;
    private int productId;
    private int quantity;

    public Cart() {
    }
    
     public Cart(int cartId)
    {
        this.cartId = cartId;
    }

    public Cart(int cartId, int userId, int productId, int quantity) {
        this.cartId = cartId;
        this.userId = userId;
        this.productId = productId;
        this.quantity = quantity;
    }

    public int getCartId() {
        return cartId;
    }

    public int getUserId() {
        return userId;
    }

    public int getProductId() {
        return productId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
    
    
}
