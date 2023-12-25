package com.example.postSocialMediaApp.repo;
import com.example.postSocialMediaApp.model.audioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository

public interface audioRepo extends JpaRepository<audioModel,UUID>{
}
