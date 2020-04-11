package com.news.demo.mapper;

import com.news.demo.dto.CategoryDTO;
import com.news.demo.dto.NewsDTO;
import com.news.demo.entity.CategoryEntity;
import com.news.demo.entity.NewsEntity;

import java.util.ArrayList;
import java.util.List;

public class CategoryMapper {

    public static CategoryEntity DtoToEntity(CategoryDTO dto) {
        CategoryEntity ent = new CategoryEntity();
        ent.setDescription(dto.getDescription());
        ent.setName(dto.getName());
        ent.setParentCategoryId(dto.getParentCategoryId());
        ent.setRelevance(dto.getRelevance());
        return ent;
    }

    public List<CategoryEntity> ListDtoToEntity(List<CategoryDTO> dtos) {
        List<CategoryEntity> ents = new ArrayList<>();
        dtos.forEach(dto -> ents.add(DtoToEntity(dto)));
        return ents;
    }
}
