package com.health.demonutrition.food;

import org.springframework.data.jpa.repository.JpaRepository;

public abstract class FoodRepository implements JpaRepository<FoodItem, Integer> {

}
