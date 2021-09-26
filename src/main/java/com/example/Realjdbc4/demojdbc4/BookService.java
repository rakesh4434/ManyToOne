package com.example.Realjdbc4.demojdbc4;

import com.example.Realjdbc4.demojdbc4.Models.Book;
import com.example.Realjdbc4.demojdbc4.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public void saveBooks(Book book){
         bookRepository.save(book);
    }
}
