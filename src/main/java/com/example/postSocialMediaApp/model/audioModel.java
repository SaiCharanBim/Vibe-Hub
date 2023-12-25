package com.example.postSocialMediaApp.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class audioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID audioId;
    String audioName ;
    @Lob
    byte[] audioContent;
}
