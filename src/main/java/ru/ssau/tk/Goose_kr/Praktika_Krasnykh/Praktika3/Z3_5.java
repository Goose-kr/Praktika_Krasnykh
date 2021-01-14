package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika3;

import java.util.Objects;

public class Z3_5 {
     static boolean diffStr(String str1, String str2){
        return !Objects.equals(null, str1) && !Objects.equals(null,str2)
                && !str1.equals(str2) && str1.equalsIgnoreCase(str2);
    }
}
