package com.library.management.system.LMS.services;

import com.library.management.system.LMS.dto.BookRequestDto;
import com.library.management.system.LMS.dto.BookResponseDto;
import com.library.management.system.LMS.mapper.BookMapper;
import com.library.management.system.LMS.repositories.BookRepository;
import com.library.management.system.LMS.entities.Book;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class BookServiceImpl implements BookService{
    private final BookRepository bookRepository;

    @Override
    public BookResponseDto addBook(BookRequestDto bookRequestDto) {
        var book = BookMapper.mapToEntity(bookRequestDto);
        return BookMapper.mapToDto(bookRepository.save(book));
    }

    @Override
    public List<BookResponseDto> getAllBooks() {
        return bookRepository
                .findAll()
                .stream()
                .map(BookMapper::mapToDto)
                .collect(Collectors.toList());
    }

    @Override
    public BookResponseDto getBookById(Long id) throws Exception {
        Book book=bookRepository.findById(id).orElseThrow(()-> new NoSuchElementException("book not found"));
        return BookMapper.mapToDto(book);
    }

    @Override
    public void deleteBook(Long id) throws Exception {
        var book = bookRepository.findById(id).orElseThrow(() -> new Exception("book not found"));
        bookRepository.delete(book);

    }
}
