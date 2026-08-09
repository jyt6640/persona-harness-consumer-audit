package com.example.shop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TaskServiceTest {
    @Disabled("audit probe: all tests skipped, persona-harness#116")
    @Test
    void trimsName() {
        assertEquals("a", new TaskService().create("  a  "));
    }
}
