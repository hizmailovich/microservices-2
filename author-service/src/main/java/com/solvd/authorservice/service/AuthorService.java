package com.solvd.authorservice.service;

import com.solvd.authorservice.domain.Author;

import java.util.List;

public interface AuthorService {

    List<Author> retrieveAll();

    Author create(Author author);

    Boolean isExists(Long authorId);

}
