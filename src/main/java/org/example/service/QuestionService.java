package org.example.service;

import org.example.pojo.Questions;
import org.example.utils.PageUtil;

public interface QuestionService {

    PageUtil selectAllC(int pageSize, int pageNo);

    Questions selectQuestionsById(int id);

    int deleteQuestionsById(int id);

    int updateQuestions(Questions l);

    int insertQuestions( Questions l);


}