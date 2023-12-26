package org.example.pojo.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Getter
@Setter
@Component
@ToString
public class ScheduleFront {
    private int Fid;
    private int id;
    private String departmentName;
    private String roomName;
    private String sign;
    private int quantity;
    private int remainingQuantity;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private LocalDateTime inquiryTime;
    private int status;
    private LocalDateTime createdTime;
    private LocalDateTime updatedTime;
    private String userName;
    private int pageSize;

    private int pageNo;

    private int total;

    private int selecterUserId;
}