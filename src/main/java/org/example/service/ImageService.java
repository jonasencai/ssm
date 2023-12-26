package org.example.service;

import org.example.response.RespBody;

import java.util.List;

public interface ImageService {
    List<String> getImageList(String path);

    RespBody deleteImage(String ImgPath);
}
