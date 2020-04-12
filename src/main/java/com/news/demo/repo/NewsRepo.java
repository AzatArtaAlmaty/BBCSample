package com.news.demo.repo;

import com.news.demo.entity.NewsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Optional;

@Repository
public interface NewsRepo extends JpaRepository<NewsEntity, Serializable> {
}



