package org.example.mapper;

import org.apache.ibatis.annotations.Param;
import org.example.pojo.Sport;

import java.util.ArrayList;

public interface SportMapper {
    ArrayList<Sport> selectAllC(@Param("pageSize") int pageSize, @Param("pageNo") int pageNo, @Param("stuid") String stuid);
    int count(@Param("stuid") String stuid);
    Sport selectSportById(@Param("id") int id);
    int deleteSportByid(@Param("id") int id);
    int updateSport(@Param("Sport") Sport sport);
    int insertSport(@Param("Sport") Sport sport);
}