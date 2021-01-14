package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika3;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Z3_9Test {

    @Test
    public void testGetIndexOf() {
        assertEquals(Z3_9.getIndexOf("Tomat Senior", "ma"), 2);
        assertEquals(Z3_9.getIndexOf("Year last","Year"), 0);
    }
}