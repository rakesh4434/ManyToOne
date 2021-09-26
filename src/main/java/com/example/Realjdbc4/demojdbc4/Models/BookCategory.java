package com.example.Realjdbc4.demojdbc4.Models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class BookCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    //one=bookcategory
    //many=book
    @OneToMany(mappedBy = "bookCategory",cascade =CascadeType.ALL)
    private Set<Book> books;

    public BookCategory(String name, Set<Book> books) {
        this.name = name;
        this.books = books;
        this.books.forEach(x->x.setBookCategory(this));
    }

    public BookCategory(int id, String name, Set<Book> books) {
        this.id = id;
        this.name = name;
        this.books = books;
    }

    public BookCategory(String name) {
        this.name = name;
    }

    public BookCategory() {
    }
}
