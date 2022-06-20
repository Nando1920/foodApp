package com.health.demonutrition.food;

import org.springframework.stereotype.Component;

@Component
public class foodItem {
    private String name;
    private long itemId;
    private int grammes;
    private int calories;
    private double protein;
    private double fat;
    private double carbs;

    public foodItem() {
    }

    public foodItem(String name, int grammes, int calories, double protein, double fat, double carbs) {
        this.name = name;
        this.grammes = grammes;
        this.calories = calories;
        this.protein = protein;
        this.fat = fat;
        this.carbs = carbs;
    }

    public foodItem(String name, long itemId, int grammes, int calories, double protein, double fat, double carbs) {
        this.name = name;
        this.itemId = itemId;
        this.grammes = grammes;
        this.calories = calories;
        this.protein = protein;
        this.fat = fat;
        this.carbs = carbs;
    }

    public String getName() {
        return name;
    }

    public long getItemId() {
        return itemId;
    }

    public int getGrammes() {
        return grammes;
    }

    public int getCalories() {
        return calories;
    }

    public double getProtein() {
        return protein;
    }

    public double getFat() {
        return fat;
    }

    public double getCarbs() {
        return carbs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public void setGrammes(int grammes) {
        this.grammes = grammes;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public void setCarbs(double carbs) {
        this.carbs = carbs;
    }

    @Override
    public String toString() {
        return "foodItem{" +
                "name='" + name + '\'' +
                ", itemId=" + itemId +
                ", grammes=" + grammes +
                ", calories=" + calories +
                ", protein=" + protein +
                ", fat=" + fat +
                ", carbs=" + carbs +
                '}';
    }
}
