package com.springmvc.chap07;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.util.Arrays;

@Controller(value = "ex07-example01controller")
public class Example01Controller {

//    @Session("session1")
//    public String test() {
//        return "hhhh";
//    }

    @GetMapping("/member")
    public String showForm(Model model) {
        Member member = new Member();
        System.out.println("Example01Controller.showForm ----------");
        System.out.println("member.getId() = " + member.getId());
        System.out.println("member.getPassword() = " + member.getPassword());
        System.out.println("member.getCity() = " + member.getCity());
        System.out.println("member.getSex() = " + member.getSex());
        System.out.println("member.getHobby() = " + member.getHobby());

        model.addAttribute("member", member);
        System.out.println("Example01Controller.showForm ----------");
        System.out.println();
        return "webpage07_01";
    }

    @PostMapping("/member")
    public String postForm(Member member1, Model model) {
        // Member member1로 매개변수 선언해도 아주 잘 작동함.
        System.out.println("Example01Controller.postForm ----------");
        System.out.println("member.getId() = " + member1.getId());
        System.out.println("member.getPassword() = " + member1.getPassword());
        System.out.println("member.getCity() = " + member1.getCity());
        System.out.println("member.getSex() = " + member1.getSex());
        System.out.println("member.getHobby() = " + Arrays.toString(member1.getHobby()));

        model.addAttribute("member", member1);
        System.out.println("Example01Controller.postForm ----------");
        System.out.println();
        return "webpage07_01";
    }


    @GetMapping("/member-test")
    public String getTest() {
        return "webpage07_01_test";
    }

    @PostMapping("/member-test")
    public String postTest(Member member) {
        System.out.println("Example01Controller.postTest -----");

        System.out.println("Example01Controller.postTest -----");

        return "webpage07_01_test";
    }
}
