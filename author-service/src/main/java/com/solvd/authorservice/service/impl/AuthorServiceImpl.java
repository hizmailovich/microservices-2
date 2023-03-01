package com.solvd.authorservice.service.impl;

import com.solvd.authorservice.domain.Author;
import com.solvd.authorservice.persistence.AuthorRepository;
import com.solvd.authorservice.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    @Override
    public List<Author> retrieveAll() {
        return authorRepository.findAll();
    }

    @Override
    public Author create(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public Boolean isExists(Long authorId) {
        return authorRepository.existsById(authorId);
    }

}
