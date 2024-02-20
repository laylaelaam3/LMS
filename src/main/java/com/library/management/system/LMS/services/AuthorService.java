package com.library.management.system.LMS.services;

import com.library.management.system.LMS.dto.AuthorRequestDto;
import com.library.management.system.LMS.dto.AuthorResponseDto;

import java.util.List;


public interface AuthorService {
    AuthorResponseDto addAuthor(AuthorRequestDto authorRequestDto);
    List<AuthorResponseDto> getAllAuthors();
    AuthorResponseDto getAuthorById(Long id) throws Exception;
    void delete(Long id) throws Exception;
    AuthorResponseDto updateAuthor(Long id,AuthorRequestDto authorRequestDto) throws Exception;




}
