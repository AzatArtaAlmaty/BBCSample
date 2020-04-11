package com.news.demo.entity;


import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Table(name = "category")
public class CategoryEntity {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private UUID categoryId;
    @Column(length = 200, nullable = false)
    private String name;
    private UUID parentCategoryId;
    private Boolean relevance;
    @Column(length = 10000)
    private String description;
}
