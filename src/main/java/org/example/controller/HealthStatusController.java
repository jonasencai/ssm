package org.example.controller;

import org.example.pojo.*;
import org.example.response.RespBody;
import org.example.service.HealthStatusService;
import org.example.service.HealthcodeService;
import org.example.service.SportService;
import org.example.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@ResponseBody
@RequestMapping("/HealthStatus")
public class HealthStatusController {

    @Autowired
    HealthStatusService hss;

    @Autowired
    HealthcodeService hcs;

    @RequestMapping("/selectAll")
    public RespBody selectAll(@RequestBody Healthstatus pageForm) {

        PageUtil pg = new PageUtil();
        pg.setPageNo(pageForm.getPageNo());
        pg.setPageSize(pageForm.getPageSize());
        pg = hss.selectAll(pg, pageForm);
        return new RespBody(200, pg, "查询成功");
    }

    @RequestMapping("/selectHealthStatusById")
    public RespBody selectHealthStatusById(int id) {

        Healthstatus hs;
        hs = hss.selectHealthStatusById(id);
        return new RespBody(200, hs, "查询成功");
    }


    @RequestMapping("/insertHealthStatus")
    public RespBody insertHealthStatus(@RequestBody Healthstatus hs) {

        int a = hss.insertHealthStatus(hs);
        if (0 < a) {
            return new RespBody(200, null, "创建成功");
        }
        return new RespBody(400, null, "添加失败");
    }

    @RequestMapping("/deleteHealthStatus")
    public RespBody deleteHealthStatus(int id) {
        int a = 0;
        a = hss.deleteHealthStatus(id);
        if (0 < a) {
            return new RespBody(200, null, "删除成功");
        }
        return new RespBody(400, null, "删除失败");
    }

    @RequestMapping("/updateHealthStatus")
    public RespBody updateHealthStatus(@RequestBody Healthstatus hs) {
        ArrayList<Healthcode> healthcodelist = hcs.selectAll();
        if (0 != hs.getHealthscore()) {
            for (int i = 0; i < healthcodelist.size(); i++) {
                if (hs.getHealthscore() > healthcodelist.get(i).getScore()) {
                    hs.setHealthstatus(healthcodelist.get(i).getHealthstatus());
                    break;
                }
            }
        }
        int a = hss.updateHealthStatus(hs);
        if (0 < a) {
            return new RespBody(200, null, "更新成功");
        }
        return new RespBody(400, null, "更新失败");
    }

    @RequestMapping("/optionsDataget")
    public RespBody optionsDataget(String stuid) {
        ArrayList<ArrayList> allList = new ArrayList();
        ArrayList<Ill> IllList = hss.selectIllByStuId(stuid);
        ArrayList<Sport> SportList = hss.selectSportByStuId(stuid);
        ArrayList<Life> LifeList = hss.selectLifeByStuId(stuid);
        ArrayList<Pexamination> PexaminationList = hss.selectPexaminationByStuId(stuid);
        allList.add(IllList);
        allList.add(SportList);
        allList.add(LifeList);
        allList.add(PexaminationList);
        return new RespBody(200, allList, "查询成功");
    }
}