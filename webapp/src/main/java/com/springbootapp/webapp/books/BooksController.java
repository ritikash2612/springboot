package com.springbootapp.webapp.books;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

import java.util.List;

@RestController
public class BooksController {
  @GetMapping("/books")
  public List<Books> getBooks(){
    return Arrays.asList(new Books(1,"ABC drives 3.1.3"));
  }
}
