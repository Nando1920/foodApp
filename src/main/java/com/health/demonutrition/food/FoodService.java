package com.health.demonutrition.food;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {
    FoodItem food;
    public List<FoodItem> get_food(){
       return List.of(new FoodItem("peanut butter",
                1,
                "15g", 65,
                3.5,9.5,20.5));
    }




}
