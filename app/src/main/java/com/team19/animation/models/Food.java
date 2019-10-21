package com.team19.animation.models;

import java.net.URL;

public class Food {
    private String name;
    private String description;
    private int price;
    private String category;
    private int foodImage;

    public Food() {
    }

    public Food(String name, String description, int price, String category,int  foodImage) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.foodImage = foodImage;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public String getCategory(){
        return category;
    }



    public int getFoodImage() {
        return foodImage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public void setFoodImage(int foodImage) {
        this.foodImage = foodImage;
    }
}
