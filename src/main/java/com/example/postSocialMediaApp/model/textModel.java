package com.example.postSocialMediaApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class textModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID textId ;
    String textName;
    String textContent ;
}
