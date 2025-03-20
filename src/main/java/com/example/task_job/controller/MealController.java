package com.example.task_job.controller;

import com.example.task_job.model.Meal;
import com.example.task_job.service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/meals")
public class MealController {

    @Autowired
    private MealService mealService;

    @PostMapping
    public Meal createMeal(@RequestParam Long userId, @RequestBody List<Long> foodIds, @RequestParam String date) {
        return mealService.createMeal(userId, foodIds, date);
    }

    @GetMapping("/report")
    public List<Meal> getMealsForDay(@RequestParam Long userId, @RequestParam String date) {
        return mealService.getMealsForDay(userId, date);
    }
}


