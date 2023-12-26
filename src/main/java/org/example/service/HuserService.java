package org.example.service;

import org.example.pojo.Huser;
import org.example.utils.PageUtil;

public interface HuserService {
    PageUtil findAll(int pageSize, int pageNo, Huser u);

    Huser selectHuserById(int id);

    int deleteHuserByid(int id);

    int updateHuser(Huser h);

    int insertHuser(Huser h);
    int changePassword(Huser h);
}