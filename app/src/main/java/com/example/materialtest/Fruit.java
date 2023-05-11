package com.example.materialtest;

// 水果类，还是挺不错的
public class Fruit {
    private String name;
    private int imageId;
    public Fruit(String name,int imageId) {
        this.name=name;
        this.imageId=imageId;
    }
    public String getName() {
        return name;
    }
    public int getImageId() {
        return imageId;
    }
}
