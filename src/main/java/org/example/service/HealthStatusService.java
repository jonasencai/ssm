package org.example.service;

import org.example.pojo.*;
import org.example.utils.PageUtil;

import java.util.ArrayList;


public interface HealthStatusService {

    PageUtil selectAll (PageUtil pageForm, Healthstatus hs);
    Healthstatus selectHealthStatusById(int id);
    int insertHealthStatus(Healthstatus hsd);
    int deleteHealthStatus(int id);
    int updateHealthStatus(Healthstatus hsd);
    ArrayList<Ill> selectIllByStuId(String id);
    ArrayList<Sport> selectSportByStuId(String id);
    ArrayList<Life>  selectLifeByStuId( String id);
    ArrayList<Pexamination>   selectPexaminationByStuId( String id);
}
