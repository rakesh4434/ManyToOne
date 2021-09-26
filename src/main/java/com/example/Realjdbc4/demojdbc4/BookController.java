package com.example.Realjdbc4.demojdbc4;

import com.example.Realjdbc4.demojdbc4.Models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {


    @Autowired
     BookService bookService;

    @PostMapping("/create")
    public void saveBooks(@RequestBody Book book){
        bookService.saveBooks(book);
    }
}
