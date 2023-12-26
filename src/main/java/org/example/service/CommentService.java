package org.example.service;

import org.example.pojo.Comment;
import org.example.utils.PageUtil;

public interface CommentService {
    PageUtil selectAllC(int pageSize, int pageNo, Comment comment);

    Comment selectCommentById(int id);

    int deleteCommentById(int id);

    int updateComment(Comment comment);

    int insertComment( Comment l);


}