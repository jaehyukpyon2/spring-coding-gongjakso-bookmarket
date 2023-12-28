package com.springmvc.chap12;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller(value = "chap12_example02controller")
@RequestMapping(value = "/chap12")
public class Example02Controller {

    @GetMapping(value = "/exam02")
    public String requestMethod() {
        return "webpage12_01";
    }
}
