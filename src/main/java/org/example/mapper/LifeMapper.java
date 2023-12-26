package org.example.mapper;

import org.apache.ibatis.annotations.Param;
import org.example.pojo.Life;
import org.example.pojo.dto.RegistryDto;

import java.util.ArrayList;

public interface LifeMapper {
    ArrayList<Life> selectAllC(@Param("pageSize") int pageSize, @Param("pageNo") int pageNo, @Param("stuid") String stuid);
    int count(@Param("stuid") String stuid);
    Life selectLifeById(@Param("id") int id);
    int deleteLifeByid(@Param("id") int id);
    int updateLife(@Param("life") Life l);
    int insertLife(@Param("life") Life l);
}