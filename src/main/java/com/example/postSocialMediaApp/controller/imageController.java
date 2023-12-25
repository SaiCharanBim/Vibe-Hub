package com.example.postSocialMediaApp.controller;

import com.example.postSocialMediaApp.model.imageModel;
import com.example.postSocialMediaApp.service.imageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/api/post")
public class imageController {
    @Autowired
    imageService imageservice;
    @PostMapping("/save")
    public String addImage(@RequestParam("imageName")String name , @RequestParam("file")MultipartFile file ){
        return imageservice.addImage(name , file );
    }
    @GetMapping("/allImages")
    public List<imageModel>getAll(){
        return imageservice.getAll();
    }

}
