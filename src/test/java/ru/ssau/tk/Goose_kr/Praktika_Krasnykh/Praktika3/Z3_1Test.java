package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika3;

import org.testng.annotations.Test;



public class Z3_1Test {

    @Test
    public void testSetString(){
        String arrayStr = new String("Lom, Tom" );
        new Z3_1().setString(arrayStr);
    }
}