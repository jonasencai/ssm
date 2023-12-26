package org.example.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ToString
public class Pexamination {

  private long id;
  private String stuid;
  private String username;
  private String date;
  private String pic;
  private String tittle;

  private int pageSize;
  private int pageNo;
  private int total;
}
