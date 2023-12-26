package org.example.controller;

import org.example.pojo.Life;
import org.example.response.RespBody;
import org.example.service.LifeService;
import org.example.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import static java.lang.Integer.parseInt;

@RestController
@ResponseBody
@RequestMapping("/Life")
public class LifeController {

    @Autowired
    LifeService ls;

    @RequestMapping("/selectAll")
    public RespBody selectAll(@RequestBody Life pageForm){

        PageUtil pg = new PageUtil();
        pg.setPageNo(pageForm.getPageNo());
        pg.setPageSize(pageForm.getPageSize());
        pg= ls.selectAllC(pageForm.getPageSize(),pageForm.getPageNo() ,pageForm.getStuid());
        return new RespBody(200,pg,"查询成功");
    }

    @RequestMapping("/selectLifeById")
    public RespBody selectLifeById(int id){
        Life uf;
        uf=ls.selectLifeById(id);
        return new RespBody(200,uf,"查询成功");
    }



    @RequestMapping("/insertLife")
    public RespBody insertLife(@RequestBody Life lifeForm){

        int a = ls.insertLife(lifeForm);
        if (0<a){
            return new RespBody(200,null,"创建成功");
        }
        return new RespBody(400,null,"添加失败");
    }
    @RequestMapping("/deleteLife")
    public RespBody deleteLife(int id){
        int a = 0;
        a= ls.deleteLifeById(id);
        if (0<a){
            return new RespBody(200,null,"删除成功");
        }
        return new RespBody(400,null,"删除失败");
    }

    @RequestMapping("/updateLife")
    public RespBody updateLife(@RequestBody Life lifeForm){
        int a= ls.updateLife(lifeForm);
        if (0<a){
            return new RespBody(200,null,"更新成功");
        }
        return new RespBody(400,null,"更新失败");
    }
}