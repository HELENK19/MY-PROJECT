package com.team19.animation.models;

public class FoodBean {
    private String description;
    private int price;
    private int imageDrawable;
    private String name;

    public FoodBean(){
    }

    public FoodBean(int imageDrawable, String name,String description,int price){
        this.imageDrawable = imageDrawable;
        this.name=name;
        this.description = description;
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setImageDrawable(int imageDrawable) {
        this.imageDrawable = imageDrawable;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public int getImageDrawable() {
        return imageDrawable;
    }

    public String getName() {
        return name;
    }
}

