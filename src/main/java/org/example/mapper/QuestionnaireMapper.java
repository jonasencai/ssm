package org.example.mapper;

import org.apache.ibatis.annotations.Param;
import org.example.pojo.Huser;
import org.example.pojo.Questionnaire;
import org.example.pojo.Questions;

import java.util.ArrayList;

public interface QuestionnaireMapper {

    /**
     * 问卷套数
     *
     * @return
     */
    ArrayList<Integer> selectAll();

    /**
     * 填写调查问卷
     *
     * @param id
     * @return
     */
    ArrayList<Questions> selectQListById(@Param("id") int id);

    /**
     * 根据id查询题目
     *
     * @param id
     * @return
     */
    ArrayList<Integer> selectQuestionnaireById(@Param("id") int id);

    /**
     * 根据id删除问卷
     *
     * @param id
     * @return
     */
    int deleteQuestionnaireByid(@Param("id") int id);

    /**
     * 根据id修改问卷
     *
     * @param c
     * @return
     */
    int updateQuestionnaire(@Param("q") Questionnaire c);

    /**
     * 根据题目插入问卷
     *
     * @param c
     * @return
     */
    int insertQuestionnaire(@Param("q") Questionnaire c);

    /**
     * 查询问卷数量
     *
     * @return
     */
    ArrayList<Integer> count();

    /**
     * 查询所有学生，并选择问卷发送的对象
     * @return
     */
    ArrayList<Huser> selectAllHuserByRole();


}