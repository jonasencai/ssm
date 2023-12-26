package org.example.mapper;

import org.apache.ibatis.annotations.Param;
import org.example.pojo.Comment;
import org.example.pojo.Healthcode;

import java.util.ArrayList;

public interface HealthcodeMapper {
    ArrayList<Healthcode> selectAll();
    Healthcode selectHealthcodeById(@Param("id") int id);
    int deleteHealthcodeById(@Param("id") int id);
    int updateHealthcode(@Param("hc") Healthcode hc);
    int insertHealthcode(@Param("hc") Healthcode hc);
}