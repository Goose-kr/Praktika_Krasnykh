package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika3;

public class Z3_4 {
    static boolean palindrome(String str){
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
