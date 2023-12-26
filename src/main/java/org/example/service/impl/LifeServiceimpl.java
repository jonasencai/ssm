package org.example.service.impl;

import org.example.mapper.LifeMapper;
import org.example.pojo.Life;
import org.example.service.LifeService;
import org.example.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service("LifeService")
public class LifeServiceimpl implements LifeService {

    @Autowired
    LifeMapper lm;

    @Override
    public PageUtil selectAllC(int pageSize, int pageNo, String stuid) {
        ArrayList<Life> users =lm.selectAllC( pageSize,(pageNo-1)* pageSize,stuid);
        int count = lm.count(stuid);
        PageUtil pageUtil = new PageUtil();
        pageUtil.setTotal(count);
        pageUtil.setPages(users);
        return pageUtil;
    }

    @Override
    public Life selectLifeById(int id) {
        return lm.selectLifeById(id);
    }

    @Override
    public int deleteLifeById(int id) {
        return lm.deleteLifeByid(id);
    }

    @Override
    public int updateLife(Life l) {
        return lm.updateLife(l);
    }

    @Override
    public int insertLife(Life l) {
        return lm.insertLife(l);
    }
}