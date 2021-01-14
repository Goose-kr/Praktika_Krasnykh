package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika4;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Task4_6 {
    public static void set(OutputStream out, Object obj) throws IOException {
        ((ObjectOutputStream) out).writeObject(obj);
    }
}
