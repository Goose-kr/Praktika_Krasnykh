package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayTest {
    @Test
    public void testArray() {
        assertEquals(Array.createArray(2), new int[2]);
        assertEquals(Array.createArray(10), new int[10]);
        assertEquals(Array.createArray(1), new int[1]);
    }
}