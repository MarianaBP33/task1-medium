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

import com.mariana.task2medium.model.Author;
import com.mariana.task2medium.model.Book;
import com.mariana.task2medium.model.Genre;
import com.mariana.task2medium.repository.BookRepository;

@RunWith(MockitoJUnitRunner.class)
public class BookServiceUnitTest {

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookService bookService;

    private Book book;

    @Before
    public void setUp() {
        Author author = new Author();
        author.setId(1L);
        author.setName("John Doe");

        Genre genre = new Genre();
        genre.setId(1L);
        genre.setName("Fiction");

        book = new Book();
        book.setId(1L);
        book.setTitle("Sample Book");
        book.setAuthor(author);
        book.setGenre(genre);
    }

    @Test
    public void testGetAllBooks() {
        List<Book> books = Arrays.asList(book);
        when(bookRepository.findAll()).thenReturn(books);

        List<Book> result = bookService.getAllBooks();

        assertEquals(1, result.size());
        assertEquals("Sample Book", result.get(0).getTitle());
    }

    @Test
    public void testGetBookById() {
        when(bookRepository.findById(1L)).thenReturn(Optional.of(book));

        Optional<Book> result = bookService.getBookById(1L);

        assertEquals("Sample Book", result.get().getTitle());
    }

    @Test
    public void testSaveBook() {
        when(bookRepository.save(book)).thenReturn(book);

        Book savedBook = bookService.saveBook(book);

        assertEquals("Sample Book", savedBook.getTitle());
    }

    @Test
    public void testDeleteBook() {
        bookService.deleteBook(1L);

        verify(bookRepository, times(1)).deleteById(1L);
    }
}
