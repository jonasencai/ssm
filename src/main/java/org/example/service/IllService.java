package org.example.service;

import org.example.pojo.Ill;
import org.example.pojo.Ill;
import org.example.utils.PageUtil;

public interface IllService {
    PageUtil selectAllC(int pageSize, int pageNo, String stuid);

    Ill selectIllById(int id);

    int deleteIllById(int id);

    int updateIll(Ill l);

    int insertIll( Ill l);


}