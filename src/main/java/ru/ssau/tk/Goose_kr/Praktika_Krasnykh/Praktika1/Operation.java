package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika1;

public abstract class Operation {
    public abstract double apply(double number);

    public double applyTriple(double number) {
        return apply(apply(apply(number)));
    }
}
