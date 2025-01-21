package com.example.demo.controller;

import com.example.demo.dto.BookResponse;
import com.example.demo.identity.Book;
import com.example.demo.repository.BookRepository;
import com.example.demo.service.GutendexService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final GutendexService gutendexService;
    private final BookRepository bookRepository;

    public BookController(GutendexService gutendexService, BookRepository bookRepository) {
        this.gutendexService = gutendexService;
        this.bookRepository = bookRepository;
    }

    @GetMapping("/search")
    public BookResponse searchBooks(@RequestParam String query) {
        return gutendexService.searchBooks(query);
    }

    @PostMapping("/save")
    public Book saveBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }
}