package com.example.controllers;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Map;

@Data
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class JsonTwo {
    Double price;
    Map<String, Object> info;
}
