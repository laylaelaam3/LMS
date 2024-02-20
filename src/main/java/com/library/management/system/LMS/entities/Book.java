package com.library.management.system.LMS.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String ISBN;
    private String publicationDate;
    @ManyToOne
    @JoinColumn(name = "authorId")
    private Author author;



}
