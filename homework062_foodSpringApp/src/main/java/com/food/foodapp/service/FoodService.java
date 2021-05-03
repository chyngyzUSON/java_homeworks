package com.food.foodapp.service;

import com.food.foodapp.entity.Food;

import java.util.List;

public interface FoodService {
    Food create(Food food);

    List<Food>getAll();

    Food findById(Long id);

    Food deleteById(Long Id);
}
