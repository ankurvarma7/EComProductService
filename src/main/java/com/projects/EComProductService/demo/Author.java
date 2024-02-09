package com.projects.EComProductService.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String name;
    private String email;
    @OneToMany(mappedBy = "author",cascade = CascadeType.REMOVE,fetch = FetchType.EAGER)
    private List<Book> books;
}
