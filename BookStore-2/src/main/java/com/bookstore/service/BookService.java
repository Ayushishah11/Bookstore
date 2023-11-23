package com.bookstore.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.bookstore.service.MyBookListService;
import com.bookstore.entity.Book;
import com.bookstore.entity.MyBookList;
import com.bookstore.entity.User;
import com.bookstore.repository.BookRepository;
import com.bookstore.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    
    public String addBook(Book book) {
		Book s1= bookRepository.save(book);
		
		if(s1!=null)
			return "Book " + s1.getId()+ " successfully created";
		else
			return null;
	}

//    public Book getBook(int id) {
//    	
//    
//		Book b1 = bookRepository.findById(id).get();
//		return b1;
//    }
	@GetMapping("/getBook/{id}")
	public Book getbook(@PathVariable int id) {
	Book s= bookRepository.findById(id).get();
	return s;
	}
	
	public String updateBook(int id, Book newBook) {
		Book s1=bookRepository.findById(id).get();
		s1.setName(newBook.getName());
		s1 = bookRepository.save(s1);
		if(s1!=null)
			return "Book " + s1.getId() + ", " + s1.getName() + " successfully updated";
		else
			return null;
	}

	
	
		
}
   
		