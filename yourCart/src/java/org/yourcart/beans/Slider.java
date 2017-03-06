package org.yourcart.beans;

/**
 *
 * @author Mostafa
 */
public class Slider {

    private int id;
    private String image;
    private String title;
    private String subTitle;
    private String description;
    private int productId;

    public Slider() {
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Slider(int id, String image, String title, String subTitle, String description, int productId) {
        this.id=id;
        this.image = image;
        this.title = title;
        this.subTitle = subTitle;
        this.description = description;
        this.productId = productId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
    

}
