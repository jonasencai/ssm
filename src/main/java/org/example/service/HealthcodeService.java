package org.example.service;

import org.apache.ibatis.annotations.Param;
import org.example.pojo.Comment;
import org.example.pojo.Healthcode;
import org.example.utils.PageUtil;

import java.util.ArrayList;

public interface HealthcodeService {
    ArrayList<Healthcode> selectAll();
    Healthcode selectHealthcodeById(int id);
    int deleteHealthcodeById(int id);
    int updateHealthcode(Healthcode hc);
    int insertHealthcode(Healthcode hc);


}