package com.news.demo.RestController;

import com.news.demo.dto.NewsDto;
import com.news.demo.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/news")
public class NewsRestCont {
    @Autowired
    private NewsService newsService;

    @PostMapping("/create")
    public UUID create(@RequestBody NewsDto dto){
        return newsService.create(dto);
    }
}
