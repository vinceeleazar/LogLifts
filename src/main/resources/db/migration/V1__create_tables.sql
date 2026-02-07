CREATE TABLE users
(
    id         BIGINT AUTO_INCREMENT PRIMARY KEY,
    username   VARCHAR(50) UNIQUE  NOT NULL,
    email      VARCHAR(100) UNIQUE NOT NULL,
    password   VARCHAR(255)        NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE exercises
(
    id           BIGINT AUTO_INCREMENT PRIMARY KEY,
    name         VARCHAR(100) NOT NULL,
    description  TEXT,
    category     VARCHAR(50),
    muscle_group VARCHAR(50),
    created_at   TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE workouts
(
    id               BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_id          BIGINT       NOT NULL,
    name             VARCHAR(100) NOT NULL,
    workout_date     DATE         NOT NULL,
    notes            TEXT,
    duration_minutes INT,
    created_at       TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at       TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE
);


CREATE TABLE workout_exercise_logs
(
    id          BIGINT AUTO_INCREMENT PRIMARY KEY,
    workout_id  BIGINT NOT NULL,
    exercise_id BIGINT NOT NULL,
    sets        INT    NOT NULL,
    reps        INT    NOT NULL,
    weight_lbs  DECIMAL(6, 2),
    order_index INT DEFAULT 0,
    notes       TEXT,
    FOREIGN KEY (workout_id) REFERENCES workouts (id) ON DELETE CASCADE,
    FOREIGN KEY (exercise_id) REFERENCES exercises (id)
);

CREATE INDEX idx_workouts_user_id ON workouts (user_id);
CREATE INDEX idx_workouts_date ON workouts (workout_date);
CREATE INDEX idx_workout_exercise_logs_workout_id ON workout_exercise_logs (workout_id);
CREATE INDEX idx_workout_exercise_logs_exercise_id ON workout_exercise_logs (exercise_id);
