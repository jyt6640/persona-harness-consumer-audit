package com.example.shop;

import org.springframework.stereotype.Service;

@Service
public class TaskService {
    public String create(String name) {
        return name.trim();
    }
}
// excluded-ref probe
