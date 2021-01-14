package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika3;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Z3_13Test {

    @Test
    public void testGetStringOfIndex() {
        String str = "Understandable have a nice day";
        int maxSizeStr = str.length();
        assertEquals(Z3_13.getStringOfIndex(str, -2, maxSizeStr), str);
        assertEquals(Z3_13.getStringOfIndex(str, 2, maxSizeStr), str.substring(2));
        assertEquals(Z3_13.getStringOfIndex(str, -2, 14), str.substring(0, 14));
        assertEquals(Z3_13.getStringOfIndex(str, 2, 14), str.substring(2, 14));
    }
}