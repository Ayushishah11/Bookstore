package com.bookstore.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.entity.MyBookList;

@Repository
public interface MyBookListRepository extends CrudRepository<MyBookList,Integer> {

}
