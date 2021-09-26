package com.example.Realjdbc4.demojdbc4.Models;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String name;
    private String authorName;
    private int cost;

    public Book(String name, String authorName, int cost, int bookCategory) {//book category already exist.but we want to set book category  to particular category id.
        this.name = name;
        this.authorName = authorName;
        this.cost = cost;
        this.bookCategory=new BookCategory();//
        this.bookCategory.setId(bookCategory);//
    }

    public void setBookCategory(BookCategory bookCategory) {
        this.bookCategory = bookCategory;
    }

    public BookCategory getBookCategory() {
        return bookCategory;
    }

    //MANY= bOOK
    //ONE=BOOKCATEGORY
    @ManyToOne
    @JoinColumn
    private BookCategory bookCategory;
    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", authorName='" + authorName + '\'' +
                ", cost=" + cost +
                '}';
    }

    public Book( String name, String authorName, int cost) {

        this.name = name;
        this.authorName = authorName;
        this.cost = cost;
    }

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

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
