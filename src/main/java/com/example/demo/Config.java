package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class Config {

    @Bean
    public Map<String, String> testMap() {
        Map<String, String> testMap = new HashMap<>();
        testMap.put("Hi","Hello");
        return testMap;
    }

    @Bean
    public Integer minAge() {
        return 5;
    }

    public String hello() {
        return "Hello";
    }
}
