package com.example.task_job.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;
import jakarta.validation.constraints.Min;

@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Email
    private String email;

    @Min(5)
    private int age;

    @Min(30)
    private double weight;

    @Min(50)
    private double height;

    @Enumerated(EnumType.STRING)
    private Goal goal;

    private double dailyCalorieIntake;

    public enum Goal {
        Похудение, Поддержание, Набор_массы
    }

    @PrePersist
    public void calculateDailyCalories() {
        double bmr = 88.362 + (13.397 * weight) + (4.799 * height) - (5.677 * age);
        switch (goal) {
            case Похудение:
                this.dailyCalorieIntake = bmr - 500;
                break;
            case Набор_массы:
                this.dailyCalorieIntake = bmr + 500;
                break;
            default:
                this.dailyCalorieIntake = bmr;
                break;
        }
    }
}



