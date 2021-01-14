package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika3;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Z3_11Test {

    @Test
    public void testTheNumberOfStringArray() {
        String[] array = new String[]{"Understandble", "have", " a ", "nice ", " day"};
        assertEquals(Z3_11.theNumberOfStringArray(array, "h", "e"), 1);
        assertEquals(Z3_11.theNumberOfStringArray(array,"d","y"),1);
    }
    }
