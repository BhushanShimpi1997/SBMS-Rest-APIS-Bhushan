package com.springdatarest.repository;

import com.springdatarest.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "books")
public interface BookRepository extends JpaRepository<Book,Integer> {
}
