package org.example.controller;

import org.example.pojo.Healthstatus;
import org.example.pojo.Questionnairescore;
import org.example.pojo.Questions;
import org.example.pojo.options;
import org.example.response.RespBody;
import org.example.service.HealthStatusService;
import org.example.service.QuestionnaireScoreService;
import org.example.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import static java.lang.String.valueOf;

@RestController
@ResponseBody
@RequestMapping("/QuestionnaireScore")
public class QuestionnaireScoreController {

    @Autowired
    QuestionnaireScoreService qnss;

    @Autowired
    HealthStatusService hss;

    @RequestMapping("/selectAll")
    public RespBody selectAll(@RequestBody Questionnairescore pageForm) {

        PageUtil pg = new PageUtil();
        pg.setPageNo(pageForm.getPageNo());
        pg.setPageSize(pageForm.getPageSize());
        pg = qnss.selectAllC(pageForm.getPageSize(), pageForm.getPageNo(), pageForm.getQuestionnaireid());
        return new RespBody(200, pg, "查询成功");
    }

    @RequestMapping("/selectQuestionnairesocreByQuestionId")
    public RespBody selectQuestionnairesocreByQuestionId(int id) {
        Questionnairescore uf;
        uf = qnss.selectQuestionnairesocreByQuestionId(id);
        return new RespBody(200, uf, "查询成功");
    }

    @RequestMapping("/insertQuestionnairesocre")
    public RespBody insertQuestionnairesocre(@RequestBody Questionnairescore sportForm) {
        ArrayList<Integer> b = new ArrayList<>();
        sportForm.setDate(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        for (int i = 0; i < sportForm.getStuidList().size(); i++) {
            sportForm.setStuid(sportForm.getStuidList().get(i));
            int a = qnss.insertQuestionnairesocre(sportForm);
            Questionnairescore qns = qnss.selectQuestionnairesocreById(sportForm.getId());
            Healthstatus hs = new Healthstatus();
            hs.setStuid(qns.getStuid());
            hs.setQuestionscoreid(qns.getId());
            hs.setDate(qns.getDate());
            hss.insertHealthStatus(hs);
            b.add(a);
        }
        if (b.size() == sportForm.getStuidList().size()) {
            return new RespBody(200, null, "创建成功");
        }
        return new RespBody(400, null, "添加失败");
    }

    @RequestMapping("/deleteQuestionnairesocreByid")
    public RespBody deleteQuestionnairesocreByid(int id) {
        int a = 0;
        a = qnss.deleteQuestionnairesocreByid(id);
        if (0 < a) {
            return new RespBody(200, null, "删除成功");
        }
        return new RespBody(400, null, "删除失败");
    }

    @RequestMapping("/updateQuestionnairesocre")
    public RespBody updateQuestionnairesocre(@RequestBody Questionnairescore sportForm) {
        int a = qnss.updateQuestionnairesocre(sportForm);
        if (0 < a) {
            return new RespBody(200, null, "更新成功");
        }
        return new RespBody(400, null, "更新失败");
    }

    @RequestMapping("/selectQuestionnaireByStuid")
    public RespBody selectQuestionnaireByStuid(String stuid) {
        ArrayList<Integer> List = qnss.selectQuestionnaireByStuid(stuid);
        return new RespBody(200, List, "查询成功");
    }

    @RequestMapping("/selectQuestionSByStuid")
    public RespBody selectQuestionSByStuid(int id) {
        ArrayList<Questions> List = qnss.selectQuestionSByStuid(id);

        return new RespBody(200, List, "查询成功");
    }

    @RequestMapping("/updateQuestionnaireScoreforScore")
    public RespBody updateQuestionnaireScoreforScore(@RequestBody options submitQuestionForm) {
        int score = 0;

        for (int i = 0; i < submitQuestionForm.getOptlist().size(); i++) {
            if (1 == submitQuestionForm.getOptlist().get(i)) {
                score += 6;
            } else if (2 == submitQuestionForm.getOptlist().get(i)) {
                score += 0;
            } else if (3 == submitQuestionForm.getOptlist().get(i)) {
                score += 3;
            }
        }

        Questionnairescore q = new Questionnairescore();
        q.setQuestionnaireid(submitQuestionForm.getQuestionnaireid());
        q.setScore(score);
        q.setStuid(valueOf(submitQuestionForm.getStuid()));
        int b = qnss.updateSocre(q);
        if (b > 0) {
            return new RespBody(200, null, "修改成功");
        }
        return new RespBody(200, null, "修改失败");
    }
}