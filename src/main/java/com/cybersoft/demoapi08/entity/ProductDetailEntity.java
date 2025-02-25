package com.cybersoft.demoapi08.entity;

import java.util.List;

public class ProductDetailEntity {
   private int product_id;
   private int category_id;
  private String  product_name	;

    public ProductDetailEntity(int product_id, int category_id, String product_name, double rate, int warranty, List<PriceEntity> price, List<PromotionEntity> promotionList, List<CityEntity> cityList, List<ShowroomEntity> showroomList) {
        this.product_id = product_id;
        this.category_id = category_id;
        this.product_name = product_name;
        this.rate = rate;
        this.warranty = warranty;
        this.price = price;
        this.promotionList = promotionList;
        this.cityList = cityList;
        this.showroomList = showroomList;
    }

    private double  rate	;
   private int warranty;
    private List<PriceEntity> price;
    private List<PromotionEntity> promotionList;
    private List<CityEntity> cityList;
    private List<ShowroomEntity> showroomList;

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    public List<PriceEntity> getPrice() {
        return price;
    }

    public void setPrice(List<PriceEntity> price) {
        this.price = price;
    }

    public List<PromotionEntity> getPromotionList() {
        return promotionList;
    }

    public void setPromotionList(List<PromotionEntity> promotionList) {
        this.promotionList = promotionList;
    }

    public List<CityEntity> getCityList() {
        return cityList;
    }

    public void setCityList(List<CityEntity> cityList) {
        this.cityList = cityList;
    }

    public List<ShowroomEntity> getShowroomList() {
        return showroomList;
    }

    public void setShowroomList(List<ShowroomEntity> showroomList) {
        this.showroomList = showroomList;
    }
}
