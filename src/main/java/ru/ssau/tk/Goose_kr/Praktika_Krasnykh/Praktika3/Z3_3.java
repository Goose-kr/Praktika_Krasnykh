package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika3;

public class Z3_3 {
    public static void main(String[] args){
        String str = "Put 4 plz";
        String str1 = new String(str);
        String str2 = "Put 4 plz";
        if(str==str2){
            System.out.println("str==str2");
        }
        if (str == str1){
            System.out.println("str==str1");
        }
        if (str.equals(str1)){
            System.out.println("str.equals(str1)");
        }
    }
}
