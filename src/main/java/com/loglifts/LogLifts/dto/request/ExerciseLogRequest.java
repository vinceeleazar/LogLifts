package com.loglifts.LogLifts.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public class ExerciseLogRequest {
    @NotNull(message = "Exercise ID is required")
    private Long exerciseId;

    @NotNull(message = "Sets is required")
    @Min(value = 1, message = "Sets must be at least 1")
    private Integer sets;

    @NotNull(message = "Reps is required")
    @Min(value = 1, message = "Reps must be at least 1")
    private Integer reps;

    private BigDecimal weightLbs;

    private Integer orderIndex;

    private String notes;
}
