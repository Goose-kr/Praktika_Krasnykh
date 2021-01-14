package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika4;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Dau_Task4_5Test {
    @Test
    void test() {
        Dau_Task4_5 temp = new Dau_Task4_5();
        Assert.assertThrows(CloneNotSupportedException.class, temp::clone);

    }
}