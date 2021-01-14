package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika3;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Z3_2Test {

    @Test
    public void testGetStr(){
        String temp = "Put 4 please";
        new Z3_2().getStr(temp);
        String temp2 = "Поставьте 4";
        new Z3_2().getStr(temp2);
    }

}