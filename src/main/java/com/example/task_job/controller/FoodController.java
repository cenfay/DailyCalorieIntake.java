package com.example.task_job.controller;

import com.example.task_job.model.Food;
import com.example.task_job.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/dishes")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @PostMapping
    public Food createFood(@RequestBody Food food) {
        return foodService.createFood(food);
    }

    @GetMapping
    public List<Food> getAllFoodes() {
        return foodService.getAllFoodes();
    }
}



