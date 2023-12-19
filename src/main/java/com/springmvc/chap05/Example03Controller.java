package com.springmvc.chap05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Example03Controller {
    @GetMapping(value = "/exam03")
    public void requestMethod() {
        System.out.println("Example03Controller.requestMethod");
    }
}
