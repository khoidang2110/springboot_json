package com.cybersoft.demoapi08.entity;

import java.util.List;

public class PriceEntity {
    private int color_id;
    private String color_name;
    private int price;

    public PriceEntity(int color_id, String color_name, int price, int old_price, List<String> img_url) {
        this.color_id = color_id;
        this.color_name = color_name;
        this.price = price;
        this.old_price = old_price;
        this.img_url = img_url;
    }

    public int getColor_id() {
        return color_id;
    }

    public void setColor_id(int color_id) {
        this.color_id = color_id;
    }

    public String getColor_name() {
        return color_name;
    }

    public void setColor_name(String color_name) {
        this.color_name = color_name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getOld_price() {
        return old_price;
    }

    public void setOld_price(int old_price) {
        this.old_price = old_price;
    }

    public List<String> getImg_url() {
        return img_url;
    }

    public void setImg_url(List<String> img_url) {
        this.img_url = img_url;
    }

    private int old_price;
    private List<String> img_url;
}
