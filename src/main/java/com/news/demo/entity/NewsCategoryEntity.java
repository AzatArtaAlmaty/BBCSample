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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "newsId")
    private NewsEntity news;

    @JoinColumn(name = "categoryId")
    @ManyToOne(fetch = FetchType.LAZY)
    private CategoryEntity category;
}
