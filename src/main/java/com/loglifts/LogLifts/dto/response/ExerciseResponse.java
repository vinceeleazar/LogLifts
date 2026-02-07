package com.loglifts.LogLifts.dto.response;

import com.loglifts.LogLifts.entity.ExerciseCategory;
import com.loglifts.LogLifts.entity.MuscleGroup;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ExerciseResponse {
    private Long id;
    private String name;
    private String description;
    private ExerciseCategory category;
    private MuscleGroup muscleGroup;
}
