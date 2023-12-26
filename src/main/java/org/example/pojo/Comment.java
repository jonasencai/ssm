package org.example.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ToString
public class Comment {

  private long id;
  private String stuid;
  private String username;
  private String date;
  private String tittle1;
  private String reporter;
  private String tittle2;
  private int pageSize;
  private int pageNo;
  private int total;
}
