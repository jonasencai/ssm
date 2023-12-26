package org.example.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ToString
public class Healthstatus {

  private int id;
  private String stuid;
  private int illid;
  private int sportid;
  private int pexaminationid;
  private int lifeid;
  private int questionscoreid;
  private String date;
  private String suggestion;
  private int healthscore;
  private String healthstatus;
  private int pageSize;
  private int pageNo;
  private int total;

}
