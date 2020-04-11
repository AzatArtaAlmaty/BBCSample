package com.news.demo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import java.util.Date;
import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class NewsDTO {
    private UUID id;
    private String header;
    private String text;
    private String reference;
    private Integer views;
    private Date dateCreated;
    private Date dateModified;
    private Long relevance;
    private Boolean isViewed;
}
