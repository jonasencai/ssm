package org.example.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ToString
public class User {

  private long id;
  private String account;
  private long stuid;
  private String username;
  private String password;
  private String sex;
  private long age;
  private String college;
  private String classname;
  private String tel;
  private String birthday;
  private long role;

}
