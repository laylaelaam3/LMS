package com.library.management.system.LMS.services;

import com.library.management.system.LMS.dto.AuthorRequestDto;
import com.library.management.system.LMS.dto.AuthorResponseDto;
import com.library.management.system.LMS.entities.Author;
import com.library.management.system.LMS.mapper.AuthorMapper;
import com.library.management.system.LMS.repositories.AuthorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;

    @Override
    public AuthorResponseDto addAuthor(AuthorRequestDto authorRequestDto) {
        var author = AuthorMapper.mapToEntity(authorRequestDto);
        return AuthorMapper.mapToDto(authorRepository.save(author));

    }

    @Override
    public List<AuthorResponseDto> getAllAuthors() {
        return authorRepository.findAll().stream().map(AuthorMapper::mapToDto).collect(Collectors.toList());
    }

    @Override
    public AuthorResponseDto getAuthorById(Long id) throws Exception {
        var author = authorRepository.findById(id).orElseThrow(() -> new Exception("author not found"));
        return AuthorMapper.mapToDto(author);
    }

    @Override
    public void delete(Long id) throws Exception {
        var author = authorRepository.findById(id).orElseThrow(() -> new Exception("author not found"));
        authorRepository.delete(author);

    }

    @Override
    public AuthorResponseDto updateAuthor(Long id, AuthorRequestDto authorRequestDto) throws Exception {
            var author = authorRepository.findById(id).orElseThrow(() -> new Exception("author not found"));
            author.setName(authorRequestDto.getName());
            author.setBiography(author.getBiography());
            author.setId(author.getId());
            return AuthorMapper.mapToDto(authorRepository.save(author));
    }
}
