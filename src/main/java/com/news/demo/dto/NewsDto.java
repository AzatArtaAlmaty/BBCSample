package com.news.demo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class NewsDto {
    private UUID id;
    private String header;
    private String text;
    private String reference;
    private Integer views;
}
