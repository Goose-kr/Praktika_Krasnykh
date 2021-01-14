package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika4;

import org.testng.annotations.Test;
import static org.testng.Assert.*;
import static ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika4.Task4_8_Checked.throwTask4_8_CheckedException;

public class Task4_8_CheckedTest {
    @Test
    public void test() {
        try {
            throwTask4_8_CheckedException();
        } catch (Task4_8_Checked e) {
            e.getCause();
        }
    }


}