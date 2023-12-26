package org.example.service;

import org.example.pojo.Questionnairescore;
import org.example.pojo.Questions;
import org.example.utils.PageUtil;

import java.util.ArrayList;

public interface QuestionnaireScoreService {
    PageUtil selectAllC(int pageSize, int pageNo, int id);

    Questionnairescore selectQuestionnairesocreByQuestionId(int id);

    int deleteQuestionnairesocreByid(int id);

    int updateQuestionnairesocre(Questionnairescore l);

    int insertQuestionnairesocre( Questionnairescore l);

    ArrayList<Integer> selectQuestionnaireByStuid(String stuid);

    ArrayList<Questions> selectQuestionSByStuid( int id);

    int updateSocre(Questionnairescore c);


    Questionnairescore selectQuestionnairesocreById(int id);





}