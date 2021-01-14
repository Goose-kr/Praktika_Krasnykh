package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika3;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Z3_8Test {

    @Test
    public void testIndexof() {
        assertEquals(Z3_8.indexof("Leto", "to"), 2);
        assertEquals(Z3_8.indexof("tom soer","soer"),4);
    }
}