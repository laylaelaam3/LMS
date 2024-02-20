package com.library.management.system.LMS.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long Id;
    private String name;
    private String biography;
    @OneToMany(mappedBy = "author")
       private List<Book>books;
    }


