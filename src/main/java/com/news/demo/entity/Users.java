package com.news.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Data
public class Users {
    @Id
    private String userId;
    private String name;
    private String picture;
    private String email;
    private String locale;
    private LocalDateTime lastVisit;

}
