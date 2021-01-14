package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika3;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Z3_12Test {

    @Test
    public void testSet() {
        assertEquals(new Z3_12().set("opopopopo", "opo", "po"), "popppo");
    }
}