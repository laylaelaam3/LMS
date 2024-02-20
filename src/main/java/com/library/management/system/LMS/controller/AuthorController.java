package com.library.management.system.LMS.controller;

import com.library.management.system.LMS.dto.AuthorRequestDto;
import com.library.management.system.LMS.dto.AuthorResponseDto;
import com.library.management.system.LMS.services.AuthorService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/authors")
public class AuthorController {
    private final AuthorService authorService;

    @GetMapping("/{id}")
    public ResponseEntity<AuthorResponseDto> getBookById(@PathVariable long id) throws Exception {
        return ResponseEntity.ok(authorService.getAuthorById(id));
    }
    @GetMapping("/")
    public ResponseEntity<List<AuthorResponseDto>> getAllBooks(){
        return ResponseEntity.ok(authorService.getAllAuthors());

    }
    @PostMapping(" ")
    public ResponseEntity<AuthorResponseDto> addAuthor(@RequestBody AuthorRequestDto authorRequestDto){
        return ResponseEntity.ok(authorService.addAuthor(authorRequestDto));
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id)  {
        try {
            authorService.delete(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @PutMapping (" ")
    public ResponseEntity<AuthorResponseDto> updateAuthor(@RequestBody AuthorRequestDto authorRequestDto) throws Exception {
        return ResponseEntity.ok(authorService.updateAuthor(1L,authorRequestDto));
    }

}


