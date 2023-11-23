package com.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.entity.Book;
import com.bookstore.entity.MyBookList;
import com.bookstore.repository.MyBookListRepository;

@Service
public class MyBookListService {
 
	@Autowired
	private MyBookListRepository mybook;
	
	
	public void saveMyBooks(MyBookList book) {
	mybook.save(book); 
		
	}
	public List<MyBookList> getAllMyBooks() {
		return (null);
	}
	public static void add(Book book) {
		// TODO Auto-generated method stub
		
	}
	
	
}
