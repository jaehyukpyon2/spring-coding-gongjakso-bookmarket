package com.springmvc.controller;

import com.springmvc.domain.Book;
import com.springmvc.service.BookService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Controller
@RequestMapping(value = "/books")
@Log4j2
public class BookController {
    @Autowired
    private BookService bookService;

    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("addTitle", "신규 도서 등록!");
    }

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        // initbinder 애노테이션 붙은 메서드의 호출 순서를 보장해주지 않으며, request가 달라지면, WebDataBinder의 인스턴스의 주소도 달라진다.
        // 즉, 한 개의 request 안에서는 인스턴스 주소가 같다.
        log.info("webDataBinder={}", webDataBinder);
        webDataBinder.setAllowedFields("bookId", "name", "unitPrice", "author", "description", "publisher",
                "category", "unitsInStock", "totalPages", "releaseDate", "condition");
    }

    @InitBinder
    public void initBinder2(WebDataBinder webDataBinder) {
        log.info("webDataBinder={}", webDataBinder);
    }

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

    @GetMapping("/add")
    public String requestAddBookForm(@ModelAttribute("NewBook") Book book) {
        log.info("book toString() = {}", book.toString());
        return "addBook";
    }

    @PostMapping("/add")
    public String submitAddNewBook(@ModelAttribute("NewBook") Book book) {
        bookService.setNewBook(book);
        return "redirect:/books";
    }
}
