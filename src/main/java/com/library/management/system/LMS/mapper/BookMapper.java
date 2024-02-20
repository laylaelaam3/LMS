package com.library.management.system.LMS.mapper;

import com.library.management.system.LMS.dto.BookRequestDto;
import com.library.management.system.LMS.dto.BookResponseDto;
import com.library.management.system.LMS.entities.Book;
import lombok.Data;
import org.modelmapper.ModelMapper;

public class BookMapper {
    private static final ModelMapper modelMapper = new ModelMapper();
    public static Book mapToEntity(BookRequestDto bookRequestDto){
        return modelMapper.map(bookRequestDto,Book.class);

        }
        public static BookResponseDto mapToDto(Book book){

        return modelMapper.map(book,BookResponseDto.class);
        }

    }






