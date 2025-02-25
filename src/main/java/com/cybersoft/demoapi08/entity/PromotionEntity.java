package com.cybersoft.demoapi08.entity;

public class PromotionEntity {
  private int promotion_id;
    private  String  promotion_content;

    public int getPromotion_id() {
        return promotion_id;
    }

    public PromotionEntity(int promotion_id, String promotion_content) {
        this.promotion_id = promotion_id;
        this.promotion_content = promotion_content;
    }

    public void setPromotion_id(int promotion_id) {
        this.promotion_id = promotion_id;
    }

    public String getPromotion_content() {
        return promotion_content;
    }

    public void setPromotion_content(String promotion_content) {
        this.promotion_content = promotion_content;
    }
}
