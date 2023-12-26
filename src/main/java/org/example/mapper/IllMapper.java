package org.example.mapper;

import org.apache.ibatis.annotations.Param;
import org.example.pojo.Ill;
import org.example.pojo.Sport;

import java.util.ArrayList;

public interface IllMapper {
    ArrayList<Ill> selectAllC(@Param("pageSize") int pageSize, @Param("pageNo") int pageNo, @Param("stuid") String stuid);
    int count(@Param("stuid") String stuid);
    Ill selectIllById(@Param("id") int id);
    int deleteIllByid(@Param("id") int id);
    int updateIll(@Param("Ill") Ill i);
    int insertIll(@Param("Ill") Ill i);
}