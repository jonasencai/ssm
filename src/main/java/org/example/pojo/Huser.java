package org.example.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ToString
public class Huser {

    private int id;
    private String stuid;
    private String username;
    private String date;
    private String tittle;
    private int pageSize;
    private int pageNo;
    private int total;
    private String account;
    private String password;
    private String sex;
    private long age;
    private String college;
    private String classname;
    private String tel;
    private String birthday;
    private long role;
    private String roleName;
}