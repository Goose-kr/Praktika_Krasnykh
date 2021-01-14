package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika3;

public class Z3_13 {
    static String getStringOfIndex(String str, int from, int to) {
        if (from < 0) {
            from = 0;
        }
        if (to > str.length()) {
            to = str.length();
        }
        if (from == to) {
            return "";
        }
        return str.substring(from, to);
    }
}
