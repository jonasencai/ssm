package org.example.service.impl;

import org.example.mapper.QuestionMapper;
import org.example.pojo.Questions;
import org.example.service.QuestionService;
import org.example.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service("QuestionService")
public class QuestionServiceimpl implements QuestionService {

    @Autowired
    QuestionMapper qm;

    @Override
    public PageUtil selectAllC(int pageSize, int pageNo) {
        ArrayList<Questions> users = qm.selectAllC(pageSize, (pageNo - 1) * pageSize);
        int count = qm.count();
        PageUtil pageUtil = new PageUtil();
        pageUtil.setTotal(count);
        pageUtil.setPages(users);
        return pageUtil;
    }

    @Override
    public Questions selectQuestionsById(int id) {
        return qm.selectQuestionsById(id);
    }

    @Override
    public int deleteQuestionsById(int id) {
        return qm.deleteQuestionsByid(id);
    }

    @Override
    public int updateQuestions(Questions q) {
        return qm.updateQuestions(q);
    }

    @Override
    public int insertQuestions(Questions q) {
        return qm.insertQuestions(q);
    }
}