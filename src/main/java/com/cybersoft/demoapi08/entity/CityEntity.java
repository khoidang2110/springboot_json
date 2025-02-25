package com.cybersoft.demoapi08.entity;

public class CityEntity {
    public int getCity_id() {
        return city_id;
    }

    public CityEntity(int city_id, String city_name) {
        this.city_id = city_id;
        this.city_name = city_name;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    private int city_id;
    private String city_name;
}
