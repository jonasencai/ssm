package org.example.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Getter
@Setter
@Component
@ToString
public class Questionnairescore {

  private int id;
  private int questionnaireid;
  private String stuid;
  private String date;
  private long score;
  private int pageSize;
  private int pageNo;
  private int total;
  private ArrayList<String> stuidList;
}