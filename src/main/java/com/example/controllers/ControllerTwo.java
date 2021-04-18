package com.example.controllers;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class ControllerTwo {

    @PostMapping(value = "/post")
    public JsonTwo test2(@RequestBody JsonTwo request){
        Double price = request.getPrice();
        Map<String, Object> info=  request.getInfo();
        info.put("id", 123);
        return new JsonTwo(price, info);
    }

}
