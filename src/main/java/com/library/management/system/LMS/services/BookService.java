package com.library.management.system.LMS.services;

import com.library.management.system.LMS.dto.BookRequestDto;
import com.library.management.system.LMS.dto.BookResponseDto;
import com.library.management.system.LMS.entities.Book;

import java.util.List;

public interface BookService {
    BookResponseDto addBook(BookRequestDto bookRequestDto);
    List<BookResponseDto>getAllBooks();
    BookResponseDto getBookById(Long id) throws Exception;
    void deleteBook(Long id) throws Exception;


}
