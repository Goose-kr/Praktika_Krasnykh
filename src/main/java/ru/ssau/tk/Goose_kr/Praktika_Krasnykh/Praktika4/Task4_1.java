package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika4;

import ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika1.Person;

public class Task4_1 {
    public static String getObjectPerson (Person obj){
      if (obj.getFirstName() == null || obj.getLastName() == null) {
        throw new NullPointerException();
    }
        return obj.toString();
}
}
