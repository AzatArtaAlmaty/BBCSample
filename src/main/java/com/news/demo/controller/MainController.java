package com.news.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/")
    @ResponseBody
    public String main() {
        return "Hello";
    }

    @GetMapping("/end")
    @ResponseBody
    public String finish() {
        return "Finish";
    }
}
