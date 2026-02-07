package com.loglifts.LogLifts.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class WorkoutRequest {
    @NotBlank(message = "Workout name is required")
    @Size(max = 100, message = "Workout name must not exceed 100 characters")
    private String name;

    @NotNull(message = "Workout date is required")
    private LocalDate workoutDate;

    private String notes;

    private Integer durationMinutes;

    private List<ExerciseLogRequest> exercises = new ArrayList<>();
}
