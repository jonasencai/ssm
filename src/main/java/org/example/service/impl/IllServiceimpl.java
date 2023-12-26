package org.example.service.impl;

import org.example.mapper.IllMapper;
import org.example.pojo.Ill;
import org.example.service.IllService;
import org.example.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service("IllService")
public class IllServiceimpl implements IllService {

    @Autowired
    IllMapper im;

    @Override
    public PageUtil selectAllC(int pageSize, int pageNo, String stuid) {
        ArrayList<Ill> users = im.selectAllC(pageSize, (pageNo - 1) * pageSize, stuid);
        int count = im.count(stuid);
        PageUtil pageUtil = new PageUtil();
        pageUtil.setTotal(count);
        pageUtil.setPages(users);
        return pageUtil;
    }

    @Override
    public Ill selectIllById(int id) {
        return im.selectIllById(id);
    }

    @Override
    public int deleteIllById(int id) {
        return im.deleteIllByid(id);
    }

    @Override
    public int updateIll(Ill Ill) {
        return im.updateIll(Ill);
    }

    @Override
    public int insertIll(Ill Ill) {
        return im.insertIll(Ill);
    }
}