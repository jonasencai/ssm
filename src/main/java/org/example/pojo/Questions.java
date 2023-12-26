package org.example.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ToString
public class Questions {

  private long id;
  private String question;
  private String optA;
  private String optB;
  private String optC;

  private int pageSize;
  private int pageNo;
  private int total;

}