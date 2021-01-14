package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika4;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task4_4Test {


    @Test
    public void testGetIntOfString() {
        Task4_4.getIntOfString("12","3"); // output: 2
        Assert.assertThrows(ArithmeticException.class,
                () ->   Task4_4.getIntOfString("10","0"));
        Assert.assertThrows(NumberFormatException.class,
                () ->    Task4_4.getIntOfString("m","1"));
        Assert.assertThrows(NumberFormatException.class,
                () ->    Task4_4.getIntOfString("r","a"));
    }
}