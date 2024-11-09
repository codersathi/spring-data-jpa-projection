package com.codersathi.springdatajpaprojection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {

    List<BookProjection> findByGenre(@Param("genre") String genre);
}
