package com.mariana.task2medium.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.mariana.task2medium.model.Genre;
import com.mariana.task2medium.repository.GenreRepository;

@RunWith(MockitoJUnitRunner.class)
public class GenreServiceUnitTest {

    @Mock
    private GenreRepository genreRepository;

    @InjectMocks
    private GenreService genreService;

    private Genre genre;

    @Before
    public void setUp() {
        genre = new Genre();
        genre.setId(1L);
        genre.setName("Fiction");
    }

    @Test
    public void testGetAllGenres() {
        List<Genre> genres = Arrays.asList(genre);
        when(genreRepository.findAll()).thenReturn(genres);

        List<Genre> result = genreService.getAllGenres();

        assertEquals(1, result.size());
        assertEquals("Fiction", result.get(0).getName());
    }

    @Test
    public void testGetGenreById() {
        when(genreRepository.findById(1L)).thenReturn(Optional.of(genre));

        Optional<Genre> result = genreService.getGenreById(1L);

        assertEquals("Fiction", result.get().getName());
    }

    @Test
    public void testSaveGenre() {
        when(genreRepository.save(genre)).thenReturn(genre);

        Genre savedGenre = genreRepository.save(genre);

        assertEquals("Fiction", savedGenre.getName());
    }

    @Test
    public void testDeleteGenre() {
        genreService.deleteGenre(1L);

        verify(genreRepository, times(1)).deleteById(1L);
    }
}
