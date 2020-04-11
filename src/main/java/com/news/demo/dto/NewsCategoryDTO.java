package com.news.demo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.news.demo.entity.CategoryEntity;
import com.news.demo.entity.NewsEntity;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class NewsCategoryDTO {

    private UUID newsCategoryId;
    private List<NewsEntity> news;
    private List<CategoryEntity> category;
}
