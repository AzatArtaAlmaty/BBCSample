package com.news.demo.mapper;

import com.news.demo.dto.NewsDto;
import com.news.demo.entity.NewsEntity;

import java.util.ArrayList;
import java.util.List;

public class NewsMapper {
    public static NewsEntity DtoToEntity(NewsDto dto) {
        NewsEntity ent = new NewsEntity();
        ent.setHeader(dto.getHeader());
        ent.setReference(dto.getReference());
        ent.setText(dto.getText());
        ent.setViews(dto.getViews());
        return ent;
    }

    public List<NewsEntity> ListDtoToEntity(List<NewsDto> dtos) {
        List<NewsEntity> ents = new ArrayList<>();
        dtos.forEach(dto -> {
            ents.add(DtoToEntity(dto));
        });
        return ents;
    }
}
