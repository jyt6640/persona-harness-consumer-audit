package com.example.shop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TaskServiceTest {
    @Test
    void trimsName() {
        assertEquals("a", new TaskService().create("  a  "));
    }
}
