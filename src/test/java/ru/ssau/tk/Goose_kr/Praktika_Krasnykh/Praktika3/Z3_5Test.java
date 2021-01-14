package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika3;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Z3_5Test {

    @Test
    public void testDiffStr() {
        String str1 = "PUT 4 PLZ";
        String str2 = "put 4 plz";
        String str3 = "YES";
        assertTrue(Z3_5.diffStr(str1, str2));
        assertFalse(Z3_5.diffStr(str2, str2));
        assertFalse(Z3_5.diffStr(str2,str3));
        assertFalse(Z3_5.diffStr(null,str2));
        assertFalse(Z3_5.diffStr(str1, null));
        assertFalse(Z3_5.diffStr(null, null));
    }
}