package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika3;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Z3_19Test {

    @Test
    public void testSet() {
        String str = "Надо бы набрать баллов  на 4. Дааааа...";
        String[] arrayStr = Z3_19.parseStringOnArray(str);
        for (String string : arrayStr) {
            System.out.println(string);
        }
    }

}