package com.cybersoft.demoapi08.entity;

public class ShowroomEntity {
    private int showroom_id;
    private int city_id;
    private String showroom_name;

    public ShowroomEntity(int showroom_id, int city_id, String showroom_name) {
        this.showroom_id = showroom_id;
        this.city_id = city_id;
        this.showroom_name = showroom_name;
    }

    public int getShowroom_id() {
        return showroom_id;
    }

    public void setShowroom_id(int showroom_id) {
        this.showroom_id = showroom_id;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getShowroom_name() {
        return showroom_name;
    }

    public void setShowroom_name(String showroom_name) {
        this.showroom_name = showroom_name;
    }
}
