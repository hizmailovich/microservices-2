package com.solvd.bookservice.service;

import com.solvd.bookservice.domain.Book;

import java.util.List;

public interface BookService {

    List<Book> retrieveAll();

    Book create(Book book);

}
