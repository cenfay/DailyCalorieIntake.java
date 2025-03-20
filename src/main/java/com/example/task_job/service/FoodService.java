package com.example.task_job.service;

import com.example.task_job.model.Food;
import com.example.task_job.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class FoodService {

    @Autowired
    private FoodRepository foodRepository;

    public Food createFood(Food food) {

        return foodRepository.save(food);
    }

    public List<Food> getAllFoodes() {

        return foodRepository.findAll();
    }
}


