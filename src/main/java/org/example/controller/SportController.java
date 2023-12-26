package org.example.controller;

import org.example.pojo.Life;
import org.example.pojo.Sport;
import org.example.response.RespBody;
import org.example.service.LifeService;
import org.example.service.SportService;
import org.example.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
@RequestMapping("/Sport")
public class SportController {

    @Autowired
    SportService ls;

    @RequestMapping("/selectAll")
    public RespBody selectAll(@RequestBody Sport pageForm){

        PageUtil pg = new PageUtil();
        pg.setPageNo(pageForm.getPageNo());
        pg.setPageSize(pageForm.getPageSize());
        pg= ls.selectAllC(pageForm.getPageSize(),pageForm.getPageNo() ,pageForm.getStuid());
        return new RespBody(200,pg,"查询成功");
    }

    @RequestMapping("/selectSportById")
    public RespBody selectSportById(int id){
        Sport uf;
        uf=ls.selectSportById(id);
        return new RespBody(200,uf,"查询成功");
    }



    @RequestMapping("/insertSport")
    public RespBody insertSport(@RequestBody Sport sportForm){

        int a = ls.insertSport(sportForm);
        if (0<a){
            return new RespBody(200,null,"创建成功");
        }
        return new RespBody(400,null,"添加失败");
    }
    @RequestMapping("/deleteSport")
    public RespBody deleteSport(int id){
        int a = 0;
        a= ls.deleteSportById(id);
        if (0<a){
            return new RespBody(200,null,"删除成功");
        }
        return new RespBody(400,null,"删除失败");
    }

    @RequestMapping("/updateSport")
    public RespBody updateSport(@RequestBody Sport sportForm){
        int a= ls.updateSport(sportForm);
        if (0<a){
            return new RespBody(200,null,"更新成功");
        }
        return new RespBody(400,null,"更新失败");
    }
}