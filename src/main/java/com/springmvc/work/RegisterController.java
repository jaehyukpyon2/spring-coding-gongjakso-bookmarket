package com.springmvc.work;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
@Log4j2
public class RegisterController {

    @GetMapping(value = "/user/register")
    public String userRegieterForm(@ModelAttribute("member") Member member, Model model) {
        return "work/register";
    }

    @PostMapping(value = "/user/register")
    public String userRegister(@Valid @ModelAttribute("member") Member member, BindingResult bindingResult,
                               Model model) {
        log.info("member={}", member);
        if (bindingResult.hasErrors()) {
            return "work/register";
        }
        return "work/result";
    }
}
