package com.news.demo.RestController;

import com.news.demo.dto.NewsDTO;
import com.news.demo.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/news")
public class NewsRestCont {
    @Autowired
    private NewsService newsService;

    @PostMapping("/create")
    public UUID create(@RequestBody NewsDTO dto) {
        return newsService.create(dto);
    }

    @GetMapping("/delete")
    public Boolean create(@RequestParam UUID newsId) {
        try {
            newsService.delete(newsId);
            return true;
        } catch (Exception err) {
            return false;
        }
    }

    @PostMapping("/update")
    public UUID update(@RequestParam NewsDTO dto) throws Exception {
        return newsService.update(dto);
    }

    @GetMapping("/getOne")
    public NewsDTO getOne(@RequestParam UUID newsId) throws Exception {
        return newsService.getOne(newsId);
    }

    @GetMapping("/getAll")
    public List<NewsDTO> getAll() throws Exception {
        return newsService.getAll();
    }

    @GetMapping("/getAll")
    public List<NewsDTO> getAll(@RequestParam Integer count, @RequestParam Integer pageNumber) throws Exception {
        return newsService.getAll().subList(count*pageNumber, (count+1)*pageNumber);
    }
}
