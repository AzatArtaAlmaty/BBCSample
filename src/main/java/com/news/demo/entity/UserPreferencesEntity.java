package com.news.demo.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.NotFound;

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

    @ManyToOne
    @JoinColumn(name="userId", nullable = false)
    private Users userId;

    @ManyToOne
    @JoinColumn(name="categoryId", nullable = false)
    private CategoryEntity categoryId;

    private Long relevance;
}
