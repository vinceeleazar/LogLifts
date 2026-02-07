package com.loglifts.LogLifts.repository;

import com.loglifts.LogLifts.entity.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExerciseRepository extends JpaRepository<Exercise, Long> {
    List<Exercise> findByMuscleGroup(String muscle);

    List<Exercise> findByNameContainingIgnoreCase(String name);
}
