package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika3;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Z3_7Test {

    @Test
    public void testGetIndexStr() {
        assertEquals(Z3_7.getIndexStr("Alla Pyganeva","Alla"), 0);
        assertEquals(Z3_7.getIndexStr("Azamat", "am"),2);
        assertEquals(Z3_7.getIndexStr("Comedia", "di"),4);
    }
}