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
public class videoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID videoId;
    String videoName;
    @Lob
    byte [] videoContent ;
}
