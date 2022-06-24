package com.health.demonutrition.food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class FoodController {

    private final FoodService foodService;

    @Autowired
    public FoodController(FoodService FoodService) {
        this.foodService = FoodService;
    }

    @GetMapping
    public List<FoodItem> get_food(){
        return foodService.get_food();
    }

    @PostMapping
    public void addFoodItem(@RequestBody FoodItem foodItem){
        foodService.addFoodItem(foodItem);
    }

    @DeleteMapping
    public void deleteFoodItem(String foodItem){
        foodService.deleteFoodItem(foodItem);
    }

}
