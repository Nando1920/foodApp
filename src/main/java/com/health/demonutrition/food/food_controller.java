package com.health.demonutrition.food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class food_controller {

    private final food_service foodService;

    @Autowired
    public food_controller(food_service food_service) {
        this.foodService = food_service;
    }

    @GetMapping(path = "/list")
    public List<foodItem> get_food(){
        return foodService.get_food();
    }


}
