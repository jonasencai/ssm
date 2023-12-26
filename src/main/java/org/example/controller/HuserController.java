package org.example.controller;

import org.example.pojo.Huser;
import org.example.response.RespBody;
import org.example.service.HuserService;
import org.example.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
@RequestMapping("/Huser")
public class HuserController {
    @Autowired
    HuserService hs;

    @RequestMapping("/selectAll")
    public RespBody selectAll(@RequestBody Huser pageForm){

        PageUtil pg = new PageUtil();
        pg.setPageNo(pageForm.getPageNo());
        pg.setPageSize(pageForm.getPageSize());
        pg= hs.findAll(pageForm.getPageSize(),pageForm.getPageNo() ,pageForm);
        return new RespBody(200,pg,"查询成功");
    }

    @RequestMapping("/selectHuserById")
    public RespBody selectHuserById(int id){
        Huser h1;
        h1=hs.selectHuserById(id);
        return new RespBody(200,h1,"查询成功");
    }

    @RequestMapping("/insertHuser")
    public RespBody insertHuser(@RequestBody Huser huserForm){
        int a = hs.insertHuser(huserForm);
        if (0<a){
            return new RespBody(200,null,"创建成功");
        }
        return new RespBody(400,null,"添加失败");
    }

    @RequestMapping("/deleteHuser")
    public RespBody deleteHuserById(int id){
        int a = 0;
        a= hs.deleteHuserByid(id);
        if (0<a){
            return new RespBody(200,null,"删除成功");
        }
        return new RespBody(400,null,"删除失败");
    }

    @RequestMapping("/updateHuser")
    public RespBody updateHuser(@RequestBody Huser huser){
        int a= hs.updateHuser(huser);
        if (0<a){
            return new RespBody(200,null,"更新成功");
        }
        return new RespBody(400,null,"更新失败");
    }

    @RequestMapping("/changePassword")
    public RespBody changePassword(@RequestBody Huser huser){
        int a= hs.changePassword(huser);
        if (0<a){
            return new RespBody(200,null,"更新成功");
        }
        return new RespBody(400,null,"更新失败");
    }
}