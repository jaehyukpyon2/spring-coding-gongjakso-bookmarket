package com.springmvc.chap12;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller(value = "chap12_example01controller")
@RequestMapping(value = "/chap12")
public class Example01Controller {

    @GetMapping(value = "/exam01")
    public String requestMethod() {
        return "webpage12_01";
    }
}
