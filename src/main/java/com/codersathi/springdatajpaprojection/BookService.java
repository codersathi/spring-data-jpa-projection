package com.codersathi.springdatajpaprojection;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<BookProjection> getBooksByGenre(String genre) {
        return bookRepository.findByGenre(genre);
    }
}
