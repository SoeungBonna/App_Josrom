package com.example.app_josrom.models;

public class PopularModel {
    String name;
    String description;
    String ration;
    String discount;
    String type;
    String img_url;

    public PopularModel() {

    }
    public PopularModel(String name, String description, String ration, String discount, String type, String img_url){
         this.name = name;
         this.description = description;
         this.ration = ration;
         this.discount = discount;
         this.type = type;
         this.img_url = img_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRation() {
        return ration;
    }

    public void setRation(String ration) {
        this.ration = ration;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }
}