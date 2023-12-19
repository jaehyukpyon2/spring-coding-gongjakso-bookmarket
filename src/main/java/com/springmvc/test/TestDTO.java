package com.springmvc.test;

import lombok.ToString;

@ToString
public class TestDTO {

    private int id;
    private String name;

    public TestDTO() {
        System.out.println("TestDTO.TestDTO");
    }

    public int getId() {
        System.out.println("TestDTO.getId");
        return id;
    }

    public void setId(int id) {
        System.out.println("TestDTO.setId");
        this.id = id;
    }

    public String getName() {
        System.out.println("TestDTO.getName");
        return name;
    }

    public void setName(String name) {
        System.out.println("TestDTO.setName");
        this.name = name;
    }
}
