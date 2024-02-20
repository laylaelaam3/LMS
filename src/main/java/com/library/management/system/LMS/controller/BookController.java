package com.library.management.system.LMS.controller;


import com.library.management.system.LMS.dto.AuthorResponseDto;
import com.library.management.system.LMS.dto.BookRequestDto;
import com.library.management.system.LMS.dto.BookResponseDto;
import com.library.management.system.LMS.entities.Book;
import com.library.management.system.LMS.mapper.BookMapper;
import com.library.management.system.LMS.services.BookService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;
    @GetMapping("/{id}")
    public ResponseEntity<BookResponseDto> getBookById(@PathVariable Long id) throws Exception {
        return ResponseEntity.ok(bookService.getBookById(id));
    }
    @GetMapping("/")
    public ResponseEntity<List<BookResponseDto>> getAllBooks() {
        return ResponseEntity.ok(bookService.getAllBooks());
    }
    @PostMapping("//")
    public ResponseEntity<BookResponseDto> addBook(@RequestBody BookRequestDto bookRequestDto){
        return ResponseEntity.ok(bookService.addBook(bookRequestDto));
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) throws Exception {
        bookService.deleteBook(id);
    }



    }






