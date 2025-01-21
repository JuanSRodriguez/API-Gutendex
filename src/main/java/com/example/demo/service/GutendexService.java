package com.example.demo.service;

import com.example.demo.dto.BookResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GutendexService {

    private final String API_URL = "https://gutendex.com/books";
    private final RestTemplate restTemplate;

    public GutendexService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public BookResponse searchBooks(String query) {
        String url = API_URL + "?search=" + query;
        ResponseEntity<BookResponse> response = restTemplate.getForEntity(url, BookResponse.class);
        return response.getBody();
    }
}