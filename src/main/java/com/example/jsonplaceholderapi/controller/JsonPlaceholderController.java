package com.example.jsonplaceholderapi.controller;

import com.example.jsonplaceholderapi.model.DataNeeded;
import com.example.jsonplaceholderapi.service.JsonPlaceholderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("data/todo")
public class JsonPlaceholderController {

    private final JsonPlaceholderService jsonPlaceholderService;

    public JsonPlaceholderController(JsonPlaceholderService jsonPlaceholderService) {
        this.jsonPlaceholderService = jsonPlaceholderService;
    }

    @GetMapping
    public List<DataNeeded> getDataTroughApi(){
        return jsonPlaceholderService.getDataNeeded();
    }

}
