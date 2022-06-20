package com.health.demonutrition.food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FoodController {

    private final FoodService foodService;

    @Autowired
    private FoodRepository foodRepo;
    @Autowired
    public FoodController(FoodService FoodService) {
        this.foodService = FoodService;
    }

    @GetMapping(path = "/list")
    public List<FoodItem> get_food(){
        return foodService.get_food();
    }


}
