package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika1;

public class ResettableIntGenerator implements Resettable, IntGenerator {
    private int count = 0;
    String name = "Angazil";

    @Override
    public int nextInt() {
        return count++;
    }

    @Override
    public void reset() {
        count = 0;
    }

    public String getName() {
        return name;
    }
}
