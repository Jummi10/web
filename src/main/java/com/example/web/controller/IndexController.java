package com.example.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping(value = "/index")
    public String getIndex() {
        return "index";
    }

    @RequestMapping(value = "/next-page")
    public String getNextPage() {
        return "next-page";
    }

    @RequestMapping(value = "/form")
    public String getFormPage() {
        return "form";
    }

    @GetMapping("/ajax")
    public String getAjaxPage() {
        return "/ajax/index";
    }
}
