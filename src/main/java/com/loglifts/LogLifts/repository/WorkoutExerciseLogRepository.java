package com.loglifts.LogLifts.repository;

import com.loglifts.LogLifts.entity.WorkoutExerciseLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkoutExerciseLogRepository extends JpaRepository<WorkoutExerciseLog, Long> {
}
