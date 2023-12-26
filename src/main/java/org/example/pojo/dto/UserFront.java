package org.example.pojo.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@Component
@ToString
public class UserFront {

    private int Fid;
    // id
    private int id;
    // 部门id
    private String departmentId;
    // 用户类型
    private String userType;
    // 用户头像URL
    private String headUrl;
    // 账号
    private String account;
    // 用户名
    private String userName;
    // 密码
    private String password;
    // 盐值
    private String salt;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private LocalDateTime createdTime;
    private LocalDateTime updatedTime;

    // 创建人ID
    private Long createdUserId;
    // 状态
    private String status;

    private int pageSize;

    private int pageNo;

    private int total;

    private int selecterUserId;
}
