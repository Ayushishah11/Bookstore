package com.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.entity.Book;
import com.bookstore.entity.User;
import com.bookstore.service.BookService;
import com.bookstore.service.UserService;
@RestController
public class BookController {
	
	@Autowired
	BookService bookService;


	@PostMapping("/addBook")
	public String addBook(@RequestBody Book book) {
		System.out.println("In add Book:" + book);
		return bookService.addBook(book);
	}
	
	@GetMapping("/getBook/{id}")
	public Book getBook(@PathVariable int id) {
		
		return bookService.getbook(id);
	}
	
	
	@PutMapping("/updateBook/{id}")
	public String updateBook(@PathVariable int id, @RequestBody Book newBook) {
		return bookService.updateBook(id, newBook);
	}
}
	



