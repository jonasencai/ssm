package org.example.service.impl;

import org.example.mapper.CommentMapper;
import org.example.pojo.Comment;
import org.example.service.CommentService;
import org.example.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@Service("CommentService")
public class CommentServiceimpl implements CommentService {

    @Autowired
    CommentMapper cm;

    @Override
    public PageUtil selectAllC(int pageSize, int pageNo, Comment comment) {
        ArrayList<Comment> users = cm.selectAllC(pageSize, (pageNo - 1) * pageSize, comment);
        int count = cm.count(comment);
        PageUtil pageUtil = new PageUtil();
        pageUtil.setTotal(count);
        pageUtil.setPages(users);
        return pageUtil;
    }

    @Override
    public Comment selectCommentById(int id) {
        return cm.selectCommentById(id);
    }

    @Override
    public int deleteCommentById(int id) {
        return cm.deleteCommentById(id);
    }

    @Override
    public int updateComment(Comment comment) {
        return cm.updateComment(comment);
    }

    @Override
    public int insertComment(Comment c) {
        c.setDate(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        return cm.insertComment(c);
    }
}