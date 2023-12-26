package org.example.service;

import org.example.pojo.Comment;
import org.example.pojo.Huser;
import org.example.pojo.Questionnaire;
import org.example.pojo.Questions;
import org.example.utils.PageUtil;

import java.util.ArrayList;

public interface QuestionnaireService {
    ArrayList<Integer> selectAll();
    ArrayList<Questions> selectQuestionnaireById(int id);
    ArrayList<Integer> selectQuestionnaireListById(int id);
    ArrayList<Questions> selectQListById(int id);
    int deleteQuestionnaireByid( int id);
    int insertQuestionnaire(Questionnaire c);
    ArrayList<Integer> count();
    ArrayList<Huser> selectAllHuserByRole();

}