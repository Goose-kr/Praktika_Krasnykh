package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika4;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task4_5Test {

    @Test
    public void testTestClone() throws CloneNotSupportedException {
        Dau_Task4_5 temp = new Dau_Task4_5();
        Dau_Task4_5 copy = (Dau_Task4_5) temp.clone();
        Task4_5 temp1 = new Task4_5();
        Task4_5 copy1 = (Task4_5) temp1.clone();
    }
}