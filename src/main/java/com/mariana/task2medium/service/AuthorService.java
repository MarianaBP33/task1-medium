package com.mariana.task2medium.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mariana.task2medium.model.Author;
import com.mariana.task2medium.repository.AuthorRepository;

@Service
public class AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    // Add methods for CRUD operations and search
    public Author createAuthor(Author author) {
        return authorRepository.save(author);
    }

    public Author getAuthorById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

}
