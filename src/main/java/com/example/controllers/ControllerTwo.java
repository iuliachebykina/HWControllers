package com.example.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ControllerTwo {

    @GetMapping(value = "/json/{price}/{date}")
    public JsonTwo test(@PathVariable Double price, @PathVariable String date){
        int id = 123;
        return new JsonTwo(price, Map.of("id", id, "date", date));
    }
}
