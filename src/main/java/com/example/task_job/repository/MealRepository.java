package com.example.task_job.repository;

import com.example.task_job.model.Meal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MealRepository extends JpaRepository<Meal, Long> {
    List<Meal> findByUserIdAndDate(Long userId, String date);
}

