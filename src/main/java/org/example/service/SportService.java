package org.example.service;

import org.example.pojo.Life;
import org.example.pojo.Sport;
import org.example.utils.PageUtil;

public interface SportService {
    PageUtil selectAllC(int pageSize, int pageNo, String stuid);

    Sport selectSportById(int id);

    int deleteSportById(int id);

    int updateSport(Sport l);

    int insertSport( Sport l);


}