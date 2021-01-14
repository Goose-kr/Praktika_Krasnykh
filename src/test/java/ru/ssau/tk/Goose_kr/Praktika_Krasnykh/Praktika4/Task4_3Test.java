package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika4;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task4_3Test {

    @Test
    public void testGetCharOnIndex() {
        String[] arrayStr = new String[]{"Java","have","a","my","brain"};
        assertEquals(Task4_3.getCharOnIndex(arrayStr,0,0),
                'J');
        Assert.assertThrows(StringIndexOutOfBoundsException.class,
                () -> Task4_3.getCharOnIndex(arrayStr,16,0));
        Assert.assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> Task4_3.getCharOnIndex(arrayStr,0,16));
    }
}