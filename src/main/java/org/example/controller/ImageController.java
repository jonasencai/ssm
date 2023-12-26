package org.example.controller;

import org.example.response.RespBody;
import org.example.service.ImageService;
import org.example.utils.ImageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@ResponseBody
@RequestMapping("/img")
public class ImageController {
    @Autowired
    ImageService imageService;
    
    @RequestMapping("/upload")
    public RespBody UpLoad(HttpServletRequest request, @RequestParam("file")MultipartFile[] files){
     String path=request.getRealPath("/upload") + "/";

     String fileName= ImageUtil.uploadImg(path,files);
     if (StringUtils.isEmpty(fileName)){
        return new RespBody(200,fileName,"");
     }
        return new RespBody(200,fileName,"");
    }
}
