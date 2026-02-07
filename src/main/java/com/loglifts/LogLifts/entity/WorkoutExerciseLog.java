package com.loglifts.LogLifts.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Getter
@Table(name = "workout_exercise_logs")
@NoArgsConstructor
@AllArgsConstructor
public class WorkoutExerciseLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workout_id", nullable = false)
    private Workout workout;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "exercise_id", nullable = false)
    private Exercise exercise;

    @Column(nullable = false)
    private Integer sets;

    @Column(nullable = false)
    private Integer reps;

    @Column(name = "weight_lbs", precision = 6, scale = 2)
    private BigDecimal weightLbs;

    @Column(name = "order_index")
    private Integer orderIndex = 0;

    @Column(columnDefinition = "TEXT")
    private String notes;
}