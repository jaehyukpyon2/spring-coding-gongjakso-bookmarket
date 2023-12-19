package com.springmvc.controller;

import com.springmvc.domain.Book;
import com.springmvc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Controller
@RequestMapping(value = "/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping(value = {"", "/"})
    public String requestBookList(Model model) {
        System.out.println("BookController.requestBookList");
        List<Book> list = bookService.getAllBookList();
        model.addAttribute("bookList", list);
        return "books";
    }

    @GetMapping(value = "/{category}")
    public String requestBooksByCategory(@PathVariable("category") String bookCategory,
                                         Model model) {
        System.out.println("BookController.requestBooksByCategory");
        List<Book> booksByCategory = bookService.getBookListByCategory(bookCategory);
        model.addAttribute("bookList", booksByCategory);
        return "books";
    }

    @GetMapping(value = "/book")
    public String requestBookById(@RequestParam(value = "id") String bookId, Model model) {
        // Required request parameter 'id' for method parameter type String is not present
        Book bookById = bookService.getBookById(bookId);
        model.addAttribute("book", bookById);
        return "book";
    }

    @GetMapping("/filter/{bookFilter}")
    public String requestBooksByFilter(
                                    @MatrixVariable(pathVar = "bookFilter") Map<String, List<String>> bookFilter,
                                    Model model) {
        Set<Book> booksByFilter = bookService.getBookListByFilter(bookFilter);
        model.addAttribute("bookList", booksByFilter);
        return "books";
    }
}
