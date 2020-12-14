package com.example.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

// TODO: 2020/12/14 return 바꾸기
@Controller
public class FormController {
    @RequestMapping(value = "/form/get", method = RequestMethod.GET)
    public String handleGet(@RequestParam String name) {
        System.out.println(name);
        return "form";
    }

    // TODO: 2020/12/14 @RequestBody
    @RequestMapping(value = "/form/post", method = RequestMethod.POST)
    public String handlePost(FormRequest formRequest) {
        System.out.println(formRequest.getAge());
        System.out.println(formRequest.getEmail());
        return "form";
    }

    @GetMapping("/form-practice")
    public String getPractice() {
        return "form-practice";
    }
}
