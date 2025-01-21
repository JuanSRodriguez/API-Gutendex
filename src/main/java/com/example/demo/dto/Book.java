package com.example.demo.dto;

import lombok.Data;

 import java.util.List;
 import java.util.Map;

 @Data
 public class Book {
     private Long id;
     private String title;
     private List<String> subjects;
     private List<Person> authors;
     private List<Person> translators;
     private List<String> bookshelves;
     private List<String> languages;
     private Boolean copyright;
     private String media_type;
     private Map<String,String> formats;
     private Integer download_count;
 }