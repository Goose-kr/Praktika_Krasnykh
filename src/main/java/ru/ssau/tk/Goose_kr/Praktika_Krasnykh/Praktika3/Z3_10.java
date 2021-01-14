package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika3;

public class Z3_10 {
    static int set(String[] array, String prefix,String postfix){
        int count = 0;
        for (String str: array){
            if(str.startsWith(prefix) && str.endsWith(postfix)){
                count++;
            }
        }
        return count;
    }
}
