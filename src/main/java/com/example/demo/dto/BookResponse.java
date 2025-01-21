package com.example.demo.dto;

import lombok.Data;
import java.util.List;
@Data
public class BookResponse {
    private int count;
    private String next;
    private String previous;
    private List<Book> results;
}