package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTest {
    @Test
    public void testAdd() {
        int result = Add.add(8, 2);
        assertEquals(10, result);
    }
}