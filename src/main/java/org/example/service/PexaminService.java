package org.example.service;

import org.example.pojo.Ill;
import org.example.pojo.Pexamination;
import org.example.utils.PageUtil;

public interface PexaminService {
    PageUtil selectAllC(int pageSize, int pageNo, String stuid);

    Pexamination selectPexaminationById(int id);

    int deletePexaminationById(int id);

    int updatePexamination(Pexamination l);

    int insertPexamination( Pexamination l);


}