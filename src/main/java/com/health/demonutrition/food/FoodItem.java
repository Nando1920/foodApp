package com.health.demonutrition.food;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name = "Foods")
public class FoodItem {
    @Id
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @SequenceGenerator(
            name = "itemSequence",
            sequenceName = "itemSequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "itemSequence")
   private int id;
    private String name;
    private int quantity;

    private String measurement;
    private int calories;
    private double protein;
    private double fat;
    private double carbs;

    public FoodItem() {
    }

    public FoodItem(int id, String name, int quantity, String measurement, int calories, double protein, double fat, double carbs) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.measurement = measurement;
        this.calories = calories;
        this.protein = protein;
        this.fat = fat;
        this.carbs = carbs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getMeasurement() {
        return measurement;
    }

    public void setMeasurement(String measurement) {
        this.measurement = measurement;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getCarbs() {
        return carbs;
    }

    public void setCarbs(double carbs) {
        this.carbs = carbs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
