package org.example.mapper;

import org.apache.ibatis.annotations.Param;
import org.example.pojo.Questionnairescore;
import org.example.pojo.Questions;

import java.util.ArrayList;

public interface QuestionnaireScoreMapper {
    ArrayList<Questionnairescore> selectAllC(@Param("pageSize") int pageSize, @Param("pageNo") int pageNo, @Param("q") int questionniareid);
    int count(@Param("q") int questionniareid);
    Questionnairescore selectQuestionnairesocreByQuestionId(@Param("id") int id);
    int deleteQuestionnairesocreByid(@Param("id") int id);
    int updateQuestionnairesocre(@Param("qns") Questionnairescore c);
    int insertQuestionnairesocre(@Param("qns") Questionnairescore c);
    /**
     * 根据stuid查询未开始填写的调查问卷
     */
    ArrayList<Integer> selectQuestionnaireByStuid(@Param("stuid") String stuid);

    /**
     * 根据问卷套号查询需要填写的调查问卷
     */
    ArrayList<Questions> selectQuestionSByStuid(@Param("id") int id);

    /**
     * 更新分数
     * @param c
     * @return
     */
    int updateSocre(@Param("qns") Questionnairescore c);

    Questionnairescore selectQuestionnairesocreById(@Param("id") int id);

}