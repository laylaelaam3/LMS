package com.library.management.system.LMS.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class BookRequestDto {
    private Long id;
    private String title;
    private String ISBN;
    private String publicationDate;
    private long authorId;


}

