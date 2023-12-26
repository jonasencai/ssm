package org.example.mapper;

import org.apache.ibatis.annotations.Param;
import org.example.pojo.Ill;
import org.example.pojo.Pexamination;

import java.util.ArrayList;

public interface PexaminMapper {
    ArrayList<Pexamination> selectAllC(@Param("pageSize") int pageSize, @Param("pageNo") int pageNo, @Param("stuid") String stuid);
    int count(@Param("stuid") String stuid);
    Pexamination selectPexaminationById(@Param("id") int id);
    int deletePexaminationByid(@Param("id") int id);
    int updatePexamination(@Param("p") Pexamination p);
    int insertPexamination(@Param("p") Pexamination p);
}