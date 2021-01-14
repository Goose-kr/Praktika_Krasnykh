package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika3;

public class Z3_22 {
    static String getStringOfNumber(int number) {
        StringBuilder strOfNumber = new StringBuilder();
        for (int i = 0; i < number; i++) {
            strOfNumber.append(i);
        }
        return strOfNumber.toString();
    }
}
