package com.food.foodapp.service;

import com.food.foodapp.entity.Food;
import com.food.foodapp.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    private FoodRepository foodRepository;

    @Override
    public Food create(Food food) {
        return foodRepository.save(food);
    }

    @Override
    public List<Food> getAll() {
        return foodRepository.findAll();
    }

    @Override
    public Food findById(Long id) {
        return foodRepository.findById(id).orElse(null);
    }

    @Override
    public Food deleteById(Long id) {
        Food food = findById(id);
        if (food != null){
            foodRepository.delete(food);
            return food;
        }
        return null;
    }
}
