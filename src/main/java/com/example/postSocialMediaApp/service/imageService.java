package com.example.postSocialMediaApp.service;

import com.example.postSocialMediaApp.model.imageModel;
import com.example.postSocialMediaApp.repo.imageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class imageService {
    @Autowired
    imageRepo imagerepo;
    public String  addImage(String name , MultipartFile file ) {
       try {
           imageModel model = new imageModel();
           byte[] arr = file.getBytes();
           model.setImageName(name);
           model.setImageContent(arr);
           imagerepo.save(model);
           return " Image is added ";
       }catch (IOException ignored){
           ignored.printStackTrace();
           return "Image is not Added";
       }

    }
    public List<imageModel> getAll(){
        return imagerepo.findAll();
    }
}
