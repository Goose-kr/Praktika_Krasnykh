package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika1;

import org.testng.annotations.Test;
import static ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika1.GNOCOP.printType;
import static org.testng.Assert.*;

public class GNOCOPTest {
    @Test
    public void testPrintType() {
        printType((byte) 255);
        printType('z');
        printType((short) 65535);
        printType(125);
        printType(125L);
        printType(0.1f);
        printType(0.1d);
        printType(false);
        printType(new Person());
        printType(new Integer(1));
        printType("");
        printType(null);
    }

}