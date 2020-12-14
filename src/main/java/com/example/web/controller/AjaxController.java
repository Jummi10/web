package com.example.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {
    @GetMapping("/ajax/get")
    @ResponseBody
    public ResponseEntity<String> sampleGet() {
        // {
        //   "message" : "hi?"
        // }
        return ResponseEntity.ok("{\"message\" : \"hi?\"}");
    }

    @GetMapping("/ajax/practice")
    public String getPracticePage() {
        return "/ajax/ajax-practice";
    }
}
