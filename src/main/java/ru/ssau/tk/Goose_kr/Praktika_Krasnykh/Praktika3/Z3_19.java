package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika3;

import java.util.Arrays;

public class Z3_19 {
    static String[] parseStringOnArray(String str) {
        String[] arrayStr = str.split(" ");
        return Arrays.stream(arrayStr)
                .filter(s -> !s.isEmpty())
                .map(s -> s.replace(
                        String.valueOf(s.charAt(0)),
                        String.valueOf(s.charAt(0)).toUpperCase()
                ))
                .toArray(String[]::new);
    }
}
