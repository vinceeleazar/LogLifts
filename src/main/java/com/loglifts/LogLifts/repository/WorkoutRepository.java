package com.loglifts.LogLifts.repository;

import com.loglifts.LogLifts.entity.Workout;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface WorkoutRepository extends JpaRepository<Workout, Long> {
    Page<Workout> findByUserId(Long userId, Pageable pageable);

    List<Workout> findByUserIdAndWorkoutDateBetween(Long userId, LocalDate startDate, LocalDate endDate);

    @Query("select w from Workout w where w.user.id = :userID and w.id = :workOutID")
    Optional<Workout> findByUserIdAndWorkoutID(Long userid, Long workoutID);
}
