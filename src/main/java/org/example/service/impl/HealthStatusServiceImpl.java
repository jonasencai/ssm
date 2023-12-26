package org.example.service.impl;

import org.example.mapper.HealthStatusMapper;
import org.example.pojo.*;
import org.example.pojo.dto.HealthStatusDto;
import org.example.service.HealthStatusService;
import org.example.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service("HealthStatusService")
public class HealthStatusServiceImpl implements HealthStatusService {
    @Autowired
    HealthStatusMapper hm;


    @Override
    public PageUtil selectAll(PageUtil pageForm, Healthstatus hs) {
        List<HealthStatusDto> lhsd = hm.selectAll(pageForm.getPageSize(), (pageForm.getPageNo()-1)* pageForm.getPageSize(), hs);
        int count = hm.count(hs);
        PageUtil pageUtil = new PageUtil();
        pageUtil.setTotal(count);
        pageUtil.setPages(lhsd);
        return pageUtil;
    }



    @Override
    public Healthstatus selectHealthStatusById(int id) {
        return hm.selectHealthStatusById(id);
    }

    @Override
    public int insertHealthStatus(Healthstatus hsd) {
        return hm.insertHealthStatus(hsd);
    }

    @Override
    public int deleteHealthStatus(int id) {
        return hm.deleteHealthStatus(id);
    }

    @Override
    public int updateHealthStatus(Healthstatus hsd) {
        return hm.updateHealthStatus(hsd);
    }

    @Override
    public ArrayList<Ill> selectIllByStuId(String id) {
        return hm.selectIllByStuId(id);
    }

    @Override
    public ArrayList<Sport> selectSportByStuId(String id) {
        return hm.selectSportByStuId(id);
    }

    @Override
    public ArrayList<Life> selectLifeByStuId(String id) {
        return hm.selectLifeByStuId(id);
    }

    @Override
    public ArrayList<Pexamination> selectPexaminationByStuId(String id) {
        return hm.selectPexaminationByStuId(id);
    }

}
