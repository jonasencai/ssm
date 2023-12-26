package org.example.mapper;



import org.apache.ibatis.annotations.Param;
import org.example.pojo.*;
import org.example.pojo.dto.HealthStatusDto;
import org.example.pojo.dto.UserFront;

import java.util.ArrayList;
import java.util.List;

public interface HealthStatusMapper {
    List<HealthStatusDto> selectAll(@Param("pageSize") int pageSize, @Param("pageNo") int pageNo, @Param("hsd") Healthstatus hsd);
    int count(@Param("hsd") Healthstatus hsd);
    Healthstatus selectHealthStatusById(@Param("id")int id);
    int insertHealthStatus(@Param("hsd") Healthstatus hsd);
    int deleteHealthStatus(@Param("id") int id);
    int updateHealthStatus(@Param("hsd") Healthstatus hsd);

    ArrayList<Ill> selectIllByStuId(@Param("id") String id);
    ArrayList<Sport>   selectSportByStuId(@Param("id") String id);
    ArrayList<Life>  selectLifeByStuId(@Param("id") String id);
    ArrayList<Pexamination>  selectPexaminationByStuId(@Param("id") String id);
}
