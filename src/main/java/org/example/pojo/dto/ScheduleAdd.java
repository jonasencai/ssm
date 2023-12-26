package org.example.pojo.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Component
@ToString
public class ScheduleAdd {

    private int id;
    private int departmentId;
    private int roomId;
    private List<String> sign;
    private String quantity;
    private String remainingQuantity;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date inquiryTime;
    private int status;
    private LocalDateTime createdTime;
    private LocalDateTime updatedTime;
    private int userId;
}