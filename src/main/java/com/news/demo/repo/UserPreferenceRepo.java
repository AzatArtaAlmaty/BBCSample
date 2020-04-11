package com.news.demo.repo;

import com.news.demo.entity.UserPreferencesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface UserPreferenceRepo extends JpaRepository<UserPreferencesEntity, Serializable> {
}
