package com.springmvc.chap12;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller(value = "chap12_example03controller")
@RequestMapping(value = "/chap12")
public class Example03Controller {

    @GetMapping(value = "/exam03")
    public String requestMethod() {
        return "webpage12_02";
    }
}
