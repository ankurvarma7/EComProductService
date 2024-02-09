package com.projects.EComProductService.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.id.factory.internal.UUIDGenerationTypeStrategy;

import java.util.UUID;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseModel {
    @Id
    @GeneratedValue(generator = "uuidGenerator")
    @GenericGenerator(name = "uuidGenerator",strategy = "uuid2")
    @Column(name = "id",nullable = false,updatable = false)
    private UUID uuid;
}
