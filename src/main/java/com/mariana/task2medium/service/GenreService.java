package com.mariana.task2medium.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mariana.task2medium.model.Genre;
import com.mariana.task2medium.repository.GenreRepository;

@Service
public class GenreService {
    private final GenreRepository genreRepository;

    public GenreService(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    // Add methods for CRUD operations and search
    // Create
    public Optional<Genre> getGenreById(Long id) {
        return genreRepository.findById(id);
    }

    public List<Genre> getAllGenres() {
        return genreRepository.findAll();
    }

    // Update
    public Genre updateGenre(Genre genre) {
        return genreRepository.save(genre);
    }

    // Delete
    public void deleteGenre(Long id) {
        genreRepository.deleteById(id);
    }

    // Search
    public List<Genre> searchGenres(String keyword) {
        return genreRepository.findByNameContainingIgnoreCase(keyword);
    }

}