package org.example.controller;

import org.example.pojo.Huser;
import org.example.pojo.Questionnaire;
import org.example.pojo.Questions;
import org.example.pojo.dto.QuestionnaireFront;
import org.example.response.RespBody;
import org.example.service.QuestionnaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@ResponseBody
@RequestMapping("/Questionnaire")
public class QuestionnaireController {

    @Autowired
    QuestionnaireService qns;

    // 前端获取问卷套数
    @RequestMapping("/selectAll")
    public RespBody selectAll() {
        ArrayList<Integer> QlistNo = qns.selectAll();
        return new RespBody(200, QlistNo, "查询成功");
    }

    // 前端获取问卷套数
    @RequestMapping("/selectAllHuserByRole")
    public RespBody selectAllHuserByRole() {
        ArrayList<Huser> QlistNo = qns.selectAllHuserByRole();
        return new RespBody(200, QlistNo, "查询成功");
    }

    // 修改调查问卷和开始调查问卷
    @RequestMapping("/selectQuestionnaireById")
    public RespBody selectQuestionnaireById(int id) {
        ArrayList<Questions> Qlist = qns.selectQuestionnaireById(id);
        return new RespBody(200, Qlist, "查询成功");
    }

    // 修改调查问卷
    @RequestMapping("/selectQuestionnaireListById")
    public RespBody selectQuestionnaireListById(int id) {
        ArrayList<Integer> Qlist = qns.selectQuestionnaireListById(id);
        return new RespBody(200, Qlist, "查询成功");
    }

    // 新增调查问卷
    @RequestMapping("/insertQuestionnaire")
    public RespBody insertQuestionnaire(@RequestBody QuestionnaireFront qnf) {

        ArrayList<Integer> a = new ArrayList<>();
        Questionnaire q = new Questionnaire();
        if ( 0 == qns.count().size()) {
            q.setId(1);
        } else {
            q.setId(qns.count().get(0) + 1);
        }


        for (int i = 0; i < qnf.getQnList().size(); i++) {
            q.setQuestionNo(qnf.getQnList().get(i));
            int b = qns.insertQuestionnaire(q);
            if (b > 0) {
                a.add(b);
            }
        }
        if (a.size() == qnf.getQnList().size()) {
            return new RespBody(200, null, "创建成功");
        }
        return new RespBody(400, null, "添加失败");
    }


    // 查询考卷题目
    @RequestMapping("/selectQListById")
    public RespBody selectQListById(int id) {
        ArrayList<Questions> questions = qns.selectQListById(id);
        if (questions.size() == 10) {
            return new RespBody(200, questions, "获取成功");
        }
        return new RespBody(400, null, "获取失败");
    }

    // 删除调查问卷
    @RequestMapping("/deleteQuestionnaireByid")
    public RespBody deleteQuestionnaireByid(int id) {
        int a = 0;
        a = qns.deleteQuestionnaireByid(id);
        if (0 < a) {
            return new RespBody(200, null, "删除成功");
        }
        return new RespBody(400, null, "删除失败");
    }

    // 修改调查问卷
    @RequestMapping("/updateQuestionnaire")
    public RespBody updateQuestionnaire(@RequestBody QuestionnaireFront qnf) {
        qns.deleteQuestionnaireByid(qnf.getId());
        ArrayList<Integer> a = new ArrayList<>();
        Questionnaire q = new Questionnaire();
        q.setId(qnf.getId());
        for (int i = 0; i < qnf.getQnList().size(); i++) {
            q.setQuestionNo(qnf.getQnList().get(i));
            int b = qns.insertQuestionnaire(q);
            if (b > 0) {
                a.add(b);
            }
        }
        if (a.size() == qnf.getQnList().size()) {
            return new RespBody(200, null, "创建成功");
        }
        return new RespBody(400, null, "添加失败");
    }
}