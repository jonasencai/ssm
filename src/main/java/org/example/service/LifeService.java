package org.example.service;

import org.example.pojo.Life;
import org.example.utils.PageUtil;

import java.util.ArrayList;

public interface LifeService {
    PageUtil selectAllC(int pageSize, int pageNo, String stuid);

    Life selectLifeById(int id);

    int deleteLifeById(int id);

    int updateLife(Life l);

    int insertLife( Life l);


}