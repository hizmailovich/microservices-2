package com.solvd.bookservice.web.dto.mapper;

import com.solvd.bookservice.domain.Book;
import com.solvd.bookservice.web.dto.BookDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BookMapper {

    Book toEntity(BookDto authorDto);

    BookDto toDto(Book author);

    List<BookDto> toDto(List<Book> author);

}
