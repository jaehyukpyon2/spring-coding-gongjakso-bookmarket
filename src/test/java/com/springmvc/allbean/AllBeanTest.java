package com.springmvc.allbean;

import lombok.extern.log4j.Log4j;
//import org.junit.Test;
//import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml",
//        "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
//@Log4j
//public class AllBeanTest {
//
//    @Autowired
//    private GenericApplicationContext ac;
//
//    @Test
//    public void instanceof_() {
//        System.out.println(ac.getClass().getName());
//    }
//
//    @Test
//    public void findApplicationBean() {
//        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
//        for (String beanDefinitionName : beanDefinitionNames) {
//            BeanDefinition beanDefinition = ac.getBeanDefinition(beanDefinitionName);
//
//            // Role ROLE_APPLICATION: 직접 등록한 애플리케이션 빈
//            // Role ROLE_INFRASTRUCTURE: 스프링이 내부에서 사용하는 빈
//            if (beanDefinition.getRole() == BeanDefinition.ROLE_APPLICATION) {
//                Object bean = ac.getBean(beanDefinitionName);
//                System.out.println("name=" + beanDefinitionName + ", object=" + bean);
//            }
//        }
//    }
//}
