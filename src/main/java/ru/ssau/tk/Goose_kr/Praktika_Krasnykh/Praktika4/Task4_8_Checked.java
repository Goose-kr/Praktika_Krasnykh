package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika4;

public class Task4_8_Checked extends Exception {
    public static void throwTask4_8_CheckedException() throws Task4_8_Checked {
        throw new Task4_8_Checked();
    }

    public static Task4_8_Checked throwUncheckedException() {
        try {
            throwTask4_8_CheckedException();
        } catch (Task4_8_Checked e) {
            throw new Task4_8_UnChecked(e);
        }
        return null;
    }
}
