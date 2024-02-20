package com.library.management.system.LMS.dto;

import lombok.Data;

@Data
public class BookResponseDto {
    private Long id;
    private String title;
    private String ISBN;
    private String publicationDate;
    private String authorName;
    private String authorBiography;
    private long authorId;
}
