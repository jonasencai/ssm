package org.example.service.impl;

import org.example.mapper.QuestionMapper;
import org.example.mapper.QuestionnaireMapper;
import org.example.pojo.Huser;
import org.example.pojo.Questionnaire;
import org.example.pojo.Questions;
import org.example.service.QuestionnaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service("QuestionnaireService")
public class QuestionnaireServiceimpl implements QuestionnaireService {

    @Autowired
    QuestionnaireMapper qnm;

    @Autowired
    QuestionMapper qm;

    @Override
    public ArrayList<Integer> selectAll() {
        ArrayList<Integer> list = qnm.selectAll();
        return list;
    }

    @Override
    public ArrayList<Questions> selectQuestionnaireById(int id) {
        ArrayList<Integer> list = qnm.selectQuestionnaireById(id);
        ArrayList<Questions> qlist = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Questions q = new Questions();
            q=qm.selectQuestionsById(list.get(i));
            qlist.add(q);
        }
        return qlist;
    }

    @Override
    public ArrayList<Integer> selectQuestionnaireListById(int id) {

        return  qnm.selectQuestionnaireById(id);
    }

    @Override
    public ArrayList<Questions> selectQListById(int id) {
        return qnm.selectQListById(id);
    }

    @Override
    public int deleteQuestionnaireByid(int id) {
        return qnm.deleteQuestionnaireByid(id);
    }

    @Override
    public int insertQuestionnaire(Questionnaire c) {
        return qnm.insertQuestionnaire(c);
    }

    @Override
    public ArrayList<Integer> count() {
        return qnm.count();
    }

    @Override
    public ArrayList<Huser> selectAllHuserByRole() {
        return qnm.selectAllHuserByRole();
    }
}