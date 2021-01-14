package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika3;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Z3_20Test {

    @Test
    public void testGetUnifiedStr() {
        String[] str = {"Java", "have", "a", "my", "brain"};
        assertEquals(Z3_20.getUnifiedStr(str), "Java, have, a, my, brain");
    }

}