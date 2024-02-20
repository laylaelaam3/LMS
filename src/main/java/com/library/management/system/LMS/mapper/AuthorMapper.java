package com.library.management.system.LMS.mapper;

import com.library.management.system.LMS.dto.AuthorRequestDto;
import com.library.management.system.LMS.dto.AuthorResponseDto;
import com.library.management.system.LMS.entities.Author;
import lombok.Data;
import org.modelmapper.ModelMapper;

public class AuthorMapper {
    private static final ModelMapper modelMapper = new ModelMapper();
public static Author mapToEntity(AuthorRequestDto authorRequestDto){
    return modelMapper.map(authorRequestDto, Author.class);
}
public static AuthorResponseDto mapToDto(Author author){

    return modelMapper.map(author, AuthorResponseDto.class);
}
}
