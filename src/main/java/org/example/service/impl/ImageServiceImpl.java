package org.example.service.impl;

import org.example.response.RespBody;
import org.example.service.ImageService;
import org.example.utils.FileUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ImageServiceImpl implements ImageService {
    @Override
    public List<String> getImageList(String path) {
        List<String> list = new ArrayList<>();
        File file=new File(path);
        if (file.exists()){
        String[] filename =file.list();
        for (int i=0;i<filename.length;i++){
            list.add(filename[i]);
            }
        }
        return list;
    }

    @Override
    public RespBody deleteImage(String ImgPath) {
        return new RespBody(FileUtil.deleteFile(ImgPath));
    }
}
