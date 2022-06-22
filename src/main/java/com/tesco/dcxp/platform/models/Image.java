package com.tesco.dcxp.platform.models;

public class Image extends Content {
    private String image;

    public Image(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
