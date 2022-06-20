package com.health.demonutrition.food;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name = "Foods")
public class FoodItem {
    @Id
    @SequenceGenerator(
            name = "itemSequence",
            sequenceName = "itemSequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "itemSequence")
    private String name;
    private long itemId;
    private String quantity;
    private int calories;
    private double protein;
    private double fat;
    private double carbs;

    public FoodItem() {
    }

    public FoodItem(String name, String quantity, int calories, double protein, double fat, double carbs) {
        this.name = name;
        this.quantity = quantity;
        this.calories = calories;
        this.protein = protein;
        this.fat = fat;
        this.carbs = carbs;
    }

    public FoodItem(String name, long itemId, String quantity, int calories, double protein, double fat, double carbs) {
        this.name = name;
        this.itemId = itemId;
        this.quantity = quantity;
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

    public String getQuantity() {
        return quantity;
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

    public void setQuantity(String quantity) {
        this.quantity = quantity;
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
                ", quantity=" + quantity +
                ", calories=" + calories +
                ", protein=" + protein +
                ", fat=" + fat +
                ", carbs=" + carbs +
                '}';
    }
}
