package com.news.demo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.news.demo.entity.CategoryEntity;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class UserPreferencesDTO {

    private UUID userPreferenceId;
    //private List<UsersEntity> news;
    private List<CategoryEntity> category;
    private Long relevance;
}
