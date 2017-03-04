package org.yourcart.beans;

/**
 *
 * @author OsamaPC
 */
public class Product {
    
    private String name;
    private double price;
    private String model;
    private String date;
    private String photo;
    private String discriptin;
    private int quantity;
    private int productId;
    private int category;

    public Product() {
    }
    
    
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    

 




    public Product(String name, double price, String model, String date, String photo, String discriptin, int quantity, int productId, int category_id) {
        this.name = name;
        this.price = price;
        this.model = model;
        this.date = date;
        this.photo = photo;
        this.discriptin = discriptin;
        this.quantity = quantity;
        this.productId = productId;
        this.category = category_id;
    }

}
