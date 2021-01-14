package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika3;

public class Z3_21 {
    public static void main(String[] args) {
        String str = "Believe 4";

        StringBuilder strBldr = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                strBldr.replace(i, i + 1, i + "");
            }
        }

        strBldr.reverse();
        System.out.println(strBldr.toString());
    }
}
