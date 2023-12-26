package org.example.controller;

import org.example.pojo.Ill;
import org.example.response.RespBody;
import org.example.service.IllService;
import org.example.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@RestController
@ResponseBody
@RequestMapping("/img2")
public class FileController {

    @Autowired
    IllService ls;

    @PostMapping("/upload")
    public RespBody UpLoad(HttpServletRequest request, @RequestParam("file")MultipartFile file){
        String originalFilename = file.getOriginalFilename();
        File destFile = new File("F:\\PEXAMINIMG\\"+ originalFilename );
        try {
            if(!destFile.exists()){
                destFile.mkdir();
            }
            file.transferTo(destFile);
        } catch (IOException e) {
            e.printStackTrace();
            return new RespBody<>(200,null,"上传失败");

        }
        return new RespBody<>(200,destFile.getAbsolutePath(),"上传成功");
    }


    @RequestMapping("/selectAll")
    public RespBody selectAll(@RequestBody Ill pageForm){

        PageUtil pg = new PageUtil();
        pg.setPageNo(pageForm.getPageNo());
        pg.setPageSize(pageForm.getPageSize());
        pg= ls.selectAllC(pageForm.getPageSize(),pageForm.getPageNo() ,pageForm.getStuid());
        return new RespBody(200,pg,"查询成功");
    }

    @RequestMapping("/selectIllById")
    public RespBody selectIllById(int id){
        Ill uf;
        uf=ls.selectIllById(id);
        return new RespBody(200,uf,"查询成功");
    }

    @RequestMapping("/insertIll")
    public RespBody insertIll(@RequestBody Ill illForm){

        int a = ls.insertIll(illForm);
        if (0<a){
            return new RespBody(200,null,"创建成功");
        }
        return new RespBody(400,null,"添加失败");
    }
    @RequestMapping("/deleteIll")
    public RespBody deleteIll(int id){
        int a = 0;
        a= ls.deleteIllById(id);
        if (0<a){
            return new RespBody(200,null,"删除成功");
        }
        return new RespBody(400,null,"删除失败");
    }

    @RequestMapping("/updateIll")
    public RespBody updateIll(@RequestBody Ill IllForm){
        int a= ls.updateIll(IllForm);
        if (0<a){
            return new RespBody(200,null,"更新成功");
        }
        return new RespBody(400,null,"更新失败");
    }
}