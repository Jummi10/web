package com.example.web.controller;

public class FormRequest {
    private final int age;
    private final String email;

    public FormRequest(int age, String email) {
        this.age = age;
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
}
