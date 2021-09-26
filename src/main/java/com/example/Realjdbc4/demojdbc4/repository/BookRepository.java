package com.example.Realjdbc4.demojdbc4.repository;

import com.example.Realjdbc4.demojdbc4.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface BookRepository extends JpaRepository<Book, Integer> {
  public  List<Book> findByAuthorName(String name);

  public List<Book> findByCost(int cost);

    public List<Book> findById(int id);

    @Query(value="select * from Book b where b.author_name=:name",nativeQuery = true)
  public  List<Book> findByAuthor(String name);

  @Query(value="select b from Book b where b.authorName=:name")
  public  List<Book> findByAuthors(String name);
}
