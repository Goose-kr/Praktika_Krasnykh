package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika3;

public class Z3_11 {
    static int theNumberOfStringArray(String[] array, String prefix, String postfix) {
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].trim();
        }
        for (String str : array) {
            if (str.startsWith(prefix) && str.endsWith(postfix)) {
                number++;
            }
        }
        return number;
    }
}
