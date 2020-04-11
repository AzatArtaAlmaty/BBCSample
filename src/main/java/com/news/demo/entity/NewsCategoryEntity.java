package com.news.demo.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "newsCategory")
public class NewsCategoryEntity {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private UUID newsCategoryId;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "newsId")
    private List<NewsEntity> news;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "categoryId")
    private List<CategoryEntity> category;
}
