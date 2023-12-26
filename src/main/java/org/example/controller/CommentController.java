package org.example.controller;

import org.example.pojo.Comment;
import org.example.response.RespBody;
import org.example.service.CommentService;
import org.example.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
@RequestMapping("/Comment")
public class CommentController {
    @Autowired
    CommentService cs;
    @RequestMapping("/selectAllC")
    public RespBody selectAllC(@RequestBody Comment pageForm){
        PageUtil pg = new PageUtil();
        pg.setPageNo(pageForm.getPageNo());
        pg.setPageSize(pageForm.getPageSize());
        pg= cs.selectAllC(pageForm.getPageSize(),pageForm.getPageNo() ,pageForm);
        return new RespBody(200,pg,"查询成功");
    }
    @RequestMapping("/selectCommentById")
    public RespBody selectCommentById(int id){
        Comment c1;
        c1= cs.selectCommentById(id);
        return new RespBody(200,c1,"查询成功");
    }
    @RequestMapping("/deleteComment")
    public RespBody deleteCommentById(int id){
        int a = 0;
        a= cs.deleteCommentById(id);
        if (0<a){
            return new RespBody(200,null,"删除成功");
        }
        return new RespBody(400,null,"删除失败");
    }
    @RequestMapping("/updateComment")
    public RespBody updateCommentById(@RequestBody Comment pageForm){
        int a= cs.updateComment(pageForm);
        if (0<a){
            return new RespBody(200,null,"更新成功");
        }
        return new RespBody(400,null,"更新失败");
    }
    @RequestMapping("/insertComment")
    public RespBody insertCommentById(@RequestBody Comment c){
        int a = cs.insertComment(c);
        if (0<a){
            return new RespBody(200,null,"创建成功");
        }
        return new RespBody(400,null,"添加失败");
    }
}
