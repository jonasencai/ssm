package org.example.controller;

import org.example.pojo.Comment;
import org.example.pojo.Healthcode;
import org.example.response.RespBody;
import org.example.service.CommentService;
import org.example.service.HealthcodeService;
import org.example.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
@RequestMapping("/Healthcode")
public class HealthcodeController {
    @Autowired
    HealthcodeService hcs;

    @RequestMapping("/selectAll")
    public RespBody selectAll() {
        return new RespBody(200, hcs.selectAll(), "查询成功");
    }

    @RequestMapping("/selectHealthcodeById")
    public RespBody selectHealthcodeById(int id) {

        return new RespBody(200, hcs.selectHealthcodeById(id), "查询成功");
    }

    @RequestMapping("/deleteHealthcodeById")
    public RespBody deleteHealthcodeById(int id) {
        return new RespBody(200, hcs.deleteHealthcodeById(id), "删除成功");

    }

    @RequestMapping("/updateHealthcode")
    public RespBody updateHealthcode(@RequestBody Healthcode hc) {

        return new RespBody(200, hcs.updateHealthcode(hc), "更新成功");

    }

    @RequestMapping("/insertHealthcode")
    public RespBody insertHealthcode(@RequestBody Healthcode hc) {

        return new RespBody(200, hcs.insertHealthcode(hc), "创建成功");

    }
}
