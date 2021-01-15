package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika1;

public class IntGeneratorImpl implements IntGenerator {
    private int count = 0;

    @Override
    public int nextInt() {
        return count++;
    }
}
