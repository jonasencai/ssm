package org.example.pojo.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;
@ToString
@Component
@Getter
@Setter
public class HealthStatusDto {
    private long id;
    private String stuid;
    private long illid;
    private long sportid;
    private long pexaminationid;
    private long lifeid;
    private long questionscoreid;
    private String date;
    private String suggestion;
    private long healthscore;
    private String illtittle;
    private String lifetittle;
    private String pexaminationtittle;
    private String pic;
    private String sporttittle;
    private long questionscore;
    private String healthstatus;
}