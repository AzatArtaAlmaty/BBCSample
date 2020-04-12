package com.news.demo.mapper;

import com.news.demo.dto.NewsDTO;
import com.news.demo.entity.NewsEntity;

import java.util.ArrayList;
import java.util.List;

public class NewsMapper {
    public static NewsEntity DtoToEntity(NewsDTO dto) {
        NewsEntity ent = new NewsEntity();
        ent.setHeader(dto.getHeader());
        ent.setReference(dto.getReference());
        ent.setText(dto.getText());
        ent.setViews(dto.getViews());
        ent.setDateCreated(dto.getDateCreated());
        ent.setDateModified(dto.getDateModified());
        ent.setIsViewed(dto.getIsViewed());
        ent.setRelevance(dto.getRelevance());
        return ent;
    }

    public static List<NewsEntity> ListDtoToEntity(List<NewsDTO> dtos) {
        List<NewsEntity> ents = new ArrayList<>();
        dtos.forEach(dto -> ents.add(DtoToEntity(dto)));
        return ents;
    }

    public static NewsDTO EntityToDto(NewsEntity ent) {
        NewsDTO dto = new NewsDTO();
        dto.setHeader(ent.getHeader());
        dto.setReference(ent.getReference());
        dto.setText(ent.getText());
        dto.setViews(ent.getViews());
        dto.setDateCreated(ent.getDateCreated());
        dto.setDateModified(ent.getDateModified());
        dto.setIsViewed(ent.getIsViewed());
        dto.setRelevance(ent.getRelevance());
        dto.setId(ent.getNewsId());
        return dto;
    }

    public static List<NewsDTO> ListEntityToDto(List<NewsEntity> ents) {
        List<NewsDTO> dtos = new ArrayList<>();
        ents.forEach(ent -> dtos.add(EntityToDto(ent)));
        return dtos;
    }
}
