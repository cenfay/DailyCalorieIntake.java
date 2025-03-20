package com.example.task_job.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;



@Entity
@Getter
@Setter
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToMany
    private List<Food> foodes;

    private String date;
}



