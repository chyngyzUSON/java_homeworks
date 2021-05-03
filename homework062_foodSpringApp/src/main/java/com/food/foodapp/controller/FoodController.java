package com.food.foodapp.controller;

import com.food.foodapp.entity.Food;
import com.food.foodapp.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/food")
public class FoodController {
    @Autowired
    private FoodService foodService;

    @GetMapping
    public List<Food> getAll() {
        return foodService.getAll();
    }

    @GetMapping("/{foodId}")
    public Food getById(@PathVariable Long foodId) {
        return foodService.findById(foodId);
    }

    @PostMapping
    public Food create(@RequestBody Food food) {
        return foodService.create(food);
    }

    @DeleteMapping("/{foodId}")
    public Food deleteById(@PathVariable Long foodId){
        return foodService.deleteById(foodId);
    }
}
