package org.example.service.impl;

import org.example.mapper.QuestionnaireScoreMapper;
import org.example.pojo.Questionnairescore;
import org.example.pojo.Questions;
import org.example.service.QuestionnaireScoreService;
import org.example.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service("QuestionnairescoreService")
public class QuestionnaireScoreServiceimpl implements QuestionnaireScoreService {

    @Autowired
    QuestionnaireScoreMapper qnm;

    @Override
    public PageUtil selectAllC(int pageSize, int pageNo, int id) {
        ArrayList<Questionnairescore> users = qnm.selectAllC(pageSize, (pageNo - 1) * pageSize, id);
        int count = qnm.count(id);
        PageUtil pageUtil = new PageUtil();
        pageUtil.setTotal(count);
        pageUtil.setPages(users);
        return pageUtil;
    }

    @Override
    public Questionnairescore selectQuestionnairesocreByQuestionId(int id) {
        return qnm.selectQuestionnairesocreByQuestionId(id);
    }

    @Override
    public int deleteQuestionnairesocreByid(int id) {
        return qnm.deleteQuestionnairesocreByid(id);
    }

    @Override
    public int updateQuestionnairesocre(Questionnairescore c) {
        return qnm.updateQuestionnairesocre(c);
    }

    @Override
    public int insertQuestionnairesocre(Questionnairescore c) {
        return qnm.insertQuestionnairesocre(c);
    }

    @Override
    public ArrayList<Integer> selectQuestionnaireByStuid(String stuid) {
        return qnm.selectQuestionnaireByStuid(stuid);
    }

    @Override
    public ArrayList<Questions> selectQuestionSByStuid(int id) {
        return qnm.selectQuestionSByStuid(id);
    }

    @Override
    public int updateSocre(Questionnairescore c) {
        return qnm.updateSocre(c);
    }

    @Override
    public Questionnairescore selectQuestionnairesocreById(int id) {
        return qnm.selectQuestionnairesocreById(id);
    }
}