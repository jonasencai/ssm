package org.example.controller;

import org.example.pojo.Ill;
import org.example.pojo.Pexamination;
import org.example.response.RespBody;
import org.example.service.IllService;
import org.example.service.PexaminService;
import org.example.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
@RequestMapping("/Peaxmin")
public class PeaxminController {

    @Autowired
    PexaminService ps;

    @RequestMapping("/selectAll")
    public RespBody selectAll(@RequestBody Pexamination pageForm){

        PageUtil pg = new PageUtil();
        pg.setPageNo(pageForm.getPageNo());
        pg.setPageSize(pageForm.getPageSize());
        pg= ps.selectAllC(pageForm.getPageSize(),pageForm.getPageNo() ,pageForm.getStuid());
        return new RespBody(200,pg,"查询成功");
    }

    @RequestMapping("/selectPexaminationById")
    public RespBody selectPexaminationById(int id){
        Pexamination uf;
        uf=ps.selectPexaminationById(id);
        return new RespBody(200,uf,"查询成功");
    }

    @RequestMapping("/insertPexamination")
    public RespBody insertPexamination(@RequestBody Pexamination illForm){
        String sb= illForm.getPic();

        if (0<sb.length()){
            illForm.setPic(sb.substring(17,sb.length()));
        }
        int a = ps.insertPexamination(illForm);
        if (0<a){
            return new RespBody(200,null,"创建成功");
        }
        return new RespBody(400,null,"添加失败");
    }
    @RequestMapping("/deletePexamination")
    public RespBody deletePexamination(int id){
        int a = 0;
        a= ps.deletePexaminationById(id);
        if (0<a){
            return new RespBody(200,null,"删除成功");
        }
        return new RespBody(400,null,"删除失败");
    }

    @RequestMapping("/updatePexamination")
    public RespBody updatePexamination(@RequestBody Pexamination IllForm){
       String sb= IllForm.getPic();
        IllForm.setPic(sb.substring(17,sb.length()));
        int a= ps.updatePexamination(IllForm);
        if (0<a){
            return new RespBody(200,null,"更新成功");
        }
        return new RespBody(400,null,"更新失败");
    }
}