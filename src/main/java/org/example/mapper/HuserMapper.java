package org.example.mapper;

import org.apache.ibatis.annotations.Param;
import org.example.pojo.Huser;
import org.example.pojo.Sport;

import java.util.ArrayList;

public interface HuserMapper {
    ArrayList<Huser> findAll(@Param("pageSize") int pageSize, @Param("pageNo") int pageNo, @Param("user") Huser u);
    int count(@Param("user") Huser u);
    Huser selectHuserById(@Param("id") int id);
    int deleteHuserByid(@Param("id") int id);
    int updateHuser(@Param("user") Huser huser);
    int insertHuser(@Param("user") Huser huser);
    int changePassword(@Param("user") Huser huser);
}
