package com.solvd.authorservice.web.dto.mapper;

import com.solvd.authorservice.domain.Author;
import com.solvd.authorservice.web.dto.AuthorDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AuthorMapper {

    Author toEntity(AuthorDto authorDto);

    AuthorDto toDto(Author author);

    List<AuthorDto> toDto(List<Author> author);

}
