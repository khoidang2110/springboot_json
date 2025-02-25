package com.cybersoft.demoapi08.entity;

import java.util.List;

public class ProductEntity {
    private Long productId;
    private String name;
    private Integer price;

    public ProductEntity(Long productId, String name, Integer price, Integer oldPrice, String pricePercent, Double rate, List<String> imgUrl, int categoryId) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.oldPrice = oldPrice;
        this.pricePercent = pricePercent;
        this.rate = rate;
        this.imgUrl = imgUrl;
        this.categoryId = categoryId;
    }

    private Integer oldPrice;
    private String pricePercent;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(Integer oldPrice) {
        this.oldPrice = oldPrice;
    }

    public String getPricePercent() {
        return pricePercent;
    }

    public void setPricePercent(String pricePercent) {
        this.pricePercent = pricePercent;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public List<String> getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(List<String> imgUrl) {
        this.imgUrl = imgUrl;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    private Double rate;
    private List<String> imgUrl;
    private int categoryId;

}
