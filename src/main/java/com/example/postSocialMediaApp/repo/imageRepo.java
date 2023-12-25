package com.example.postSocialMediaApp.repo;

import com.example.postSocialMediaApp.model.imageModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository

public interface imageRepo extends JpaRepository<imageModel, UUID> {
}
