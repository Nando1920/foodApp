package com.health.demonutrition.food;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FoodRepository extends JpaRepository<FoodItem, String> {


    Optional<FoodItem> findFoodItemByName(String name);


}
