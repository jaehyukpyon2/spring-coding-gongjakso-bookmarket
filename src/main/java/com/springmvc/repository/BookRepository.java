package com.springmvc.repository;

import com.springmvc.domain.Book;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface BookRepository {
    List<Book> getAllBookList();
    List<Book> getBookListByCategory(String category);
    Book getBookById(String bookId);
    Set<Book> getBookListByFilter(Map<String, List<String>> filter);
}
