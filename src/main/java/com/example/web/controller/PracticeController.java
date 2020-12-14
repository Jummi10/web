package com.example.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.web.application.response.NameResponse;

@RestController
public class PracticeController {
    @GetMapping("/practice/name")
    public ResponseEntity<NameResponse> getName() {
        return ResponseEntity.ok(new NameResponse("김경준"));
    }
}
