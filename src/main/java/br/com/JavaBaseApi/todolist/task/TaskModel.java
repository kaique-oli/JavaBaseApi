package br.com.JavaBaseApi.todolist.task;

import java.time.LocalDateTime;
import java.util.UUID;

public class TaskModel {
    private UUID id;
    private String description;
    private String title;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private String priority;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
    private boolean deleted = false;
}
