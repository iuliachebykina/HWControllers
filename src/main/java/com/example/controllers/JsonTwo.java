package com.example.controllers;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Map;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class JsonTwo {
    Double price;
    Map<String, Object> info;

    public JsonTwo(Double price, Map<String, Object> info) {
        this.price =price;
        this.info = info;
    }
}
