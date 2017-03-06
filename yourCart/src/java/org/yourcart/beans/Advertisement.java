package org.yourcart.beans;

/**
 *
 * @author OsamaPC
 */
public class Advertisement {
    private int id;
    private String image;
    private String url ; 

    public Advertisement() {
    }

    public int getId() {
        return id;
    }

    public String getImage() {
        return image;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    
}
