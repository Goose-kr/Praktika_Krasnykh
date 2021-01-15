package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika3;

import org.testng.annotations.Test;
import ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika1.NamedPoint;
import ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika1.Person;
import ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika1.Point;
import ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika2.Matrix;

import static org.testng.Assert.*;

public class Z3_18Test {

    @Test
    public void testGetDescription() {
        Matrix matrix = new Matrix(3, 3);
        matrix.setAt(0, 0, 1);
        matrix.setAt(0, 1, 2);
        matrix.setAt(0, 2, 3);
        matrix.setAt(1, 0, 4);
        matrix.setAt(1, 1, 5);
        matrix.setAt(1, 2, 6);
        matrix.setAt(2, 0, 7);
        matrix.setAt(2, 1, 8);
        matrix.setAt(2, 2, 9);
        Z3_18.getDescription(matrix);
        Z3_18.getDescription(new Person("Anatoly", "OchenNychnaCheture", 828183));
        Z3_18.getDescription(new Point(0, 1, 2));
        Z3_18.getDescription(new NamedPoint(0, 1, 4, "X"));
}}