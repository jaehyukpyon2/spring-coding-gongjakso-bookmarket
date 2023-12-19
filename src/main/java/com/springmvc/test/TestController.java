package com.springmvc.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class TestController {

    @ModelAttribute("test")
    public TestDTO testDTO() {
        System.out.println("TestController.testDTO");
        return new TestDTO();
    }

    @GetMapping("test1")
    public void test1(HttpServletResponse response) throws Exception {
        System.out.println("TestController.test1");
        response.setContentType("text/plain");
        response.getWriter().println("hehe");
    }

    @GetMapping("test2")
    public void test2(@ModelAttribute("test") TestDTO testDTO) {
        System.out.println("TestController.<unnamed>");
    }

    /*
    *
    * 현재 이 클래스 파일에서,
    * testDTO() 메서드는 무조건 실행.
    * testDTO() 메서드 실행해서 새로운 TestDTO 객체 만들고, 그 다음에 test2() 실행.
    * */
}
