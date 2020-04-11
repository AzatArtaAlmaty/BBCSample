package com.news.demo.service;

import com.news.demo.dto.NewsDTO;
import com.news.demo.mapper.NewsMapper;
import com.news.demo.repo.NewsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class NewsService {
    @Autowired
    private NewsRepo newsRepo;

    public UUID create(NewsDTO dto) {
        return newsRepo.save(NewsMapper.DtoToEntity(dto)).getNewsId();
    }
}
