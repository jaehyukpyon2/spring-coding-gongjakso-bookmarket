package com.springmvc.chap07;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller(value = "chap07example03controller")
@SessionAttributes(value = {"title", "subtitle"})
public class Example03Controller {
    int i = 0;

    @ModelAttribute(value = "title")
    public String setTitle() {
        System.out.println("Example03Controller.setTitle");
        return "@ModelAttribute 유형";
    }

    @ModelAttribute
    public void setsubTitle(Model model) {
        System.out.println("Example03Controller.setsubTitle");
        model.addAttribute("subtitle", "메소드에 @ModelAttribute annotation 적용하기 => " + i++);
    }

    @GetMapping(value = "/exam03_")
    public String showForm() {
        return "webpage07_03";
    }
}
