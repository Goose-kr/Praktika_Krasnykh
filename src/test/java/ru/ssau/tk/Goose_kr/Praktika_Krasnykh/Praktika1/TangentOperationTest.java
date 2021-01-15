package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika1;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TangentOperationTest {
    private final double DOUBLE = 0.0001;
    TangentOperation tangent = new TangentOperation();

    @Test
    public void testApply() {
        assertEquals(tangent.apply(5), Math.tan(5), DOUBLE);
        assertEquals(tangent.apply(Double.NEGATIVE_INFINITY), Double.NaN, DOUBLE);
        assertEquals(tangent.apply(Double.POSITIVE_INFINITY), Double.NaN, DOUBLE);
        assertEquals(tangent.apply(Double.NaN), Double.NaN, DOUBLE);
    }

    @Test
    public void testApplyTriple() {
        assertEquals(tangent.applyTriple(5), Math.tan(Math.tan(Math.tan(5))), DOUBLE);
        assertEquals(tangent.applyTriple(Double.NEGATIVE_INFINITY), Double.NaN, DOUBLE);
        assertEquals(tangent.applyTriple(Double.POSITIVE_INFINITY), Double.NaN, DOUBLE);
        assertEquals(tangent.applyTriple(Double.NaN), Double.NaN, DOUBLE);
    }
}