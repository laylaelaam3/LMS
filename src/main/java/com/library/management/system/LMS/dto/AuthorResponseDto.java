package com.library.management.system.LMS.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class AuthorResponseDto {
    private Long Id;
    private String name;
    private String biography;
}
