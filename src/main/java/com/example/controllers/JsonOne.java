package com.example.controllers;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Map;

@Data
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class JsonOne {
    Map<String, String> headers;
}
