package com.shubhzgang.todos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

    public TodoController() {
        // empty for now
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
