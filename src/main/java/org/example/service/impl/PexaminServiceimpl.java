package org.example.service.impl;

import org.example.mapper.PexaminMapper;
import org.example.pojo.Pexamination;
import org.example.service.PexaminService;
import org.example.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service("PexaminationService")
public class PexaminServiceimpl implements PexaminService {

    @Autowired
    PexaminMapper pm;

    @Override
    public PageUtil selectAllC(int pageSize, int pageNo, String stuid) {
        ArrayList<Pexamination> users = pm.selectAllC(pageSize, (pageNo - 1) * pageSize, stuid);
        int count = pm.count(stuid);
        PageUtil pageUtil = new PageUtil();
        pageUtil.setTotal(count);
        pageUtil.setPages(users);
        return pageUtil;
    }

    @Override
    public Pexamination selectPexaminationById(int id) {
        return pm.selectPexaminationById(id);
    }

    @Override
    public int deletePexaminationById(int id) {
        return pm.deletePexaminationByid(id);
    }

    @Override
    public int updatePexamination(Pexamination p) {
        return pm.updatePexamination(p);
    }

    @Override
    public int insertPexamination(Pexamination p) {
        return pm.insertPexamination(p);
    }
}