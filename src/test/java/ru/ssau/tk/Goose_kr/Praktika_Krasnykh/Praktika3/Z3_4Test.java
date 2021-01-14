package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika3;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Z3_4Test {

    @Test
    public void testPalindrome(){
        assertEquals(Z3_4.palindrome("mold"), false);
        assertEquals(Z3_4.palindrome("anna"), true);
        assertEquals(Z3_4.palindrome("sos"), true);
    }

}