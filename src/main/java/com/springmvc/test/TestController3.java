package com.springmvc.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
//@SessionAttributes("test")
public class TestController3 {

    @ModelAttribute("test")
    public TestDTO testDTO() {
        System.out.println("TestController2.testDTO");

        TestDTO testDTO = new TestDTO();
        testDTO.setId(9999);
        testDTO.setName("Jaehyuk Pyon");
        return testDTO;
    }

    @GetMapping("test-11")
    public void test1(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("TestController2.test1");
        System.out.println("request.getSession().getAttribute(\"test\") = " + request.getSession().getAttribute("test"));
        response.setContentType("text/plain");
        response.getWriter().println("test1");
    }

    @GetMapping("test-22")
    public void test2(@ModelAttribute("test") TestDTO testDTO, HttpServletResponse response) throws Exception {
        System.out.println("TestController2.test2");
        System.out.println("testDTO = " + testDTO);
        response.setContentType("text/plain");
        response.getWriter().println("test2");
    }

    @GetMapping("test-33")
    public void test3(@ModelAttribute("test") TestDTO testDTO, HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("TestController2.test3");
        System.out.println("testDTO = " + testDTO);
        System.out.println("request.getSession().getAttribute(\"test\") = " + request.getSession().getAttribute("test"));
        response.setContentType("text/plain");
        response.getWriter().println("test2");
    }

    /*
    *  현재 이 상황에서는, testDTO가 브라우저가 처음 test1() 호출한 시점에 딱 한 번만 호출된다.
    *  그런데, 맨 처음, test1() 실행할 때, request.getSession.getAttribute("test") 를 찍어보면 null 이 나오는데,
    *  다시 한 번 test1() 실행해보면 맨 처음 요청했을 때 testDTO() 가 호출돼서 거기에서 세팅한 값이 잘 나온다...
    *
    *  그리고, test-2?id=7777&name=Yeon 하면,  내가 알고 있는 그 세션영역에 "test"를 키값으로 잘 저장된다.
    *
    *
    * */
}
