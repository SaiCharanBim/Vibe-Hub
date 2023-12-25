package com.example.postSocialMediaApp.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Entity
public class imageModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID imageId;
    String imageName ;
    @Lob
    byte[] imageContent;

}
