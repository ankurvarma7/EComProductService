package com.projects.EComProductService.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @Enumerated(EnumType.ORDINAL)
    private BookType bookType;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;
}
