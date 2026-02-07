package com.loglifts.LogLifts.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Table(name = "exercises")
@NoArgsConstructor
@AllArgsConstructor
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(length = 50)
    private ExerciseCategory category;

    @Enumerated(EnumType.STRING)
    @Column(name = "muscle_group", length = 50)
    private MuscleGroup muscleGroup;

    @OneToMany(mappedBy = "exercise")
    private List<WorkoutExerciseLog> workoutExerciseLogs = new ArrayList<>();

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;


}