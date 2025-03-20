package com.example.task_job.service;

import com.example.task_job.model.Food;
import com.example.task_job.model.Meal;
import com.example.task_job.model.User;
import com.example.task_job.repository.FoodRepository;
import com.example.task_job.repository.MealRepository;
import com.example.task_job.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MealService {

    @Autowired
    private MealRepository mealRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private FoodRepository foodRepository;

    public Meal createMeal(Long userId, List<Long> foodIds, String date) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        List<Food> foodes = foodRepository.findAllById(foodIds);

        Meal meal = new Meal();
        meal.setUser(user);
        meal.setFoodes(foodes);
        meal.setDate(date);

        return mealRepository.save(meal);
    }

    public List<Meal> getMealsForDay(Long userId, String date) {
        return mealRepository.findByUserIdAndDate(userId, date);
    }
}



