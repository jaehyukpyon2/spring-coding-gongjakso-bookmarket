package com.springmvc.chap06;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/home")
public class Example01Controller {

    @GetMapping(value = "/exam01/{bookId}")
    public String requestMethod(@PathVariable(required = false, value = "huhuhu") String bookId, Model model) {
        // localhost:8092/home/exam01/{bookId} >> bookId부분에 아무런 값도 주지 않으면, No mapping for GET /home/exam01/ error 발생
        // @PathVariable(required = false, value = "huhuhu") >> 이렇게 해도 값 안 주면 No mapping for GET 안된다.

        System.out.println("bookId = " + bookId);
        model.addAttribute("data", "도서 ID: " + bookId);
        return "webpage06";
    }
}
