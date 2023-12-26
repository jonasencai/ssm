package org.example.service.impl;

import org.example.mapper.SportMapper;
import org.example.pojo.Sport;
import org.example.service.SportService;
import org.example.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service("SportService")
public class SportServiceimpl implements SportService {

    @Autowired
    SportMapper sm;

    @Override
    public PageUtil selectAllC(int pageSize, int pageNo, String stuid) {
        ArrayList<Sport> users = sm.selectAllC(pageSize, (pageNo - 1) * pageSize, stuid);
        int count = sm.count(stuid);
        PageUtil pageUtil = new PageUtil();
        pageUtil.setTotal(count);
        pageUtil.setPages(users);
        return pageUtil;
    }

    @Override
    public Sport selectSportById(int id) {
        return sm.selectSportById(id);
    }

    @Override
    public int deleteSportById(int id) {
        return sm.deleteSportByid(id);
    }

    @Override
    public int updateSport(Sport sport) {
        return sm.updateSport(sport);
    }

    @Override
    public int insertSport(Sport sport) {
        return sm.insertSport(sport);
    }
}