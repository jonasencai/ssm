package org.example.service.impl;

import org.example.mapper.HealthcodeMapper;
import org.example.pojo.Healthcode;
import org.example.service.HealthcodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service("HealthcodeService")
public class HealthcodeServiceimpl implements HealthcodeService {

    @Autowired
    HealthcodeMapper hcm;

    @Override
    public ArrayList<Healthcode> selectAll() {
        return hcm.selectAll();
    }

    @Override
    public Healthcode selectHealthcodeById(int id) {
        return hcm.selectHealthcodeById(id);
    }

    @Override
    public int deleteHealthcodeById(int id) {
        return hcm.deleteHealthcodeById(id);
    }

    @Override
    public int updateHealthcode(Healthcode hc) {
        return hcm.updateHealthcode(hc);
    }

    @Override
    public int insertHealthcode(Healthcode hc) {
        return hcm.insertHealthcode(hc);
    }
}