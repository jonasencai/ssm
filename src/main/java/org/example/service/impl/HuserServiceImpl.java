package org.example.service.impl;

import org.example.mapper.HuserMapper;
import org.example.pojo.Huser;

import org.example.service.HuserService;
import org.example.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service("/HuserService")
public class HuserServiceImpl implements HuserService {
    @Autowired
    HuserMapper hm;
    @Override
    public PageUtil findAll(int pageSize, int pageNo, Huser u) {
        ArrayList<Huser> husers = hm.findAll(pageSize, (pageNo - 1) * pageSize, u);
        for (int i = 0; i < husers.size(); i++) {
            if(1==husers.get(i).getRole()){
                husers.get(i).setRoleName("管理员");
            } else if(2==husers.get(i).getRole()){
                husers.get(i).setRoleName("医生");
            } else if(3==husers.get(i).getRole()){
                husers.get(i).setRoleName("学生");
            }
        }
        int count = hm.count(u);
        PageUtil pageUtil = new PageUtil();
        pageUtil.setTotal(count);
        pageUtil.setPages(husers);
        return pageUtil;
    }

    @Override
    public Huser selectHuserById(int id) {
        return hm.selectHuserById(id);
    }

    @Override
    public int deleteHuserByid(int id) {
        return hm.deleteHuserByid(id);
    }

    @Override
    public int updateHuser(Huser h) {
        return hm.updateHuser(h);
    }

    @Override
    public int insertHuser(Huser h) {
        return hm.insertHuser(h);
    }

    @Override
    public int changePassword(Huser h) {
        return hm.changePassword(h);
    }
}