package org.example.mapper;

import org.apache.ibatis.annotations.Param;
import org.example.pojo.Comment;
import org.example.pojo.Questions;

import java.util.ArrayList;

public interface QuestionMapper {
    ArrayList<Questions> selectAllC(@Param("pageSize") int pageSize, @Param("pageNo") int pageNo);
    int count();
    Questions selectQuestionsById(@Param("id") int id);
    int deleteQuestionsByid(@Param("id") int id);
    int updateQuestions(@Param("Questions") Questions c);
    int insertQuestions(@Param("Questions") Questions c);
}