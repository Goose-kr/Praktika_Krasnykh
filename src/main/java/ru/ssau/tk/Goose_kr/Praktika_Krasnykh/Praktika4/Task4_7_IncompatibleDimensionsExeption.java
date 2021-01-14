package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika4;

public class Task4_7_IncompatibleDimensionsExeption extends RuntimeException  {
    public Task4_7_IncompatibleDimensionsExeption() {
        this("Матрицы несовместимы!");
    }

    public Task4_7_IncompatibleDimensionsExeption(String str) {
        System.out.println(str);

    }
}
