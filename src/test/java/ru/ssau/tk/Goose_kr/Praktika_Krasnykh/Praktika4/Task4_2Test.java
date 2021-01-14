package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika4;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task4_2Test {


    @Test
    public void testSet() {
        String[] str = {"Java", "have", "a", "my", "brain"};
        assertEquals(Task4_2.getSymbolOnIndex(str, 0), new String[]{"J", "h", "a", "m", "b"});
        Assert.assertThrows(StringIndexOutOfBoundsException.class,
                () -> Task4_2.getSymbolOnIndex(str, 1));

        Assert.assertThrows(NullPointerException.class,
                () -> Task4_2.getSymbolOnIndex(null, 0));
        String[] str1 = {null, "null"};
        Assert.assertThrows(NullPointerException.class,
                () -> Task4_2.getSymbolOnIndex(str1, 0));
    }
}