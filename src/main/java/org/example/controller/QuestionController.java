package org.example.controller;

import org.example.pojo.Ill;
import org.example.pojo.Questions;
import org.example.response.RespBody;
import org.example.service.IllService;
import org.example.service.QuestionService;
import org.example.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
@RequestMapping("/Question")
public class QuestionController {

    @Autowired
    QuestionService qs;

    @RequestMapping("/selectAll")
    public RespBody selectAll(@RequestBody Questions pageForm){

        PageUtil pg = new PageUtil();
        pg.setPageNo(pageForm.getPageNo());
        pg.setPageSize(pageForm.getPageSize());
        pg= qs.selectAllC(pageForm.getPageSize(),pageForm.getPageNo());
        return new RespBody(200,pg,"查询成功");
    }

    @RequestMapping("/selectQuestionsById")
    public RespBody selectQuestionsById(int id){
        Questions uf;
        uf=qs.selectQuestionsById(id);
        return new RespBody(200,uf,"查询成功");
    }

    @RequestMapping("/insertQuestions")
    public RespBody insertQuestions(@RequestBody Questions questionsForm){

        int a = qs.insertQuestions(questionsForm);
        if (0<a){
            return new RespBody(200,null,"创建成功");
        }
        return new RespBody(400,null,"添加失败");
    }
    @RequestMapping("/deleteQuestions")
    public RespBody deleteQuestions(int id){
        int a = 0;
        a= qs.deleteQuestionsById(id);
        if (0<a){
            return new RespBody(200,null,"删除成功");
        }
        return new RespBody(400,null,"删除失败");
    }

    @RequestMapping("/updateQuestions")
    public RespBody updateQuestions(@RequestBody Questions questionsForm){
        int a= qs.updateQuestions(questionsForm);
        if (0<a){
            return new RespBody(200,null,"更新成功");
        }
        return new RespBody(400,null,"更新失败");
    }
}