package com.news.demo.service;

import com.news.demo.dto.NewsDTO;
import com.news.demo.entity.NewsEntity;
import com.news.demo.mapper.NewsMapper;
import com.news.demo.repo.NewsRepo;
import org.apache.tomcat.jni.Error;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class NewsService {
    @Autowired
    private NewsRepo newsRepo;

    public UUID create(NewsDTO dto) {
        dto.setDateCreated(new Date());
        dto.setDateModified(new Date());
        dto.setIsViewed(false);
        dto.setRelevance((long) 100);
        dto.setViews(0);
        return newsRepo.save(NewsMapper.DtoToEntity(dto)).getNewsId();
    }

    public void delete(UUID newsId) {
        if(newsRepo.findById(newsId).isPresent())
        newsRepo.delete(newsRepo.findById(newsId).get());
    }

    public UUID update(NewsDTO dto) throws Exception {
        try {
            NewsEntity news = newsRepo.findById(dto.getId()).get();
            news.setDateModified(new Date());
            if (!dto.getHeader().isEmpty()) {
                news.setHeader(dto.getHeader());
            }
            if (!dto.getReference().isEmpty()) {
                news.setReference(dto.getReference());
            }
            if (!dto.getText().isEmpty()) {
                news.setText(dto.getText());
            }
            news.setRelevance((long) 100);
            return newsRepo.save(news).getNewsId();
        } catch (Exception err) {
            throw new Exception("no such news");
        }
    }

    public NewsDTO getOne(UUID newsId) throws Exception {
        try {
            if(newsRepo.findById(newsId).isPresent());
            return NewsMapper.EntityToDto(newsRepo.findById(newsId).get());
        } catch (Exception err) {
            throw new Exception("no such news");
        }
    }

    public List<NewsDTO> getAll() throws Exception {
        try {
            return NewsMapper.ListEntityToDto(newsRepo.findAll(Sort.by("relevance", "views").descending()));
        } catch (Exception err) {
            throw new Exception("impossible error");
        }
    }


}
