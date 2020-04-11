package com.news.demo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class CategoryDTO {

    private UUID categoryId;
    private String name;
    private UUID parentCategoryId;
    private Boolean relevance;
    private String description;
}
