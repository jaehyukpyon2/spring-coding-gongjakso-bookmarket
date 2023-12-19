package com.springmvc.controller;

import com.springmvc.domain.DataBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//@Controller(value = "test1")
public class TestController {
    //@GetMapping("/test1")
    public String test1(DataBean bean) {
        bean.setA1("data2");
        return "test1";
    }
}
