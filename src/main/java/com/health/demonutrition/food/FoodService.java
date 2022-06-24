package com.health.demonutrition.food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class FoodService {

    private final FoodRepository foodRepository;

    @Autowired
    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public List<FoodItem> get_food(){
       return foodRepository.findAll();
    }

    public void addFoodItem(@RequestBody FoodItem foodItem){
        Optional<FoodItem> foodByName = foodRepository.findFoodItemByName(foodItem.getName());
        if(foodByName.isPresent()){
            throw new IllegalStateException("Food Item already in the DB ");
        }
        foodRepository.save(foodItem);
    }


    public void deleteFoodItem(String name) {
        Optional<FoodItem> foodByName = foodRepository.findFoodItemByName(name);
        if(!foodByName.isPresent()){
            throw new IllegalStateException("Food Item already in the DB ");
        }
        foodRepository.deleteById(name);
    }
}
