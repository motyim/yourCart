package org.yourcart.beans;

/**
 *
 * @author sara metwalli
 */
public class CartProduct {
     private int cartId;
    private int userId;
    private int quantity;
     private String name;
    private double price;
    private String model;
    private String date;
    private String photo;
    private String discriptin;
    private int quantity_product;
     private int productId;
    private int category;

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDiscriptin() {
        return discriptin;
    }

    public void setDiscriptin(String discriptin) {
        this.discriptin = discriptin;
    }

    public int getQuantity_product() {
        return quantity_product;
    }

    public void setQuantity_product(int quantity_product) {
        this.quantity_product = quantity_product;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }
  //  CartProduct cartProduct=new CartProduct(cartId,rs.getInt("c.quantity"),rs.getString("p.name"),rs.getInt("p.price"),rs.getString("p.photo"),rs.getString("p.discriptin"),rs.getInt(",p.productId"));

    public CartProduct(int cartId, int quantity, String name, double price, String photo, String discriptin, int productId) {
        this.cartId = cartId;
        this.quantity = quantity;
        this.name = name;
        this.price = price;
        this.photo = photo;
        this.discriptin = discriptin;
        this.productId = productId;
    }

    public CartProduct(){
        
    }
  
   
}