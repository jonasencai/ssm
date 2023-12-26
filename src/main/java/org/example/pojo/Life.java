package org.example.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ToString
public class Life {

  private long id;
  private String stuid;
  private String username;
  private String date;
  private String time;
  private String tittle;

  private int pageSize;
  private int pageNo;
  private int total;
}
