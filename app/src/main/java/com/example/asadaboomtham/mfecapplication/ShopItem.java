package com.example.asadaboomtham.mfecapplication;

import org.w3c.dom.Text;

/**
 * Created by asada boomtham on 13/6/2560.
 */

public class ShopItem {
    private String name;
    private String price;
    private int img;





    public ShopItem(String name, String price, int img){
        this.name = name;
        this.price = price;
        this.img = img;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
