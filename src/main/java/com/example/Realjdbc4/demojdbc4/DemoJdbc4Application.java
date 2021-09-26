package com.example.Realjdbc4.demojdbc4;

import com.example.Realjdbc4.demojdbc4.Models.Book;
import com.example.Realjdbc4.demojdbc4.Models.BookCategory;
import com.example.Realjdbc4.demojdbc4.repository.BookCategoryRepository;
import com.example.Realjdbc4.demojdbc4.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class DemoJdbc4Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoJdbc4Application.class, args);
	}

    @Autowired
	BookRepository bookRepository;

	@Autowired
	BookCategoryRepository bookCategoryRepository;

	@Override
	public void run(String... args) throws Exception {
          /* List<Book>  books=new ArrayList<>();
		  Book b1=new Book(2,"ghh","uuyuy",677);
		Book b2=new Book(3,"ghhhh","uuyjjhuy",677);
		books.add(b1);
		books.add(b2);
		   bookRepository.saveAll(books);*/

		Set<Book> books=new HashSet<>();
		Set<Book> book1=new HashSet<>();
		 //Book b1= new Book("python","BOB",200);
		Book b1= new Book("MATHS","BOB",200,4);
		//Book b2= new Book("HTML","heo",90,2);
		Book b2= new Book("HTII","heo",90,5);
         book1.add(b1);
		books.add(b1);
		books.add(b2);

		//bookRepository.save(b2);
		bookCategoryRepository.save(new BookCategory("non-programming",book1));
		//bookCategoryRepository.save(new BookCategory("programming",books));
	/*	System.out.println(bookRepository.findByCost(677));
		System.out.println(bookRepository.findById(1));
		System.out.println(bookRepository.findByAuthorName("ear"));
		System.out.println(bookRepository.findByAuthor("ear"));
		System.out.println(bookRepository.findByAuthors("uuyuy"));*/
	}
}
