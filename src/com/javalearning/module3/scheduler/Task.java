package com.javalearning.module3.scheduler;

import java.time.LocalDateTime;

public record Task(String title, LocalDateTime dueDate, TaskStatus status) {
}
