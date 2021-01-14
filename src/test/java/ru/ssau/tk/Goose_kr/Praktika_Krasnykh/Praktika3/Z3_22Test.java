package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika3;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Z3_22Test {

    @Test
    public void testGetStringOfNumber() {
        assertEquals(Z3_22.getStringOfNumber(4),"0123");
        System.out.println(Z3_22.getStringOfNumber(10000));
    }
}