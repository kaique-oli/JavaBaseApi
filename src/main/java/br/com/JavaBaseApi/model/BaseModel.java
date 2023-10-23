package br.com.JavaBaseApi.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;
@Data
@MappedSuperclass
public class BaseModel {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    @CreationTimestamp
    private LocalDateTime createdAt = null;
    private LocalDateTime updatedAt = null;
    private LocalDateTime deletedAt = null;
    private UUID deletingUser;
    private UUID updaterUser;
    private UUID createrUser;
    private boolean deleted = false;
}
