package com.news.demo.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "userPreferences")
public class UserPreferencesEntity {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private UUID userPreferenceId;

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "userId")
//    private List<UsersEntity> news;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "categoryId")
    private List<CategoryEntity> category;

    private Long relevance;
}
