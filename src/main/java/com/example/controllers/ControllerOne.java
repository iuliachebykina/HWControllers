package com.example.controllers;


import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
public class ControllerOne {

    @GetMapping("/test")
    public JsonOne test(@RequestHeader MultiValueMap<String, String> headers){
        Map<String, String> h = new HashMap<>();
        headers.forEach((key, value) -> h.put(key, value.stream().collect(Collectors.joining("|"))));
        return new JsonOne(h);
    }
}
