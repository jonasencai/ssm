package org.example.mapper;

import org.apache.ibatis.annotations.Param;
import org.example.pojo.Comment;

import java.util.ArrayList;

public interface CommentMapper {
    ArrayList<Comment> selectAllC(@Param("pageSize") int pageSize, @Param("pageNo") int pageNo, @Param("comment") Comment comment);
    int count(@Param("comment") Comment comment);
    Comment selectCommentById(@Param("id") int id);
    int deleteCommentById(@Param("id") int id);
    int updateComment(@Param("Comment") Comment comment);
    int insertComment(@Param("Comment") Comment c);
}