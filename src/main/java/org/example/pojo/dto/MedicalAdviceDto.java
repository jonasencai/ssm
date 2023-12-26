package org.example.pojo.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

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
public class MedicalAdviceDto {
    private int maId;
    private String patientName;
    private String idCard;
    private String sex;
    private String birthday;
    private String address;
    private int registryId;
    private String departmentId;
    private String roomId;
    private String registryDoctor;
    private String registryTime;
    private String consultationTime;
    private String chiefComplaint;
    private String diagnosis;
    private String medicalDoctor;
}