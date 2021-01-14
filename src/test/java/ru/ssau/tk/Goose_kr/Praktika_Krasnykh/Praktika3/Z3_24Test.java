package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika3;

import org.testng.annotations.Test;

import java.nio.charset.StandardCharsets;

import static org.testng.Assert.*;

public class Z3_24Test {

    @Test
    public void testChangeCharsetStr() {
        String str = "Believe 4";
        Z3_24.changeCharsetStr(str, StandardCharsets.UTF_8, StandardCharsets.UTF_16LE);
        Z3_24.changeCharsetStr(str,StandardCharsets.UTF_16LE,StandardCharsets.UTF_8);
    }
}