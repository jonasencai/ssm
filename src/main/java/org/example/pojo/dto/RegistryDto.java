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
public class RegistryDto {
  private int Fid;
  private long id;
  private long patientId;
  private long scheduleId;
  private long userId;
  private long departmentId;
  private long roomId;
  private long status;
  private double fee;
  private double payFee;
  private double medicareFee;
  private long isMedicare;
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
  private LocalDateTime registryTime;
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
  private LocalDateTime consultationTime;
  private LocalDateTime createdTime;
  private LocalDateTime updatedTime;
  private String pname;
  private String sex;
  private String idCard;
  private String fUserIId;
  private String fDepartmentId;
  //1-->已挂号，未问诊；2-->正在问诊；3-->问诊结束
  private String  fstatus ;
  private int pageSize;
  private int pageNo;
  private int total;
}