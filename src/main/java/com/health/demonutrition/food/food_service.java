package com.health.demonutrition.food;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class food_service {
    foodItem food;
    public List<foodItem> get_food(){
       return List.of(new foodItem("peanut butter",
                1,
                15, 65,
                3.5,9.5,20.5));
    }




}
