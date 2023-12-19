package com.springmvc.chap07;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter @Setter
@ToString
public class Member {
    private int id;
    private String password;
    private String city;
    private String sex;
    private String[] hobby;
    private Date birth;
}
